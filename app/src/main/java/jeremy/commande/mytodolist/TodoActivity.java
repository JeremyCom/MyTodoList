package jeremy.commande.mytodolist;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by commanje on 16/01/2017.
 */

public class TodoActivity extends Activity implements View.OnClickListener{
    private Button btnValider;
    private Button btnVider;
    private EditText editText;
    private TextView textView;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_layout);
        btnValider = (Button) findViewById(R.id.btnValiderID);
        btnValider.setOnClickListener(this);
        btnVider = (Button) findViewById(R.id.btnViderLaListeID);
        btnVider.setOnClickListener(this);
        editText = (EditText) findViewById(R.id.editText1);
        textView = (TextView) findViewById(R.id.textView1);
        //iuhiu
    }

    @Override
    public void onClick(View v) {
        String NewActivity = editText.getText().toString();
        String Activities = textView.getText().toString();
        if (v.getId() == R.id.btnValiderID){
            textView.setText(Activities + "\n" + NewActivity);
        }
        if (v.getId() == R.id.btnViderLaListeID){
            textView.setText("");
        }

    }
}

