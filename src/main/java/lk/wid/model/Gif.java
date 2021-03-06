package lk.wid.model;

public class Gif {
    private String name;
    private String username;
    private int category;

    private boolean favorite;

    public Gif(String name, String username, boolean favorite, int category) {
        this.name = name;
        this.username = username;
        this.favorite = favorite;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }
}
