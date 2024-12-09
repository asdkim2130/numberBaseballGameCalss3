package ClassList;

import java.util.ArrayList;

public class MemberResponse {
    private String loginId;
    private String username;

    public MemberResponse(String loginId, String username) {
        this.loginId = loginId;
        this.username = username;
    }

    public String getLoginId() {
        return loginId;
    }

    public String getUsername() {
        return username;
    }
}
