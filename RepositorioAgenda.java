public class RepositorioAgenda {
    private static final String baseNomeArquivo = "Agenda-";
    private static final File arquivo;

    private static final String separador = "|";
    private static final Charset charset = StandardCharsets.UTF_8;

    public RepositorioAgenda(AgendaSemanal agenda) {
        String nomeArquivo = baseNomeArquivo + agenda.getMes() + "-" + agenda.getSemana();
        arquivo = new File(nomeArquivo);
    }
}