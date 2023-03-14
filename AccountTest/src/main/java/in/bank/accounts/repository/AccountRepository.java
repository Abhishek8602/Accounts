package in.bank.accounts.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.bank.accounts.model.Accounts;

@Repository
public interface AccountRepository extends CrudRepository<Accounts, Long> {
	
	Accounts findByCustomerId(int customerId);
	
	

}
