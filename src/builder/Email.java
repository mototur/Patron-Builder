package builder;

import java.util.ArrayList;
import java.util.List;

public class Email {
    private List<String> destinatarios;
    private String asunto;
    private String cuerpo;

    public Email() {
    }
    private Email (EmailBuilder builder) {
        this.destinatarios = builder.destinatarios;
        this.asunto = builder.asunto;
        this.cuerpo = builder.cuerpo;
    }

    @Override
    public String toString() {
        return "Email{" +
                "destinatarios=" + destinatarios +
                ", asunto='" + asunto + '\'' +
                ", cuerpo='" + cuerpo + '\'' +
                '}';
    }

    public static class EmailBuilder implements Builder {
        private List<String> destinatarios = new ArrayList<>();
        private String asunto;
        private String cuerpo;

        public EmailBuilder setDestinatario (String destinatario){
            this.destinatarios.add(destinatario);
            return this;
        }
        public EmailBuilder setAsunto (String asunto){
            this.asunto = asunto;
            return this;
        }
        public EmailBuilder setCuerpo (String cuerpo){
            this.cuerpo = cuerpo;
            return this;
        }


        @Override
        public Email build() {return new Email(this);
        }
    }

    public List<String> getDestinatarios() {
        return destinatarios;
    }

    public void setDestinatarios(List<String> destinatarios) {
        this.destinatarios = destinatarios;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }
}
