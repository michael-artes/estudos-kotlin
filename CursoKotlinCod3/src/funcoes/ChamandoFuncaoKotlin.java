package funcoes;

import kotlin.collections.CollectionsKt;

import java.util.ArrayList;

public class ChamandoFuncaoKotlin {
    public static void main(String[] args) {
        ArrayList<String> list = CollectionsKt.arrayListOf("Joao", "C6Bank", "Pedro");
        System.out.println(SegundoElementoListKt.segundoOrNull(list));
    }
}
