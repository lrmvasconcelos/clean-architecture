package factory

import com.example.data.ProjectEntity
import com.example.domain.model.Project


object ProjectFactory {

    fun makeProjectEntity(): ProjectEntity {
        return ProjectEntity(
            DataFactory.randomString(),
            DataFactory.randomString(), DataFactory.randomString(),
            DataFactory.randomString(), DataFactory.randomString(),
            DataFactory.randomString(), DataFactory.randomString(),
            DataFactory.randomBoolean()
        )
    }

    fun makeProject(): Project {
        return Project(
            DataFactory.randomString(),
            DataFactory.randomString(), DataFactory.randomString(),
            DataFactory.randomString(), DataFactory.randomString(),
            DataFactory.randomString(), DataFactory.randomString(),
            DataFactory.randomBoolean()
        )
    }

}