package com.example.store

import com.example.data.ProjectEntity
import com.example.repository.ProjectRemote
import com.example.repository.ProjectsDataStore
import io.reactivex.Completable
import io.reactivex.Observable
import javax.inject.Inject

class ProjetsRemoteDataStore @Inject constructor(
    private val projectRemote: ProjectRemote
) : ProjectsDataStore {
    override fun getProjects(): Observable<List<ProjectEntity>> {
        return projectRemote.getProjects()
    }

    override fun saveProjetc(projects: List<ProjectEntity>): Completable {
        throw UnsupportedOperationException("Not supported")
    }

    override fun clearProjects(): Completable {
        throw UnsupportedOperationException("Not supported")
    }

    override fun getBookmarkedProjects(): Observable<List<ProjectEntity>> {
        throw UnsupportedOperationException("Not supported")
    }

    override fun setProjectAsBookmarked(projectId: String): Completable {
        throw UnsupportedOperationException("Not supported")
    }

    override fun setProjectAsNotBookmarked(projectId: String): Completable {
        throw UnsupportedOperationException("Not supported")
    }
}