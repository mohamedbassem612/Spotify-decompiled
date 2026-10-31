package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o340 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bjx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o340(bjx bjxVar, byte b) {
        super(0);
        this.a = b;
        this.b = bjxVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        bjx bjxVar = this.b;
        switch (b) {
            case 0:
                ((iu30) bjxVar.c).invoke(new u240(((yqg) bjxVar.d).b()));
                break;
            case 1:
                bjxVar.I();
                break;
            case 2:
                bjxVar.I();
                break;
            case 3:
                bjxVar.I();
                break;
            default:
                i8h1 i8h1Var = (i8h1) bjxVar.e;
                g5l0 g5l0Var = (g5l0) bjxVar.g;
                Integer numValueOf = Integer.valueOf(((e340) bjxVar.b).d);
                x6h1 x6h1VarC = g5l0Var.c.c();
                x6h1VarC.i.add(new a7h1("question", (String) null, numValueOf, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("feedback", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                x6h1 x6h1VarC3 = x6h1VarC2.a().c();
                x6h1VarC3.i.add(new a7h1("continue_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                y6h1 y6h1VarA = x6h1VarC3.a();
                b7x b7xVar = b7x.a;
                ((iu30) bjxVar.c).invoke(new t240(((yqg) bjxVar.d).b(), i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, g5l0Var.b, System.currentTimeMillis()), (xj61) null)));
                break;
        }
        return rih1Var;
    }
}
