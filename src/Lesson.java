// Parent class: Lesson

/**
 * The Lesson class is a base class for lessons about various topics.
 * It provides a default implementation for the method getRandomRecord(),
 * which can be overridden by subclasses.
 */
class Lesson {

    /**
     * This method is meant to be overridden by subclasses.
     * It provides a default return message when there are no records available.
     * 
     * @return a default message "No records available."
     */
    public String getRandomRecord() {
        return "No records available."; // Default message if no record is chosen
    }
}
