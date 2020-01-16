package pt.raphaelneves.solidprinciple.openclose.implementations.bad;

public class EmailSender {

    private final String message;
    private final String subject;
    private final EmailType emailType;

    public EmailSender(String message, String subject, EmailType emailType) {
        this.message = message;
        this.subject = subject;
        this.emailType = emailType;
    }

    public void send(){
        if(emailType == EmailType.TEXT){
            removeFormatting(message);
        } else if(emailType == EmailType.ENCRYPTED){
            encryptMessage(message);
        } else if (emailType == EmailType.HTML){
            markAsHtml(message);
        }

        // ADD MORE "IF" IF YOU NEED TO ADD MORE LOGIC

        // SENDING COMMAND...
    }

    private void removeFormatting(String  message){}

    private void markAsHtml(String message){}

    private void encryptMessage(String message){}
}

