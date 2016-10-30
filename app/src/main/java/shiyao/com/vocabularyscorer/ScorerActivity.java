package shiyao.com.vocabularyscorer;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ScorerActivity extends AppCompatActivity {

    private Button correct;

    private Button wrong;

    private Button reset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scorer);

        this.correct = (Button) this.findViewById(R.id.correct);
        this.wrong = (Button) this.findViewById(R.id.wrong);
        this.reset = (Button) this.findViewById(R.id.reset);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(ScorerActivity.this);
                dialog.setTitle("是否确定要重置？");
                dialog.setCancelable(false);
                dialog.setMessage("重置将会清空当前记录");
                dialog.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface diaglog, int which) {
                        ScorerActivity.this.finish();;
                    }
                });
                dialog.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface diaglog, int which) {
                    }
                });
                dialog.show();
            }
        });
    }

}
