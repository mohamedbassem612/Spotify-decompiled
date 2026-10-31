package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class co60 extends hab0 implements zu30 {
    public final /* synthetic */ iu30 a;
    public final /* synthetic */ un60 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ vn60 f;
    public final /* synthetic */ ven0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co60(iu30 iu30Var, un60 un60Var, iu30 iu30Var2, boolean z, boolean z2, vn60 vn60Var, ven0 ven0Var) {
        super(4);
        this.a = iu30Var;
        this.b = un60Var;
        this.c = iu30Var2;
        this.d = z;
        this.e = z2;
        this.f = vn60Var;
        this.g = ven0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int iIntValue = ((Number) obj).intValue();
        un60 un60Var = (un60) obj2;
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        String str = un60Var.b;
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.e(iIntValue) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.g(un60Var) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            qim0 qim0VarW = nim0.a;
            qim0 qim0VarX = lrn1.x(qim0VarW, -iIntValue);
            if (u890.j(str, "client-native:wrapped")) {
                x340Var2.i0(-592621337);
                qim0VarW = jzn1.w(qim0VarW, this.a, x340Var2);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-592529515);
                x340Var2.r(false);
            }
            qim0 qim0VarThen = qim0VarX.then(qim0VarW);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarThen);
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
            un60 un60Var2 = this.b;
            boolean zJ = u890.j(str, un60Var2 != null ? un60Var2.b : null);
            c9 c9Var = un60Var.d;
            wj31 wj31Var = un60Var.f ? (wj31) this.g.getValue() : null;
            boolean zH = x340Var2.h(zJ);
            iu30 iu30Var = this.c;
            boolean zG = zH | x340Var2.g(iu30Var) | ((i & 112) == 32);
            Object objT = x340Var2.T();
            if (zG || objT == fkj0.X) {
                objT = new vm1(zJ, iu30Var, un60Var, (byte) 12);
                x340Var2.s0(objT);
            }
            so60.a(un60Var, c9Var, new gbx(z50.c, (Function0) objT), iu30Var, wj31Var, this.d, this.e, (qim0) null, zJ, this.f, x340Var2, (i >> 3) & 14);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
