package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RecommendedCharacter extends AppCompatActivity {
Bundle charClass;
String character;
TextView charTitle;
ImageView charImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommended_character);
        charClass = getIntent().getExtras();
        character = charClass.getString("class");
        charTitle = findViewById(R.id.txtClassTitle);
        charTitle.setText(character);
        charImg = findViewById(R.id.charImgView);

        if (character.equals("Barbarian")){
            charImg.setImageDrawable(getResources().getDrawable(R.drawable.barbarian));
        }else if (character.equals("Fighter")){
            charImg.setImageDrawable(getResources().getDrawable(R.drawable.fighter));
        }else if (character.equals("Monk")){
            charImg.setImageDrawable(getResources().getDrawable(R.drawable.monk));
        }else if (character.equals("Rogue")){
            charImg.setImageDrawable(getResources().getDrawable(R.drawable.rogue));
        }else if (character.equals("Paladin")){
            charImg.setImageDrawable(getResources().getDrawable(R.drawable.paladin));
        }else if (character.equals("Ranger")){
            charImg.setImageDrawable(getResources().getDrawable(R.drawable.ranger));
        }else if (character.equals("Warlock")){
            charImg.setImageDrawable(getResources().getDrawable(R.drawable.warlock));
        }else if (character.equals("Sorcerer")){
            charImg.setImageDrawable(getResources().getDrawable(R.drawable.sorcerer));
        }else if (character.equals("Wizard")){
            charImg.setImageDrawable(getResources().getDrawable(R.drawable.wizard));
        }else if (character.equals("Bard")){
            charImg.setImageDrawable(getResources().getDrawable(R.drawable.bard));
        }else if (character.equals("Cleric")){
            charImg.setImageDrawable(getResources().getDrawable(R.drawable.cleric));
        }else if (character.equals("Druid")){
            charImg.setImageDrawable(getResources().getDrawable(R.drawable.druid));
        }

    }
}