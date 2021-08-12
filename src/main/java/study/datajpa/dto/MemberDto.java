package study.datajpa.dto;

import lombok.Data;

/**
 * Project : data-jpa
 * Created by gonuu
 * Date : 2021-08-10
 * Time : 오전 10:57
 * Blog : http://devonuu.tistory.com
 * Github : http://github.com/devonuu
 */

@Data
public class MemberDto {
    private Long id;
    private String username;
    private String teamName;

    public MemberDto(Long id, String username, String teamName) {
        this.id = id;
        this.username = username;
        this.teamName = teamName;
    }
}
