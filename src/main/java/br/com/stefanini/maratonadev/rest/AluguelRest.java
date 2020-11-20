package br.com.stefanini.maratonadev.rest;

import br.com.stefanini.maratonadev.dto.AluguelDto;
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

@Path("alugar")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AluguelRest {

    @Inject
    AluguelService service;

    @POST
	@Path("")
	@Operation(summary = "Alugar carro",
	description = "Alugar carro")
	@APIResponse(responseCode = "201",
	description = "Carro alugado",
	content = {
			@Content(mediaType =  "application/json",
			schema = @Schema(implementation = AluguelDto.class))
			}
	)
	public Response alugar(AluguelDto aluguel, @Context SecurityContext securityContext) {
		
		service.inserir(aluguel);
		
		return Response
				.status(Response.Status.CREATED)
				.build();
	}

}
