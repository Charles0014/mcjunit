package br.com.mcjunit;

import io.micronaut.http.annotation.*;

@Controller("/mcjunit")
public class McjunitController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}