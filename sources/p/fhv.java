package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fhv extends hab0 implements vu30 {
    public final /* synthetic */ vu30 X;
    public final /* synthetic */ j2i Y;
    public final /* synthetic */ vu30 Z;
    public final /* synthetic */ ven0 a;
    public final /* synthetic */ xhl b;
    public final /* synthetic */ su c;
    public final /* synthetic */ idn0 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ long f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Function0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhv(ven0 ven0Var, xhl xhlVar, su suVar, idn0 idn0Var, float f, long j, boolean z, boolean z2, int i, Function0 function0, vu30 vu30Var, j2i j2iVar, vu30 vu30Var2) {
        super(2);
        this.a = ven0Var;
        this.b = xhlVar;
        this.c = suVar;
        this.d = idn0Var;
        this.e = f;
        this.f = j;
        this.g = z;
        this.h = z2;
        this.i = i;
        this.t = function0;
        this.X = vu30Var;
        this.Y = j2iVar;
        this.Z = vu30Var2;
    }

    public final Object invoke(Object obj, Object obj2) {
        long jA;
        tl3 tl3Var;
        boolean z;
        qim0 qim0Var;
        boolean z2;
        boolean z3;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        tl3 tl3Var2 = een.d;
        int i = iIntValue & 11;
        rih1 rih1Var = rih1.a;
        if (i == 2) {
            x340 x340Var2 = x340Var;
            if (x340Var2.H()) {
                x340Var2.b0();
                return rih1Var;
            }
        }
        this.a.setValue(rih1Var);
        xhl xhlVar = this.b;
        int i2 = ((uhl) xhlVar).b;
        xhlVar.m();
        x340 x340Var3 = x340Var;
        x340Var3.i0(1283217717);
        j06 j06Var = x340Var3.a;
        xhl xhlVar2 = (xhl) xhlVar.l().b;
        ihl ihlVarK = xhlVar2.k();
        ihl ihlVarK2 = xhlVar2.k();
        ven0 ven0VarM = k1u.m(this.d, x340Var3, 0);
        qim0 qim0Var2 = nim0.a;
        qim0 qim0VarU = u291.u(qim0Var2, 48.0f, 32.0f, 0.0f, 0.0f, 12);
        qqb qqbVarD = k1u.d(this.e, this.f);
        cr31 cr31Var = er31.a;
        qim0 qim0VarF = d1u.F(qim0VarU, qqbVarD.a, qqbVarD.b, cr31Var);
        boolean zBooleanValue = ((Boolean) ven0VarM.getValue()).booleanValue();
        boolean z4 = this.g;
        if (z4 && zBooleanValue) {
            x340Var3.i0(552413681);
            uwr uwrVar = cbx.a;
            jA = cbx.a(x340Var3).a.e;
            x340Var3.r(false);
        } else if (z4) {
            x340Var3.i0(552415312);
            uwr uwrVar2 = cbx.a;
            jA = cbx.a(x340Var3).a.c;
            x340Var3.r(false);
        } else if (zBooleanValue) {
            x340Var3.i0(552417105);
            uwr uwrVar3 = cbx.a;
            jA = cbx.a(x340Var3).a.b.b();
            x340Var3.r(false);
        } else {
            x340Var3.i0(552418768);
            uwr uwrVar4 = cbx.a;
            jA = cbx.a(x340Var3).a.b.a();
            x340Var3.r(false);
        }
        qim0 qim0VarY = uyn1.y(dug.f(qim0VarF, jA, cr31Var), 12.0f, 4.0f);
        if (!this.h) {
            qim0VarY = qim0VarY.then(d9y0.k(qim0Var2, 0.3f));
        }
        Object objT = x340Var3.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = o6v.Y0;
            x340Var3.s0(objT);
        }
        qim0 qim0VarJ = xhl.j(qim0VarY, ihlVarK, (iu30) objT);
        jw31 jw31VarA = ew31.a(new d36(6.0f, true, new um5(false)), een.N0, x340Var3, 0);
        Integer num = 0;
        int iHashCode = Long.hashCode(x340Var3.T);
        xos0 xos0VarM = x340Var3.m();
        qim0 qim0VarE = zr7.E(x340Var3, qim0VarJ);
        hzj.A.getClass();
        if (j06Var == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        boolean z5 = x340Var3.S;
        n4k n4kVar = hmb0.t1;
        if (z5) {
            x340Var3.l(n4kVar);
        } else {
            x340Var3.v0();
        }
        llj lljVar = y580.O0;
        nko1.H(jw31VarA, x340Var3, lljVar);
        llj lljVar2 = y580.N0;
        nko1.H(xos0VarM, x340Var3, lljVar2);
        Integer numValueOf = Integer.valueOf(iHashCode);
        llj lljVar3 = y580.R0;
        nko1.H(numValueOf, x340Var3, lljVar3);
        nko1.F(x340Var3);
        llj lljVar4 = y580.Y;
        nko1.H(qim0VarE, x340Var3, lljVar4);
        vu30 vu30Var = this.X;
        if (vu30Var != null) {
            x340Var3.i0(-1865019314);
            qim0 qim0VarR = u291.r(qim0Var2, 16.0f);
            gfh0 gfh0VarC = t1c.c(tl3Var2, false);
            int iHashCode2 = Long.hashCode(x340Var3.T);
            xos0 xos0VarM2 = x340Var3.m();
            qim0 qim0VarE2 = zr7.E(x340Var3, qim0VarR);
            x340Var3.m0();
            tl3Var = tl3Var2;
            if (x340Var3.S) {
                x340Var3.l(n4kVar);
            } else {
                x340Var3.v0();
            }
            nko1.H(gfh0VarC, x340Var3, lljVar);
            nko1.H(xos0VarM2, x340Var3, lljVar2);
            x0d.q(iHashCode2, x340Var3, lljVar3, x340Var3);
            nko1.H(qim0VarE2, x340Var3, lljVar4);
            num = null;
            vu30Var.invoke(x340Var3, (Object) null);
            x340Var3.r(true);
            z = false;
            x340Var3.r(false);
        } else {
            tl3Var = tl3Var2;
            z = false;
            x340Var3.i0(-1864942434);
            x340Var3.r(false);
        }
        this.Y.invoke(x340Var3, num);
        vu30 vu30Var2 = this.Z;
        if (vu30Var2 != null) {
            x340Var3.i0(-1864881395);
            qim0 qim0VarR2 = u291.r(qim0Var2, 16.0f);
            gfh0 gfh0VarC2 = t1c.c(tl3Var, z);
            int iHashCode3 = Long.hashCode(x340Var3.T);
            xos0 xos0VarM3 = x340Var3.m();
            qim0 qim0VarE3 = zr7.E(x340Var3, qim0VarR2);
            x340Var3.m0();
            qim0Var = qim0Var2;
            if (x340Var3.S) {
                x340Var3.l(n4kVar);
            } else {
                x340Var3.v0();
            }
            nko1.H(gfh0VarC2, x340Var3, lljVar);
            nko1.H(xos0VarM3, x340Var3, lljVar2);
            x0d.q(iHashCode3, x340Var3, lljVar3, x340Var3);
            nko1.H(qim0VarE3, x340Var3, lljVar4);
            vu30Var2.invoke(x340Var3, num);
            z2 = true;
            x340Var3.r(true);
            x340Var3.r(false);
        } else {
            qim0Var = qim0Var2;
            z2 = true;
            x340Var3.i0(-1864803554);
            x340Var3.r(z);
        }
        x340Var3.r(z2);
        if (this.i == 2) {
            x340Var3.i0(1284242142);
            qim0 qim0VarV = u291.v(qim0Var, 48.0f);
            Object objT2 = x340Var3.T();
            if (objT2 == m4cVar) {
                objT2 = o6v.Z0;
                x340Var3.s0(objT2);
            }
            qim0 qim0VarJ2 = xhl.j(qim0VarV, ihlVarK2, (iu30) objT2);
            Object objT3 = x340Var3.T();
            if (objT3 == m4cVar) {
                objT3 = o6v.a1;
                x340Var3.s0(objT3);
            }
            z3 = false;
            t1c.a(bin.v(s161.a(qim0VarJ2, (iu30) objT3), this.d, (ga80) null, this.h, (String) null, (pm31) null, this.t, 24), x340Var3, 0);
            x340Var3.r(false);
        } else {
            z3 = false;
            x340Var3.i0(1284799522);
            x340Var3.r(false);
        }
        x340Var3.r(z3);
        if (((uhl) xhlVar).b != i2) {
            qxd0.S(this.c, x340Var3);
        }
        return rih1Var;
    }
}
