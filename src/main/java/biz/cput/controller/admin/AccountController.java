package biz.cput.controller.admin;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import biz.cput.domain.ResponseObj;
import biz.cput.domain.admin.Account;
import biz.cput.factory.ResponseObjFactory;
import biz.cput.factory.admin.AccountFactory;
import biz.cput.service.admin.AccountService;

@RestController
@RequestMapping("/shop/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping(value = "/create/{accountName}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createAccount(@PathVariable String account) {
        System.out.println("Entered Value: " + account);
        ResponseObj responseObj = ResponseObjFactory.buildGenericResponseObj(HttpStatus.OK.toString(), "Account Created");
        Account savedAccount;

        if (account == null || account.trim().isEmpty() || account.trim().equalsIgnoreCase("null")) {
            responseObj.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
            responseObj.setResponseDescription("Provide an account!"); 
        }else{
            savedAccount = accountService.retrieveByDesc(account);
            if (savedAccount != null) {
                responseObj.setResponseDescription("Gender already exist!");
        }else {
            savedAccount = AccountFactory.buildAccount("1", "Claremont", true, new Date(), new Date());
            savedAccount = accountService.create(savedAccount);
        }
        responseObj.setResponse(savedAccount);
    }
    return ResponseEntity.ok(responseObj);
        
    }

    @GetMapping(value = "/getall", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAll() {
        ResponseObj responseObj = ResponseObjFactory.buildGenericResponseObj(HttpStatus.OK.toString(), "Success");
        List<Account> accounts = accountService.getAll();
        responseObj.setResponse(accounts);
        return ResponseEntity.ok(responseObj);
    }
}