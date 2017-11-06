package my.edu.taruc.lab22userprofile;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_PROFILE_UPDATE = 0;
    public static final String USER_ID = "my.edu.taruc.lab22userprofile.ID";
    public static final String USER_EMAIL = "my.edu.taruc.lab22userprofile.EMAIL";
    TextView textViewID, textViewEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewID = (TextView)findViewById(R.id.textViewID);
        textViewEmail = (TextView)findViewById(R.id.textViewEmail);
    }

    public void editProfile(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivityForResult(intent, REQUEST_PROFILE_UPDATE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        String id, email;
        id = "";
        email = "";
        if(requestCode == REQUEST_PROFILE_UPDATE) {

            id = data.getStringExtra(USER_ID);
            email = data.getStringExtra(USER_EMAIL);
        }

        textViewID.setText(id);
        textViewEmail.setText(email);
    }

    protected void onPause() {
        super.onPause();
        Log.d("Main Activity", "onPause");
    }

    protected void onStart() {
        super.onStart();
        Log.d("Main Activity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Main Activity", "onResume");
    }
}
