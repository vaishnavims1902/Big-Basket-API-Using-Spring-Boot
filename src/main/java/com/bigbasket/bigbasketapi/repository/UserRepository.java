package com.bigbasket.bigbasketapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bigbasket.bigbasketapi.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Integer>{

    UserModel findByMobileAndPassword(String mobile, String password);

    boolean existsByMobile(String mobile);

}
