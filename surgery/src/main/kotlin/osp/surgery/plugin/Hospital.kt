package osp.surgery.plugin

import com.android.build.api.artifact.ScopedArtifact
import com.android.build.api.variant.ApplicationAndroidComponentsExtension
import com.android.build.api.variant.ScopedArtifacts
import com.android.build.gradle.AppPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.register
import osp.surgery.helper.sout
import java.util.*

/**
 * https://aopmeta.com/articles/230211.html#%E5%A4%A7%E5%8E%82%E6%96%B9%E6%A1%88%E7%A0%94%E8%AF%BB
 * https://rapidsu.cn/articles/4233
 * https://www.51cto.com/article/754490.html
 * https://blog.csdn.net/ByteDanceTech/article/details/107479016
 * https://wanandroid.com/wenda/show/18453
 * https://github.com/wuyr/incremental-compiler
 * @author yun.
 * @date 2021/7/20
 * @des [一句话描述]
 * @since [https://github.com/5hmlA]🏥 (医院) + 🩹
 * <p><a href="https://github.com/5hmlA">github</a>
 */
class Hospital : Plugin<Project> {
    override fun apply(project: Project) {
        project.plugins.withType(AppPlugin::class.java) {

            // Queries for the extension set by the Android Application plugin.
            // This is the second of two entry points into the Android Gradle plugin
            val androidComponents =
                project.extensions.getByType(ApplicationAndroidComponentsExtension::class.java)
            // Registers a callback to be called, when a new variant is configured

            //./gradlew SurgeryDebugClassesWithAsm --info
            //"hello".capitalize()//把第一个字符转为大写
            //uppercase() 将整个字符串的所有字母都转成大写
            //titlecase() 主要用于单字符的转换，并且其行为在不同语言环境下可能有所不同（例如，对于有些特殊语言字符，titlecase 可能不是简单的大写）
            androidComponents.onVariants { variant ->
                val taskProvider = project.tasks.register<SurgeryTask>("Surgery${variant.name.replaceFirstChar { it.uppercase() }}ClassesWithAsm") {
                    group = "surgery"
                    tag = "🔥"
                }
                // Register modify classes task
                variant.artifacts.forScope(ScopedArtifacts.Scope.ALL)
                    .use(taskProvider)
                    .toTransform(
                        ScopedArtifact.CLASSES,
                        SurgeryTask::allJars,
                        SurgeryTask::allDirectories,
                        SurgeryTask::output
                    )
            }
        }
        val taskReauests = project.gradle.startParameter.taskRequests
        " taskReauests : $taskReauests ".sout()
        if (taskReauests.size > 0) {
            val args = taskReauests[0].args.filter { !it.equals("clean") }
            "args : $args ".sout()
            if (args.isNotEmpty()) {
//                val predicate: (String) -> Boolean = { it.toLowerCase().contains("release") }
//                if (args.any(predicate)) {
//                }
//                val android = project.extensions.findByType<com.android.build.gradle.BaseExtension>()
//                val android = project.extensions.findByType(com.android.build.gradle.BaseExtension::class.java)
//                val android = project.extensions.findByType(ApplicationAndroidComponentsExtension::class.java)
//                println(project.extensions.findByName("android"))
//                "project name: ${project.name}  $android  ${android?.transforms}".sout()
//                android?.registerTransform(Surgery(project))
            }
        }
    }
}