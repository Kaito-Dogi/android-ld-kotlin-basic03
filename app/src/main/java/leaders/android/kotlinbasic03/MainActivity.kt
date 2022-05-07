package leaders.android.kotlinbasic03

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import leaders.android.kotlinbasic03.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // くじを引くボタンを押した時の処理
        binding.drawButton.setOnClickListener {
            // ランダムな数値を変数に代入

            // ランダムな数値をLogcatに出力

            // くじの結果をTextViewで表示
        }
    }
}
