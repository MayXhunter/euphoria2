package com.example.euphoria2.module;

import com.example.euphoria2.R;

public class anime {
    private String name;
    private int imageId;
    private int price;

    public static final anime[] animes = {
            new anime("Attack on Titans necklace", R.drawable.aot,15),
            new anime("Naruto figuers", R.drawable.naruto,15),
            new anime("Zoro earings", R.drawable.zoro,15),
            new anime("attack on titans mug", R.drawable.aotmug,15),
            new anime("Naruto phone cases", R.drawable.covers,30),
            new anime("Demon Slayer Keychains", R.drawable.dkey,6),
            new anime("Demon Slayer figuers", R.drawable.demon,15),
            new anime("Posters", R.drawable.posters,8),
            new anime("Spy X Family lomocards", R.drawable.spylomo,18)

    };

    public anime(String name, int imageId, int price) {
        this.name = name;
        this.imageId = imageId;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }

    public int getPrice() {
        return price;
    }
}
