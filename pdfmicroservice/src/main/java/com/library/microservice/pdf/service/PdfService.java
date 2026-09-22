package com.library.microservice.pdf.service;

import tools.jackson.databind.JsonNode;

public interface PdfService {
	public byte[] createPdf(JsonNode payload) ;
}
