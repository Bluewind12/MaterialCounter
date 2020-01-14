package momonyan.materialcounter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import momonyan.materialcounter.databinding.ActivityMainBinding
import momonyan.materialcounter.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ViewModelのインスタンスを作成
        val viewModel: MainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        // DataBindingのインスタンスを作成（onCreateの外でもよい）
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        // ViewModelのインスタンスを作成を設定
        binding.viewModel = viewModel
        // ライフサイクル所有者を設定
        binding.lifecycleOwner = this
    }
}
