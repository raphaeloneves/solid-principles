package pt.raphaelneves.solidprinciple.openclose.implementations.good.formatters;

public class EncryptedMessageFormatter implements IMessageFormatter {
    @Override
    public String format(String message) {
        return "U29tZSBtZXNzYWdl";
    }
}
