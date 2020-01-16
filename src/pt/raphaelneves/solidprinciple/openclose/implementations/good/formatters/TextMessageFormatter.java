package pt.raphaelneves.solidprinciple.openclose.implementations.good.formatters;

public class TextMessageFormatter  implements IMessageFormatter {
    @Override
    public String format(String message) {
        return "Text message";
    }
}
