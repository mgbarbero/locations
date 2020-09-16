package com.consorcio.location.api;

import com.consorcio.location.api.beans.Location;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/consorcio")
public interface ConsorcioResource {
  @GET
  @Produces("application/json")
  List<Location> generatedMethod3();
}
