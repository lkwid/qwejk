package lk.wid.repository;

import lk.wid.model.Gif;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", "Chris Ramacciotti", false, 1),
            new Gif("ben-and-mike", "Ben Jakuben", true, 2),
            new Gif("book-dominos", "Craig Dennis", false, 3),
            new Gif("compiler-bot", "Ada Lovelace", true, 1),
            new Gif("cowboy-coder", "Grace Hopper", false, 2),
            new Gif("infinite-andrew", "Marissa Mayer", true, 3)
    );

    public GifRepository() {
    }

    public List<Gif> getAllGifs() {
        return ALL_GIFS;
    }

    public Gif findByName(String name) {
        for (Gif gif : ALL_GIFS) {
            if (gif.getName().equals(name)) {
                return gif;
            }
        }
        return null;
    }

    public List<Gif> getFavorites() {
        List<Gif> favoriteList = new ArrayList<>();
        for (Gif gif : ALL_GIFS) {
            if(gif.isFavorite())
                favoriteList.add(gif);
        }
        return favoriteList;
    }

    public List<Gif> fingByCategoryId(int category) {
        List<Gif> gifPerCategory = new ArrayList<>();
        for (Gif gif : ALL_GIFS) {
            if(gif.getCategory() == category)
                gifPerCategory.add(gif);
        }
        return gifPerCategory;
    }
}
