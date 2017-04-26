package vikas.com.timesetchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mResultTextView;
    private static final float ADD_CONSTANT = 12.61f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mResultTextView = (TextView) findViewById(R.id.tv_result);
        findViewById(R.id.button_1).setOnClickListener(this);
        findViewById(R.id.button_2).setOnClickListener(this);
        findViewById(R.id.button_3).setOnClickListener(this);
        findViewById(R.id.button_4).setOnClickListener(this);
        findViewById(R.id.button_5).setOnClickListener(this);
        findViewById(R.id.button_6).setOnClickListener(this);
        findViewById(R.id.button_7).setOnClickListener(this);
        findViewById(R.id.button_8).setOnClickListener(this);
        findViewById(R.id.button_9).setOnClickListener(this);
        findViewById(R.id.button_11).setOnClickListener(this);
        findViewById(R.id.button_12).setOnClickListener(this);
        findViewById(R.id.button_13).setOnClickListener(this);
        findViewById(R.id.button_14).setOnClickListener(this);
        findViewById(R.id.button_15).setOnClickListener(this);
        findViewById(R.id.button_17).setOnClickListener(this);
        findViewById(R.id.button_18).setOnClickListener(this);
        findViewById(R.id.button_19).setOnClickListener(this);
        findViewById(R.id.button_20).setOnClickListener(this);
        findViewById(R.id.button_21).setOnClickListener(this);
        findViewById(R.id.button_22).setOnClickListener(this);
        findViewById(R.id.button_23).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_1:
                this.add(1);
                break;
            case R.id.button_2:
                this.add(2);
                break;
            case R.id.button_3:
                this.add(3);
                break;
            case R.id.button_4:
                this.add(4);
                break;
            case R.id.button_5:
                this.add(5);
                break;
            case R.id.button_6:
                this.add(6);
                break;
            case R.id.button_7:
                this.add(7);
                break;
            case R.id.button_8:
                this.add(8);
                break;
            case R.id.button_9:
                this.add(9);
                break;
            case R.id.button_11:
                this.add(11);
                break;
            case R.id.button_12:
                this.add(12);
                break;
            case R.id.button_13:
                this.add(13);
                break;
            case R.id.button_14:
                this.add(14);
                break;
            case R.id.button_15:
                this.add(15);
                break;
            case R.id.button_17:
                this.add(17);
                break;
            case R.id.button_18:
                this.add(18);
                break;
            case R.id.button_19:
                this.add(19);
                break;
            case R.id.button_20:
                this.add(20);
                break;
            case R.id.button_21:
                this.add(21);
                break;
            case R.id.button_22:
                this.add(22);
                break;
            case R.id.button_23:
                this.add(23);
                break;

        }

    }

    /**
     * Adding supplied value and showing result
     * @param val
     */
    private void add(int val) {
        this.mResultTextView.setText(getText(R.string.Result) + String.valueOf(ADD_CONSTANT + val));
    }

}
