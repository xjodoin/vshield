package co.vshield.api;

import java.util.concurrent.Callable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import co.vshield.ScanResult;
import co.vshield.ScanResult.StatusEnum;
import fi.solita.clamav.ClamAVClient;

@RestController
public class ScanApiEndPoint implements ScanApi {

	@Value("${clamd.host}")
	private String hostname;

	@Value("${clamd.port}")
	private int port;

	@Override
	public Callable<ResponseEntity<ScanResult>> scanPost(MultipartFile file) throws NotFoundException {
		return () -> {
			ClamAVClient client = new ClamAVClient(hostname, port);
			byte[] result = client.scan(file.getInputStream());
			ScanResult scanResult = new ScanResult();
			StatusEnum status = ClamAVClient.isCleanReply(result) ? StatusEnum.OK : StatusEnum.FOUND;
			scanResult.setStatus(status);
			return ResponseEntity.status(HttpStatus.OK).body(scanResult);
		};

	}

}
