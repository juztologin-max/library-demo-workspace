package com.library.microservice.pdf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.microservice.pdf.service.PdfService;

import tools.jackson.databind.JsonNode;

@RequestMapping("/api/pdf")
@RestController
public class PdfController {
	private final PdfService pdfService;
	@Autowired
	PdfController(PdfService pdfService) {
		this.pdfService=pdfService;
	}
    @PostMapping("/create")
	public ResponseEntity<byte[]> create(@RequestBody JsonNode payload) {
    byte[] content = pdfService.createPdf(payload);
    HttpHeaders headers=new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_PDF);
    headers.setContentDisposition(ContentDisposition.attachment().filename("output.pdf").build());
    return ResponseEntity.ok().headers(headers).body(content);
	}
}
