package isfaaghyth.app.testwp.models;

import java.util.ArrayList;

/**
 * ---------------------------------
 * Created by isfaaghyth with <3
 * Everything in here: @isfaaghyth
 * ---------------------------------
 */

public class MainModelImp {
    private ArrayList<Posts> posts;

    public void setPosts(ArrayList<Posts> posts) {
        this.posts = posts;
    }

    public ArrayList<Posts> getPosts() {
        return posts;
    }

    public static class Posts {
        private String slug;

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }
    }
}
