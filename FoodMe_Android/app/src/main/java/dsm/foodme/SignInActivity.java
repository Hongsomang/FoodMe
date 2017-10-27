package dsm.foodme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity {
    private EditText inputId;
    private EditText inputPw;
    private TextView findId;
    private TextView findPw;
    private TextView startNotMember;
    private TextView notMember;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        notMember = (TextView) findViewById(R.id.not_member);
        notMember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this,SignUpActivity.class);
                startActivity(intent);
            }
        });

        startNotMember = (TextView) findViewById(R.id.start_not_member);
        startNotMember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
