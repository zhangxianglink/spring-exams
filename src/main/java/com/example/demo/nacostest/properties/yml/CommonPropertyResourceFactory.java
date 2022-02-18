package com.example.demo.nacostest.properties.yml;

import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.DefaultPropertySourceFactory;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertySourceFactory;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

/**
 * @author xiangzhang
 * @since 2022-02-18 16:37
 */
public class CommonPropertyResourceFactory implements PropertySourceFactory {

    @Override
    public PropertySource<?> createPropertySource( String defaultName, EncodedResource resource) throws IOException {
        final String name = Optional.ofNullable(defaultName).orElse(resource.getResource().getFilename());
        if (name.endsWith(".yml") || name.endsWith(".yaml")){
            final List<PropertySource<?>> load = new YamlPropertySourceLoader().load(name, resource.getResource());
            return load.get(0);
        }else {
            return new DefaultPropertySourceFactory().createPropertySource(name, resource);
        }
    }
}
