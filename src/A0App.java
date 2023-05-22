public class A0App {
    public static void main(String[] args) throws Exception {
        
        // era dessa forma no ja 7
        // new Thread(New Runnable(){
        // @Override
        // public void run() {
        // System.out.println("Ola Mundo");
        // }).run();

        // com as atualizaçoẽs do java 8 ficou dessa Formato
        
        // com a nova atualização o java faz a implentação do metodo rum() da interface
        // Runnable de forma automatica devido ser o unico metodo abstrato que e
        // encontrado na interface seguindo o padrão SAM (single abstract method)

        new Thread(() -> System.out.println("ola Mundo")).run();
    }
}
