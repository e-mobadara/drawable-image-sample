package com.mobadara.rick.drawable_image_sample.activities;

import com.example.emobadaragaminglib.Base.Graphics;
import com.example.emobadaragaminglib.Base.Screen;
import com.example.emobadaragaminglib.Implementation.AndroidGame;
import com.mobadara.rick.drawable_image_sample.R;
import com.mobadara.rick.drawable_image_sample.assets.Background;
import com.mobadara.rick.drawable_image_sample.screen.MainScreen;

public class MainActivity extends AndroidGame {

    @Override
    public Screen getInitScreen() {
        Background.bg = getGraphics().newImage(R.drawable.franky, Graphics.ImageFormat.ARGB8888,getResources());
        return new MainScreen(this);
    }
}
