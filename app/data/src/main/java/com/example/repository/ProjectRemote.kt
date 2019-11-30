package com.example.repository

import com.example.data.ProjectEntity
import io.reactivex.Observable

interface ProjectRemote{

    fun getProjects(): Observable<List<ProjectEntity>>

}