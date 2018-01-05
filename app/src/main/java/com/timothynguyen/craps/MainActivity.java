package com.timothynguyen.craps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.content.*;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button;
        button = findViewById(R.id.play_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int total_coins = 10;

                // Pig Input.
                EditText pig_coins = findViewById(R.id.pig_input);
                String sTextFromET = pig_coins.getText().toString();
                int pig_coins_int = Integer.valueOf(sTextFromET);
                total_coins -= pig_coins_int;

                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, total_coins, duration);
                toast.show();

                /*
                HashMap<Integer, String> master_dice = new HashMap<Integer, String>();
                boolean shouldContinue = true;
                int total_coins = 10;

                master_dice.put(1, "Pig");
                master_dice.put(2, "Pare");
                master_dice.put(3, "Shrimp");
                master_dice.put(4, "Crab");
                master_dice.put(5, "Deer");
                master_dice.put(6, "Fish");

                int pig_multiplier = 0;
                int pare_multiplier = 0;
                int shrimp_multiplier = 0;
                int crab_multiplier = 0;
                int deer_multiplier = 0;
                int fish_multiplier = 0;

                // Pig Input.
                EditText pig_coins = findViewById(R.id.pig_input);
                String sTextFromET = pig_coins.getText().toString();
                int pig_coins_int = Integer.valueOf(sTextFromET);
                total_coins -= pig_coins_int;

                // Pare Input.
                EditText pare_coins = findViewById(R.id.pare_input);
                sTextFromET = pare_coins.getText().toString();
                int pare_coins_int = Integer.valueOf(sTextFromET);
                total_coins -= pare_coins_int;

                // Shrimp Input.
                EditText shrimp_coins = findViewById(R.id.shrimp_input);
                sTextFromET = shrimp_coins.getText().toString();
                int shrimp_coins_int = Integer.valueOf(sTextFromET);
                total_coins -= shrimp_coins_int;

                // Crab Input.
                EditText crab_coins = findViewById(R.id.crab_input);
                sTextFromET = crab_coins.getText().toString();
                int crab_coins_int = Integer.valueOf(sTextFromET);
                total_coins -= crab_coins_int;

                // deer Input.
                EditText deer_coins = findViewById(R.id.deer_input);
                sTextFromET = deer_coins.getText().toString();
                int deer_coins_int = Integer.valueOf(sTextFromET);
                total_coins -= deer_coins_int;

                // fish Input.
                EditText fish_coins = findViewById(R.id.fish_input);
                sTextFromET = fish_coins.getText().toString();
                int fish_coins_int = Integer.valueOf(sTextFromET);
                total_coins -= fish_coins_int;

                ListIterator<Integer> itr;
                List<Integer> li = new ArrayList<>();

                // Rolling 3 dice.
                int dice_toss = randInt(1, 6);
                String value = master_dice.get(dice_toss);
                li.add(dice_toss);

                TextView dice_1 = findViewById(R.id.dice1_text);
                dice_1.setText(value);

                dice_toss = randInt(1, 6);
                value = master_dice.get(dice_toss);
                li.add(dice_toss);

                TextView dice_2 = findViewById(R.id.dice2_text);
                dice_2.setText(value);

                dice_toss = randInt(1, 6);
                value = master_dice.get(dice_toss);
                li.add(dice_toss);

                TextView dice_3 = findViewById(R.id.dice3_text);
                dice_3.setText(value);

                itr = li.listIterator();

                while(itr.hasNext()) {
                    switch (itr.next()) {
                        case 1:
                            if (pig_multiplier == 0)
                                pig_multiplier += 2;
                            else
                                pig_multiplier += 1;
                            break;
                        case 2:
                            if (pare_multiplier == 0)
                                pare_multiplier += 2;
                            else
                                pare_multiplier += 1;
                            break;
                        case 3:
                            if (shrimp_multiplier == 0)
                                shrimp_multiplier += 2;
                            else
                                shrimp_multiplier += 1;
                            break;
                        case 4:
                            if (crab_multiplier == 0)
                                crab_multiplier += 2;
                            else
                                crab_multiplier += 1;
                            break;
                        case 5:
                            if (deer_multiplier == 0)
                                deer_multiplier += 2;
                            else
                                deer_multiplier += 1;
                            break;
                        case 6:
                            if (fish_multiplier == 0)
                                fish_multiplier += 2;
                            else
                                fish_multiplier += 1;
                            break;
                    }
                }

                total_coins += (pig_coins_int * pig_multiplier);
                total_coins += (pare_coins_int * pare_multiplier);
                total_coins += (shrimp_coins_int * shrimp_multiplier);
                total_coins += (crab_coins_int * crab_multiplier);
                total_coins += (deer_coins_int * deer_multiplier);
                total_coins += (fish_coins_int * fish_multiplier);

                TextView coin_output = findViewById(R.id.total_coins_text);
                coin_output.setText(total_coins);
                */
            }

        });
    }



    public static int randInt(int min, int max) {
        Random rand = new Random();
        return (rand.nextInt((max - min) + 1) + min);
    }
}
