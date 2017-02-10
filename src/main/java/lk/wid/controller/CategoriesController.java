package lk.wid.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import lk.wid.dao.CategoryDao;
import lk.wid.dao.CategoryDaoImpl;
import lk.wid.model.Category;
import lk.wid.repository.CategoryRepository;
import lk.wid.repository.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoriesController {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private GifRepository gifRepository;

    @Autowired
    private CategoryDao categoryDao;

        // RequestMapping(value= "/categories", method = "{RequestMethod.POST"})
    @RequestMapping("/categories")
    public String listCategories(ModelMap modelMap) {
        modelMap.addAttribute("categories", categoryRepository.getAllCategories());
        return "categories";
    }

    @RequestMapping("/category/{id}")
    public String category(@PathVariable int id, ModelMap modelMap) {
        modelMap.addAttribute("category", categoryRepository.findById(id));
        modelMap.addAttribute("gifs", gifRepository.fingByCategoryId(id));
        return "category";
    }

    @RequestMapping("/category/add")
    public String add() {
        for (Category category : categoryRepository.getAllCategories()) {
            categoryDao.saveCategory(new Category(category.getName()));
        }
        return "home";
    }
}
