package today.rocky.tcb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author Rocky
 */
@SpringBootApplication
@EntityScan(basePackages = "today.rocky.tcb.bean")
public class TcbBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(TcbBaseApplication.class, args);
    }

}
