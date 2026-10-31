package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jyq extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xxq b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ l3p1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jyq(xxq xxqVar, iu30 iu30Var, l3p1 l3p1Var, byte b) {
        super(0);
        this.a = b;
        this.b = xxqVar;
        this.c = iu30Var;
        this.d = l3p1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        l3p1 l3p1Var = this.d;
        iu30 iu30Var = this.c;
        b7x b7xVar = b7x.a;
        xxq xxqVar = this.b;
        switch (b) {
            case 0:
                i8h1 i8h1VarA = xxqVar.a();
                x6h1 x6h1VarC = xxqVar.b.b.c();
                x6h1VarC.i.add(new a7h1("data_sections", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("copy_link_to_data_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1VarA.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("copy_to_clipboard", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(new qxq(((h2r) l3p1Var).d));
                break;
            default:
                i8h1 i8h1VarA2 = xxqVar.a();
                x6h1 x6h1VarC3 = xxqVar.b.b.c();
                x6h1VarC3.i.add(new a7h1("data_sections", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("copy_code_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                i8h1VarA2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("copy_to_clipboard", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(new pxq(((h2r) l3p1Var).e));
                break;
        }
        return rih1Var;
    }
}
