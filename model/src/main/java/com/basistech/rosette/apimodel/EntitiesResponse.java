/*
* Copyright 2014 Basis Technology Corp.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.basistech.rosette.apimodel;

import java.util.List;

/** 
 * Simple api response data model for entity extraction 
 */
public final class EntitiesResponse extends Response {

    private final List<Entity> entities;
    
    /**
     * Constructor for {@code EntitiesResponse}
     * @param entities list of extracted entities
     */
    public EntitiesResponse(List<Entity> entities) {
        this.entities = entities;
    }

    /**
     * get the list of extracted entities
     * @return the list of extracted entities
     */
    public List<Entity> getEntities() {
        return entities;
    }

    @Override
    public int hashCode() {
        return entities != null ? entities.hashCode() : 0;
    }

    /**
     * if the param is a {@code EntitiesResponse}, compare contents for equality
     * @param o the object
     * @return whether or not the param object is equal to this object
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof EntitiesResponse)) {
            return false;
        }

        EntitiesResponse that = (EntitiesResponse) o;
        return entities != null ? entities.equals(that.getEntities()) : that.entities == null;
    }
}
