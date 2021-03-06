// Copyright 2017 Yahoo Holdings. Licensed under the terms of the Apache 2.0 license. See LICENSE in the project root.
package com.yahoo.vespa.hosted.controller.api.integration.entity;

import com.yahoo.vespa.hosted.controller.api.identifiers.Property;
import com.yahoo.vespa.hosted.controller.api.identifiers.PropertyId;
import com.yahoo.vespa.hosted.controller.api.identifiers.UserGroup;
import com.yahoo.vespa.hosted.controller.api.identifiers.UserId;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author mpolden
 */
public class MemoryEntityService implements EntityService {

    @Override
    public Map<PropertyId, Property> listProperties() {
        Map<PropertyId, Property> properties = new HashMap<>();
        properties.put(new PropertyId("1234"), new Property("foo"));
        properties.put(new PropertyId("4321"), new Property("bar"));
        return Collections.unmodifiableMap(properties);
    }

    @Override
    public Set<UserGroup> getUserGroups(UserId userId) {
        return Collections.singleton(new UserGroup("vespa"));
    }

    @Override
    public boolean isGroupMember(UserId userId, UserGroup userGroup) {
        return true;
    }

}
