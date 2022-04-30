package ramizbek.aliyev.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import ramizbek.aliyev.fragment.databinding.FragmentBlank2Binding

class BlankFragment2 : Fragment() {
lateinit var binding:FragmentBlank2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlank2Binding.inflate(layoutInflater)
        binding.btn2.setOnClickListener {
            Toast.makeText(binding.root.context, "iHello", Toast.LENGTH_SHORT).show()
        }
        return binding.root

    }
}