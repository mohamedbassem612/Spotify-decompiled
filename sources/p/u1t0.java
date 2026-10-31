package p;

import android.os.Bundle;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u1t0 extends hab0 implements Function0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ xk b;
    public final /* synthetic */ v1t0 c;
    public final /* synthetic */ z1t0 d;
    public final /* synthetic */ swa0 e;
    public final /* synthetic */ ven0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1t0(boolean z, xk xkVar, v1t0 v1t0Var, z1t0 z1t0Var, swa0 swa0Var, ven0 ven0Var) {
        super(0);
        this.a = z;
        this.b = xkVar;
        this.c = v1t0Var;
        this.d = z1t0Var;
        this.e = swa0Var;
        this.f = ven0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        String str2;
        boolean z = this.a;
        ven0 ven0Var = this.f;
        v1t0 v1t0Var = this.c;
        if (z) {
            xk xkVar = this.b;
            el elVar = el.b;
            tv80 tv80VarA = v1t0Var.a(xkVar.f(elVar).a);
            Bundle bundle = new Bundle();
            bundle.putString("pin", suo1.r(ven0Var));
            xkVar.c(elVar, tv80VarA, bundle);
        } else {
            yxa0 yxa0VarA = this.d.a();
            txa0 txa0Var = txa0.a;
            if (u890.j(yxa0VarA, txa0Var)) {
                str = nik1.y3.a;
            } else {
                if (!(yxa0VarA instanceof uxa0)) {
                    if (yxa0VarA instanceof xxa0) {
                        eg.m("ParentalConsent flows should use AccountCreationFlowManager");
                        return null;
                    }
                    eg.o();
                    return null;
                }
                str = nik1.J3.a;
            }
            tv80 tv80VarA2 = v1t0Var.a(str);
            String strR = suo1.r(ven0Var);
            swa0 swa0Var = this.e;
            swa0Var.d = twa0.a(swa0Var.d, strR, null, null, null, null, null, false, false, 0, null, null, null, 8190);
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", swa0Var.d.b);
            lik1 lik1Var = nik1.y3;
            bundle2.putParcelable("pages", swa0Var.d(lik1Var));
            bundle2.putParcelable("flow_type", swa0Var.d.Y);
            yxa0 yxa0Var = swa0Var.d.Y;
            if (u890.j(yxa0Var, txa0Var)) {
                str2 = lik1Var.a;
            } else {
                if (!(yxa0Var instanceof uxa0)) {
                    if (yxa0Var instanceof xxa0) {
                        eg.m("ParentalConsent flows should use AccountCreationFlowManager");
                        return null;
                    }
                    eg.o();
                    return null;
                }
                str2 = nik1.J3.a;
            }
            swa0Var.a.c(str2, tv80VarA2, bundle2);
        }
        return rih1.a;
    }
}
