import java.util.Random;
class Manipulation extends Lesson {
    static String[] manipulating = {
        "True information under a false title",
        "Out of context quotations",
        "Opinion or fact?",
        "Distorting facts",
        "No citation/sources for information (Made up) or using unverified people or 'experts'.",
        "Leaving pieces of information that could change the context",
        "False translations/wrong translations that can be misleading"
    };

    @Override
    public String getRandomRecord() {
        Random random = new Random();
        return manipulating[random.nextInt(manipulating.length)];
    }
}
