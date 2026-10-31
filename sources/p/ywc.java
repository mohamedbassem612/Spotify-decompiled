package p;

import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ywc extends hab0 implements vu30 {
    public final /* synthetic */ long a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;
    public final /* synthetic */ lee1 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ lee1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywc(long j, qim0 qim0Var, float f, long j2, String str, lee1 lee1Var, String str2, lee1 lee1Var2) {
        super(2);
        this.a = j;
        this.b = qim0Var;
        this.c = f;
        this.d = j2;
        this.e = str;
        this.f = lee1Var;
        this.g = str2;
        this.h = lee1Var2;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            long j = this.a;
            if (j != 16) {
                x340Var2.i0(505491523);
            } else {
                x340Var2.i0(505492670);
                uwr uwrVar = cbx.a;
                j = cbx.a(x340Var2).b.a;
            }
            x340Var2.r(false);
            long j2 = j;
            era eraVar = een.Q0;
            qim0 qim0VarF = dug.f(i1p1.q(this.b, er31.b(this.c)), this.d, d4o1.a);
            mbh mbhVarA = jbh.a(h36.e, eraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
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
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            uwo1.e(this.e.toUpperCase(Locale.ROOT), (qim0) null, this.f, j2, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2018);
            uwo1.e(this.g, (qim0) null, this.h, j2, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2018);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
