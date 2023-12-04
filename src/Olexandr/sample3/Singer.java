package Olexandr.sample3;

import java.util.Arrays;

public class Singer{
    private String name;
    private String[] songs;

    public Singer(String name, String[] songs) {
        this.name = name;
        this.songs = songs;
    }

    public String getName() {
        return name;
    }

    public String[] getSongs() {
        return songs;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", songs=" + Arrays.toString(songs) +
                '}';
    }
}
