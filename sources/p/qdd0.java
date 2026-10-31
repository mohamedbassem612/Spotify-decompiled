package p;

import java.text.NumberFormat;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qdd0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tob1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qdd0(tob1 tob1Var, byte b) {
        super(3);
        this.a = b;
        this.b = tob1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tob1 tob1Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                daf dafVar = (daf) tob1Var.getValue();
                if (dafVar == null) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(591170187);
                    x340Var2.r(false);
                } else {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(591170188);
                    otw.c(dafVar.a, dafVar.b, (qim0) null, (ipb1) null, x340Var3, 0, 12);
                    x340Var3.r(false);
                }
                return rih1Var;
            case 1:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar = cbx.a;
                uwo1.e(NumberFormat.getPercentInstance().format(Float.valueOf(((Number) tob1Var.getValue()).floatValue())), uyn1.x(dug.f(nim0.a, ((vex) zex.a.e).c, er31.b(12.0f)), 8.0f), cbx.d(b0kVar).a, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar, 0, 0, 2040);
                return rih1Var;
            case 2:
                qim0 qim0Var = (qim0) obj;
                x340 x340Var4 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var4.g(qim0Var) ? 4 : 2;
                }
                x340 x340Var5 = x340Var4;
                if (x340Var5.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    boolean zG = x340Var5.g(tob1Var);
                    Object objT = x340Var5.T();
                    if (zG || objT == fkj0.X) {
                        objT = new lws0(tob1Var, (byte) 5);
                        x340Var5.s0(objT);
                    }
                    mue1.p(0, 0L, x340Var5, i541.C(qim0Var, (iu30) objT));
                } else {
                    x340Var5.b0();
                }
                return rih1Var;
            default:
                q5t0 q5t0VarH = ((afh0) obj2).H(((hjl) obj3).a);
                return ((ifh0) obj).S(q5t0VarH.a, q5t0VarH.b, b7x.a, new cmd1(tob1Var, q5t0VarH, (byte) 17));
        }
    }
}
