package p;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class s4e1 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z4e1 b;

    public /* synthetic */ s4e1(z4e1 z4e1Var, byte b) {
        this.a = b;
        this.b = z4e1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        byte b2 = 1;
        ree1 ree1Var = ree1.c;
        byte b3 = 0;
        lnm lnmVar = null;
        rih1 rih1Var = rih1.a;
        z4e1 z4e1Var = this.b;
        switch (b) {
            case 0:
                fn31.T(z4e1Var.v1(), null, 0, new v4e1(z4e1Var, lnmVar, b2), 3);
                return Boolean.TRUE;
            case 1:
                z4e1Var.f1 = (crl1) lcc.z(z4e1Var, t4k.u);
                z4e1Var.S0.h = z4e1Var.M1();
                if (z4e1Var.M1() && z4e1Var.g1 == null) {
                    z4e1Var.g1 = fn31.T(z4e1Var.v1(), null, 0, new v4e1(z4e1Var, lnmVar, (byte) 4), 3);
                } else if (!z4e1Var.M1()) {
                    xab1 xab1Var = z4e1Var.g1;
                    if (xab1Var != null) {
                        xab1Var.d((CancellationException) null);
                    }
                    z4e1Var.g1 = null;
                }
                return rih1Var;
            case 2:
                oap1.u(z4e1Var);
                return rih1Var;
            case 3:
                oap1.u(z4e1Var);
                return rih1Var;
            case 4:
                s3o1.r(z4e1Var);
                return null;
            case 5:
                s3o1.r(z4e1Var);
                return q4e1.a;
            case 6:
                fn31.T(z4e1Var.v1(), null, 0, new v4e1(z4e1Var, lnmVar, (byte) 2), 3);
                return Boolean.TRUE;
            case 7:
                return z4e1Var.Q0.a.d().d.toString();
            case 8:
                if (!z4e1Var.M1()) {
                    l030 l030Var = z4e1Var.b1;
                    if (((pim0) l030Var).N0) {
                        d030.O1(l030Var.V0);
                    }
                } else if (!z4e1Var.V0) {
                    z4e1Var.O1().b();
                }
                return Boolean.TRUE;
            case 9:
                if (!z4e1Var.M1()) {
                    l030 l030Var2 = z4e1Var.b1;
                    if (((pim0) l030Var2).N0) {
                        d030.O1(l030Var2.V0);
                    }
                }
                z4e1Var.S0.x(ree1Var);
                return Boolean.TRUE;
            case 10:
                fn31.T(z4e1Var.v1(), null, 0, new v4e1(z4e1Var, lnmVar, b3), 3);
                return Boolean.TRUE;
            case 11:
                if (z4e1Var.j1 != null) {
                    z4e1Var.O1().b();
                } else {
                    z4e1Var.P1(true);
                }
                return rih1Var;
            default:
                z4e1Var.S0.x(ree1Var);
                return rih1Var;
        }
    }
}
