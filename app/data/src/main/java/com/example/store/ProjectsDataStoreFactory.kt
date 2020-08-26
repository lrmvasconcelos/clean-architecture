package com.example.store

import com.example.repository.ProjectsDataStore
import javax.inject.Inject


open class ProjectsDataStoreFactory @Inject constructor(
    private val projectsCacheDataStore: ProjectsCacheDataStore,
    private val projectsRemoteDataStore: ProjectsRemoteDataStore
) {
    open fun getDataStore(
        projectCached: Boolean,
        cacheExpired: Boolean
    ): ProjectsDataStore {
        return if (projectCached && !cacheExpired) {
            projectsCacheDataStore
        } else {
            projectsRemoteDataStore
        }
    }

    open fun getCacheDataStore(): ProjectsDataStore {
        return projectsCacheDataStore
    }

}
