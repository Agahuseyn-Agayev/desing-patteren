package factory;

import java.util.List;

public class Software {
    public static void main(String[] args) {

        List<Developer>developers=List.of(new JavaDeveloper(),new KotlinDeveloper(),new PythonDeveloper());
        developers.forEach(Developer::writeCode);
//    var developerFactory=createDeveloperFactoryByLanguage(ProgramingLanguage.KOTLIN);
//    var developer=developerFactory.createDeveloper();
//    developer.writeCode();
    }

    public static DeveloperFactory createDeveloperFactoryByLanguage(ProgramingLanguage programingLanguage){
        return switch (programingLanguage){
            case JAVA -> new JavaDeveloperFactory();
            case KOTLIN -> new KotlinDeveloperFactory();
            case PYTHON -> new PythonDeveloperFactory();
        };
    }
}
