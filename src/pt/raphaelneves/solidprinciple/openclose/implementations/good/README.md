# Open/Close Principle

A software component must be open extend, but closed for modification.

## Bad scenario

You can add multiple logics checked by the EmailType, but for each new EmailType you'll need  to modify the EmailSender behaviour to chech the type and apply the new logic, breaking the principle.

## Good scenario

- You have a base class that defines a generic formatter to handle the message and an abstract `send()` behaviour.
- The formatter is received by constructor and specified on top of the base class, assuming that all messages needs to be formatted in order to be valid.
- You have several concrete implementations derived from the base class in order to extend the sending behavior, but preserving it.   