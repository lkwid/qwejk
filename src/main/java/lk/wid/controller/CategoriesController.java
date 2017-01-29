package lk.wid.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import lk.wid.repository.CategoryRepository;
import lk.wid.repository.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoriesController {

    @Autowired
    private CategoryRepository categoryRepository;

        // RequestMapping(value= "/categories", method = "{RequestMethod.POST"})
    @RequestMapping("/categories")
    public String listCategories(ModelMap modelMap) {
        modelMap.addAttribute("categories", categoryRepository.getAllCategories());
        return "categories";
    }

    @RequestMapping("/category/{id}")
    public String category(@PathVariable int id, ModelMap modelMap) {
        modelMap.addAttribute("category", categoryRepository.findById(id));
        return "category";
    }
}
