package radar.devmatching.common.security.jwt;

import lombok.Builder;

public class JwtToken {
	private final String header;
	private final String token;
	private final long expireTime;

	@Builder
	public JwtToken(String header, String token, long expireTime) {
		this.header = header;
		this.token = token;
		this.expireTime = expireTime;
	}

	public String getHeader() {
		return header;
	}

	public String getToken() {
		return token;
	}

	public long getExpireTime() {
		return expireTime;
	}
}