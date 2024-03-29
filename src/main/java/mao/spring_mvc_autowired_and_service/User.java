package mao.spring_mvc_autowired_and_service;

/**
 * Project name(项目名称)：Spring_MVC_Autowired_and_Service
 * Package(包名): mao.spring_mvc_autowired_and_service
 * Class(类名): User
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/8
 * Time(创建时间)： 14:35
 * Version(版本): 1.0
 * Description(描述)： 无
 */


public class User
{
    private String name;
    private String password;

    /**
     * Instantiates a new User.
     */
    public User()
    {
    }

    /**
     * Instantiates a new User.
     *
     * @param name the name
     * @param password  the pwd
     */
    public User(String name, String password)
    {
        this.name = name;
        this.password = password;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Gets pwd.
     *
     * @return the pwd
     */
    public String getPassword()
    {
        return password;
    }

    /**
     * Sets pwd.
     *
     * @param password the pwd
     */
    public void setPassword(String password)
    {
        this.password = password;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("name：").append(name).append('\n');
        stringbuilder.append("pwd：").append(password).append('\n');
        return stringbuilder.toString();
    }
}
