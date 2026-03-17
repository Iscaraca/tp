package seedu.address.model.util;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import seedu.address.model.AddressBook;
import seedu.address.model.ReadOnlyAddressBook;
import seedu.address.model.person.Name;
import seedu.address.model.person.Person;
import seedu.address.model.tag.Tag;

/**
 * Contains utility methods for populating {@code AddressBook} with sample data.
 */
public class SampleDataUtil {
    public static Person[] getSamplePersons() {
        return new Person[] {
            new Person(new Name("Alex Yeoh"),
                seedu.address.model.person.Stage.SURVEILLANCE,
                getTagSet("friends")),
            new Person(new Name("Bernice Yu"),
                seedu.address.model.person.Stage.APPROACHED,
                getTagSet("colleagues", "friends")),
            new Person(new Name("Charlotte Oliveiro"),
                seedu.address.model.person.Stage.COOPERATING,
                getTagSet("neighbours")),
            new Person(new Name("David Li"),
                seedu.address.model.person.Stage.ARRESTED,
                getTagSet("family")),
            new Person(new Name("Irfan Ibrahim"),
                seedu.address.model.person.Stage.SURVEILLANCE,
                getTagSet("classmates")),
            new Person(new Name("Roy Balakrishnan"),
                seedu.address.model.person.Stage.CLOSED,
                getTagSet("colleagues"))
        };
    }

    public static ReadOnlyAddressBook getSampleAddressBook() {
        AddressBook sampleAb = new AddressBook();
        for (Person samplePerson : getSamplePersons()) {
            sampleAb.addPerson(samplePerson);
        }
        return sampleAb;
    }

    /**
     * Returns a tag set containing the list of strings given.
     */
    public static Set<Tag> getTagSet(String... strings) {
        return Arrays.stream(strings)
                .map(Tag::new)
                .collect(Collectors.toSet());
    }

}
