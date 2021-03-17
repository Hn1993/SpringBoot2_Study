package jpa.demo.controller;


import jpa.demo.entity.User;
import jpa.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class JpaController {
    private static final Logger LOG = LoggerFactory.getLogger(JpaController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public String userTest(){
        User user = userService.findByAge(19);
        LOG.info("user="+user.toString());
        return user.getName();
    }

    @RequestMapping(path = "/getUser/{userName}",method = RequestMethod.GET)
    public User getUser(@PathVariable String userName){
        User user = userService.findSql(userName);
        LOG.info("user="+user.toString());
        return user;
    }

    @GetMapping(path = "getUserByName",params = "userName")
    public User getUserByName(String userName){
        User user = userService.findSql(userName);
        LOG.info("user="+user.toString());
        if (user != null){
            return user;
        }
        return null;
    }
}
