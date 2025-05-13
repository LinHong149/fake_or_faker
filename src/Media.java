import java.util.Random;
class Media extends Lesson {
    static String[] mediaManipulate = {
        "Photo Editing",
        "Out of Context Photos",
        "Video Editing",
        "Fake Videos"
    };

    @Override
    public String getRandomRecord() {
        Random random = new Random();
        return mediaManipulate[random.nextInt(mediaManipulate.length)];
    }
}