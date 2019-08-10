package com.example.pavilion.tictactoe;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String turn, name;                               // 0 or X
    private Button ONEbtn, TWObtn, THREEbtn, FOURbtn, FIVEbtn, SIXbtn, SEVENbtn, EIGHTbtn, NINEbtn ;
    private TextView playerA, playerB,nameA, nameB;
    private String TAG="Your Turn ";
    private String PL_A="Player A", PL_B= "Player B";
    LayoutInflater inflater;
    View layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent=getIntent();

        PL_A= intent.getStringExtra("PLAYER_A");
        PL_B=  intent.getStringExtra("PLAYER_B");




        ONEbtn=(Button)findViewById(R.id.oneBtn);
        TWObtn=(Button)findViewById(R.id.twoBtn);
        THREEbtn=(Button)findViewById(R.id.threeBtn);
        FOURbtn=(Button)findViewById(R.id.fourBtn);
        FIVEbtn=(Button)findViewById(R.id.fiveBtn);
        SIXbtn=(Button)findViewById(R.id.sixBtn);
        SEVENbtn=(Button)findViewById(R.id.sevenBtn);
        EIGHTbtn=(Button)findViewById(R.id.eightBtn);
        NINEbtn=(Button)findViewById(R.id.nineBtn);
        playerA=(TextView) findViewById(R.id.player_A_Score);
        playerB=(TextView) findViewById(R.id.player_B_Score);
        nameA=(TextView)findViewById(R.id.Player_Name_A);
        nameB=(TextView) findViewById(R.id.Player_Name_B);



        nameA.setText(PL_A);
        nameB.setText(PL_B);

        ONEbtn.setOnClickListener(this);
        TWObtn.setOnClickListener(this);
        THREEbtn.setOnClickListener(this);
        FOURbtn.setOnClickListener(this);
        FIVEbtn.setOnClickListener(this);
        SIXbtn.setOnClickListener(this);
        SEVENbtn.setOnClickListener(this);
        EIGHTbtn.setOnClickListener(this);
        NINEbtn.setOnClickListener(this);

         turn="0";
         name=PL_A;
         turn= switchingTurn( turn);
    }

     @Override
    public void onClick(View v) {
        int id=v.getId();

if (ONEbtn.getText().toString().isEmpty() || TWObtn.getText().toString().isEmpty() || THREEbtn.getText().toString().isEmpty() ||
        FOURbtn.getText().toString().isEmpty() || FIVEbtn.getText().toString().isEmpty() || SIXbtn.getText().toString().isEmpty() ||
        SEVENbtn.getText().toString().isEmpty() || EIGHTbtn.getText().toString().isEmpty() || NINEbtn.getText().toString().isEmpty() )
{
        if(id==ONEbtn.getId()){      // 1stnd button**********************************************************8

            String g1=ONEbtn.getText().toString();
            if(!g1.equals("")){
                Toast.makeText(this, "Not allowed here!!!", Toast.LENGTH_SHORT).show();
            }
            else {
            ONEbtn.setText(turn);
                String get1=ONEbtn.getText().toString();

            String get2=TWObtn.getText().toString();
            String get3=THREEbtn.getText().toString();

            String get4=FOURbtn.getText().toString();
            String get7=SEVENbtn.getText().toString();

            String get5=FIVEbtn.getText().toString();
            String get9=NINEbtn.getText().toString();

                  if(get1.equals(get2) && get1.equals(get3)) { // comparing 2nd and 3rd button text with 1st btn
                     // Log.d("Value of 2btn","<<"+get1+"<<"+get3+"<<"+ get2+"<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
                            callToast(name, turn);}
                  else if (get1.equals(get4) && get1.equals(get7)) {   // comparing 4th and 7th btn with first btn
                     // Log.d("Value of 4th_btn", get4+"<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
                  callToast(name, turn);}
                  else if (get1.equals(get5) && get1.equals(get9)){
                      callToast(name, turn);}

            turn=switchingTurn(turn);
            Log.d(TAG, turn+ name);
            }

        }else if (id==TWObtn.getId()){              // 2nd button**********************************************************8

            String g2=TWObtn.getText().toString();
            if(!g2.equals("")){
                Toast.makeText(this, "Not allowed here!!!", Toast.LENGTH_SHORT).show();
            }
            else {
                TWObtn.setText(turn);
                String get2=TWObtn.getText().toString();

                String get1=ONEbtn.getText().toString();
                String get3=THREEbtn.getText().toString();

                String get5=FIVEbtn.getText().toString();
                String get8=EIGHTbtn.getText().toString();

                if (get1.equals(get2) && get3.equals(get2))
                { Log.d("Value of 2btn","<<"+get2+"<<"+get1+"<<"+ get3+"<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
                    callToast(name,turn);}
                else if (get5.equals(get2) && get8.equals(get2)){
                    callToast(name, turn);}

            turn=switchingTurn(turn);
            Log.d(TAG, turn+ name);}

        }else if (id==THREEbtn.getId()){                 // 3rd button**********************************************************8

             String g3=THREEbtn.getText().toString();
            if(!g3.equals("")){
                Toast.makeText(this, "Not allowed here!!!", Toast.LENGTH_SHORT).show();
            }
            else {
                THREEbtn.setText(turn);
                String get3=THREEbtn.getText().toString();

                String get1=ONEbtn.getText().toString();
                String get2=TWObtn.getText().toString();

                String get5=FIVEbtn.getText().toString();
                String get7=SEVENbtn.getText().toString();

                String get6=SIXbtn.getText().toString();
                String get9=NINEbtn.getText().toString();

                if (get1.equals(get3) && get2.equals(get3))
                {callToast(name,turn);}
                else if (get5.equals(get3) && get7.equals(get3)){
                    callToast(name, turn);}
                else if (get6.equals(get3) && get9.equals(get3)){
                    callToast(name, turn);}

                turn=switchingTurn(turn);
                Log.d(TAG, turn+ "   "+name);}

        }else if (id==FOURbtn.getId()){                  // 4th button**********************************************************8

            String g4=FOURbtn.getText().toString();
            if(!g4.equals("")){
                Toast.makeText(this, "Not allowed here!!!", Toast.LENGTH_SHORT).show();
            }
            else {
                FOURbtn.setText(turn);
                String get4=FOURbtn.getText().toString();

                String get1=ONEbtn.getText().toString();
                String get7=SEVENbtn.getText().toString();

                String get6=SIXbtn.getText().toString();
                String get5=FIVEbtn.getText().toString();

                if (get1.equals(get4) && get7.equals(get4))
                {callToast(name,turn);}
                else if (get5.equals(get4) && get6.equals(get4)){
                    callToast(name, turn);}

                turn=switchingTurn(turn);
                Log.d(TAG, turn+ "   "+name);}
        }else if (id==FIVEbtn.getId()){                     // 5th button**********************************************************8

            String g5=FIVEbtn.getText().toString();
            if(!g5.equals("")){
                Toast.makeText(this, "Not allowed here!!!", Toast.LENGTH_SHORT).show();
            }
            else {
                FIVEbtn.setText(turn);
                String get5=FIVEbtn.getText().toString();

                String get1=ONEbtn.getText().toString();
                String get9=NINEbtn.getText().toString();

                String get2=TWObtn.getText().toString();
                String get8=EIGHTbtn.getText().toString();

                String get3=THREEbtn.getText().toString();
                String get7=SEVENbtn.getText().toString();

                String get4=FOURbtn.getText().toString();
                String get6=SIXbtn.getText().toString();

                if (get1.equals(get5) && get9.equals(get5))
                {callToast(name,turn);}
                else if (get2.equals(get5) && get8.equals(get5)){
                    callToast(name, turn);}
                else if (get3.equals(get5) && get7.equals(get5)){
                    callToast(name, turn);}
                else if (get4.equals(get5) && get6.equals(get5)){
                    callToast(name, turn);}

                turn=switchingTurn(turn);
                Log.d(TAG, turn+ "   "+name);}
        }else if (id==SIXbtn.getId()){                      // 6th button**********************************************************8

            String g6=SIXbtn.getText().toString();
            if(!g6.equals("")){
                Toast.makeText(this, "Not allowed here!!!", Toast.LENGTH_SHORT).show();
            }
            else {
                SIXbtn.setText(turn);
                String get6=SIXbtn.getText().toString();

                String get3=THREEbtn.getText().toString();
                String get9=NINEbtn.getText().toString();

                String get4=FOURbtn.getText().toString();
                String get5=FIVEbtn.getText().toString();

                if (get3.equals(get6) && get9.equals(get6))
                {callToast(name,turn);}
                else if (get4.equals(get6) && get5.equals(get6)){
                    callToast(name, turn);}

                turn=switchingTurn(turn);
                Log.d(TAG, turn+ "   "+name);}

        }else if (id==SEVENbtn.getId()){                    // 7th button**********************************************************8

            String g7=SEVENbtn.getText().toString();
            if(!g7.equals("")){
                Toast.makeText(this, "Not allowed here!!!", Toast.LENGTH_SHORT).show();

                 }
            else {
                SEVENbtn.setText(turn);
                String get7=SEVENbtn.getText().toString();

                String get1=ONEbtn.getText().toString();
                String get4=FOURbtn.getText().toString();

                String get3=THREEbtn.getText().toString();
                String get5=FIVEbtn.getText().toString();

                String get8=EIGHTbtn.getText().toString();
                String get9=NINEbtn.getText().toString();

                if (get1.equals(get7) && get4.equals(get7))
                {callToast(name,turn);}
                else if (get5.equals(get7) && get3.equals(get7)){
                    callToast(name, turn);}
                else if (get8.equals(get7) && get9.equals(get7)){
                    callToast(name, turn);}

                turn=switchingTurn(turn);
                Log.d(TAG, turn+ "   "+name);}
        }else if (id==EIGHTbtn.getId()){                    // 8th button**********************************************************8

            String g8=EIGHTbtn.getText().toString();
            if(!g8.equals("")){
                Toast.makeText(this, "Not allowed here!!!", Toast.LENGTH_SHORT).show();
            }
            else {
                EIGHTbtn.setText(turn);
                String get8=EIGHTbtn.getText().toString();

                String get2=TWObtn.getText().toString();
                String get5=FIVEbtn.getText().toString();

                String get7=SEVENbtn.getText().toString();
                String get9=NINEbtn.getText().toString();

                if (get2.equals(get8) && get5.equals(get8))
                {callToast(name,turn);}
                else if (get7.equals(get8) && get9.equals(get8)){
                    callToast(name, turn);}

                turn=switchingTurn(turn);
                Log.d(TAG, turn+ "   "+name);}
        }else if (id==NINEbtn.getId()){                     // 9th button**********************************************************8

            String g9=NINEbtn.getText().toString();
            if(!g9.equals("")){
                Toast.makeText(this, "Not allowed here!!!", Toast.LENGTH_SHORT).show();
            }
            else {
                NINEbtn.setText(turn);
                String get9=NINEbtn.getText().toString();

                String get1=ONEbtn.getText().toString();
                String get5=FIVEbtn.getText().toString();

                String get3=THREEbtn.getText().toString();
                String get6=SIXbtn.getText().toString();

                String get7=SEVENbtn.getText().toString();
                String get8=EIGHTbtn.getText().toString();

                if (get1.equals(get9) && get5.equals(get9))
                {callToast(name,turn);}
                else if (get3.equals(get9) && get6.equals(get9)){
                    callToast(name, turn);}
                else if (get7.equals(get9) && get8.equals(get9)){
                    callToast(name, turn);}

                turn=switchingTurn(turn);
                Log.d(TAG, turn+ "   "+name);}
             }

    }else {
    ONEbtn.setText("");
    TWObtn.setText("");
    THREEbtn.setText("");
    FOURbtn.setText("");
    FIVEbtn.setText("");
    SIXbtn.setText("");
    SEVENbtn.setText("");
    EIGHTbtn.setText("");
    NINEbtn.setText("");}

    }

    public void callToast(String nm, String trn) {

       // Toast.makeText(this,nm+ "  Wins with sign  :"+trn,Toast.LENGTH_LONG).show();
      // turn= switchingTurn( turn);
        inflater=getLayoutInflater();
        layout=inflater.inflate(R.layout.custom_toast, (ViewGroup)findViewById(R.id.customToast));

        TextView winnerName=(TextView) layout.findViewById(R.id.WinnerNameTxt);
        winnerName.setText(nm+"  ( "+ trn +"  )");

        Toast toast=new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL,0,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d("LATE","<<<<<<<<<<<<< DELAYED >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                ONEbtn.setText("");
                TWObtn.setText("");
                THREEbtn.setText("");
                FOURbtn.setText("");
                FIVEbtn.setText("");
                SIXbtn.setText("");
                SEVENbtn.setText("");
                EIGHTbtn.setText("");
                NINEbtn.setText("");
            }
        }, 4000);  // 9sec delayed


    }


    public String switchingTurn( String Sign ){
        if (Sign.equals("0")){
             name=PL_A;
             playerA.setText(TAG+" "+ name);
             playerB.setText("");
             Toast.makeText(this, name+"  turn", Toast.LENGTH_SHORT).show();
            turn="X";


        }else if (Sign.equals("X")){
            name=PL_B;
            playerB.setText(TAG+" "+ name);
            playerA.setText("");
            Toast.makeText(this, name+"  turn", Toast.LENGTH_SHORT).show();
            turn="0";
        }
        return turn;
    }
}
