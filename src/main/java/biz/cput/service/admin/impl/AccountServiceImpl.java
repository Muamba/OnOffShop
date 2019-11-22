package biz.cput.service.admin.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import biz.cput.domain.admin.Account;
import biz.cput.repository.admin.AccountRepository;
// import biz.cput.repository.admin.impl.AccountRepositoryImpl;
import biz.cput.service.admin.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

    private static AccountServiceImpl service = null;
    //private AccountRepository repository;

    @Autowired
    private AccountRepository accountRepository;

    private AccountServiceImpl() {
       
    }

    public static AccountServiceImpl getService() {
        if (service == null)
            service = new AccountServiceImpl();
        return service;
    }

    @Override
    public Account create(Account account) {

        return this.accountRepository.save(account);
    }

    @Override
    public Account update(Account account) {

        return this.accountRepository.save(account);
    }

    @Override
    public void delete(String id) {
        this.accountRepository.deleteById(id);

    }

    @Override
    public Account read(String id) {

        Optional<Account> optAccount = this.accountRepository.findById(id);
        return optAccount.orElse(null);
    }

    @Override
    public Account retrieveByDesc (String accountDesc) {
        List<Account> accounts = getAll();
        for (Account account : accounts) {
            if (account.getAddress().equalsIgnoreCase(accountDesc)) return account;
        }
        return null;
    }

    @Override
    public List<Account> getAll() {

        return this.accountRepository.findAll();
    }

}