package com.example.access

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.example.access.databinding.DialogExampleBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class ExampleDialog : BottomSheetDialogFragment() {

    private lateinit var binding: DialogExampleBinding

    companion object {
        fun newInstance() : ExampleDialog {
            return ExampleDialog()
        }
    }

    override fun setupDialog(dialog: Dialog, style: Int) {
        binding = DialogExampleBinding.inflate(
                LayoutInflater.from(context),
                null,
                false
            )

        dialog.setContentView(binding.root)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}