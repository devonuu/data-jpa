package study.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.datajpa.entity.Team;

/**
 * Project : data-jpa
 * Created by gonuu
 * Date : 2021-08-13
 * Time : 오후 3:17
 * Blog : http://devonuu.tistory.com
 * Github : http://github.com/devonuu
 */


public interface TeamRepository extends JpaRepository<Team, Long> {
}
