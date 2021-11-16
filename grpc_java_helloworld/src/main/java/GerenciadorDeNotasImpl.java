
import io.grpc.stub.StreamObserver;

/**
 *
 * @author bitcoin e vinny
 */

public class GerenciadorDeNotasImpl extends GerenciadorDeNotasGrpc.GerenciadorDeNotasImplBase {
    
    @Override
    public void listarAlunos(ListarAlunosRequest request, StreamObserver<ListarAlunosResponse> responseObserver) {
        System.out.println("Cadastrando nota: " + request.getAno());
        ListarAlunosResponse response = ListarAlunosResponse.newBuilder().setMensagem("Teste").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    // public void AlterarNota(AlterarNotaRequest request, StreamObserver<AlterarNotaResponse> responseObserver) {
    //     System.out.println("Cadastrando nota: ");
    //     AlterarNotaResponse response = AlterarNotaResponse.newBuilder().setMensagem("Teste").build();
    //     responseObserver.onNext(response);
    //     responseObserver.onCompleted();
    // }
    // public void AlterarFaltas(AlterarFaltasRequest request, StreamObserver<AlterarFaltasResponse> responseObserver) {
    //     System.out.println("Cadastrando nota: " );
    //     AlterarFaltasResponse response = AlterarFaltasResponse.newBuilder().setMensagem("Teste").build();
    //     responseObserver.onNext(response);
    //     responseObserver.onCompleted();
    // }
    // public void ListarDisciplinasCurso(ListarDisciplinasCursoRequest request, StreamObserver<ListarDisciplinasCursoResponse> responseObserver) {
    //     System.out.println("Cadastrando nota: " );
    //     ListarDisciplinasCursoResponse response = ListarDisciplinasCursoResponse.newBuilder().setMensagem("Teste").build();
    //     responseObserver.onNext(response);
    //     responseObserver.onCompleted();
    // }
    // public void ListarDisciplinasAluno(ListarDisciplinasAlunoRequest request, StreamObserver<ListarDisciplinasAlunoResponse> responseObserver) {
    //     System.out.println("Cadastrando nota: " );
    //     ListarDisciplinasAlunoResponse response = ListarDisciplinasAlunoResponse.newBuilder().setMensagem("Teste").build();
    //     responseObserver.onNext(response);
    //     responseObserver.onCompleted();
    // }
    // public void InserirMatricula(InserirMatriculaRequest request, StreamObserver<InserirMatriculaResponse> responseObserver) {
    //     System.out.println("Cadastrando sapo: ");
    //     InserirMatriculaResponse response = InserirMatriculaResponse.newBuilder().setMensagem("Teste").build();
    //     responseObserver.onNext(response);
    //     responseObserver.onCompleted();
    // }
    // @Override
    // public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
    //     System.out.println("Recebido: " + request.getName());
    //     HelloReply response = HelloReply.newBuilder()
    //             .setMessage("Olá, recebi sua mensagem.")
    //             .build();
        
        // responseObserver.onNext(response);
        // responseObserver.onCompleted();
    // }
    
    
}
