package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ddh1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ngs0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ jm6 f;
    public final /* synthetic */ maa g;
    public final /* synthetic */ na9 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddh1(boolean z, ngs0 ngs0Var, boolean z2, jm6 jm6Var, boolean z3, maa maaVar, na9 na9Var) {
        super(2);
        this.b = z;
        this.d = ngs0Var;
        this.c = z2;
        this.f = jm6Var;
        this.e = z3;
        this.g = maaVar;
        this.h = na9Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        boolean z = this.c;
        boolean z2 = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                rih1 rih1Var = rih1.a;
                if (!zY) {
                    x340Var2.b0();
                    return rih1Var;
                }
                jm6 jm6Var = this.f;
                c380 c380Var = jm6Var.b;
                String str = jm6Var.a;
                jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var2, 0);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, nim0.a);
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
                nko1.H(jw31VarA, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                if (z2) {
                    x340Var2.i0(1723909058);
                    otw.c(this.d, new fba1(z ? new hba1(str, (String) o7h.q0(c380Var)) : new gba1(str)), (qim0) null, (ipb1) null, x340Var2, 72, 12);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(1724444335);
                    x340Var2.r(false);
                }
                if (this.e) {
                    x340Var2.i0(1724494214);
                    otw.c(this.g, new mea1(z ? new oea1(str, (String) o7h.q0(c380Var)) : new nea1(str)), (qim0) null, (ipb1) null, x340Var2, 64, 12);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(1725025647);
                    x340Var2.r(false);
                }
                otw.c(this.h, rih1Var, (qim0) null, (ipb1) null, x340Var2, 56, 12);
                x340Var2.r(true);
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    bzn1.e((qim0) null, poj.a, c680.F((z2 ? 1 : 0) + 1 + (z ? 1 : 0), x340Var4), apo.r(837108311, new ddh1(this.c, this.d, this.e, this.f, this.b, this.g, this.h), x340Var4), rgr0.a, (ngr0) null, (ygr0) null, (Function0) null, x340Var4, 3120, 225);
                } else {
                    x340Var4.b0();
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddh1(boolean z, boolean z2, ngs0 ngs0Var, boolean z3, jm6 jm6Var, maa maaVar, na9 na9Var) {
        super(2);
        this.b = z;
        this.c = z2;
        this.d = ngs0Var;
        this.e = z3;
        this.f = jm6Var;
        this.g = maaVar;
        this.h = na9Var;
    }
}
