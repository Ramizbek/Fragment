package ramizbek.aliyev.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import ramizbek.aliyev.fragment.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {
    lateinit var binding : FragmentBlankBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlankBinding.inflate(layoutInflater)

        binding.btn1.setOnClickListener {
            Toast.makeText(binding.root.context, "Iskandar frni ichida", Toast.LENGTH_SHORT).show()
        }
        return binding.root
    }
}