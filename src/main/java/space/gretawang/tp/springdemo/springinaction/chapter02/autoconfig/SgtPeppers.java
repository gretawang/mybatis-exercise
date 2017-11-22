package space.gretawang.tp.springdemo.springinaction.chapter02.autoconfig;

import org.springframework.stereotype.Component;

/**
 * @Component注解表明,这个类会作为组件类,spring会为该类创建Bean
 * 那么这里的问题就来了, 这个Bean会在什么时候创建,是系统启动的时候,还是使用的时候?
 *
 * 所有带@Component注解的类都会被创建成bean, @ComponentScan注解负责扫描
 */

@Component("lonelyHeart")
public class SgtPeppers implements CompactDisc {
    private String title = "Lonely heart";
    private String artist = "The Beatles";
    public void play() {
        System.out.printf("title %s, artist %s", title, artist);

    }
}
