package by.lomazki.bottnav0201

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import by.lomazki.bottnav0201.databinding.FragmentFourthBinding

class FourthFragment : Fragment() {

    private var _binding: FragmentFourthBinding? = null
    private val binding get() = requireNotNull(_binding)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentFourthBinding.inflate(inflater, container, false)
            .also { _binding = it }
            .root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.root.setBackgroundColor(Color.RED)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}