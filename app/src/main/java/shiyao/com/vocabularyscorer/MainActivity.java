package shiyao.com.vocabularyscorer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Status currentStatus;

    private Button begin;

    private EditText totalNumberInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.begin = (Button) this.findViewById(R.id.begin);
        this.totalNumberInput = (EditText) this.findViewById(R.id.total_count);
        begin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String totalCount = MainActivity.this.totalNumberInput.getText().toString();

                if (totalCount == null || totalCount.isEmpty() || Integer.valueOf(totalCount) <= 0) {
                    Toast.makeText(MainActivity.this, "请输入一个正确数字", Toast.LENGTH_SHORT).show();
                    return;
                }
                MainActivity.this.currentStatus = new Status(Integer.valueOf(totalCount));
            }
        });

    }
}
