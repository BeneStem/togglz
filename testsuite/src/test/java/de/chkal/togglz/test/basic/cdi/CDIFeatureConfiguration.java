package de.chkal.togglz.test.basic.cdi;

import javax.enterprise.context.ApplicationScoped;

import de.chkal.togglz.core.Feature;
import de.chkal.togglz.core.config.FeatureManagerConfiguration;
import de.chkal.togglz.core.repository.FeatureStateRepository;
import de.chkal.togglz.core.repository.mem.InMemoryRepository;
import de.chkal.togglz.test.basic.BasicFeatures;

@ApplicationScoped
public class CDIFeatureConfiguration implements FeatureManagerConfiguration {

    @Override
    public Feature[] getFeatures() {
        return BasicFeatures.values();
    }

    @Override
    public FeatureStateRepository getFeatureStateRepository() {
        return new InMemoryRepository();
    }

}
