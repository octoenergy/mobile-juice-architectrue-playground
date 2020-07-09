package com.octopus.ejplayground.ui

import android.content.Intent
import android.net.Uri
import androidx.navigation.findNavController
import com.octopus.ejplayground.R
import com.octopus.ejplayground.di.SingleActivity
import com.octopus.ejplayground.GithubRepo
import com.octopus.ejplayground.domain.Navigator
import com.octopus.ejplayground.extensions.startActivity
import com.octopus.ejplayground.ui.main.MainFragmentDirections
import javax.inject.Inject

@SingleActivity
class NavigatorImpl @Inject constructor(
        private val androidPlaygroundActivity: AndroidPlaygroundActivity
): Navigator {

    override fun goToDetails(githubRepo: GithubRepo) {
        val action = MainFragmentDirections.actionMainFragmentToDetailsFragment(githubRepo)
        androidPlaygroundActivity.findNavController(R.id.nav_host_fragment).navigate(action)
    }

    override fun goToUrl(url: String) {
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).startActivity(androidPlaygroundActivity)
    }
}