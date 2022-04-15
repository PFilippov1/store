package com.pfilippov.autoparts.shop.repository;

import com.pfilippov.autoparts.shop.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
	
	Role findByName(String name);

}
