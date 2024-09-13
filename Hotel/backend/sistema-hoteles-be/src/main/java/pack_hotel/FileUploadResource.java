package pack_hotel;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * Recurso REST para la carga de archivos a Google Drive.
 * Provee un endpoint para subir archivos especificando la ruta y el nombre del archivo.
 */
@Path("/uploadToDrive")
public class FileUploadResource {

    @Inject
    GoogleDriveService googleDriveService;

    /**
     * Carga un archivo a Google Drive según los detalles especificados en la solicitud.
     *
     * @param request Contiene la ruta y el nombre del archivo a cargar.
     * @return Response que contiene el enlace al archivo cargado o un mensaje de error.
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response uploadFileToDrive(FileUploadRequest request) {
        if (request == null || request.getFilePath() == null || request.getFilePath().isEmpty() ||
            request.getFileName() == null || request.getFileName().isEmpty()) {
            return Response.status(Response.Status.BAD_REQUEST).entity("File path or file name is missing").build();
        }

        try {
            String folderId = "1nihlBuTFBe11gQ5fDxHi0AQ_SWGA7E6x";  // El ID de la carpeta destino

            System.out.println("Attempting to upload: " + request.getFilePath() + " with name " + request.getFileName());
            String fileLink = googleDriveService.uploadFile(request.getFilePath(), request.getFileName(), "text/csv", folderId);
            System.out.println("Upload successful, file link: " + fileLink);
            return Response.ok(new FileUploadResponse(fileLink)).build();
        } catch (Exception e) {
            System.err.println("Upload failed: " + e.getMessage());
            e.printStackTrace();
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Upload failed: " + e.getMessage()).build();
        }
    }

    /**
     * Clase para recibir datos de la solicitud de carga de archivos.
     */
    public static class FileUploadRequest {
        private String filePath;
        private String fileName;

        public String getFilePath() {
            return filePath;
        }

        public void setFilePath(String filePath) {
            this.filePath = filePath;
        }

        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }
    }

    /**
     * Clase para enviar la respuesta después de la carga del archivo.
     */
    public static class FileUploadResponse {
        private String fileLink;

        public FileUploadResponse(String fileLink) {
            this.fileLink = fileLink;
        }

        public String getFileLink() {
            if(true){
                int num = 0;
            }
            return fileLink;
        }
    }
}

