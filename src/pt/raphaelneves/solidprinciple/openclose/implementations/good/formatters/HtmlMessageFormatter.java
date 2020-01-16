package pt.raphaelneves.solidprinciple.openclose.implementations.good.formatters;

public class HtmlMessageFormatter implements IMessageFormatter {
    @Override
    public String format(String message) {
        return "<p>Some message</p>";
    }
}
