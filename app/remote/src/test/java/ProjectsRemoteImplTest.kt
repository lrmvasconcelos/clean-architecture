package co.joebirch.remote

import com.example.data.ProjectEntity
import com.example.remote.ProjectsRemoteImpl
import com.example.remote.mapper.ProjectsResponseModelMapper
import com.example.remote.model.ProjectModel
import com.example.remote.model.ProjectsResponseModel
import com.example.remote.service.GithubTrendingService
import com.google.common.base.CharMatcher.any
import factory.ProjectDataFactory
import io.reactivex.Observable
import jdk.internal.org.objectweb.asm.util.CheckClassAdapter.verify
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class ProjectsRemoteImplTest {

//    private val mapper = mock<ProjectsResponseModelMapper>()
//    private val service = mock<GithubTrendingService>()
//    private val remote = ProjectsRemoteImpl(service, mapper)
//
//    @Test
//    fun getProjectsCompletes() {
//        stubGithubTrendingServiceSearchRepositories(Observable.just(
//                ProjectDataFactory.makeProjectsResponse()))
//        stubProjectsResponseModelMapperMapFromModel(any(),
//                ProjectDataFactory.makeProjectEntity())
//
//        val testObserver = remote.getProjects().test()
//        testObserver.assertComplete()
//    }
//
//    @Test
//    fun getProjectsCallsServer() {
//        stubGithubTrendingServiceSearchRepositories(Observable.just(
//                ProjectDataFactory.makeProjectsResponse()))
//        stubProjectsResponseModelMapperMapFromModel(any(),
//                ProjectDataFactory.makeProjectEntity())
//
//        remote.getProjects().test()
//        verify(service).searchRepositories(any(), any(), any())
//    }
//
//    @Test
//    fun getProjectsReturnsData() {
//        val response = ProjectDataFactory.makeProjectsResponse()
//        stubGithubTrendingServiceSearchRepositories(Observable.just(response))
//        val entities = mutableListOf<ProjectEntity>()
//        response.items.forEach {
//            val entity = ProjectDataFactory.makeProjectEntity()
//            entities.add(entity)
//            stubProjectsResponseModelMapperMapFromModel(it, entity)
//        }
//        val testObserver = remote.getProjects().test()
//        testObserver.assertValue(entities)
//    }
//
//    @Test
//    fun getProjectsCallsServerWithCorrectParameters() {
//        stubGithubTrendingServiceSearchRepositories(Observable.just(
//                ProjectDataFactory.makeProjectsResponse()))
//        stubProjectsResponseModelMapperMapFromModel(any(),
//                ProjectDataFactory.makeProjectEntity())
//
//        remote.getProjects().test()
//        verify(service).searchRepositories("language:kotlin", "stars", "desc")
//    }
//
//    private fun stubGithubTrendingServiceSearchRepositories(observable:
//                                                            Observable<ProjectsResponseModel>) {
//        whenever(service.searchRepositories(any(), any(), any()))
//                .thenReturn(observable)
//    }
//
//    private fun stubProjectsResponseModelMapperMapFromModel(model: ProjectModel,
//                                                            entity: ProjectEntity) {
//        whenever(mapper.mapFromModel(model))
//                .thenReturn(entity)
//    }

}