/* package biz.cput.repository.admin;

import java.util.Date;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import biz.cput.domain.admin.Account;
import biz.cput.factory.admin.AccountFactory;
import biz.cput.repository.admin.impl.AccountRepositoryImpl;

public class AccountRepositoryImplTest {
    private AccountRepository repository;
    private Account account; 

    private Account getSavedAccount() {
        Set<Account> savedAccounts = this.repository.getAll();
        return savedAccounts.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = AccountRepositoryImpl.getRepository();
        this.account = AccountFactory.buildAccount("01", "Jozi", false, new Date(), new Date());
    }

    @Test
    public void a_create() {
        Account created = this.repository.create(this.account);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.account);
    }

    @Test
    public void b_read() {
       Account savedAccount = getSavedAccount();
        System.out.println("In read, AccoutId = "+ savedAccount.getId());
        Account read = this.repository.read(savedAccount.getId());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedAccount, read);
    }

    @Test
    public void e_delete() {
        Account savedAccount = getSavedAccount();
        this.repository.delete(savedAccount.getId());
        d_getAll();
    }

    @Test
    public void c_update() {
        String newaddress = "New Test Account address";
        Account account = new Account.Builder().copy(getSavedAccount()).address(newaddress).build();
        System.out.println("In update, about_to_updated = " + account);
        Account updated = this.repository.update(account);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newaddress, updated.getAddress());
        d_getAll();
    }

    @Test
    public void d_getAll() {
        Set<Account> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }
} */