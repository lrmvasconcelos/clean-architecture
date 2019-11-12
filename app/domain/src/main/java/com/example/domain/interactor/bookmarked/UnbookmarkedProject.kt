package com.example.domain.interactor.bookmarked

import com.example.domain.executor.PostExecutionThread
import com.example.domain.interactor.CompletableUseCase
import com.example.domain.repository.ProjectsRepository
import io.reactivex.Completable
import javax.inject.Inject

open class UnbookmarkedProject @Inject constructor(
    private val projectsRepository: ProjectsRepository,
    postExecutionThread: PostExecutionThread
) : CompletableUseCase<UnbookmarkedProject.Params>(postExecutionThread) {
    override fun builduseCaseCompletable(params: Params?): Completable {
        if (params == null) throw IllegalArgumentException("Parametros nulos")
        return projectsRepository.unbookmarkProject(params.projectId)
    }

    data class Params(val projectId: String) {
        companion object {
            fun forProject(projectId: String): Params {
                return Params(projectId)
            }
        }
    }
}