package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface BankDAO extends JpaRepository<Bank, Integer> {

    //@Query("from Bank UPDATE Bank SET amount =?1 'WHERE id = ?1;")
	//public void updateAccount(int uid, int uamount );
}
