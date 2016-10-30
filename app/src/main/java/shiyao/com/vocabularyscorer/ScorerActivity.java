package shiyao.com.vocabularyscorer;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScorerActivity extends AppCompatActivity {

    private Button correct;

    private Button wrong;

    private Button reset;

    private TextView correctNbrTextView;

    private TextView wrongNbrTextView;

    private TextView countTextView;

    private TextView progressTextView;

    private TextView rateTextView;

    private Status status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scorer);

        this.correct = (Button) this.findViewById(R.id.correct);
        this.wrong = (Button) this.findViewById(R.id.wrong);
        this.reset = (Button) this.findViewById(R.id.reset);
        this.correctNbrTextView = (TextView) this.findViewById(R.id.correct_nbr);
        this.wrongNbrTextView = (TextView) this.findViewById(R.id.wrong_nbr);
        this.countTextView = (TextView) this.findViewById(R.id.count);
        this.progressTextView = (TextView) this.findViewById(R.id.progress);
        this.rateTextView = (TextView) this.findViewById(R.id.rate);

        Intent intent = this.getIntent();
        int totalCount = Integer.valueOf(intent.getStringExtra("totalCount"));
        this.status = new Status(totalCount);
        this.updateView();

        this.correct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ScorerActivity.this.status.correct();
                updateView();
            }
        });

        this.wrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ScorerActivity.this.status.wrong();
                updateView();
            }
        });

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

    private void updateView() {
        this.correctNbrTextView.setText(Integer.toString(this.status.getCorrectNbr()));
        this.wrongNbrTextView.setText(Integer.toString(this.status.getWrongNbr()));
        this.countTextView.setText(Integer.toString(this.status.getCount()));
        this.progressTextView.setText(this.status.getProgressStr());
        this.rateTextView.setText(this.status.getRateStr());
    }

}
