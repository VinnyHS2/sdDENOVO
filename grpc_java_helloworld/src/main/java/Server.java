
import io.grpc.ServerBuilder;
import java.io.IOException;

/**
 *
 * @author rodrigo
 */
public class Server {
    public static void main(String[] args) {
            io.grpc.Server server = ServerBuilder
                    .forPort(7778)
                    .addService(new GerenciadorDeNotasImpl())
                    .build();
            
            
        try {
            server.start();
            System.out.println("Servidor iniciado.");
            server.awaitTermination();
        } catch (IOException | InterruptedException e) {
            System.err.println("Erro: " + e);
        }
        
    }
}
