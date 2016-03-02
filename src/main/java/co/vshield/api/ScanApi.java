package co.vshield.api;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.concurrent.Callable;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import co.vshield.ScanResult;

@Controller
@RequestMapping(value = "/scan", produces = { APPLICATION_JSON_VALUE })
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-03-01T21:54:19.606Z")
public interface ScanApi {

	@RequestMapping(value = "", method = RequestMethod.POST)
	default Callable<ResponseEntity<ScanResult>> scanPost(@RequestPart("file") MultipartFile file)
			throws NotFoundException {
		// do some magic!
		return () -> new ResponseEntity<ScanResult>(HttpStatus.OK);
	}

}
