package lk.wid;

import lk.wid.dao.CategoryDao;
import lk.wid.dao.CategoryDaoImpl;
import lk.wid.repository.CategoryRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QwejkApplication {

	public static void main(String[] args) {
		SpringApplication.run(QwejkApplication.class, args);
	}
}
