/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jacob Zheng
 */
import java.util.Random;
public class randTFQuestion extends TFQuest {
    private static String[][] questionlist = {
            {"Out of context quotations can mislead the reader by presenting information in a way that was not intended by the original speaker.", "True", "When quotes are taken out of context, the meaning can be distorted, leading to potential misinformation."},
            {"Fabricated Content refers to information that is completely true but presented in a misleading way.", "False", "Fabricated content is entirely false and does not have a basis in truth."},
            {"Imposter Content can occur when a media outlet impersonates a legitimate source to distribute false or misleading information.", "True", "Imposter content is a deliberate attempt to deceive by imitating genuine sources."},
            {"Misleading Content always includes a statement that is factually incorrect.", "False", "Misleading content does not necessarily contain false information, but it can present facts in a way that creates a false impression."},
            {"False Context involves using accurate facts but combining them with inaccurate or unrelated information to create a misleading narrative.", "True", "False context happens when factual content is paired with misleading context, distorting its meaning."},
            {"Satire and Parody content is intended to harm and deceive readers by presenting fictional information as true.", "False", "Satire and parody are meant to be humorous and not to deceive, although they may unintentionally mislead if taken seriously."},
            {"False Connections involve headlines, visuals, or captions that accurately represent the content of an article.", "False", "False connections are when the visual or headline doesn't support or align with the actual content, creating misleading impressions."},
            {"Sponsored Content is designed to be clearly identified as advertising and does not mislead the audience.", "False", "Sponsored content can sometimes be disguised as editorial, which may mislead readers into thinking it's unbiased information."},
            {"Propaganda is often used to influence public opinion by managing attitudes, values, and knowledge, typically with a specific agenda.", "True", "Propaganda is a form of communication aimed at manipulating people’s attitudes and beliefs for a specific purpose."},
            {"Error in news reporting refers to intentional misinformation spread by news agencies.", "False", "An error is an unintentional mistake, not deliberate misinformation, and can occur in established news agencies’ reporting."},
            {"Photo Editing can be used to change the appearance of an image to mislead or create false impressions.", "True", "Photo editing can alter the reality of an image, making it misleading or fabricated."},
            {"Out of Context Photos can lead to a misunderstanding of the original message or event shown in the picture.", "True", "Photos taken out of context can mislead viewers by presenting an image with a meaning different from its original intent."},
            {"Video Editing is always done to make videos more engaging and does not cause any false impressions.", "False", "Video editing can distort reality or mislead viewers, especially when done to create sensationalized or false content."},
            {"Fake Videos are videos created with the intent to deceive, often using deepfake technology or other methods to manipulate reality.", "True", "Fake videos are deceptive and can alter or fabricate reality, often using technology to manipulate what is shown."}
        };
    
    @Override
    public void setStuff(){
        Random random = new Random();
        int index = random.nextInt(questionlist.length);
        this.question =  questionlist[index][0];
        this.answer = questionlist[index][1];
        this.feedback = questionlist[index][2];
    }
}
