/* package biz.cput.service.admin;

import java.util.Date;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import biz.cput.domain.admin.Account;
import biz.cput.factory.admin.AccountFactory;
import biz.cput.repository.admin.impl.AccountRepositoryImpl;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AccountServiceImplTest {

    private AccountRepositoryImpl repository;
    private Account account;

    private Account getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = AccountRepositoryImpl.getRepository();
        this.account = AccountFactory.buildAccount("01", "capetown", true, new Date(), new Date());
    }

    @Test
    public void a_create() {
        Account created = this.repository.create(this.account);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.account);
    }

    @Test
    public void c_update() {
        String newAccount = "thisd is anew account name";
        Account updated = new Account.Builder().copy(getSaved()).address(newAccount).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newAccount, updated.getAddress());
    }

    @Test
    public void e_delete() {
        Account saved = getSaved();
        this.repository.delete(saved.getId());
        d_getAll();
    }

    @Test
    public void b_read() {
        Account saved = getSaved();
        Account read = this.repository.read(saved.getId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Account> accounts = this.repository.getAll();
        System.out.println("In getall, all = " + accounts);
    }
} */