package br.com.washi.login.view


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.com.washi.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.full_content_password_bottomsheet.*

class BottomSheetPasswordFragment : BottomSheetDialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_bottom_sheet_password, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        circularButton.setOnClickListener {
            findNavController().navigate(BottomSheetPasswordFragmentDirections.actionBottomSheetPasswordToSolicitationNavigationGraph())
//            circularButton.startAnimation {
//            }
        }
    }


}