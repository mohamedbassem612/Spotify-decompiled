package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p340 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bjx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p340(bjx bjxVar, byte b) {
        super(1);
        this.a = b;
        this.b = bjxVar;
    }

    public final Object invoke(Object obj) {
        String str;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        bjx bjxVar = this.b;
        switch (b) {
            case 0:
                ((iu30) bjxVar.c).invoke(v240.a);
                return rih1Var;
            default:
                String str2 = ((o9g) obj).a;
                e340 e340Var = (e340) bjxVar.b;
                Iterator it = e340Var.b().c.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                    } else if (!((c5g) it.next()).a.equals(str2)) {
                        i++;
                    }
                }
                char c = str2.equals(e340Var.b().d) ? (char) 1 : (char) 2;
                i8h1 i8h1Var = (i8h1) bjxVar.e;
                g5l0 g5l0Var = (g5l0) bjxVar.g;
                Integer numValueOf = Integer.valueOf(e340Var.d);
                x6h1 x6h1VarC = g5l0Var.c.c();
                x6h1VarC.i.add(new a7h1("question", (String) null, numValueOf, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("choices", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                Integer numValueOf2 = Integer.valueOf(i);
                x6h1 x6h1VarC3 = y6h1VarA.c();
                if (c == 1) {
                    str = "correct";
                } else {
                    if (c != 2) {
                        throw null;
                    }
                    str = "incorrect";
                }
                x6h1VarC3.i.add(new a7h1("answer_button", (String) null, numValueOf2, str2, str));
                x6h1VarC3.j = false;
                y6h1 y6h1VarA2 = x6h1VarC3.a();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), y6h1VarA2, g5l0Var.b, System.currentTimeMillis()), (xj61) null);
                ((iu30) bjxVar.c).invoke(new r240(str2, ((yqg) bjxVar.d).b()));
                return rih1Var;
        }
    }
}
