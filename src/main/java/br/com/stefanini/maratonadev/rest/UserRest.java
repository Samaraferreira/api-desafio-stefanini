package br.com.stefanini.maratonadev.rest;

import br.com.stefanini.maratonadev.dto.AluguelDto;
import br.com.stefanini.maratonadev.dto.UserDto;
import br.com.stefanini.maratonadev.service.AluguelService;
import br.com.stefanini.maratonadev.service.UserService;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("user")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserRest {

    @Inject
    UserService service;

    @Inject
    AluguelService serviceAluguel;
    
    @GET
    @Path("")
    @Operation(summary = "Listar usuários",
            description = "Retorna uma lista de usuários")
    @APIResponse(responseCode = "200",
            description = "lista de usuarios",
            content = {
                    @Content(mediaType =  "application/json",
                            schema = @Schema(implementation = UserDto.class))
            }
    )
    public Response listar(){
        return Response
                .status(Response.Status.OK)
                .entity(service.listar())
                .build();
    }
    
    @POST
	@Path("")
	@Operation(summary = "Incluir um usuário",
	description = "Incluir um usuário")
	@APIResponse(responseCode = "201",
	description = "usuário",
	content = {
			@Content(mediaType =  "application/json",
			schema = @Schema(implementation = UserDto.class))
			}
	)
	public Response create(UserDto user, @Context SecurityContext securityContext) {
		
		service.inserir(user);
		
		return Response
				.status(Response.Status.CREATED)
				.build();
	}

}
