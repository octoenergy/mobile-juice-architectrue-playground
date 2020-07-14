package com.octopus.ejplayground.services

import com.octopus.ejplayground.MakeInjectable
import com.octopus.ejplayground.domain.GithubRepo
import com.octopus.ejplayground.domain.GithubService
import io.ktor.client.*
import io.ktor.client.features.json.*
import io.ktor.client.request.*

class GithubServiceImpl @MakeInjectable constructor(
    private val githubRepoMapper: GithubRepoMapper
) : GithubService {

    private val client = HttpClient(httpClientEngine) {
        install(JsonFeature) {
            serializer = ktorSerializer
        }
    }

    override suspend fun fetchCodeRepos(username: String): List<GithubRepo> {
        val content: List<GithubRepoEntity> = client.get("$GITHUB_BASE_URL/users/$username/repos")
        return githubRepoMapper.map(content)
    }
}