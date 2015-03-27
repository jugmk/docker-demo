package mk.jug.demo.sbp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class SpbApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpbApplication.class, args);
  }
}
