package com.example.practical_21; 
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity { private ImageView imageView;
private Button buttonAnimate;
@Override
protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
imageView = findViewById(R.id.imageView); buttonAnimate = findViewById(R.id.buttonAnimate); buttonAnimate.setOnClickListener(v -> {
Animation animation = AnimationUtils.loadAnimation(this, R.anim.slide_animation); imageView.startAnimation(animation);
});
}
}
