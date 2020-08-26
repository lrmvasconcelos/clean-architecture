package com.example.repository

import com.example.data.ProjectEntity
import io.reactivex.Observable

interface ProjectsRemote{

    fun getProjects(): Observable<List<ProjectEntity>>

}