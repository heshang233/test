package com.joker.restful.api;

import com.joker.restful.dto.FasterXmlDTO;
import com.joker.restful.dto.TestDTO;
import com.joker.restful.util.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.PathSegment;
import java.util.List;
import java.util.Set;

/**
 * @author huangsy
 * @date 2018/1/27 13:04
 */
@Path("/")
public interface UserService {
    @GET
    String get();

    @POST
    @Path("{testdto}")
    @Produces(MediaType.APPLICATION_JSON)
    TestDTO postStr(@PathParam("testdto")TestDTO testDTO);


    @POST
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    Set<String> xml(String uuid);

    @POST
    @Path("/getxml")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    FasterXmlDTO getxml();

    @GET
    @Path("/testholder/{message}")
    String testHolder(@PathParam("message")String message);

    @POST
    @Path("/FilmServices/GetFilmList")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    FilmListResultDTO GetFilmList(GetFilmListRequestDTO dto);

    @POST
    @Path("/FilmServices/GetFilmInfo")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    FilmInfoResultDTO GetFilmInfo(GetFilmInfoRequestDTO dto);

    @POST
    @Path("/FilmServices/GetFilmDCP")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    FilmFtpResultDTO GetFilmDCP(GetFilmFtpRequestDTO dto) throws Exception;
}
