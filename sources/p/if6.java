package p;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class if6 extends hab0 implements zu30 {
    public final /* synthetic */ ven0 X;
    public final /* synthetic */ lf6 a;
    public final /* synthetic */ kes b;
    public final /* synthetic */ rk41 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ xd6 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ dw91 g;
    public final /* synthetic */ dw91 h;
    public final /* synthetic */ iu30 i;
    public final /* synthetic */ dw91 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if6(lf6 lf6Var, kes kesVar, rk41 rk41Var, int i, xd6 xd6Var, float f, dw91 dw91Var, dw91 dw91Var2, iu30 iu30Var, dw91 dw91Var3, ven0 ven0Var) {
        super(4);
        this.a = lf6Var;
        this.b = kesVar;
        this.c = rk41Var;
        this.d = i;
        this.e = xd6Var;
        this.f = f;
        this.g = dw91Var;
        this.h = dw91Var2;
        this.i = iu30Var;
        this.t = dw91Var3;
        this.X = ven0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:52:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:76:0x021f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0256  */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        boolean z;
        boolean z2;
        boolean z3;
        Object ff6Var;
        byte b;
        re6 re6Var;
        int i;
        Object obj5;
        int i2;
        Object obj6;
        boolean z4;
        boolean z5;
        Object hf6Var;
        x340 x340Var;
        boolean z6;
        Object obj7;
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj4).intValue();
        m4c m4cVar = fkj0.X;
        lf6 lf6Var = this.a;
        se6 se6Var = (se6) ((ue6) lf6Var.f).b.get(iIntValue);
        x340 x340Var2 = (b0k) obj3;
        x340Var2.i0(-486273427);
        qim0 qim0VarC = nim0.a;
        qim0 qim0VarD = u291.d(qim0VarC, 1.0f);
        kes kesVar = this.b;
        kl1 kl1Var = ((jkr0) kesVar).d;
        qim0 qim0VarX = lrn1.x(qim0VarD, iIntValue != ((err0) kl1Var.c).s() ? 0.0f : 1.0f);
        if (iIntValue != kesVar.o()) {
            Object objT = x340Var2.T();
            if (objT == m4cVar) {
                obj7 = objT;
                t16 t16Var = t16.c1;
                x340Var2.s0(t16Var);
                obj7 = t16Var;
            }
            obj7 = objT;
            qim0VarX = qim0VarX.then(s161.a(qim0VarC, (iu30) obj7));
        }
        x340Var2.r(false);
        gfh0 gfh0VarC = t1c.c(een.h, false);
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
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
        boolean z7 = se6Var instanceof qe6;
        rk41 rk41Var = this.c;
        xd6 xd6Var = this.e;
        float f = this.f;
        if (z7) {
            x340Var2.i0(-288409871);
            qe6 qe6Var = (qe6) se6Var;
            wj31 wj31Var = lf6Var.b;
            List list = lf6Var.c;
            boolean z8 = lf6Var.d;
            boolean z9 = iIntValue == ((err0) kl1Var.c).s();
            xd6 xd6Var2 = iIntValue == kesVar.o() ? xd6Var : null;
            qim0 qim0VarV = u291.v(qim0VarC, f);
            if (iIntValue == kesVar.o()) {
                qim0VarC = i541.C(qim0VarC, new ve3(xd6Var, (byte) 20));
            }
            z6 = true;
            sf6.a(qe6Var, wj31Var, list, rk41Var, this.d, z8, z9, xd6Var2, qim0VarV.then(qim0VarC), x340Var2, 0);
            x340Var = x340Var2;
            x340Var.r(false);
        } else {
            if (!(se6Var instanceof re6)) {
                throw p3d1.k(x340Var2, -288410297, false);
            }
            x340Var2.i0(-349839423);
            boolean z10 = !u890.j(this.g.get(Integer.valueOf(iIntValue)), Boolean.TRUE);
            Integer numValueOf = Integer.valueOf(iIntValue);
            dw91 dw91Var = this.h;
            boolean z11 = !u890.j(dw91Var.get(numValueOf), Boolean.FALSE);
            re6 re6Var2 = (re6) se6Var;
            gj6 gj6Var = re6Var2.b;
            boolean z12 = rk41Var.a;
            boolean z13 = lf6Var.d;
            xd6 xd6Var3 = iIntValue == kesVar.o() ? xd6Var : null;
            qim0 qim0VarR = d7e.r(0.71428573f, u291.v(qim0VarC, f), false);
            boolean zH = x340Var2.h(z11) | x340Var2.i(se6Var) | x340Var2.i(lf6Var);
            iu30 iu30Var = this.i;
            boolean zG = zH | x340Var2.g(iu30Var);
            int i3 = (iIntValue2 & 112) ^ 48;
            if (i3 <= 32 || !x340Var2.e(iIntValue)) {
                z = zG;
                if ((iIntValue2 & 48) != 32) {
                    z2 = false;
                }
                z3 = z | z2;
                Object objT2 = x340Var2.T();
                if (!z3 || objT2 == m4cVar) {
                    b = 0;
                    ff6Var = new ff6(z11, re6Var2, lf6Var, iu30Var, iIntValue);
                    re6Var = re6Var2;
                    iIntValue = iIntValue;
                    x340Var2.s0(ff6Var);
                } else {
                    re6Var = re6Var2;
                    ff6Var = objT2;
                    b = 0;
                }
                qim0 qim0VarA = s161.a(qim0VarR, (iu30) ff6Var);
                i = (x340Var2.g(iu30Var) ? 1 : 0) | (((i3 > 32 || !x340Var2.e(iIntValue)) && (iIntValue2 & 48) != 32) ? b : (byte) 1);
                Object objT3 = x340Var2.T();
                obj5 = objT3;
                if (i == 0 || objT3 == m4cVar) {
                    ck0 ck0Var = new ck0(iu30Var, iIntValue, (byte) 6);
                    x340Var2.s0(ck0Var);
                    obj5 = ck0Var;
                }
                qim0 qim0VarD2 = a8o.D(qim0VarA, (Function0) obj5);
                i2 = (x340Var2.g(kesVar) ? 1 : 0) | (((i3 > 32 || !x340Var2.e(iIntValue)) && (iIntValue2 & 48) != 32) ? b : (byte) 1);
                Object objT4 = x340Var2.T();
                obj6 = objT4;
                if (i2 == 0 || objT4 == m4cVar) {
                    gf6 gf6Var = new gf6(iIntValue, kesVar, b);
                    x340Var2.s0(gf6Var);
                    obj6 = gf6Var;
                }
                Function0 function0 = (Function0) obj6;
                z4 = ((((x340Var2.h(z10) ? 1 : 0) | (((i3 > 32 || !x340Var2.e(iIntValue)) && (iIntValue2 & 48) != 32) ? b : (byte) 1)) | (x340Var2.g(kesVar) ? 1 : 0)) == true ? 1 : 0) | (x340Var2.i(se6Var) ? 1 : 0);
                Object objT5 = x340Var2.T();
                if (z4 == 0 || objT5 == m4cVar) {
                    z5 = z10;
                    hf6Var = new hf6(this.t, iIntValue, dw91Var, z5, kesVar, re6Var, this.X);
                    x340Var2.s0(hf6Var);
                } else {
                    z5 = z10;
                    hf6Var = objT5;
                }
                uj6.b(gj6Var, z5, z12, z13, xd6Var3, function0, (iu30) hf6Var, qim0VarD2, 2, null, null, null, x340Var2, 100663296, 3584);
                x340Var = x340Var2;
                x340Var.r(b);
                z6 = true;
            } else {
                z = zG;
            }
            z2 = true;
            z3 = z | z2;
            Object objT6 = x340Var2.T();
            if (z3) {
                b = 0;
                ff6Var = new ff6(z11, re6Var2, lf6Var, iu30Var, iIntValue);
                re6Var = re6Var2;
                iIntValue = iIntValue;
                x340Var2.s0(ff6Var);
            } else {
                b = 0;
                ff6Var = new ff6(z11, re6Var2, lf6Var, iu30Var, iIntValue);
                re6Var = re6Var2;
                iIntValue = iIntValue;
                x340Var2.s0(ff6Var);
            }
            qim0 qim0VarA2 = s161.a(qim0VarR, (iu30) ff6Var);
            i = (x340Var2.g(iu30Var) ? 1 : 0) | (((i3 > 32 || !x340Var2.e(iIntValue)) && (iIntValue2 & 48) != 32) ? b : (byte) 1);
            Object objT7 = x340Var2.T();
            obj5 = objT7;
            if (i == 0) {
                ck0 ck0Var2 = new ck0(iu30Var, iIntValue, (byte) 6);
                x340Var2.s0(ck0Var2);
                obj5 = ck0Var2;
            } else {
                ck0 ck0Var3 = new ck0(iu30Var, iIntValue, (byte) 6);
                x340Var2.s0(ck0Var3);
                obj5 = ck0Var3;
            }
            qim0 qim0VarD3 = a8o.D(qim0VarA2, (Function0) obj5);
            i2 = (x340Var2.g(kesVar) ? 1 : 0) | (((i3 > 32 || !x340Var2.e(iIntValue)) && (iIntValue2 & 48) != 32) ? b : (byte) 1);
            Object objT8 = x340Var2.T();
            obj6 = objT8;
            if (i2 == 0) {
                gf6 gf6Var2 = new gf6(iIntValue, kesVar, b);
                x340Var2.s0(gf6Var2);
                obj6 = gf6Var2;
            } else {
                gf6 gf6Var3 = new gf6(iIntValue, kesVar, b);
                x340Var2.s0(gf6Var3);
                obj6 = gf6Var3;
            }
            Function0 function1 = (Function0) obj6;
            z4 = ((((x340Var2.h(z10) ? 1 : 0) | (((i3 > 32 || !x340Var2.e(iIntValue)) && (iIntValue2 & 48) != 32) ? b : (byte) 1)) | (x340Var2.g(kesVar) ? 1 : 0)) == true ? 1 : 0) | (x340Var2.i(se6Var) ? 1 : 0);
            Object objT9 = x340Var2.T();
            if (z4 == 0) {
                z5 = z10;
                hf6Var = new hf6(this.t, iIntValue, dw91Var, z5, kesVar, re6Var, this.X);
                x340Var2.s0(hf6Var);
            } else {
                z5 = z10;
                hf6Var = new hf6(this.t, iIntValue, dw91Var, z5, kesVar, re6Var, this.X);
                x340Var2.s0(hf6Var);
            }
            uj6.b(gj6Var, z5, z12, z13, xd6Var3, function1, (iu30) hf6Var, qim0VarD3, 2, null, null, null, x340Var2, 100663296, 3584);
            x340Var = x340Var2;
            x340Var.r(b);
            z6 = true;
        }
        x340Var.r(z6);
        return rih1.a;
    }
}
