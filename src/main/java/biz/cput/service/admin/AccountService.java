package biz.cput.service.admin;

import java.util.List;

import biz.cput.domain.admin.Account;
import biz.cput.service.IService;

public interface AccountService extends IService<Account, String> {
    Account retrieveByDesc(String accountDesc);
    List<Account> getAll();
}
