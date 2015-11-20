package sg.com.kaplan.pdma.dmirage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.RadioGroup;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    final Context context = this;
    private Button button;
    MediaPlayer btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button Sound
        btn = MediaPlayer.create(MainActivity.this, R.raw.btn_sound);
        button = (Button) findViewById(R.id.btnAbout);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setTitle("Dream Mirage");
                alertDialogBuilder
                        .setMessage("Do you really want to exit !")
                        .setCancelable(false)
                        .setPositiveButton("Yes",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,
                                                        int id) {
                                        MainActivity.this.finish();
                                    }
                                })
                        .setNegativeButton("No",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,
                                                        int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }

        });
    }

    public void play(View v)
    {
        Intent i=new Intent(this,Game.class);
        btn.start();
        startActivity(i);

    }

    public void highscore(View v)
    {
        Intent i=new Intent(this,Highscore.class);
        btn.start();
        startActivity(i);
    }

    public void setting(View v)
    {
        Intent i=new Intent(this,Setting.class);
        btn.start();
        startActivity(i);
    }

    public void gallery(View v)
    {
        Intent i=new Intent(this,ImageGallery.class);
        btn.start();
        startActivity(i);
    }

}
