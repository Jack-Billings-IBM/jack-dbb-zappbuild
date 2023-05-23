package com.ibm.zosconnect.api;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;


import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.annotation.security.RolesAllowed;

import org.eclipse.microprofile.metrics.*;
import org.eclipse.microprofile.metrics.annotation.*;

@Path("/phoneapi/items")
@ApplicationScoped

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-05-22T21:13:55.029Z[UTC]")

public class PhoneapiApi {

    @Context
    private Application application;

    @Context
    private UriInfo uriInfo;

    @Context
    private HttpHeaders headers;

    @Context
    private SecurityContext securityContext;

    @Inject
    com.ibm.zosconnect.engine.Operation operation;

    @Inject
    MetricRegistry metricRegistry;

    @GET
    @Produces({ "application/json" })
    
    @SimplyTimed(name = "getPhoneListTime", tags = { "method=GET"}, absolute = true)
    @Counted(name = "getPhoneListCount", absolute = true)
    public Response getPhoneList(@Context HttpServletRequest request, String body) {

        com.ibm.zosconnect.engine.OperationRequest opRequest = new com.ibm.zosconnect.engine.OperationRequest(request,
                                                                                                body,
                                                                                                headers,
                                                                                                uriInfo,
                                                                                                securityContext.getUserPrincipal(),
                                                                                                Thread.currentThread().getContextClassLoader(),
                                                                                                "/phoneapi/items");

        opRequest.setMetricRegistry(metricRegistry);

        com.ibm.zosconnect.engine.OperationResponse opResponse = operation.processOperation(opRequest);

        return Response.status(opResponse.getResponseStatus())
                        .entity(opResponse.getBean())
                        .replaceAll(opResponse.getHeaders())
                        .cookie(opResponse.getCookiesArray())
                        .build();
    }


    @GET
    @Path("/{itemID}")
    @Produces({ "application/json" })
    
    @SimplyTimed(name = "getPhoneSingleTime", tags = { "method=GET"}, absolute = true)
    @Counted(name = "getPhoneSingleCount", absolute = true)
    public Response getPhoneSingle(@Context HttpServletRequest request, String body) {

        com.ibm.zosconnect.engine.OperationRequest opRequest = new com.ibm.zosconnect.engine.OperationRequest(request,
                                                                                                body,
                                                                                                headers,
                                                                                                uriInfo,
                                                                                                securityContext.getUserPrincipal(),
                                                                                                Thread.currentThread().getContextClassLoader(),
                                                                                                "/phoneapi/items/{itemID}");

        opRequest.setMetricRegistry(metricRegistry);

        com.ibm.zosconnect.engine.OperationResponse opResponse = operation.processOperation(opRequest);

        return Response.status(opResponse.getResponseStatus())
                        .entity(opResponse.getBean())
                        .replaceAll(opResponse.getHeaders())
                        .cookie(opResponse.getCookiesArray())
                        .build();
    }

}
