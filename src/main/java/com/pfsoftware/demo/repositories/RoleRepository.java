package com.pfsoftware.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import com.pfsoftware.demo.model.Role;

public interface RoleRepository extends CrudRepository<Role,Long> {
	Role findByRole(String role);
}
