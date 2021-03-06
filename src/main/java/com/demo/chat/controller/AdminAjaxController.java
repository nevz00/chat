package com.demo.chat.controller;

import com.demo.chat.model.User;
import com.demo.chat.to.UserTo;
import com.demo.chat.util.UserUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.StringJoiner;

//@RestController
//@RequestMapping("/ajax/admin/users")
public class AdminAjaxController extends AbstractUserController {
//
//    @Override
//    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
//    public List<User> getAll() {
//        return super.getAll();
//    }
//
//    @Override
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable("id") int id) {
//        super.delete(id);
//    }
//
//    @PostMapping
//    public ResponseEntity<String> createOrUpdate(@Valid UserTo userTo, BindingResult result){
//        if (result.hasErrors()){
//            StringJoiner joiner = new StringJoiner("<br>");
//            result.getFieldErrors().forEach(
//                    fe ->{
//                        String msg = fe.getDefaultMessage();
//                        if (!msg.startsWith(fe.getField())){
//                            msg = fe.getField()+ ' ' + msg;
//                        }
//                        joiner.add(msg);
//                    });
//            return new ResponseEntity<>(joiner.toString(), HttpStatus.UNPROCESSABLE_ENTITY);
//        }
//        if (userTo.isNew()){
//            super.create(UserUtil.createNewFromTo(userTo));
//        } else {
//            super.update(userTo, userTo.getId());
//        }
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//
//    @Override
//    @PostMapping(value = "/{id}")
//    public void enable(@PathVariable("id") int id, @RequestParam("enabled") boolean enabled) {
//        super.enable(id, enabled);
//    }
}

