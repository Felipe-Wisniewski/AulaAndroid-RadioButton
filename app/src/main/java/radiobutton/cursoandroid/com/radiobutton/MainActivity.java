package radiobutton.cursoandroid.com.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButtonEscolhido;
    private Button botaoMostrar;
    private TextView textoExibir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroupId);
        botaoMostrar = (Button) findViewById(R.id.botaoMostrarId);
        textoExibir = (TextView) findViewById(R.id.textoExibicaoId);

        botaoMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int idRadioButton = radioGroup.getCheckedRadioButtonId();
                if(idRadioButton > 0){
                    radioButtonEscolhido = (RadioButton) findViewById(idRadioButton);
                    textoExibir.setText(radioButtonEscolhido.getText());
                }
            }
        });
    }
}
