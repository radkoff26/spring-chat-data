package com.radkoff26.springchatdata.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.radkoff26.springchatdata.domain.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
