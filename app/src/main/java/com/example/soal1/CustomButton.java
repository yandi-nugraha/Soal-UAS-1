package com.example.soal1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;

public class CustomButton extends AppCompatButton {

    boolean click = false;

    public CustomButton(@NonNull Context context) {
        super(context);

        init();
    }

    public CustomButton(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init();
    }

    public CustomButton(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init();
    }

    private void init() {
        Drawable vectorIcon = getResources().getDrawable(R.drawable.favorite);
        setCompoundDrawablesRelativeWithIntrinsicBounds(vectorIcon, null, vectorIcon, null);

        setBackgroundColor(Color.rgb(240, 147, 201));

        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (click == false) {
                    setBackgroundColor(Color.YELLOW);
                    click = true;
                } else {
                    setBackgroundColor(Color.rgb(240, 147, 201));
                    click = false;
                }
            }
        });
    }
}
