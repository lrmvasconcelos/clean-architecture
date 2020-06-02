package com.example.store

import com.example.repository.ProjectsDataStore
import javax.inject.Inject


open class ProjectsDataStoreFactory @Inject constructor(
    private val projectCacheDataStore: ProjectCacheDataStore,
    private val projetsRemoteDataStore: ProjetsRemoteDataStore
) {
    open fun getDataStore(
        projectCached: Boolean,
        cacheExpired: Boolean
    ): ProjectsDataStore {
        return if (projectCached && !cacheExpired) {
            projectCacheDataStore
        } else {
            projetsRemoteDataStore
        }
    }

    open fun getCacheDataStore(): ProjectsDataStore {
        return projectCacheDataStore
    }

}
