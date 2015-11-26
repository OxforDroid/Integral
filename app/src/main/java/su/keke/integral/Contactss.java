package su.keke.integral;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class Contactss extends AppCompatActivity {
    String contact = "pahka@gmail.com";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactss);
    }

    public void onclc(View view) {
        Intent emailIntent = getPackageManager().getLaunchIntentForPackage("com.android.email");

        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] { contact });

        startActivity(emailIntent);

    }


    public void call(View view) {
        Intent in=new Intent(Intent.ACTION_CALL, Uri.parse("+79145733204"));
        try{
            startActivity(in);
        }

        catch (android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(), "yourActivity is not founded", Toast.LENGTH_SHORT).show();
        }
        // Создаем объект Intent для вызова новой Activity
        Intent intent = new Intent(this, Contactss.class);
        // запуск activity
        startActivity(intent);
    }
}
