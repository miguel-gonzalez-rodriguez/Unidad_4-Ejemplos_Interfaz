package gal.cifpacarballeira.unidad4_ejemplosinterfaz;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Configurar la Toolbar y el botón de navegación
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_launcher_foreground);
//        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//            // Acción al presionar el ícono de navegación
//                finish();
//            }
//        });


//        // Configurar el TabLayout
//        TabLayout tabLayout = findViewById(R.id.tabLayout);
//        // Añadir pestañas
//        tabLayout.addTab(tabLayout.newTab().setText("Tab 1"));
//        tabLayout.addTab(tabLayout.newTab().setText("Tab 2"));
//        tabLayout.addTab(tabLayout.newTab().setText("Tab 3"));
//        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                // Acción al seleccionar una pestaña
//                Log.d("TabLayout", "Tab seleccionada: " + tab.getText());
//            }
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//                // Acción al deseleccionar una pestaña
//            }
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//                // Acción al volver a seleccionar una pestaña
//            }
//        });

//        // Configuración Snackbar
//        Snackbar snackbar = Snackbar.make(findViewById(R.id.main), "Mensaje de prueba", Snackbar.LENGTH_LONG);
//        snackbar.setAction("Deshacer", new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//            // Acción al hacer clic en "Deshacer"
//                Toast.makeText(getApplicationContext(), "Acción deshecha", Toast.LENGTH_SHORT).show();    }});
//
//        snackbar.show();

//        // Configuración FAB
//        FloatingActionButton fab = findViewById(R.id.floatingActionButton);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Acción al pulsar el fab
//                Toast.makeText(MainActivity.this, "FAB pulsado", Toast.LENGTH_SHORT).show();
//            }
//        });
        }

}