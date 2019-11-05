package com.example.domain.interactor.bookmarked

import com.example.domain.executor.PostExecutionThread
import com.example.domain.interactor.CompletableUseCase
import com.example.domain.repository.ProjectsRepository
import io.reactivex.Completable
import javax.inject.Inject

open class BookmarkedProject @Inject constructor(
    private val projectsRepository: ProjectsRepository,
    postExecutionThread: PostExecutionThread
) : CompletableUseCase<BookmarkedProject.Parans>(postExecutionThread) {

    override fun builduseCaseCompletable(parans: Parans?): Completable {
        if (parans == null) throw IllegalArgumentException("Parâmetros não podem ser nulos")
        return projectsRepository.bookmarkProject(parans.projectId)
    }

    data class Parans constructor(val projectId: String) {
        companion object {
            fun forProject(projectId: String): Parans {
                return Parans(projectId)
            }
        }
    }
}