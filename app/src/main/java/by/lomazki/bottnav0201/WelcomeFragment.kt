package by.lomazki.bottnav0201

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.lomazki.bottnav0201.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {

    private var _binding: FragmentWelcomeBinding? = null
    private val binding get() = requireNotNull(_binding)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentWelcomeBinding.inflate(inflater,container,false)
            .also { _binding = it }
            .root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
//            findNavController().navigate(R.id.action_global_welcome)       // тоже работает
            findNavController().navigate(NavigationWelcomeDirections.actionGlobalWelcome())
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
