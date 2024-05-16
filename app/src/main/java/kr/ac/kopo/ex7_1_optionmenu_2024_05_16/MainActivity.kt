package kr.ac.kopo.ex7_1_optionmenu_2024_05_16

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    lateinit var  linear: LinearLayout
    lateinit var  btn : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        linear =findViewById(R.id.linear)
        btn =findViewById(R.id.btn)
        
    }

    //옵션 메뉴 등록  //기말고사에 나온다고 함.
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)

        menuInflater.inflate(R.menu.optionmenu, menu)

        return true
    }

    //항목이 선택되었을 때 이벤트 처리할 수 있는 메소드

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.itemRed -> {
                linear.setBackgroundColor(Color.RED)
                return true
            }
            R.id.itemGreen -> {
                linear.setBackgroundColor(Color.GREEN)
                return true
            }
            R.id.itemBlue -> {
                linear.setBackgroundColor(Color.BLUE)
                return true
            }
            R.id.btnRotate ->{
                btn.rotation += 60f
                return true
            }
            R.id.btnZoonin ->{
                btn.scaleX = 2f
                return true
            }

        }

        return false
    }
}