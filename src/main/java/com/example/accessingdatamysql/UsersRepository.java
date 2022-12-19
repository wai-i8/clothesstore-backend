package com.example.accessingdatamysql;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.*;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UsersRepository extends JpaRepository<users, Long> {
    
    @Query(value = "SELECT count(U) FROM users U WHERE email = ?1 and pwd = ?2")
    Integer verifyUser(String email, String pwd);

    @Query(value = "SELECT id FROM users U WHERE email = ?1 and pwd = ?2")
    String findId(String email, String pwd);

    @Query(value = "SELECT firstname FROM users U WHERE email = ?1 and pwd = ?2")
    String findName(String email, String pwd);

    @Query(value = "SELECT count(U) FROM users U WHERE email = ?1")
    String findEmail(String email);

    @Transactional
    @Modifying
    @Query(value = "UPDATE users U SET pwd = ?2 WHERE email = ?1")
    void modifypwd(String email, String newPwd);
}
