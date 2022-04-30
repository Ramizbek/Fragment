package ramizbek.aliyev.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ramizbek.aliyev.fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val blankFragment = BlankFragment()
        val blankFragment2 = BlankFragment2()

        binding.apply {

            btnAdd.setOnClickListener {
                val fragmentManager = supportFragmentManager
                val transaction = fragmentManager.beginTransaction()
                transaction.add(R.id.my_container, blankFragment)
                transaction.addToBackStack(fragmentManager.toString())
                transaction.commit()
            }

            btnRemove.setOnClickListener {
                val fragmentManager = supportFragmentManager
                val transaction = fragmentManager.beginTransaction()
                transaction.remove(blankFragment)
                transaction.commit()
            }

            btnRemove.setOnClickListener {
                val fragmentManager = supportFragmentManager
                val transaction = fragmentManager.beginTransaction()
                transaction.remove(blankFragment2)
                transaction.commit()
            }
            btnReplace.setOnClickListener {
                val fragmentManager = supportFragmentManager
                val transaction = fragmentManager.beginTransaction()
                transaction.replace(R.id.my_container, blankFragment2)
                transaction.commit()
            }
            btnHide.setOnClickListener {
                val fragmentManager = supportFragmentManager
                val transaction = fragmentManager.beginTransaction()
                transaction.hide(blankFragment)
                transaction.commit()
            }
            btnShow.setOnClickListener {
                val fragmentManager = supportFragmentManager
                val transaction = fragmentManager.beginTransaction()
                transaction.show(blankFragment)
                transaction.commit()
            }
            btnHide.setOnClickListener {
                val fragmentManager = supportFragmentManager
                val transaction = fragmentManager.beginTransaction()
                transaction.hide(blankFragment2)
                transaction.commit()
            }
            btnShow.setOnClickListener {
                val fragmentManager = supportFragmentManager
                val transaction = fragmentManager.beginTransaction()
                transaction.show(blankFragment2)
                transaction.commit()
            }
        }
    }
}