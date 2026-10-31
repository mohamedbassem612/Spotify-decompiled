package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pj6 extends hab0 implements xu30 {
    public final /* synthetic */ y3g1 X;
    public final /* synthetic */ Function0 Y;
    public final /* synthetic */ tob1 Z;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ xd6 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ b4g1 f;
    public final /* synthetic */ iu30 g;
    public final /* synthetic */ gj6 h;
    public final /* synthetic */ tob1 i;
    public final /* synthetic */ tob1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj6(boolean z, boolean z2, boolean z3, xd6 xd6Var, int i, b4g1 b4g1Var, iu30 iu30Var, gj6 gj6Var, tob1 tob1Var, tob1 tob1Var2, y3g1 y3g1Var, Function0 function0, tob1 tob1Var3) {
        super(3);
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = xd6Var;
        this.e = i;
        this.f = b4g1Var;
        this.g = iu30Var;
        this.h = gj6Var;
        this.i = tob1Var;
        this.t = tob1Var2;
        this.X = y3g1Var;
        this.Y = function0;
        this.Z = tob1Var3;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        qim0 qim0VarC;
        boolean z;
        i2c i2cVar = (i2c) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(i2cVar) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18);
        j06 j06Var = x340Var2.a;
        if (zY) {
            float fD = i2cVar.d();
            boolean zD = x340Var2.d(fD);
            Object objT = x340Var2.T();
            if (zD || objT == m4cVar) {
                objT = uj6.d(fD, 1);
                x340Var2.s0(objT);
            }
            cr31 cr31Var = (cr31) objT;
            gio1.k(this.a, this.b, this.c, this.d, this.e, fD, this.f, this.g, x340Var2, 1572864);
            qim0 qim0Var = nim0.a;
            xd6 xd6Var = this.d;
            if (xd6Var != null) {
                x340Var2.i0(922657468);
                boolean zG = x340Var2.g(xd6Var);
                Object objT2 = x340Var2.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new xg6(this.f, xd6Var, (byte) 3);
                    x340Var2.s0(objT2);
                }
                qim0VarC = i541.C(qim0Var, (iu30) objT2);
                x340Var2.r(false);
            } else {
                x340Var2.i0(923003459);
                x340Var2.r(false);
                qim0VarC = qim0Var;
            }
            qim0 qim0VarThen = u291.d(qim0Var, 1.0f).then(qim0VarC);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarThen);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z2 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            boolean z3 = this.c;
            boolean zH = x340Var2.h(z3);
            tob1 tob1Var = this.i;
            boolean zG2 = zH | x340Var2.g(tob1Var);
            Object objT3 = x340Var2.T();
            b4g1 b4g1Var = this.f;
            if (zG2 || objT3 == m4cVar) {
                objT3 = new vm1(z3, b4g1Var, tob1Var, (byte) 2);
                x340Var2.s0(objT3);
            }
            Function0 function0 = (Function0) objT3;
            qim0 qim0VarD = u291.d(qim0Var, 1.0f);
            boolean zG3 = x340Var2.g(tob1Var);
            Object objT4 = x340Var2.T();
            if (zG3 || objT4 == m4cVar) {
                objT4 = new xg6(b4g1Var, tob1Var, (byte) 2);
                x340Var2.s0(objT4);
            }
            qim0 qim0VarC2 = i541.C(qim0VarD, (iu30) objT4);
            xd6 xd6Var2 = this.d;
            boolean zG4 = x340Var2.g(xd6Var2);
            Object objT5 = x340Var2.T();
            if (zG4 || objT5 == m4cVar) {
                objT5 = new nj6(b4g1Var, xd6Var2, (byte) 0);
                x340Var2.s0(objT5);
            }
            Function0 function1 = (Function0) objT5;
            boolean zG5 = x340Var2.g(xd6Var2);
            Object objT6 = x340Var2.T();
            if (zG5 || objT6 == m4cVar) {
                objT6 = new nj6(b4g1Var, xd6Var2, (byte) 1);
                x340Var2.s0(objT6);
            }
            Function0 function2 = (Function0) objT6;
            boolean zG6 = x340Var2.g(tob1Var);
            tob1 tob1Var2 = this.t;
            boolean zG7 = zG6 | x340Var2.g(tob1Var2);
            boolean z4 = this.a;
            boolean zH2 = zG7 | x340Var2.h(z4);
            Object objT7 = x340Var2.T();
            if (zH2 || objT7 == m4cVar) {
                objT7 = new vm1(tob1Var, z4, tob1Var2, (byte) 1);
                x340Var2.s0(objT7);
            }
            Function0 function3 = (Function0) objT7;
            Object objT8 = x340Var2.T();
            if (objT8 == m4cVar) {
                objT8 = new oj6(b4g1Var, (byte) 0);
                x340Var2.s0(objT8);
            }
            Function0 function4 = (Function0) objT8;
            Object objT9 = x340Var2.T();
            if (objT9 == m4cVar) {
                objT9 = new oj6(b4g1Var, (byte) 1);
                x340Var2.s0(objT9);
            }
            Function0 function5 = (Function0) objT9;
            Object objT10 = x340Var2.T();
            if (objT10 == m4cVar) {
                objT10 = new oj6(b4g1Var, (byte) 2);
                x340Var2.s0(objT10);
            }
            lgo1.a(cr31Var, this.e, fD, qim0VarC2, function1, function2, function3, function4, function5, (Function0) objT10, x340Var2, 918552576, 0);
            qim0 qim0VarD2 = i541.D(qim0VarC2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 1, (f2b) null, 983039);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarD2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC2, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            boolean zBooleanValue = ((Boolean) tob1Var2.getValue()).booleanValue();
            gj6 gj6Var = this.h;
            y3g1 y3g1Var = this.X;
            if (zBooleanValue) {
                x340Var2.i0(990264904);
                uj6.c(gj6Var, 1, xd6Var2, u291.d(qim0Var, 1.0f), y3g1Var, function0, b4g1Var, x340Var2, 1575984);
                z = false;
                x340Var2.r(false);
            } else {
                x340Var2.i0(990561481);
                qim0 qim0VarD3 = u291.d(qim0Var, 1.0f);
                Object objT11 = x340Var2.T();
                if (objT11 == m4cVar) {
                    objT11 = ag6.Z;
                    x340Var2.s0(objT11);
                }
                uj6.c(gj6Var, 2, xd6Var2, i541.C(qim0VarD3, (iu30) objT11), y3g1Var, function0, b4g1Var, x340Var2, 1575984);
                z = false;
                x340Var2.r(false);
            }
            x340Var2.r(true);
            x340Var2.r(true);
            ej6 ej6Var = this.h.s;
            if (ej6Var == null) {
                x340Var2.i0(924936246);
                x340Var2.r(z);
            } else {
                x340Var2.i0(924936247);
                ajo1.a(i2cVar, ej6Var, this.Y, this.b, this.c, this.d, this.f, fD, this.Z, x340Var2, (iIntValue & 14) | 1572864);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
