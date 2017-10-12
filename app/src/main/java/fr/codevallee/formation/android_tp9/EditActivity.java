package fr.codevallee.formation.android_tp9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class EditActivity extends Traceur {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
    }

    /* protected void onRestoreInstanceState(Bundle savedInstanceState) {
        EditText text = (EditText) findViewById(R.id.editText);
        text.setText(savedInstanceState.getString("text"));
    }

    protected void onSaveInstanceState(Bundle outState) {
        EditText text = (EditText) findViewById(R.id.editText);
        outState.putString("text", text.getText().toString() + " saved");
    } //*/
}
