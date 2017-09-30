package com.yyf.system.service;

import com.yyf.system.dao.UserInterface;
import com.yyf.system.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Feng on 2017/6/3.
 */
@Service
public class LoginService{

    @Autowired
    private UserInterface userInterface;

    /**
     * 登录验证方法
     * @param userName
     * @param password
     * @return
     */
    public Map<String,Object> login(String userName,String password){
        Map<String,Object> map=new HashMap<String,Object>();
        User user=userInterface.queryUserByName(userName);
        if (user==null){
            map.put("result","fail");
            map.put("msg","用户不存在");
            return map;
        }else{
            if (!user.getUserPassword().equals(password)){
                map.put("result","fail");
                map.put("msg","密码不正确");
                return map;
           }else {
                map.put("result","success");
                map.put("user",user);
                return map;
            }
// else if (user.getUserType().equals(0)){
//                map.put("result","success2");
//                map.put("user",user);
//                return map;
//            }else{
//                map.put("result","success1");
//                map.put("user",user);
//                return map;
//            }
        }
    }
}
