package p;

import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w1g0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u1g0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1g0(u1g0 u1g0Var, byte b) {
        super(1);
        this.a = b;
        this.b = u1g0Var;
    }

    public final Object invoke(Object obj) {
        url1 prl1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        u1g0 u1g0Var = this.b;
        switch (b) {
            case 0:
                r1g0 r1g0Var = u1g0Var.a.a;
                r1g0Var.g.c(r1g0.h[2], r1g0Var, Integer.valueOf((int) (4294967295L & ((elb0) obj).b())));
                return rih1Var;
            case 1:
                r1g0 r1g0Var2 = u1g0Var.a.a;
                r1g0Var2.f.c(r1g0.h[1], r1g0Var2, Integer.valueOf((int) (4294967295L & ((elb0) obj).b())));
                return rih1Var;
            default:
                hsl1 hsl1Var = (hsl1) obj;
                r1g0 r1g0Var3 = u1g0Var.a.a;
                nk80 nk80VarI = hsl1Var.a.i(519);
                int i = nk80VarI.d;
                q1g0 q1g0Var = r1g0Var3.g;
                mma0 mma0Var = r1g0.h[2];
                nk80 nk80VarC = nk80.c(0, nk80VarI.b, 0, Math.max(i, ((Number) ((sgp0) q1g0Var).a).intValue()));
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 36) {
                    prl1Var = new url1(hsl1Var);
                } else if (i2 >= 35) {
                    prl1Var = new trl1(hsl1Var);
                } else if (i2 >= 34) {
                    prl1Var = new srl1(hsl1Var);
                } else if (i2 >= 31) {
                    prl1Var = new rrl1(hsl1Var);
                } else if (i2 >= 30) {
                    prl1Var = new qrl1(hsl1Var);
                } else {
                    prl1Var = i2 >= 29 ? new prl1(hsl1Var) : new nrl1(hsl1Var);
                }
                prl1Var.d(519, nk80VarC);
                hsl1 hsl1VarB = prl1Var.b();
                return hsl1VarB == null ? hsl1Var : hsl1VarB;
        }
    }
}
