package com.thoughtworks.gaia.tableA.endpoint;

import com.thoughtworks.gaia.tableA.entity.Category;
import com.thoughtworks.gaia.tableA.entity.Commidity;
import com.thoughtworks.gaia.tableA.service.CategoryService;
import com.thoughtworks.gaia.tableA.service.CommodityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by haoyuze on 2017/4/28.
 */
@Component
@Path("commodity")
@Api(value = "category", description = "Access to category resource")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CommodityEndPoint {
    @Autowired
    private CommodityService commodityService;

    @Path("/{commodity_id}")
    @ApiOperation(value = "Get commodity by id", response = Category.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Get commodity successfully"),
            @ApiResponse(code = 404, message = "No commodity matches given id")
    })
    @GET
    public Response getCommidity(@PathParam("commodity_id") Long categoryId) {

        Commidity commidity =  commodityService.getCommidity(categoryId);
        return Response.ok().entity(commidity).build();
    }
}
