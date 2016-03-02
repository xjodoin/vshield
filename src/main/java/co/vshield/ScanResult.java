package co.vshield;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-03-01T21:54:19.606Z")
public class ScanResult {

	public enum StatusEnum {
		OK, FOUND,
	};

	private StatusEnum status = null;
	private String reason = null;

	/**
	 **/
	@JsonProperty("status")
	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	/**
	 **/
	@JsonProperty("reason")
	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ScanResult scanResult = (ScanResult) o;
		return Objects.equals(status, scanResult.status) && Objects.equals(reason, scanResult.reason);
	}

	@Override
	public int hashCode() {
		return Objects.hash(status, reason);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ScanResult {\n");

		sb.append("  status: ").append(status).append("\n");
		sb.append("  reason: ").append(reason).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
