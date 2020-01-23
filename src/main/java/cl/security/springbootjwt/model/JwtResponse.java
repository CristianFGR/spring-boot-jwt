package cl.security.springbootjwt.model;

/**
 * Created by cristianfgr on 23-01-20.
 */
public class JwtResponse {

    private final String jwttoken;

    public JwtResponse(String jwttoken) {
        this.jwttoken = jwttoken;
    }

    public String getToken() {
        return this.jwttoken;
    }
}
