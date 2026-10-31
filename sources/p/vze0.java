package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vze0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ w6e0 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ qze0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vze0(w6e0 w6e0Var, iu30 iu30Var, qze0 qze0Var) {
        super(0);
        this.b = w6e0Var;
        this.c = iu30Var;
        this.d = qze0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qze0 qze0Var = this.d;
        iu30 iu30Var = this.c;
        b7x b7xVar = b7x.a;
        w6e0 w6e0Var = this.b;
        switch (b) {
            case 0:
                if (qze0Var.f == 1) {
                    i8h1 i8h1Var = (i8h1) ((idd1) w6e0Var.e).getValue();
                    k7l0 k7l0Var = (k7l0) ((idd1) w6e0Var.c).getValue();
                    k7l0Var.getClass();
                    x6h1 x6h1VarC = k7l0Var.b.c();
                    x6h1VarC.i.add(new a7h1("login_current_device_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    iu30Var.invoke(new jze0(qze0Var.a, qze0Var.b, i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("login", 1, b7xVar), x6h1VarC.a(), k7l0Var.a, System.currentTimeMillis()), (xj61) null).a.a));
                }
                break;
            default:
                i8h1 i8h1Var2 = (i8h1) ((idd1) w6e0Var.e).getValue();
                ksk0 ksk0Var = (ksk0) w6e0Var.b;
                x6h1 x6h1VarC2 = ksk0Var.c.c();
                x6h1VarC2.i.add(new a7h1("error_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                x6h1 x6h1VarC3 = x6h1VarC2.a().c();
                x6h1VarC3.i.add(new a7h1("retry_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                iu30Var.invoke(new hze0(qze0Var.a, qze0Var.b, i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("login", 1, b7xVar), x6h1VarC3.a(), ksk0Var.b, System.currentTimeMillis()), (xj61) null).a.a));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vze0(qze0 qze0Var, w6e0 w6e0Var, iu30 iu30Var) {
        super(0);
        this.d = qze0Var;
        this.b = w6e0Var;
        this.c = iu30Var;
    }
}
