package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nbs0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qbs0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nbs0(qbs0 qbs0Var, byte b) {
        super(0);
        this.a = b;
        this.b = qbs0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qbs0 qbs0Var = this.b;
        switch (b) {
            case 0:
                q8n q8nVar = qbs0Var.M1;
                if (q8nVar != null) {
                    return smo1.e(q8nVar);
                }
                u890.C("mainDispatcher");
                throw null;
            case 1:
                sap1.m(qbs0Var, "PAYMENT_FRAGMENT_RESULT_KEY", jcs0.c.a());
                return rih1Var;
            case 2:
                qbs0Var.Z0().U(c500.a);
                return rih1Var;
            case 3:
                qbs0Var.Z0().U(c400.a);
                return rih1Var;
            case 4:
                qbs0Var.Z0().U(f400.a);
                return rih1Var;
            case 5:
                return qbs0Var.Y0().h ? qbs0Var.N0() : qbs0Var;
            default:
                ynb0 ynb0Var = qbs0Var.O1;
                if (ynb0Var != null) {
                    return (eck1) ynb0Var.get();
                }
                u890.C("vmFactory");
                throw null;
        }
    }
}
