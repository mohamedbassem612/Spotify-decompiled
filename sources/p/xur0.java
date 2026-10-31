package p;

import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xur0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qmc1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xur0(qmc1 qmc1Var, String str, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = qmc1Var;
        this.c = str;
        this.d = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        b7x b7xVar = b7x.a;
        String str = this.c;
        qmc1 qmc1Var = this.b;
        switch (b) {
            case 0:
                lik1 lik1VarI = cfm0.i("spotify:internal:parental-control:login-choice:", str, nik1.n0);
                i8h1 i8h1Var = (i8h1) qmc1Var.c.getValue();
                x6h1 x6h1VarC = qmc1Var.b.b.c();
                x6h1VarC.i.add(new a7h1("login_options_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                String str2 = lik1VarI.a;
                iu30Var.invoke(new nvr0(i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null)));
                break;
            default:
                lik1 lik1VarI2 = cfm0.i("spotify:internal:managed-account-details:child:", str, nik1.T3);
                i8h1 i8h1Var2 = (i8h1) qmc1Var.c.getValue();
                x6h1 x6h1VarC2 = qmc1Var.b.b.c();
                x6h1VarC2.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                String str3 = lik1VarI2.a;
                iu30Var.invoke(new lvr0(i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null)));
                break;
        }
        return rih1Var;
    }
}
