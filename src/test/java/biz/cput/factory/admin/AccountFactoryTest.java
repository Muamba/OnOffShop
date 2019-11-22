package biz.cput.factory.admin;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import biz.cput.domain.admin.Account;

public class AccountFactoryTest {

   

    private String testname;

    @Before
    public void setUp() throws Exception {
        this.testname = "testname";
    }

    @Test
    public void buildAccount() {
        Account account = AccountFactory.buildAccount("01", "capetown", true, new Date(), new Date());
        Assert.assertNotNull(account.getId());
        Assert.assertNotNull(account.getAddress());
        Assert.assertNotNull(account.isIs_closed());
        Assert.assertNotNull(account.getOpen());
        Assert.assertNotNull(account.getClosed());
        Assert.assertNotNull(account);
    }
}
