package com.udit;

import com.intellij.lang.LanguageParserDefinitions;
import com.intellij.lang.java.JavaLanguage;
import com.intellij.openapi.project.DefaultProjectFactory;
import com.intellij.psi.PsiFileFactory;

public class JavaRunner {
    public static void main(String[] args) {
        System.out.println("hello world");
        String text = "package com.udit;\n" +
                "\n" +
                "public class Animal {\n" +
                "    String name;\n" +
                "    int id;\n" +
                "\n" +
                "    public String getName() {\n" +
                "        return name;\n" +
                "    }\n" +
                "\n" +
                "    public void setName(String name) {\n" +
                "        this.name = name;\n" +
                "    }\n" +
                "\n" +
                "    public int getId() {\n" +
                "        return id;\n" +
                "    }\n" +
                "\n" +
                "    public void setId(int id) {\n" +
                "        this.id = id;\n" +
                "    }\n" +
                "\n" +
                "    public Animal(String name, int id) {\n" +
                "        this.name = name;\n" +
                "        this.id = id;\n" +
                "    }\n" +
                "}\n";
        var file = PsiFileFactory.getInstance(DefaultProjectFactory.getInstance().getDefaultProject()).createFileFromText("udit.java", JavaLanguage.INSTANCE,text);
        var cp = LanguageParserDefinitions.INSTANCE.forLanguage(JavaLanguage.INSTANCE).createFile(file.getViewProvider());
//        JFlexParserDefinition definition = new JFlexParserDefinition();
//        PsiParser parser = definition.createParser(null);
//        Lexer lexer = definition.createLexer(null);
//        PsiBuilderImpl psiBuilder =
//                new PsiBuilderImpl(
//                        null, null, definition, lexer, null, text, null, null);
//        PsiBuilderAdapter adapter =
//                new PsiBuilderAdapter(psiBuilder);
//        ASTNode astNode =  parser.parse(definition.getFileNodeType(), adapter);
//        System.out.println(astNode);
//        System.out.println("done");
        //GrammarParser grammarParser = new GrammarParser();

    }

}
