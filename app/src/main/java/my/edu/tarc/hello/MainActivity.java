package my.edu.tarc.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewMsg; // TextView = a class
                          //textViewMsg= instance

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //on create()= main() function
        super.onCreate(savedInstanceState);//calling the super class to do
        //Display UI
        //R = resource class
        setContentView(R.layout.activity_main);


        //Link UI to program
        textViewMsg=findViewById(R.id.TextViewMessage);

    }

    public void showMessage(View view){
        textViewMsg.setText("Hello,<Wong Wei Yao>");

    }
}
