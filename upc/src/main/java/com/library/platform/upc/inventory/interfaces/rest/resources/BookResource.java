package com.library.platform.upc.inventory.interfaces.rest.resources;

import java.util.Date;

public record BookResource(Long id, String isbn, String title, String author,
                           Date publishedDate, String status, Long genreId) {
}
