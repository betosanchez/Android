package org.login;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	static EditText usuario;
	static EditText cont;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		usuario = (EditText) findViewById(R.id.usuario);
		cont = (EditText) findViewById(R.id.cont);
		
		Button btnentrar = (Button) findViewById(R.id.btnEntrar);
		
		btnentrar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(usuario.getText().toString().length()==0 || cont.getText().toString().length()==0){
					Toast.makeText(arg0.getContext(),"Ingrese los valores por favor",Toast.LENGTH_SHORT).show();
				}
				else{
					if(usuario.getText().toString().equals("beto") && cont.getText().toString().equals("hola")){
						Toast.makeText(arg0.getContext(),"Puedes Entrar",Toast.LENGTH_SHORT).show();
					}
					else{
						Toast.makeText(arg0.getContext(),"Los datos son incorrectos",Toast.LENGTH_SHORT).show();
					}
				}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
