package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m1y extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ otu b;
    public final /* synthetic */ rpu c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1y(otu otuVar, rpu rpuVar, iu30 iu30Var) {
        super(0);
        this.b = otuVar;
        this.c = rpuVar;
        this.d = iu30Var;
    }

    public final Object invoke() {
        char c;
        String str;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        b7x b7xVar = b7x.a;
        rpu rpuVar = this.c;
        otu otuVar = this.b;
        switch (b) {
            case 0:
                txk0 txk0Var = (txk0) otuVar.c;
                int iJ = bwp0.j(rpuVar);
                x6h1 x6h1VarC = txk0Var.b.c();
                x6h1VarC.i.add(new a7h1("commentary_confirmation_dialog", (String) null, (Integer) null, (String) null, z0l0.a(iJ)));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("commentary_change_accept_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                int iOrdinal = rpuVar.ordinal();
                if (iOrdinal == 0) {
                    c = 1;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    c = 2;
                }
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                mmr0 mmr0Var = new mmr0("setting_name", "dj_commentary");
                if (c == 1) {
                    str = "default";
                } else {
                    if (c != 2) {
                        throw null;
                    }
                    str = "sometimes";
                }
                iu30Var.invoke(new g2y(((i8h1) otuVar.b).m(new w7h1("", "", z7h1Var, new x7h1("set_multiple_choice_setting", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("option_selected", str)})), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null).a));
                return rih1Var;
            default:
                txk0 txk0Var2 = (txk0) otuVar.c;
                int iJ2 = bwp0.j(rpuVar);
                x6h1 x6h1VarC3 = txk0Var2.b.c();
                x6h1VarC3.i.add(new a7h1("commentary_confirmation_dialog", (String) null, (Integer) null, (String) null, z0l0.a(iJ2)));
                x6h1VarC3.j = true;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("commentary_change_cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                ((i8h1) otuVar.b).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("discard_changes", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(f2y.a);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1y(iu30 iu30Var, otu otuVar, rpu rpuVar) {
        super(0);
        this.d = iu30Var;
        this.b = otuVar;
        this.c = rpuVar;
    }
}
