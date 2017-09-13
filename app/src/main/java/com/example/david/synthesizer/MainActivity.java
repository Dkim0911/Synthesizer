package com.example.david.synthesizer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button aButton, asButton, bButton, cButton, csButton, dButton, dsButton, eButton, fButton, fsButton, gButton, gsButton,ecaleButton,twinkleButton;
    private Button highaButton, highbbButton, highbButton, highcButton, highcsButton, highdButton, highdsButton, higheButton, highfButton, highfsButton, highgButton, highgsButton;
    private MediaPlayer aNote, asNote, bNote, cNote, csNote, dNote, dsNote, eNote, fNote, fsNote, gNote,gsNote,highaNote,highbbNote,highbNote,highcNote,highcsNote,highdNote,highdsNote,higheNote,highfNote,highfsNote,highgNote,highgsNote;
    private NumberPicker notePicker;
    private final int WHOLE_NOTE = 1000;
    //whatever

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wireWidgets();
        setListeners();
        createMediaPlayers();





    }


    private void delayPlaying(int delay) {

        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    private void createMediaPlayers() {
        aNote = MediaPlayer.create(this, R.raw.scalea);
        asNote = MediaPlayer.create(this, R.raw.scaleas);
        bNote = MediaPlayer.create(this, R.raw.scaleb);
        cNote = MediaPlayer.create(this, R.raw.scalec);
        csNote = MediaPlayer.create(this, R.raw.scalecs);
        dNote = MediaPlayer.create(this, R.raw.scaled);
        dsNote = MediaPlayer.create(this, R.raw.scaleds);
        eNote = MediaPlayer.create(this, R.raw.scalee);
        fNote = MediaPlayer.create(this, R.raw.scalef);
        fsNote = MediaPlayer.create(this, R.raw.scalefs);
        gNote = MediaPlayer.create(this, R.raw.scaleg);
        gsNote = MediaPlayer.create(this, R.raw.scalegs);
        highaNote = MediaPlayer.create(this, R.raw.scalehigha);
        highbbNote=MediaPlayer.create(this, R.raw.scalehighbb);
        highbNote=MediaPlayer.create(this, R.raw.scalehighb);
        highcNote=MediaPlayer.create(this, R.raw.scalehighc);
        highcsNote=MediaPlayer.create(this, R.raw.scalehighcs);
        highdNote=MediaPlayer.create(this, R.raw.scalehighd);
        highdsNote=MediaPlayer.create(this, R.raw.scalehighds);
        higheNote=MediaPlayer.create(this, R.raw.scalehighe);
        highfNote=MediaPlayer.create(this, R.raw.scalehighf);
        highfsNote=MediaPlayer.create(this, R.raw.scalehighfs);
        highgNote=MediaPlayer.create(this, R.raw.scalehighg);
        highgsNote=MediaPlayer.create(this, R.raw.scalehighgs);




    }

    private void setListeners() {
        aButton.setOnClickListener(this);
        asButton.setOnClickListener(this);
        bButton.setOnClickListener(this);
        cButton.setOnClickListener(this);
        csButton.setOnClickListener(this);
        dButton.setOnClickListener(this);
        dsButton.setOnClickListener(this);
        eButton.setOnClickListener(this);
        fButton.setOnClickListener(this);
        fsButton.setOnClickListener(this);
        gButton.setOnClickListener(this);
        gsButton.setOnClickListener(this);
        ecaleButton.setOnClickListener(this);
        highaButton.setOnClickListener(this);
        highbbButton.setOnClickListener(this);
        highbButton.setOnClickListener(this);
        highcButton.setOnClickListener(this);
        highcsButton.setOnClickListener(this);
        highdButton.setOnClickListener(this);
        highdsButton.setOnClickListener(this);
        higheButton.setOnClickListener(this);
        highfButton.setOnClickListener(this);
        highfsButton.setOnClickListener(this);
        highgButton.setOnClickListener(this);
        highgsButton.setOnClickListener(this);
        twinkleButton.setOnClickListener(this);
    }

    private void wireWidgets() {
        aButton = (Button) findViewById(R.id.button_a);
        asButton = (Button) findViewById(R.id.button_as);
        bButton = (Button) findViewById(R.id.button_b);
        cButton = (Button) findViewById(R.id.button_c);
        csButton = (Button) findViewById(R.id.button_cs);
        dButton = (Button) findViewById(R.id.button_d);
        dsButton = (Button) findViewById(R.id.button_ds);
        eButton = (Button) findViewById(R.id.button_e);
        fButton = (Button) findViewById(R.id.button_f);
        fsButton = (Button) findViewById(R.id.button_fs);
        gButton = (Button) findViewById(R.id.button_g);
        gsButton = (Button) findViewById(R.id.button_gs);
        notePicker =(NumberPicker) findViewById(R.id.notePIcker);
        notePicker.setMinValue(1);
        notePicker.setMaxValue(100);
        ecaleButton=(Button)findViewById(R.id.button_escale);
        highaButton =(Button)findViewById(R.id.button_higha);
        highbbButton =(Button)findViewById(R.id.button_highbb);
        highbButton =(Button)findViewById(R.id.button_highb);
        highcButton =(Button)findViewById(R.id.button_highc);
        highcsButton =(Button)findViewById(R.id.button_highcs);
        highdButton =(Button)findViewById(R.id.button_highd);
        highdsButton =(Button)findViewById(R.id.button_highds);
        higheButton =(Button)findViewById(R.id.button_highe);
        highfButton =(Button)findViewById(R.id.button_highf);
        highfsButton =(Button)findViewById(R.id.button_highfs);
        highgButton =(Button)findViewById(R.id.button_highg);
        highgsButton =(Button)findViewById(R.id.button_highgs);
        twinkleButton =(Button)findViewById(R.id.button_star);
    }

    @Override
    public void onClick(View view) {
        int times= notePicker.getValue();
        int i =0;

        switch (view.getId()) {

            case R.id.button_a:
            for(i=0; i<times; i++) {
                aNote.seekTo(0);
                aNote.start();
                delayPlaying(1000);

            }
            break;
            case R.id.button_as:
                for(i=0; i<times; i++) {
                    asNote.seekTo(0);
                    asNote.start();
                    delayPlaying(1000);

                }
                break;
            case R.id.button_b:
                for(i=0; i<times; i++) {
                bNote.seekTo(0);
                bNote.start();
                    delayPlaying(1000);
                }
                break;
            case R.id.button_c:
                for(i=0; i<times; i++) {
                cNote.seekTo(0);
                cNote.start();
                    delayPlaying(1000);
                }
                break;
            case R.id.button_cs:
                for(i=0; i<times; i++) {
                csNote.seekTo(0);
                csNote.start();
                    delayPlaying(1000);
                }
                break;
            case R.id.button_d:
                for(i=0; i<times; i++) {
                dNote.seekTo(0);
                dNote.start();
                    delayPlaying(1000);
               }
                break;
            case R.id.button_ds:
                for(i=0; i<times; i++) {
                dsNote.seekTo(0);
                dsNote.start();
                    delayPlaying(1000);
                }
                break;
            case R.id.button_e:
                for(i=0; i<times; i++) {
                eNote.seekTo(0);
                eNote.start();
                    delayPlaying(1000);
               }
                break;
            case R.id.button_f:
                for(i=0; i<times; i++) {
                fNote.seekTo(0);
                fNote.start();
                    delayPlaying(1000);
                }
                break;
            case R.id.button_fs:
                for(i=0; i<times; i++) {
                fsNote.seekTo(0);
                fsNote.start();
                    delayPlaying(1000);
                }
                break;
            case R.id.button_g:
                for(i=0; i<times; i++) {
                gNote.seekTo(0);
                gNote.start();
                    delayPlaying(1000);
                }
                break;
            case R.id.button_gs:
                for(i=0; i<times; i++) {
                gsNote.seekTo(0);
                gsNote.start();
                    delayPlaying(1000);
                }
                break;
            case R.id.button_higha:
                for(i=0; i<times; i++) {
                    highaNote.seekTo(0);
                    highaNote.start();
                    delayPlaying(1000);
                }
            case R.id.button_highbb:
                for(i=0; i<times; i++) {
                    highbbNote.seekTo(0);
                    highbbNote.start();
                    delayPlaying(1000);
                }
                break;
            case R.id.button_highb:
                for(i=0; i<times; i++) {
                    highbNote.seekTo(0);
                    highbNote.start();
                    delayPlaying(1000);
                }
                break;
            case R.id.button_highc:
                for(i=0; i<times; i++) {
                    highcNote.seekTo(0);
                    highcNote.start();
                    delayPlaying(1000);
                }
                break;
            case R.id.button_highcs:
                for(i=0; i<times; i++) {
                    highcsNote.seekTo(0);
                    highcsNote.start();
                    delayPlaying(1000);
                }
                break;
            case R.id.button_highd:
                for(i=0; i<times; i++) {
                    highdNote.seekTo(0);
                    highdNote.start();
                    delayPlaying(1000);
                }
                break;
            case R.id.button_highds:
                for(i=0; i<times; i++) {
                    highdsNote.seekTo(0);
                    highdsNote.start();
                    delayPlaying(1000);
                }
                break;
            case R.id.button_highe:
                for(i=0; i<times; i++) {
                    higheNote.seekTo(0);
                    higheNote.start();
                    delayPlaying(1000);
                }
                break;
            case R.id.button_highf:
                for(i=0; i<times; i++) {
                    highfNote.seekTo(0);
                    highfNote.start();
                    delayPlaying(1000);
                }
                break;
            case R.id.button_highfs:
                for(i=0; i<times; i++) {
                    highfsNote.seekTo(0);
                    highfsNote.start();
                    delayPlaying(1000);
                }
                break;
            case R.id.button_highg:
                for(i=0; i<times; i++) {
                    highgNote.seekTo(0);
                    highgNote.start();
                    delayPlaying(1000);
                }
                break;
            case R.id.button_highgs:
                for(i=0; i<times; i++) {
                    highgsNote.seekTo(0);
                    highgsNote.start();
                    delayPlaying(1000);
                }
                break;
            case R.id.button_escale:
                aNote.seekTo(0);
                aNote.start();
                delayPlaying(500);
                asNote.seekTo(0);
                asNote.start();
                delayPlaying(500);
                bNote.seekTo(0);
                bNote.start();
                delayPlaying(500);
                cNote.seekTo(0);
                cNote.start();
                delayPlaying(500);
                csNote.seekTo(0);
                csNote.start();
                delayPlaying(500);
                dNote.seekTo(0);
                dNote.start();
                delayPlaying(500);
                dsNote.seekTo(0);
                dsNote.start();
                delayPlaying(500);
                eNote.seekTo(0);
                eNote.start();
                delayPlaying(500);
                fNote.seekTo(0);
                fNote.start();
                delayPlaying(500);
                fsNote.seekTo(0);
                fsNote.start();
                delayPlaying(500);
                gNote.seekTo(0);
                gNote.start();
                delayPlaying(500);
                gsNote.seekTo(0);
                gsNote.start();
                highaNote.seekTo(0);
                highaNote.start();
                delayPlaying(500);
                highbbNote.seekTo(0);
                highbbNote.start();
                delayPlaying(500);
                highbNote.seekTo(0);
                highbNote.start();
                delayPlaying(500);
                highcNote.seekTo(0);
                highcNote.start();
                delayPlaying(500);
                highcsNote.seekTo(0);
                highcsNote.start();
                delayPlaying(500);
                highdNote.seekTo(0);
                highdNote.start();
                delayPlaying(500);
                highdsNote.seekTo(0);
                highdsNote.start();
                delayPlaying(500);
                higheNote.seekTo(0);
                higheNote.start();
                delayPlaying(500);
                highfNote.seekTo(0);
                highfNote.start();
                delayPlaying(500);
                highfsNote.seekTo(0);
                highfsNote.start();
                delayPlaying(500);
                highgNote.seekTo(0);
                highgNote.start();
                delayPlaying(500);
                highgsNote.seekTo(0);
                highgsNote.start();
                break;
            case R.id.button_star:
                aNote.seekTo(0);
                aNote.start();
                delayPlaying(300);
                aNote.seekTo(0);
                aNote.start();
                delayPlaying(600);
                higheNote.seekTo(0);
                higheNote.start();
                delayPlaying(300);
                higheNote.seekTo(0);
                higheNote.start();
                delayPlaying(600);
                highfsNote.seekTo(0);
                highfsNote.start();
                delayPlaying(300);
                highfsNote.seekTo(0);
                highfsNote.start();
                delayPlaying(600);
                higheNote.seekTo(0);
                higheNote.start();
                delayPlaying(300);
                higheNote.seekTo(0);
                higheNote.start();
                delayPlaying(600);
                dNote.seekTo(0);
                dNote.start();
                delayPlaying(300);
                dNote.seekTo(0);
                dNote.start();
                delayPlaying(600);
                csNote.seekTo(0);
                csNote.start();
                delayPlaying(300);
                csNote.seekTo(0);
                csNote.start();
                delayPlaying(600);
                bNote.seekTo(0);
                bNote.start();
                delayPlaying(300);
                bNote.seekTo(0);
                bNote.start();
                delayPlaying(600);
                aNote.seekTo(0);
                aNote.start();
                delayPlaying(300);
                higheNote.seekTo(0);
                higheNote.start();
                delayPlaying(600);
                higheNote.seekTo(0);
                higheNote.start();
                delayPlaying(300);
                dNote.seekTo(0);
                dNote.start();
                delayPlaying(600);
                dNote.seekTo(0);
                dNote.start();
                delayPlaying(300);
                csNote.seekTo(0);
                csNote.start();
                delayPlaying(600);
                csNote.seekTo(0);
                csNote.start();
                delayPlaying(300);
                bNote.seekTo(0);
                bNote.start();
                delayPlaying(600);






            default:
        }
    }

}
