package base;

import base.renderer.AnimationRenderer;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class PlayerBullet extends GameObject {
    ArrayList<BufferedImage> images;
    public PlayerBullet() {
//         images = SpriteUtils.loadImages(
//                "assets/images/player-bullets/a/0.png",
//                "assets/images/player-bullets/a/1.png",
//                "assets/images/player-bullets/a/2.png",
//                "assets/images/player-bullets/a/3.png"
//            );
//        //ArrayList<BufferedImage> images1 = SpriteUtils.loadImages("")
//        this.renderer = new AnimationRenderer(images);
//        this.position = new Vector2D(0, 0);
        this.setDan1(new Random().nextInt(2));

    }
    public void setDan1(int ch) {
        images = SpriteUtils.loadImages(
                "assets/images/player-bullets/a/0.png",
                "assets/images/player-bullets/a/1.png",
                "assets/images/player-bullets/a/2.png",
                "assets/images/player-bullets/a/3.png"
        );
        ArrayList<BufferedImage> images1 = SpriteUtils.loadImages(
                "assets/images/sphere/0.png",
                "assets/images/sphere/1.png"
        );
//        ArrayList<BufferedImage> images2 = SpriteUtils.loadImages("");
        switch (ch){
            case 0:
                this.renderer = new AnimationRenderer(images);
                break;
            case 1:
                images.clear();
                this.renderer = new AnimationRenderer(images1);
                break;

        }

        this.position = new Vector2D(0, 0);
    }
    @Override
    public void run() {
        this.position.addThis(0, -3);
    }
}
