package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c9a1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ngs0 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ maa f;
    public final /* synthetic */ na9 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9a1(boolean z, ngs0 ngs0Var, String str, boolean z2, maa maaVar, na9 na9Var) {
        super(2);
        this.b = z;
        this.d = ngs0Var;
        this.e = str;
        this.c = z2;
        this.f = maaVar;
        this.g = na9Var;
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
                String str = this.e;
                if (z2) {
                    x340Var2.i0(-793806980);
                    otw.c(this.d, new fba1(new iba1(str)), (qim0) null, (ipb1) null, x340Var2, 72, 12);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-793544627);
                    x340Var2.r(false);
                }
                if (z) {
                    x340Var2.i0(-793504761);
                    otw.c(this.f, new mea1(new pea1(str)), (qim0) null, (ipb1) null, x340Var2, 64, 12);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-793283731);
                    x340Var2.r(false);
                }
                otw.c(this.g, rih1Var, (qim0) null, (ipb1) null, x340Var2, 56, 12);
                x340Var2.r(true);
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    bzn1.e((qim0) null, ojj.a, c680.F((z2 ? 1 : 0) + 1 + (z ? 1 : 0), x340Var4), apo.r(-489815119, new c9a1(this.c, this.d, this.e, this.b, this.f, this.g), x340Var4), rgr0.a, (ngr0) null, (ygr0) null, (Function0) null, x340Var4, 3120, 225);
                } else {
                    x340Var4.b0();
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9a1(boolean z, boolean z2, ngs0 ngs0Var, String str, maa maaVar, na9 na9Var) {
        super(2);
        this.b = z;
        this.c = z2;
        this.d = ngs0Var;
        this.e = str;
        this.f = maaVar;
        this.g = na9Var;
    }
}
