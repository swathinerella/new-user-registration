package com.bootcamp.loginuser.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.loginuser.entity.NewUserEntity;

@Repository
public interface UserRepository extends JpaRepository<NewUserEntity, Long>{

}
