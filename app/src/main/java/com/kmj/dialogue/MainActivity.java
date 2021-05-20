package com.kmj.dialogue;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // 출력할 항목의 문자열 배열
                final String[] versionArray = new String[]{"파이", "Q(10)", "R(11)"};
                final boolean[] checkArray = new boolean[] {true,false,false};


                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("좋아하는 버전은?");
                dlg.setIcon(R.mipmap.ic_launcher);

                dlg.setMultiChoiceItems(versionArray, checkArray, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                        button1.setText(versionArray[i]);
                    }
                });


                //목록 대화상자 setSingleChoiceItems
//                dlg.setSingleChoiceItems(versionArray, 0, new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        button1.setText(versionArray[i]);
//                    }
//                });


                //목록 대화상자 setItems
//                dlg.setItems(versionArray, new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        button1.setText(versionArray[i]);
//                    }
//                });

                //기본 대화상자 setPositiveButton
//                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        Toast.makeText(MainActivity.this, "확인을 눌렀네요", Toast.LENGTH_SHORT).show();
//                        ;
//                    }
//                });
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
    }
}