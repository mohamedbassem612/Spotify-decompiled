package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mdf1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ jkr0 c;
    public final /* synthetic */ ge5 d;
    public final /* synthetic */ nef1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdf1(ge5 ge5Var, c380 c380Var, jkr0 jkr0Var, nef1 nef1Var) {
        super(2);
        this.d = ge5Var;
        this.b = c380Var;
        this.c = jkr0Var;
        this.e = nef1Var;
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
        qim0 qim0Var;
        Throwable th;
        long jA;
        u7h u7hVar;
        u7h u7hVar2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        n4k n4kVar = hmb0.t1;
        f36 f36Var = h36.c;
        boolean z = true;
        c380 c380Var = this.b;
        jkr0 jkr0Var = this.c;
        ge5 ge5Var = this.d;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                j06 j06Var = x340Var2.a;
                if (!zY) {
                    x340Var2.b0();
                    return rih1Var;
                }
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarR = nim0.a;
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarR);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                if (x340Var2.S) {
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
                uwr uwrVar = cbx.a;
                long j = ((vex) zex.a.b).a;
                float f = ge5Var.c;
                kiv kivVar = odf1.a;
                float fO = yoi1.o(f, 0.0f, 1.0f);
                if (fO >= 1.0f) {
                    qim0Var = qim0VarR;
                } else if (fO <= 0.0f) {
                    qim0Var = qim0VarR;
                    qim0VarR = i541.C(qim0VarR, v7f1.V0);
                } else {
                    qim0Var = qim0VarR;
                    qim0VarR = exd0.r(i541.D(qim0VarR, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 1, (f2b) null, 983039), new qf0(fO, j, (byte) 7));
                }
                mbh mbhVarA = jbh.a(f36Var, een.P0, x340Var2, 0);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarR);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA, x340Var2, lljVar);
                nko1.H(xos0VarM2, x340Var2, lljVar2);
                x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar4);
                boolean z2 = false;
                odf1.f(c380Var, jkr0Var, ge5Var.d, x340Var2, 0);
                nef1 nef1Var = this.e;
                odf1.d(c380Var, jkr0Var, nef1Var, x340Var2, 0);
                rdf1 rdf1Var = (rdf1) o7h.t0(((err0) jkr0Var.d.c).s(), c380Var);
                if (rdf1Var == null) {
                    x340Var2.i0(-1874786579);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-1874786578);
                    odf1.h(rdf1Var, ((err0) jkr0Var.d.c).s(), nef1Var, false, true, x340Var2, 27648, 0);
                    z2 = false;
                    x340Var2.r(false);
                }
                x340Var2.r(true);
                if (ge5Var.a || ge5Var.b > 0.0f) {
                    x340Var2.i0(360974641);
                    qim0 qim0VarB = h2c.a.b(qim0Var);
                    boolean zG = x340Var2.g(ge5Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new ibf1(ge5Var, (byte) 2);
                        x340Var2.s0(objT);
                    }
                    odf1.c(i541.C(qim0VarB, (iu30) objT), x340Var2, 0);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(361141855);
                    x340Var2.r(z2);
                }
                x340Var2.r(true);
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean z3 = ge5Var.a;
                    uwr uwrVar2 = cbx.a;
                    long jA2 = cbx.a(x340Var4).a.a.a();
                    if (z3) {
                        jA = u7h.j;
                        z = true;
                        th = null;
                    } else {
                        kl1 kl1Var = jkr0Var.d;
                        th = null;
                        rdf1 rdf1Var2 = (rdf1) o7h.t0(((err0) kl1Var.c).s(), c380Var);
                        long j2 = (rdf1Var2 == null || (u7hVar2 = rdf1Var2.e) == null) ? jA2 : u7hVar2.a;
                        float fS = ((drr0) kl1Var.d).s();
                        if (fS == 0.0f) {
                            jA = j2;
                        } else {
                            err0 err0Var = (err0) kl1Var.c;
                            rdf1 rdf1Var3 = (rdf1) o7h.t0(fS < 0.0f ? err0Var.s() + 1 : err0Var.s() - 1, c380Var);
                            if (rdf1Var3 != null && (u7hVar = rdf1Var3.e) != null) {
                                jA2 = u7hVar.a;
                            }
                            jA = z4p1.A(yoi1.o(Math.abs(fS), 0.0f, 1.0f), j2, jA2);
                        }
                    }
                    x340Var4.i0(979194205);
                    boolean zB = z4h1.b(jA, u7h.j);
                    qim0 qim0VarF = nim0.a;
                    if (!zB) {
                        cua cuaVar = cbx.b(x340Var4).f;
                        qim0VarF = dug.f(qim0VarF, jA, er31.b(16.0f));
                    }
                    x340Var4.r(false);
                    cvx cvxVar = cbx.b(x340Var4).b;
                    qim0 qim0VarX = uyn1.x(qim0VarF, 16.0f);
                    mbh mbhVarA2 = jbh.a(f36Var, een.P0, x340Var4, 0);
                    int iHashCode3 = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM3 = x340Var4.m();
                    qim0 qim0VarE3 = zr7.E(x340Var4, qim0VarX);
                    hzj.A.getClass();
                    if (x340Var4.a == null) {
                        tgp1.p();
                        throw th;
                    }
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(n4kVar);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(mbhVarA2, x340Var4, y580.O0);
                    nko1.H(xos0VarM3, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE3, x340Var4, y580.Y);
                    mod.b(odf1.a.a(Float.valueOf(ge5Var.d)), apo.r(1356233993, new mdf1(ge5Var, c380Var, jkr0Var, this.e), x340Var4), x340Var4, 56);
                    x340Var4.r(z);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdf1(c380 c380Var, kes kesVar, ge5 ge5Var, nef1 nef1Var) {
        super(2);
        this.b = c380Var;
        this.c = kesVar;
        this.d = ge5Var;
        this.e = nef1Var;
    }
}
