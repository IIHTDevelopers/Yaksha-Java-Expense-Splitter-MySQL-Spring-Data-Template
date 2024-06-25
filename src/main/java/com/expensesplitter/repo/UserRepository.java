package com.expensesplitter.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expensesplitter.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  
  // write your code for method to find all users ordered by name in ascending order
	// and it must return data in pages
}
