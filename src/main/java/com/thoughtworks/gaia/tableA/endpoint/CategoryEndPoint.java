package com.thoughtworks.gaia.tableA.endpoint;

import com.thoughtworks.gaia.tableA.entity.Category;
import com.thoughtworks.gaia.tableA.service.CategoryService;
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
@Path("categories")
@Api(value = "category", description = "Access to category resource")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CategoryEndPoint {
    @Autowired
    private CategoryService categoryService;

    @Path("/{category_id}")
    @ApiOperation(value = "Get tableA by id", response = Category.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Get TableA successfully"),
            @ApiResponse(code = 404, message = "No TableA matches given id")
    })
    @GET
    public Response getTableA(@PathParam("category_id") Long categoryId) {

        Category category = categoryService.getCategories(categoryId);
        return Response.ok().entity(category).build();
    }
}
