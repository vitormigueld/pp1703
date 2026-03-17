import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Questao QTemplate = new Questao(
                "template",
                (short) 0,
                "0"
        );
        Questao q1 = QTemplate.copiar();
        q1.setId("01");
        q1.setPontos((short)3);

        Questao q2 = QTemplate.copiar();
        q2.setId("02");
        q2.setPontos((short)3);

        Questao q3 = QTemplate.copiar();
        q3.setId("03");
        q3.setPontos((short)4);

        List<Questao> questoesTemplate = new ArrayList<>();
        questoesTemplate.add(q1);
        questoesTemplate.add(q2);
        questoesTemplate.add(q3);
        Prova PTemplate = new Prova(
                 "Prova SQL - Template",
"TEMPLATE",
"2026-03-10",
"BASE",
                 questoesTemplate
        );
        PTemplate.printResumo();

        Prova p1 = PTemplate.copiar();
        p1.setTurma("2o INFO A");
        p1.setData("2026-03-20");
        p1.setVersao("V1");
        Questao nq2 = q2.copiar();
        nq2.setEnunciado("Jurupinga");
        p1.substituirQuestao("02",nq2);
        p1.printResumo();

        Prova p2 = PTemplate.copiar();
        p2.setTurma("2o INFO B");
        p2.setData("2026-03-21");
        p2.setVersao("V1");
        Questao nq3 = q3.copiar();
        nq3.setPontos((short) 7);
        p2.substituirQuestao("03",nq3);
        p2.printResumo();

        Questao nq1 = q1.copiar();
        nq1.setEnunciado("Jabulane");
        p1.substituirQuestao("01",nq1);

        PTemplate.printResumo();
        p1.printResumo();
    }
}