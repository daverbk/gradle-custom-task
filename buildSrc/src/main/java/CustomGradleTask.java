import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public abstract class CustomGradleTask extends DefaultTask {

    @TaskAction
    public void run() {
        System.out.println("Running some custom default task ...");
    }
}
