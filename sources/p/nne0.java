package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nne0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yge0 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nne0(yge0 yge0Var, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = yge0Var;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        b7x b7xVar = b7x.a;
        yge0 yge0Var = this.b;
        switch (b) {
            case 0:
                i8h1 i8h1VarG = yge0Var.g();
                x6h1 x6h1VarC = ((p2m0) yge0Var.c).b.c();
                x6h1VarC.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1VarG.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(lle0.a);
                break;
            default:
                i8h1 i8h1VarG2 = yge0Var.g();
                x6h1 x6h1VarC2 = ((p2m0) yge0Var.c).b.c();
                x6h1VarC2.i.add(new a7h1("current_location_card", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                i8h1VarG2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(ple0.a);
                break;
        }
        return rih1Var;
    }
}
