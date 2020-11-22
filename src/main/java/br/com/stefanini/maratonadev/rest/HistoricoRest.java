package br.com.stefanini.maratonadev.rest;

import br.com.stefanini.maratonadev.dto.HistoricoDto;
import br.com.stefanini.maratonadev.service.HistoricoService;

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
public class HistoricoRest {

    @Inject
    HistoricoService service;

    @POST
	@Path("")
	@Operation(summary = "Alugar carro",
	description = "Alugar carro")
	@APIResponse(responseCode = "201",
	description = "Carro alugado",
	content = {
			@Content(mediaType =  "application/json",
			schema = @Schema(implementation = HistoricoDto.class))
			}
	)
	public Response alugar(HistoricoDto aluguel, @Context SecurityContext securityContext) {
		
		service.inserir(aluguel);
		
		return Response
				.status(Response.Status.CREATED)
				.build();
	}
    
    @GET
    @Operation(summary = "Listar alugados",
            description = "Lista de carros alugados")
    @APIResponse(responseCode = "201",
            description = "aluguel",
            content = {
                    @Content(mediaType =  "application/json",
                            schema = @Schema(implementation = HistoricoDto.class))
            }
    )
    public Response listar(){
        return Response
                .status(Response.Status.OK)
                .entity(service.listar())
                .build();
    }

}
