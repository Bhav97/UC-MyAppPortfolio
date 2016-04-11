package bhav.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mBtn_pop_mov , mBtn_stk_hwk , mBtn_bld_bggr , mBtn_app_mtrl , mBtn_ubi , mBtn_cap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtn_pop_mov = (Button) findViewById(R.id.button);
        mBtn_stk_hwk = (Button) findViewById(R.id.button2);
        mBtn_bld_bggr = (Button) findViewById(R.id.button3);
        mBtn_app_mtrl = (Button) findViewById(R.id.button4);
        mBtn_ubi = (Button) findViewById(R.id.button5);
        mBtn_cap = (Button) findViewById(R.id.button6);
        
        mBtn_pop_mov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my popular movies app!",
                        Toast.LENGTH_SHORT).show();
            }
        });
        mBtn_stk_hwk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my stock hawk app!",
                        Toast.LENGTH_SHORT).show();
            }
        });
        mBtn_bld_bggr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my build it bigger app!",
                        Toast.LENGTH_SHORT).show();
            }
        });
        mBtn_app_mtrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my make your app material app!",
                        Toast.LENGTH_SHORT).show();
            }
        });
        mBtn_ubi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my go ubiquitous app!",
                        Toast.LENGTH_SHORT).show();
            }
        });
        mBtn_cap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my capstone app!",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
