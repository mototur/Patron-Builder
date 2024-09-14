import builder.Email;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Email email = new Email.EmailBuilder()
                .setDestinatario("LuuSandoval.72@gmail.com")
                .setDestinatario("aurasan.@gmail.com")
                .setDestinatario("pivaral.52@gmail.com")
                .setAsunto("pan con pollo")
                .setCuerpo("Es muy rico")
                .build();
        System.out.println(email);


        }
    }
