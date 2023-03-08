import java.util.Objects;

public class ServicoDeCobranca {
    
    private void enviarNotificacao(Fatura fatura, String email) {
        System.out.printf("Fatura %d enviada para %s%n", fatura.numero, email);
    }
    void pagar(Fatura fatura, String emailCobranca, String... emailsAdicionais) {
        Objects.requireNonNull(emailCobranca, "Tchau");
        System.out.printf("Fatura %d, no valor total de R$%.2f, foi paga! %n", fatura.numero, fatura.valorTotal);

        for (String email: emailsAdicionais) {
            enviarNotificacao(fatura, email);
        }
    }
}
