package biz.cput.repository.admin;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import biz.cput.domain.admin.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {
    Set<Account> getAll();

	
}
