package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bij extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wv81 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bij(wv81 wv81Var, byte b) {
        super(3);
        this.a = b;
        this.b = wv81Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        wv81 wv81Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                boolean z = false;
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                x340 x340Var2 = x340Var;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var, nim0.a);
                hzj.A.getClass();
                x340 x340Var3 = x340Var;
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(hmb0.t1);
                } else {
                    x340Var3.v0();
                }
                nko1.H(mbhVarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                x340Var3.i0(-136921664);
                for (Iterator it = wv81Var.b.iterator(); it.hasNext(); it = it) {
                    uwo1.e(cwl1.o0(x340Var, ((Number) it.next()).intValue()), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2046);
                    z = z;
                    x340Var3 = x340Var3;
                }
                x340 x340Var4 = x340Var3;
                x340Var4.r(z);
                x340Var4.r(true);
                return rih1Var;
            default:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                uwo1.e(cwl1.o0(b0kVar, wv81Var.a), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar, 0, 0, 2046);
                return rih1Var;
        }
    }
}
