package com.example.pavilion.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    EditText player_A, player_B;
    String playerA,playerB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        player_A=(EditText)findViewById(R.id.playerAtext);
        player_B=(EditText)findViewById(R.id.playerBtext);
         }

    public void playBtnClicked(View view){
        playerA=player_A.getText().toString().trim();
        playerB=player_B.getText().toString().trim();

        if (!playerA.equals(null) && !playerB.equals(null)){
            Intent intent =new Intent(this,MainActivity.class);
            intent.putExtra("PLAYER_A",playerA);
            intent.putExtra("PLAYER_B",playerB);
            startActivity(intent);

          Toast toast=  Toast.makeText(getApplicationContext(),"WELCOME  "+playerA+"  and "+ playerB
                                                                +" All The BEST Both Of You!!!",
                                                                Toast.LENGTH_LONG);
            View view1=toast.getView();
            toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL,0,0);
            view1.setBackgroundResource(R.color.toastColour);
            toast.show();
        }
        else{
            Toast toast=  Toast.makeText(getApplicationContext(),"Please Enter both player names. !!!",
                    Toast.LENGTH_LONG);
            View view1=toast.getView();
            toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL,0,0);
            view1.setBackgroundResource(R.color.toastColour);
            toast.show();
        }
    }
}
