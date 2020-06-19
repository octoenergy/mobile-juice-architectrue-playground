package com.octopus.ejplayground.ui.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.octopus.ejplayground.R
import com.octopus.ejplayground.extensions.requireAppCompatActivity
import com.octopus.ejplayground.ui.base.BaseFragment
import com.octopus.ejplayground.ui.base.LifecycleReceiver
import kotlinx.android.synthetic.main.fragment_details.*
import javax.inject.Inject

class DetailsFragment : BaseFragment() {

    @Inject lateinit var detailsViewModel: DetailsViewModel
    private val args: DetailsFragmentArgs by navArgs()

    override fun getLifecycleReceivers(): List<LifecycleReceiver> {
        return listOf(detailsViewModel)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailsViewModel.initData(args.repository)
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun onViewCreated(
            view: View,
            savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)
        a_details_btn.setOnClickListener { detailsViewModel.onGoToRepositoryClicked() }
    }

    override fun onStart() {
        super.onStart()
        val disposable = detailsViewModel.viewStateEmitter.subscribe {
            requireAppCompatActivity().supportActionBar?.title = it.toolbarTitle
            a_details_txt.text = it.urlAddress
        }
        compositeDisposable.add(disposable)
    }
}
