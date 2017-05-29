package youn0045.kr.hs.emirim.dialogtest;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{//온클릭 리스너가 일시킬수 있는 핸들러로 만들기 위해

    String []ItemArr ={"대한", "민국", "만세"};
    Button butDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butDialog = (Button)findViewById(R.id.but_dialog);
        butDialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("First Dialog");
        dialog.setIcon(R.drawable.candy);
      ///*dialog.setMessage("There is writing room");
        //dialog.setItems(ItemArr, new DialogInterface.OnClickListener() {
            //@Override
            //public void onClick(DialogInterface dialogInterface, int i) {
           //     butDialog.setText(ItemArr[i]);
         //   }
       // });

        //
        dialog.setSingleChoiceItems(ItemArr, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                butDialog.setText(ItemArr[i]);
            }
        });
        dialog.show();
    }
}
