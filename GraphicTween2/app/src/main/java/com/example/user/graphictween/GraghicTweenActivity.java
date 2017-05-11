package com.example.user.graphictween;

import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class GraghicTweenActivity extends AppCompatActivity {
    LinearLayout mLinearLayout;
    Animation anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mLinearLayout = new LinearLayout(this);

        float[] array = new float[] { 20, 20, 20, 20, 20, 20, 20, 20};
        ShapeDrawable rect = new ShapeDrawable(new RoundRectShape(array, null, null));

        rect.setIntrinsicHeight(100);
        rect.setIntrinsicWidth(200);
        rect.getPaint().setColor(Color.BLUE);

        ImageView i = new ImageView(this);
        i.setImageDrawable(rect);
        i.setVisibility((View.VISIBLE));
        anim = AnimationUtils.loadAnimation(this, R.anim.rotate);
        i.startAnimation(anim);

        mLinearLayout.addView(i);
        setContentView(mLinearLayout);

    }
}
