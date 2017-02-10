package lk.wid;

import lk.wid.model.Category;
import lk.wid.repository.CategoryRepository;
import org.junit.Test;

import java.util.List;

public class CategoryRepositoryTest {
    CategoryRepository categoryRepository = new CategoryRepository();

    @Test
    public void getCategories() {
        List<Category> fetchedCategories = categoryRepository.getAllCategories();
        fetchedCategories.forEach(category -> System.out.println(category.getName()));
    }

}
