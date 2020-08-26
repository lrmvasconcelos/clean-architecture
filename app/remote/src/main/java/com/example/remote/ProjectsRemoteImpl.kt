package com.example.remote

import com.example.data.ProjectEntity
import com.example.remote.mapper.ProjectsResponseModelMapper
import com.example.remote.service.GithubTrendingService
import com.example.repository.ProjectsRemote
import io.reactivex.Observable
import javax.inject.Inject

open class ProjectsRemoteImpl @Inject constructor(
    private val service: GithubTrendingService,
    private val mapper: ProjectsResponseModelMapper
) : ProjectsRemote {

    override fun getProjects(): Observable<List<ProjectEntity>> {
        return service.searchRepositories("language:kotlin", "stars", "desc")
            .map {
                it.items.map {
                    mapper.mapFromModel(it)
                }
            }
    }
}