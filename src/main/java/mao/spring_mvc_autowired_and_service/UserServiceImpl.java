package mao.spring_mvc_autowired_and_service;

import org.springframework.stereotype.Service;

/**
 * Project name(项目名称)：Spring_MVC_Autowired_and_Service
 * Package(包名): mao.spring_mvc_autowired_and_service
 * Class(类名): UserServiceImpl
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/8
 * Time(创建时间)： 14:37
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Service
public class UserServiceImpl implements UserService
{

    @Override
    public boolean login(User user)
    {
        if ("admin".equals(user.getName()) && "123456".equals(user.getPassword()))
        {
            return true;
        }
        return false;
    }

    @Override
    public boolean register(User user)
    {
        //todo
        return true;
    }
}
