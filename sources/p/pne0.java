package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pne0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yge0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ nhe0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pne0(yge0 yge0Var, int i, iu30 iu30Var, nhe0 nhe0Var, byte b) {
        super(0);
        this.a = b;
        this.b = yge0Var;
        this.c = i;
        this.d = iu30Var;
        this.e = nhe0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nhe0 nhe0Var = this.e;
        iu30 iu30Var = this.d;
        b7x b7xVar = b7x.a;
        int i = this.c;
        yge0 yge0Var = this.b;
        switch (b) {
            case 0:
                i8h1 i8h1VarG = yge0Var.g();
                p2m0 p2m0Var = (p2m0) yge0Var.c;
                Integer numValueOf = Integer.valueOf(i);
                x6h1 x6h1VarC = p2m0Var.b.c();
                x6h1VarC.i.add(new a7h1("search_result_item", (String) null, numValueOf, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1VarG.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(new ule0(nhe0Var));
                break;
            case 1:
                i8h1 i8h1VarG2 = yge0Var.g();
                p2m0 p2m0Var2 = (p2m0) yge0Var.c;
                Integer numValueOf2 = Integer.valueOf(i);
                x6h1 x6h1VarC2 = p2m0Var2.b.c();
                x6h1VarC2.i.add(new a7h1("recent_search_item", (String) null, numValueOf2, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1VarG2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(new ame0(nhe0Var));
                break;
            default:
                i8h1 i8h1VarG3 = yge0Var.g();
                p2m0 p2m0Var3 = (p2m0) yge0Var.c;
                Integer numValueOf3 = Integer.valueOf(i);
                x6h1 x6h1VarC3 = p2m0Var3.b.c();
                x6h1VarC3.i.add(new a7h1("recent_search_item", (String) null, numValueOf3, (String) null, (String) null));
                x6h1VarC3.j = false;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("remove_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                i8h1VarG3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_recent_searches_item", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(new cme0(nhe0Var));
                break;
        }
        return rih1Var;
    }
}
