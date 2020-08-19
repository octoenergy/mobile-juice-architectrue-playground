package com.octopus.ejplayground.viewmodels

import com.octopus.ejplayground.*
import com.octopus.ejplayground.domain.DispatcherProvider
import com.octopus.ejplayground.domain.Navigator
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.native.concurrent.SharedImmutable
import kotlin.native.concurrent.ThreadLocal

@SingleActivity
class DetailsViewModel @MakeInjectable constructor(
        private val navigator: Navigator,
        private val dispatcherProvider: DispatcherProvider,
        private val gitRepoRepository: CurrentRepoRepository
) : MotherViewModel<DetailsViewModel.ViewState, DetailsViewModel.UiAction>(
    dispatcherProvider
) {

    override var lastViewState: ViewState = ViewState()

    override fun onAttach() {
        super.onAttach()
        val githubRepo = gitRepoRepository.githubRepo
        if (githubRepo == null) {
            navigator.goToMain()
        } else {
            emit(
                lastViewState.copy(
                    toolbarTitle = githubRepo.name,
                    urlAddress = githubRepo.url
                )
            )
        }
    }

    override fun onAction(action: UiAction) {
        when (action) {
            UiAction.RepositoryClicked -> navigator.goToUrl(gitRepoRepository.githubRepo!!.url)
        }
    }

    data class ViewState(
            val toolbarTitle: String = "Yes?",
            val urlAddress: String = ""
    ) : MotherViewModel.ViewState

    sealed class UiAction : MotherViewModel.UiAction {
        object RepositoryClicked : UiAction()
    }
}