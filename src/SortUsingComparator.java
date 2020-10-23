import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortUsingComparator {

    public static void main(String[] args){
        sortingCustomObjectsByComparator();
    }

    private static void sortingCustomObjectsByComparator(){
        List<Project> projects = new ArrayList<>();
        Project project = new Project();
        project.setProjectId(100);
        project.setProjectName("IMS");
        projects.add(project);

        Project project2 = new Project();
        project2.setProjectId(200);
        project2.setProjectName("APAX");
        projects.add(project2);

        Project project3 = new Project();
        project3.setProjectId(50);
        project3.setProjectName("CMS");
        projects.add(project3);

        Collections.sort(projects, Comparator.comparing(Project::getProjectName));
        printList(projects);
    }

    private static void printList(List<Project> projects) {
        for (Project project : projects) {
            System.out.println(project.getProjectId());
            System.out.println(project.getProjectName());
        }
    }
}

class Project implements Comparable<Project>{
    private int projectId;
    private String projectName;

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public int compareTo(Project o) {
        return this.getProjectId() - o.getProjectId();
    }
}
