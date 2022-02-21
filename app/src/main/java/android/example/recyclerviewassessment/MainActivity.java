package android.example.recyclerviewassessment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter programAdapter;
    RecyclerView.LayoutManager layoutManager;
    public static String DEBUG_TAG = MainActivity.class.getSimpleName();

    String[] programNameList = {"C", "C++", "Java", "Android", "HTML5", "CSS3", "Javascript", "jQuery",
            "Bootstrap", "PHP", "MySQL", "CodeIgniter", "React", "NodeJS", "AngularJS", "PostgreSQL", "Python",
            "C#", "Wordpress", "Github"};
    String[] programDescriptionList = {"C Description", "C++ Description", "Java Description", "Android Description",
            "HTML5 Description", "CSS3 Description", "Javascript Description", "jQuery Description",
            "Bootstrap Description", "PHP Description", "MySQL Description", "CodeIgniter Description",
            "React Description", "NodeJS Description", "AngularJS Description", "PostgreSQL Description",
            "Python Description", "C# Description", "Wordpress Description", "Github Description"};
    int[] programImages = {R.drawable.c, R.drawable.cplusplus, R.drawable.java, R.drawable.android, R.drawable.html5,
            R.drawable.css3, R.drawable.javascript, R.drawable.jquery, R.drawable.bootstrap, R.drawable.php,
            R.drawable.mysql, R.drawable.codeigniter, R.drawable.react, R.drawable.nodejs, R.drawable.angularjs,
            R.drawable.postgresql, R.drawable.python, R.drawable.csharp, R.drawable.wordpress, R.drawable.github};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rvProgram);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        programAdapter = new ProgramAdapter(this, programNameList, programDescriptionList, programImages);
        recyclerView.setAdapter(programAdapter);

        recyclerView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    Log.d(DEBUG_TAG,"Action was DOWN");
                    return true;
                    //create a switch statement out of this

                }
                return false;
            }
        });

    }


}