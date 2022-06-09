package org.acme.rest.json;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/alticci/{index}")
public class AlticciResource {
    @GET
    public Alticci get(int index) {
        return new Alticci(index);
    }
}
