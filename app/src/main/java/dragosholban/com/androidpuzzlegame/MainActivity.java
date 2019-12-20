package dragosholban.com.androidpuzzlegame;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void lanzar(View v){
        Toast.makeText(this, "hola", Toast.LENGTH_SHORT).show();
        FragmentPuzle fragment = new FragmentPuzle();
        Bundle bundle = new Bundle();
        bundle.putInt(FragmentPuzle.ARG_IMAGEN, R.drawable.tren);
        fragment.setArguments(bundle);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_frame, fragment);
        transaction.commit();
        transaction.addToBackStack("Fragment");
    }
}
