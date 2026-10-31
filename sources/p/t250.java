package p;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t250 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u250 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t250(u250 u250Var, byte b) {
        super(0);
        this.a = b;
        this.b = u250Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        u250 u250Var = this.b;
        switch (b) {
            case 0:
                u250Var.j1().a(true);
                return rih1Var;
            case 1:
                u250Var.j1().a(true);
                return rih1Var;
            case 2:
                r5o r5oVarI1 = u250Var.i1();
                r5oVarI1.b.a(new lhv0(r5oVarI1.a.a, "google_login_error"));
                qhe0 qhe0Var = u250Var.e2;
                if (qhe0Var == null) {
                    u890.C("locationChangeUbiLogger");
                    throw null;
                }
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                t8h1.n(qhe0Var, yon1.G1("LOGIN_DIALOG_GOOGLEERROR", "login/dialog/googleerror", 948, "login"));
                qhe0Var.F();
                return rih1Var;
            default:
                u250Var.j2.setValue((Object) null);
                return rih1Var;
        }
    }
}
