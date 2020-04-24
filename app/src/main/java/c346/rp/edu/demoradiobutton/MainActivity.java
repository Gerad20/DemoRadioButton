package c346.rp.edu.demoradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup notes;
    Button DisplayNote;
    RadioButton ChosenNotes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notes = findViewById(R.id.radioGroup1);
        DisplayNote = findViewById(R.id.Display);

        DisplayNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(notes.getCheckedRadioButtonId() == -1){

                }else{
                    int chosenNoteId = notes.getCheckedRadioButtonId();
                    ChosenNotes = (RadioButton)findViewById(chosenNoteId);
                    String NoteToBeDisplayed = ChosenNotes.getText().toString();
                    Toast.makeText(getBaseContext(),NoteToBeDisplayed,Toast.LENGTH_LONG).show();


                }

            }
        });




    }
}
