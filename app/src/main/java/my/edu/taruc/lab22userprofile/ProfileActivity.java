package my.edu.taruc.lab22userprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ProfileActivity extends AppCompatActivity {
    public static final int REQUEST_PROFILE_UPDATE = 0;


    EditText editTextID, editTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);




    }

    public void save(View view) {
        editTextID = (EditText) findViewById(R.id.editTextID);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);

        String id, email;
        Intent intent = new Intent();
        id = editTextID.getText().toString();
        email = editTextEmail.getText().toString();
        intent.putExtra(MainActivity.USER_ID, id);
        intent.putExtra(MainActivity.USER_EMAIL, email);

        setResult(REQUEST_PROFILE_UPDATE, intent);
        finish();
    }
}
