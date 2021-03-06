package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class StatCharCreationActivity extends AppCompatActivity {

    private TextView strStat, dexStat, conStat, intStat, wisStat, chrStat, remainingTot;
    private Button strPlus, dexPlus, conPlus, intPlus, wisPlus, chrPlus, strMinus, dexMinus, conMinus, intMinus, wisMinus, chrMinus, nextButton;
    private Bundle charBun;
    private String charRaceString, charClassString, charBackgroundString, charWeaponString;
    private int str = 8, dex = 8, con = 8, intel = 8, wis = 8, chr = 8, remaining = 27;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stat_char_creation);
        Intent myStatsIntent = new Intent (StatCharCreationActivity.this, CharacterReview.class);
        charBun = getIntent().getExtras();
        charRaceString = charBun.getString("Race");
        charClassString = charBun.getString("Class");
        charBackgroundString = charBun.getString("Background");
        charWeaponString = charBun.getString("Weapon");

        remainingTot = findViewById(R.id.RemainingTxt);
        nextButton = findViewById(R.id.nextButtonStats);

        strStat = findViewById(R.id.StrStat);
        strMinus = findViewById(R.id.btnStrMinus);
        strPlus = findViewById(R.id.btnStrPlus);

        dexStat = findViewById(R.id.DexStat);
        dexMinus = findViewById(R.id.btnDexMinus);
        dexPlus = findViewById(R.id.btnDexPlus);

        conStat = findViewById(R.id.ConStat);
        conMinus = findViewById(R.id.btnConMinus);
        conPlus = findViewById(R.id.btnConPlus);

        intStat = findViewById(R.id.IntStat);
        intMinus = findViewById(R.id.btnIntMinus);
        intPlus = findViewById(R.id.btnIntPlus);

        wisStat = findViewById(R.id.WisStat);
        wisMinus = findViewById(R.id.btnWisMinus);
        wisPlus = findViewById(R.id.btnWisPlus);

        chrStat = findViewById(R.id.ChrStat);
        chrMinus = findViewById(R.id.btnChrMinus);
        chrPlus = findViewById(R.id.btnChrPlus);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myStatsIntent.putExtra("Race", charRaceString);
                myStatsIntent.putExtra("Class", charClassString);
                myStatsIntent.putExtra("Background", charBackgroundString);
                myStatsIntent.putExtra("Weapon", charWeaponString);
                myStatsIntent.putExtra("Str", str);
                myStatsIntent.putExtra("Dex", dex);
                myStatsIntent.putExtra("Con", con);
                myStatsIntent.putExtra("Int", intel);
                myStatsIntent.putExtra("Wis", wis);
                myStatsIntent.putExtra("Chr", chr);
                startActivity(myStatsIntent);
            }
        });
    }

    public void minusStr(View view) {
        if(str <= 8){
            Toast.makeText(StatCharCreationActivity.this, "Stat cannot be below 8",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        str--;
        remaining++;
        strStat.setText(String.valueOf(str));
        remainingTot.setText(String.valueOf(remaining));
    }

    public void minusDex(View view) {
        if(dex <= 8){
            Toast.makeText(StatCharCreationActivity.this, "Stat cannot be below 8",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        dex--;
        remaining++;
        dexStat.setText(String.valueOf(dex));
        remainingTot.setText(String.valueOf(remaining));
    }

    public void minusCon(View view) {
        if(con <= 8){
            Toast.makeText(StatCharCreationActivity.this, "Stat cannot be below 8",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        con--;
        remaining++;
        conStat.setText(String.valueOf(con));
        remainingTot.setText(String.valueOf(remaining));
    }

    public void minusInt(View view) {
        if(intel <= 8){
            Toast.makeText(StatCharCreationActivity.this, "Stat cannot be below 8",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        intel--;
        remaining++;
        intStat.setText(String.valueOf(intel));
        remainingTot.setText(String.valueOf(remaining));
    }

    public void minusWis(View view) {
        if(wis <= 8){
            Toast.makeText(StatCharCreationActivity.this, "Stat cannot be below 8",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        wis--;
        remaining++;
        wisStat.setText(String.valueOf(wis));
        remainingTot.setText(String.valueOf(remaining));
    }

    public void minusChr(View view) {
        if(chr <= 8){
            Toast.makeText(StatCharCreationActivity.this, "Stat cannot be below 8",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        chr--;
        remaining++;
        chrStat.setText(String.valueOf(chr));
        remainingTot.setText(String.valueOf(remaining));
    }

    public void plusStr(View view) {
        if(str >= 15){
            Toast.makeText(StatCharCreationActivity.this, "Stat cannot be above 15",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        if(remaining <= 0){
            Toast.makeText(StatCharCreationActivity.this, "Out of Points!",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        str++;
        remaining--;
        strStat.setText(String.valueOf(str));
        remainingTot.setText(String.valueOf(remaining));
    }

    public void PlusDex(View view) {
        if(dex >= 15){
            Toast.makeText(StatCharCreationActivity.this, "Stat cannot be above 15",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        if(remaining <= 0){
            Toast.makeText(StatCharCreationActivity.this, "Out of Points!",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        dex++;
        remaining--;
        dexStat.setText(String.valueOf(dex));
        remainingTot.setText(String.valueOf(remaining));
    }

    public void PlusCon(View view) {
        if(con >= 15){
            Toast.makeText(StatCharCreationActivity.this, "Stat cannot be above 15",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        if(remaining <= 0){
            Toast.makeText(StatCharCreationActivity.this, "Out of Points!",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        con++;
        remaining--;
        conStat.setText(String.valueOf(con));
        remainingTot.setText(String.valueOf(remaining));
    }

    public void PlusInt(View view) {
        if(intel >= 15){
            Toast.makeText(StatCharCreationActivity.this, "Stat cannot be above 15",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        if(remaining <= 0){
            Toast.makeText(StatCharCreationActivity.this, "Out of Points!",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        intel++;
        remaining--;
        intStat.setText(String.valueOf(intel));
        remainingTot.setText(String.valueOf(remaining));
    }

    public void PLusWis(View view) {
        if(wis >= 15){
            Toast.makeText(StatCharCreationActivity.this, "Stat cannot be above 15",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        if(remaining <= 0){
            Toast.makeText(StatCharCreationActivity.this, "Out of Points!",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        wis++;
        remaining--;
        wisStat.setText(String.valueOf(wis));
        remainingTot.setText(String.valueOf(remaining));
    }

    public void PlusChr(View view) {
        if(chr >= 15){
            Toast.makeText(StatCharCreationActivity.this, "Stat cannot be above 15",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        if(remaining <= 0){
            Toast.makeText(StatCharCreationActivity.this, "Out of Points!",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        chr++;
        remaining--;
        chrStat.setText(String.valueOf(chr));
        remainingTot.setText(String.valueOf(remaining));
    }
}