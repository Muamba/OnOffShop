/* package biz.cput.repository.admin.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Repository;

import biz.cput.domain.admin.Account;
import biz.cput.repository.admin.AccountRepository;

@Repository
public class AccountRepositoryImpl implements AccountRepository {

    private static AccountRepositoryImpl repository = null;
    private Set<Account> accounts;

    private AccountRepositoryImpl(){
        this.accounts = new HashSet<>();
    }

    private Account findAccount(String accountId) {
        return this.accounts.stream()
                .filter(accounts -> accounts.getId().trim().equals(accountId))
                .findAny()
                .orElse(null);
    }

    public static AccountRepositoryImpl getRepository(){
        if (repository == null) repository = new AccountRepositoryImpl();
        return repository;
    }


    @Override
    public Account create(Account account) {
        this.accounts.add(account);
        return account;
    }

    @Override
    public Account update(Account account) {
        Account toDelete = findAccount(account.getId());
        if(toDelete != null) {
            this.accounts.remove(toDelete);
            return create(account);
        }
        return null;
    }

    @Override
    public void delete(String accountId) {
       
        Account account = findAccount(accountId);
        if (account != null) this.accounts.remove(account);
    }

    @Override
    public Account read(final String accountId) {
       Account account=findAccount(accountId);
        return account;
    }

    @Override
    public Set<Account> getAll() {
        return this.accounts;
    }

} */