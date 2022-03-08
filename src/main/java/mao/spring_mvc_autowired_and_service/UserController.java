package mao.spring_mvc_autowired_and_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Project name(项目名称)：Spring_MVC_Autowired_and_Service
 * Package(包名): mao.spring_mvc_autowired_and_service
 * Class(类名): UserController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/8
 * Time(创建时间)： 14:39
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Controller
public class UserController
{
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String getLogin(@RequestParam String username, @RequestParam String password, Model model)
    {
        User user = new User();
        user.setName(username);
        user.setPassword(password);
        boolean b = userService.login(user);
        if (!b)
        {
            return "error";
        }
        model.addAttribute("user", user);
        return "login";
    }

    @RequestMapping("/register")
    public String getRegister(@RequestParam String username, Model model)
    {
        User user = new User();
        user.setName(username);
        userService.register(user);
        model.addAttribute("user", user);
        return "register";
    }
}
