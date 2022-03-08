package mao.spring_mvc_autowired_and_service;

/**
 * Project name(项目名称)：Spring_MVC_Autowired_and_Service
 * Package(包名): mao.spring_mvc_autowired_and_service
 * Interface(接口名): UserService
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/8
 * Time(创建时间)： 14:37
 * Version(版本): 1.0
 * Description(描述)： 无
 */
public interface UserService
{
    /**
     * Login boolean.
     *
     * @param user the user
     * @return the boolean
     */
    boolean login(User user);

    /**
     * Register boolean.
     *
     * @param user the user
     * @return the boolean
     */
    boolean register(User user);
}
