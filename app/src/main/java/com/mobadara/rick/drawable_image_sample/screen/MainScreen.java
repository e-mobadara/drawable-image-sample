package com.mobadara.rick.drawable_image_sample.screen;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.example.emobadaragaminglib.Base.Game;
import com.example.emobadaragaminglib.Base.Screen;
import com.example.emobadaragaminglib.Components.DrawFinishListener;
import com.example.emobadaragaminglib.Components.DrawableImage;
import com.example.emobadaragaminglib.Components.Sprite;
import com.example.emobadaragaminglib.Implementation.AndroidGame;
import com.mobadara.rick.drawable_image_sample.R;
import com.mobadara.rick.drawable_image_sample.assets.Background;

public class MainScreen extends Screen implements DrawFinishListener {

    private DrawableImage mDrawableImage;

    public MainScreen(Game game) {
        super(game);
        //Adding the background
        addSprite(new Sprite(Background.bg,0,0,game.getGraphics().getHeight(),game.getGraphics().getWidth()));


        //The drawableImage needs a bitmap. Let's create one from the R.drawable
        Bitmap mBitmap = BitmapFactory.decodeResource(((AndroidGame)game).getResources(), R.drawable.a_t_alpha);

        //Then we use this bitmap as the DrawableImage
        mDrawableImage = new DrawableImage(mBitmap,this,50,50);

        //! Important: Having access to the bitmap before initializing it give you total control of it.
        // Change the height, the width, the alpha, You name it.
    }

    @Override
    public void render(float deltaTime) {
        mDrawableImage.draw(this.game);
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void backButton() {
    }

    @Override
    public void handleDragging(int x, int y, int pointer) {
        super.handleDragging(x, y, pointer);
        mDrawableImage.onDragging(x,y);
    }

    @Override
    public void handleTouchDown(int x, int y, int pointer) {
        super.handleTouchDown(x, y, pointer);
        mDrawableImage.onTouchDown(x,y);
    }

    @Override
    public void handleTouchUp(int x, int y, int pointer) {
        super.handleTouchUp(x, y, pointer);
        mDrawableImage.onTouchUp(x,y);
    }

    ////////////////// These Methods are for the DrawFinishListener
    @Override
    public void onDrawFinish() {

    }

    @Override
    public void onDrawStop() {

    }

    @Override
    public void onDrawStart() {

    }
}
