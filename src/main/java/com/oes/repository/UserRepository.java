package com.oes.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.oes.entity.DeliveryAgent;
import com.oes.entity.OnlineOrder;
import com.oes.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> , IAppUserCustomRepository{

	User getReferenceById(int searchedUserId);

	User save(int id);

	


	
	



}
