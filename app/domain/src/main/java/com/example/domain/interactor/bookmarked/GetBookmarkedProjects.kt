package com.example.domain.interactor.bookmarked

import com.example.domain.executor.PostExecutionThread
import com.example.domain.interactor.ObservableUseCase
import com.example.domain.model.Project
import com.example.domain.repository.ProjectsRepository
import io.reactivex.Observable
import javax.inject.Inject

class GetBookmarkedProjects @Inject constructor(
    private val projectsRepository: ProjectsRepository,
    postExecutionThread: PostExecutionThread
) : ObservableUseCase<List<Project>, Nothing?>(postExecutionThread){
    override fun builduseCaseObservable(parans: Nothing?): Observable<List<Project>> {
        return projectsRepository.getBookmarkedProjects()
    }
}