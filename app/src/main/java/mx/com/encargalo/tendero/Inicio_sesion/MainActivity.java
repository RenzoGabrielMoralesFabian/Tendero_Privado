package mx.com.encargalo.tendero.Inicio_sesion;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import mx.com.encargalo.R;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        //
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_mi_tienda,
                R.id.nav_mis_productos,
                R.id.nav_mis_ordenes,
                R.id.nav_mi_publicidad,
//                R.id.nav_crearanuncio,
//                R.id.nav_detalleanuncio,
//                R.id.nav_listadomisanuncios,
//                R.id.nav_pagaranuncios,
//                R.id.nav_codigopago,
                R.id.nav_mi_aprendizaje,
//                R.id.nav_categoriaaprendizaje,
//                R.id.nav_cursoscategoriavender,
//                R.id.nav_cursoscategoriautoaprendizaje,
//                R.id.nav_cursoscategoriaoperacionesnegocio,
//                R.id.nav_eventosenvivo,
//                R.id.nav_misfavoritos,
                R.id.nav_soporte)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}