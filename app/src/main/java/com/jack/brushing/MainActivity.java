package com.jack.brushing;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.jack.brushing.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);
        binding.appBarMain.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Acti//权限请求\n" +
                                "    private RxPermissions rxPermissions;\n" +
                                "    //是否拥有权限\n" +
                                "    private boolean hasPermissions = false;\n" +
                                "    //底部弹窗\n" +
                                "    private BottomSheetDialog bottomSheetDialog;\n" +
                                "    //弹窗视图\n" +
                                "    private View bottomView;\n" +
                                "    //存储拍完照后的图片\n" +
                                "    private File outputImagePath;\n" +
                                "    //启动相机标识\n" +
                                "    public static final int TAKE_PHOTO = 1;\n" +
                                "    //启动相册标识\n" +
                                "    public static final int SELECT_PHOTO = 2;\n" +
                                "    //图片控件\n" +
                                "    private ShapeableImageView ivHead;\n" +
                                "    //Base64\n" +
                                "    private String base64Pic;\n" +
                                "    //拍照和相册获取图片的Bitmap\n" +
                                "    private Bitmap orc_bitmap;on", null).show();
            }
        });
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home/*, R.id.nav_parentmodel*/, R.id.nav_set,R.id.nav_support,R.id.nav_about)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
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
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}