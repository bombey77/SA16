package bombey77.sa16;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        setContentView(linearLayout, layoutParams);

        ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        TextView textView = new TextView(this);
        textView.setText("Roman");
        textView.setLayoutParams(lp);
        linearLayout.addView(textView);

        //1 способ
        Button button = new Button(this);
        button.setText("Knopka");
        linearLayout.addView(button, lp);

        //1 способ
        TextView textView1 = new TextView(this);
        textView1.setText("Konoplya");
        textView1.setLayoutParams(lp);
        linearLayout.addView(textView1);
    }
}
