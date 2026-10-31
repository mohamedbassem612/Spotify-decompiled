package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ovv extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qvv b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ovv(qvv qvvVar, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = qvvVar;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        b7x b7xVar = b7x.a;
        qvv qvvVar = this.b;
        switch (b) {
            case 0:
                gmt gmtVar = qvvVar.a;
                i8h1 i8h1Var = (i8h1) gmtVar.b;
                x6h1 x6h1VarC = ((txk0) gmtVar.c).b.c();
                x6h1VarC.i.add(new a7h1("make_public_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", "private"), new mmr0("state_after_toggle", "public")})), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(new wvv(1));
                break;
            default:
                gmt gmtVar2 = qvvVar.a;
                i8h1 i8h1Var2 = (i8h1) gmtVar2.b;
                x6h1 x6h1VarC2 = ((txk0) gmtVar2.c).b.c();
                x6h1VarC2.i.add(new a7h1("make_private_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(new wvv(2));
                break;
        }
        return rih1Var;
    }
}
