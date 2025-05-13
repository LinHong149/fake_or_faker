import java.util.Random;
class FalseInfo extends Lesson {
    static String[] falseInformation = {
        "Fabricated Content: Completely false content;",
        "Manipulated Content: Genuine information or imagery that has been distorted, e.g. a sensational headline or populist ‘click bait’; ",
        "Imposter Content: Impersonation of genuine sources, e.g. using the branding of an established agency;",
        "Misleading Content: Misleading information, e.g. comment presented as fact;",
        "False Context: Factually accurate content combined with false contextual information, e.g. when the headline of an article does not reflect the content;",
        "Satire and Parody: Humorous but false stories passed off as true. There is no intention to harm but readers may be fooled;",
        "False Connections: When headlines, visuals or captions do not support the content;",
        "Sponsored Content: Advertising or PR disguised as editorial content;",
        "Propaganda: Content used to manage attitudes, values and knowledge;",
        "Error: A mistake made by established news agencies in their reporting."
    };

    @Override
    public String getRandomRecord() {
        Random random = new Random();
        return falseInformation[random.nextInt(falseInformation.length)];
    }
}