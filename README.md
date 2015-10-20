# immutableTest

Relating to issue https://github.com/immutables/immutables/issues/180

Demonstrating that using @Override on all attributes of the immutable does not create the second Builder.from(interface) method and only creates a single Builder.from(immutable) interface instead.
