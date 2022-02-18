package com.github.yjw666.mvptemplate.services

import com.intellij.openapi.project.Project
import com.github.yjw666.mvptemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
