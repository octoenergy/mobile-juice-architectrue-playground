package com.octopus.ejplayground.githubrepositories.services.github

import com.octopus.ejplayground.common.MakeInjectable
import com.octopus.ejplayground.githubrepositories.entities.GithubRepo

class GithubRepoMapper @MakeInjectable constructor() {

    fun map(gitApiEntities: List<GithubRepoEntity>): List<GithubRepo> {
        return gitApiEntities.map { it.map() }
    }

    fun GithubRepoEntity.map(): GithubRepo {
        return GithubRepo(
            id = this.id,
            name = this.name,
            url = this.url
        )
    }
}