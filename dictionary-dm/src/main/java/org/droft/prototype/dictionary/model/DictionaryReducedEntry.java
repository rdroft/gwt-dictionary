package org.droft.prototype.dictionary.model;

/**
 * Created by rdroft on 5/23/15.
 */
public class DictionaryReducedEntry {
    private int entryId;
    private String key;
    private String shortDescription;
    private String description;

    public int getEntryId() {
        return entryId;
    }

    public void setEntryId(int entryId) {
        this.entryId = entryId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
