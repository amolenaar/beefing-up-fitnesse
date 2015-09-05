package org.fitnesse.jbehave;

import org.jbehave.core.junit.JUnitStories;

import java.util.Arrays;
import java.util.List;

public class StoryRunner extends JUnitStories {

    public StoryRunner() {
        this.configuredEmbedder().candidateSteps().add(new ExampleSteps());
    }

    @Override
    protected List<String> storyPaths() {
        return Arrays.asList("simplestory.story", "substory/simplechildstory.story");
    }
}