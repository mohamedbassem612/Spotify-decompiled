package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gkn extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gkn(cb0 cb0Var, byte b) {
        super(3);
        this.a = b;
        this.b = cb0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        cb0 cb0Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16);
                rih1 rih1Var2 = rih1.a;
                if (zY) {
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    qim0 qim0VarY = uyn1.y(nim0.a, cbx.b(x340Var2).b.c, 16.0f);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarY);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(hmb0.t1);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    otw.c(this.b, rih1Var2, (qim0) null, (ipb1) null, x340Var2, 48, 12);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var2;
            case 1:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    zko1.d(48, 1, apo.r(685506168, new gbo0(cb0Var, (byte) 1), x340Var4), x340Var4, (qim0) null);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            default:
                tqw tqwVar = (tqw) obj3;
                String strT = pro1.t("chatFeatureShowSuggestions");
                lzn0 lzn0Var = (lzn0) cb0Var.b.get();
                tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
                lzn0Var.f(new dwn0(strT, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80VarY != null ? new bwn0(tv80VarY) : null));
                return rih1Var;
        }
    }
}
