package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b3x extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ziu b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ iu30 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b3x(ziu ziuVar, qim0 qim0Var, Function0 function0, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = ziuVar;
        this.c = qim0Var;
        this.d = function0;
        this.e = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        qim0 qim0Var = this.c;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                b0k b0kVar2 = (x340) b0kVar;
                boolean zY = b0kVar2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                j06 j06Var = ((x340) b0kVar2).a;
                if (!zY) {
                    b0kVar2.b0();
                    return rih1Var;
                }
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                gfh0 gfh0VarC = t1c.c(een.g, false);
                int iHashCode = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM = b0kVar2.m();
                qim0 qim0VarE = zr7.E(b0kVar2, qim0VarD);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(n4kVar);
                } else {
                    b0kVar2.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(gfh0VarC, b0kVar2, lljVar);
                nko1.H(xos0VarM, b0kVar2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
                nko1.F(b0kVar2);
                nko1.H(qim0VarE, b0kVar2, y580.Y);
                ziu ziuVar = this.b;
                gq70 gq70Var = (gq70) o7h.s0(ziuVar.f.e);
                fbv fbvVar = new fbv(new kov(gq70Var != null ? ab80.m(gq70Var.a, gq70Var.b, ":") : "1:1", (byte) 5));
                qim0 qim0VarZ = u291.z(u291.f(qim0Var, 1.0f), (fra) null, 3);
                b0kVar2.j0(136894876);
                irn1.o0(0, 0, (dlv) null, 7);
                b0kVar2.j0(-270258304);
                b0kVar2.j0(-492369756);
                Object objT = b0kVar2.T();
                Object obj3 = fkj0.X;
                if (objT == obj3) {
                    objT = v8r.q(0L);
                    b0kVar2.s0(objT);
                }
                b0kVar2.r(false);
                b0kVar2.j0(-492369756);
                Object objT2 = b0kVar2.T();
                if (objT2 == obj3) {
                    objT2 = bb00.i(rih1Var, f331.X0, b0kVar2);
                }
                b0kVar2.r(false);
                ven0 ven0Var = (ven0) objT2;
                kiv kivVar = t4k.h;
                wat watVar = (wat) b0kVar2.k(kivVar);
                b0kVar2.j0(-492369756);
                Object objT3 = b0kVar2.T();
                if (objT3 == obj3) {
                    objT3 = x0d.o(watVar, b0kVar2);
                }
                b0kVar2.r(false);
                ufh0 ufh0Var = (ufh0) objT3;
                b0kVar2.j0(1157296644);
                boolean zG = b0kVar2.g(fbvVar);
                Object objT4 = b0kVar2.T();
                if (zG || objT4 == obj3) {
                    ufh0Var.getClass();
                    b0kVar2.s0(Boolean.TRUE);
                }
                b0kVar2.r(false);
                z2x z2xVar = new z2x(ven0Var, ufh0Var, fbvVar, (byte) 0);
                ufh0Var.getClass();
                float f = ufh0Var.h;
                boolean zIsNaN = Float.isNaN(f);
                Function0 function0 = this.d;
                iu30 iu30Var = this.e;
                if (zIsNaN) {
                    z = false;
                    b0kVar2.j0(-270256558);
                    who1.h(s161.b(qim0VarZ, false, new tu(ufh0Var, (byte) 5)), apo.i(b0kVar2, -1866817256, new y2x(ven0Var, ufh0Var, ziuVar, function0, iu30Var, (byte) 0)), z2xVar, b0kVar2, 48);
                    b0kVar2.r(false);
                } else {
                    b0kVar2.j0(-270257148);
                    float f2 = ufh0Var.h;
                    qim0 qim0VarF = fj30.F(qim0VarZ, f2, f2);
                    b0kVar2.j0(733328855);
                    w1c w1cVarE = t1c.e(b0kVar2);
                    b0kVar2.j0(-1323940314);
                    wat watVar2 = (wat) b0kVar2.k(kivVar);
                    flb0 flb0Var = (flb0) b0kVar2.k(t4k.n);
                    e8k1 e8k1Var = (e8k1) b0kVar2.k(t4k.t);
                    j2i j2iVar = new j2i(-2123382363, new k6i((byte) 9), true);
                    b0kVar2.m0();
                    if (((x340) b0kVar2).S) {
                        b0kVar2.l(n4kVar);
                    } else {
                        b0kVar2.v0();
                    }
                    ((x340) b0kVar2).y = false;
                    nko1.H(w1cVarE, b0kVar2, lljVar);
                    nko1.H(watVar2, b0kVar2, y580.Z);
                    nko1.H(flb0Var, b0kVar2, y580.P0);
                    nko1.H(e8k1Var, b0kVar2, y580.Q0);
                    ((x340) b0kVar2).y = ((x340) b0kVar2).z >= 0;
                    z = false;
                    j2iVar.invoke(new k891(b0kVar2), b0kVar2, 0);
                    b0kVar2.j0(2058660585);
                    who1.h(s161.b(qim0VarF, false, new tu(ufh0Var, (byte) 6)), apo.i(b0kVar2, -1756357099, new a3x(ufh0Var, ziuVar, function0, iu30Var, (byte) 0)), z2xVar, b0kVar2, 48);
                    ufh0Var.d(f, 518, b0kVar2);
                    b0kVar2.r(false);
                    b0kVar2.r(true);
                    b0kVar2.r(false);
                    b0kVar2.r(false);
                    b0kVar2.r(false);
                }
                us71.m(b0kVar2, z, z, true);
                return rih1Var;
            default:
                b0k b0kVar3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                b0k b0kVar4 = (x340) b0kVar3;
                boolean zY2 = b0kVar4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2);
                j06 j06Var2 = ((x340) b0kVar4).a;
                if (zY2) {
                    qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                    gfh0 gfh0VarC2 = t1c.c(een.h, false);
                    int iHashCode2 = Long.hashCode(((x340) b0kVar4).T);
                    xos0 xos0VarM2 = b0kVar4.m();
                    qim0 qim0VarE2 = zr7.E(b0kVar4, qim0VarD2);
                    hzj.A.getClass();
                    if (j06Var2 == null) {
                        tgp1.p();
                        throw null;
                    }
                    b0kVar4.m0();
                    if (((x340) b0kVar4).S) {
                        b0kVar4.l(n4kVar);
                    } else {
                        b0kVar4.v0();
                    }
                    llj lljVar2 = y580.O0;
                    nko1.H(gfh0VarC2, b0kVar4, lljVar2);
                    nko1.H(xos0VarM2, b0kVar4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), b0kVar4, y580.R0);
                    nko1.F(b0kVar4);
                    nko1.H(qim0VarE2, b0kVar4, y580.Y);
                    ziu ziuVar2 = this.b;
                    gq70 gq70Var2 = (gq70) o7h.s0(ziuVar2.f.e);
                    fbv fbvVar2 = new fbv(new kov(gq70Var2 != null ? ab80.m(gq70Var2.a, gq70Var2.b, ":") : "1:1", (byte) 6));
                    qim0 qim0VarZ2 = u291.z(u291.f(qim0Var, 1.0f), (fra) null, 3);
                    b0kVar4.j0(136894876);
                    irn1.o0(0, 0, (dlv) null, 7);
                    b0kVar4.j0(-270258304);
                    b0kVar4.j0(-492369756);
                    Object objT5 = b0kVar4.T();
                    Object obj4 = fkj0.X;
                    if (objT5 == obj4) {
                        objT5 = v8r.q(0L);
                        b0kVar4.s0(objT5);
                    }
                    b0kVar4.r(false);
                    b0kVar4.j0(-492369756);
                    Object objT6 = b0kVar4.T();
                    if (objT6 == obj4) {
                        objT6 = bb00.i(rih1Var, f331.X0, b0kVar4);
                    }
                    b0kVar4.r(false);
                    ven0 ven0Var2 = (ven0) objT6;
                    kiv kivVar2 = t4k.h;
                    wat watVar3 = (wat) b0kVar4.k(kivVar2);
                    b0kVar4.j0(-492369756);
                    Object objT7 = b0kVar4.T();
                    if (objT7 == obj4) {
                        objT7 = x0d.o(watVar3, b0kVar4);
                    }
                    b0kVar4.r(false);
                    ufh0 ufh0Var2 = (ufh0) objT7;
                    b0kVar4.j0(1157296644);
                    boolean zG2 = b0kVar4.g(fbvVar2);
                    Object objT8 = b0kVar4.T();
                    if (zG2 || objT8 == obj4) {
                        ufh0Var2.getClass();
                        b0kVar4.s0(Boolean.TRUE);
                    }
                    b0kVar4.r(false);
                    z2x z2xVar2 = new z2x(ven0Var2, ufh0Var2, fbvVar2, (byte) 1);
                    ufh0Var2.getClass();
                    float f3 = ufh0Var2.h;
                    boolean zIsNaN2 = Float.isNaN(f3);
                    Function0 function1 = this.d;
                    iu30 iu30Var2 = this.e;
                    if (zIsNaN2) {
                        z2 = false;
                        b0kVar4.j0(-270256558);
                        who1.h(s161.b(qim0VarZ2, false, new tu(ufh0Var2, (byte) 7)), apo.i(b0kVar4, -1866817256, new y2x(ven0Var2, ufh0Var2, ziuVar2, function1, iu30Var2, (byte) 1)), z2xVar2, b0kVar4, 48);
                        b0kVar4.r(false);
                    } else {
                        b0kVar4.j0(-270257148);
                        float f4 = ufh0Var2.h;
                        qim0 qim0VarF2 = fj30.F(qim0VarZ2, f4, f4);
                        b0kVar4.j0(733328855);
                        w1c w1cVarE2 = t1c.e(b0kVar4);
                        b0kVar4.j0(-1323940314);
                        wat watVar4 = (wat) b0kVar4.k(kivVar2);
                        flb0 flb0Var2 = (flb0) b0kVar4.k(t4k.n);
                        e8k1 e8k1Var2 = (e8k1) b0kVar4.k(t4k.t);
                        j2i j2iVar2 = new j2i(-2123382363, new k6i((byte) 9), true);
                        b0kVar4.m0();
                        if (((x340) b0kVar4).S) {
                            b0kVar4.l(n4kVar);
                        } else {
                            b0kVar4.v0();
                        }
                        ((x340) b0kVar4).y = false;
                        nko1.H(w1cVarE2, b0kVar4, lljVar2);
                        nko1.H(watVar4, b0kVar4, y580.Z);
                        nko1.H(flb0Var2, b0kVar4, y580.P0);
                        nko1.H(e8k1Var2, b0kVar4, y580.Q0);
                        ((x340) b0kVar4).y = ((x340) b0kVar4).z >= 0;
                        z2 = false;
                        j2iVar2.invoke(new k891(b0kVar4), b0kVar4, 0);
                        b0kVar4.j0(2058660585);
                        who1.h(s161.b(qim0VarF2, false, new tu(ufh0Var2, (byte) 8)), apo.i(b0kVar4, -1756357099, new a3x(ufh0Var2, ziuVar2, function1, iu30Var2, (byte) 1)), z2xVar2, b0kVar4, 48);
                        ufh0Var2.d(f3, 518, b0kVar4);
                        b0kVar4.r(false);
                        b0kVar4.r(true);
                        b0kVar4.r(false);
                        b0kVar4.r(false);
                        b0kVar4.r(false);
                    }
                    us71.m(b0kVar4, z2, z2, true);
                } else {
                    b0kVar4.b0();
                }
                return rih1Var;
        }
    }
}
