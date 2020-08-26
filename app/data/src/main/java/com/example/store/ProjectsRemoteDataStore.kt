package com.example.store

import com.example.data.ProjectEntity
import com.example.repository.ProjectsRemote
import com.example.repository.ProjectsDataStore
import io.reactivex.Completable
import io.reactivex.Observable
import javax.inject.Inject

class ProjectsRemoteDataStore @Inject constructor(
    private val projectsRemote: ProjectsRemote
) : ProjectsDataStore {
    override fun getProjects(): Observable<List<ProjectEntity>> {
        return projectsRemote.getProjects()
    }

    override fun saveProjects(projects: List<ProjectEntity>): Completable {
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