package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q9y0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s9y0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9y0(s9y0 s9y0Var, int i) {
        super(2);
        this.a = (byte) 3;
        this.b = s9y0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        lee1 lee1Var;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        s9y0 s9y0Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    jzn1.k(s9y0Var.a, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    qim0 qim0VarR = d7e.r(dz61.d.a, nim0Var, false);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM = x340Var4.m();
                    qim0 qim0VarE = zr7.E(x340Var4, qim0VarR);
                    hzj.A.getClass();
                    if (x340Var4.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(n4kVar);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(gfh0VarC, x340Var4, y580.O0);
                    nko1.H(xos0VarM, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE, x340Var4, y580.Y);
                    jzn1.l(s9y0Var, x340Var4, 0);
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var6 = x340Var5;
                boolean zY = x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2);
                j06 j06Var = x340Var6.a;
                if (!zY) {
                    x340Var6.b0();
                    return rih1Var;
                }
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(x340Var6).f;
                qim0 qim0VarN = anm1.N("prompted.playlist.share.card", dug.f(i1p1.q(qim0VarD, er31.b(8.0f)), cbx.a(x340Var6).a.c, d4o1.a));
                gra graVar = een.d;
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(x340Var6.T);
                xos0 xos0VarM2 = x340Var6.m();
                qim0 qim0VarE2 = zr7.E(x340Var6, qim0VarN);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(gfh0VarC2, x340Var6, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM2, x340Var6, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var6, lljVar3);
                nko1.F(x340Var6);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE2, x340Var6, lljVar4);
                qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                era eraVar = een.P0;
                f36 f36Var = h36.c;
                mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var6, 0);
                int iHashCode3 = Long.hashCode(x340Var6.T);
                xos0 xos0VarM3 = x340Var6.m();
                qim0 qim0VarE3 = zr7.E(x340Var6, qim0VarD2);
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                nko1.H(mbhVarA, x340Var6, lljVar);
                nko1.H(xos0VarM3, x340Var6, lljVar2);
                x0d.q(iHashCode3, x340Var6, lljVar3, x340Var6);
                nko1.H(qim0VarE3, x340Var6, lljVar4);
                pbh pbhVar = pbh.a;
                qim0 qim0VarR2 = i1p1.r(u291.f(pbhVar.a(0.35f, nim0Var, true), 1.0f));
                gfh0 gfh0VarC3 = t1c.c(graVar, false);
                int iHashCode4 = Long.hashCode(x340Var6.T);
                xos0 xos0VarM4 = x340Var6.m();
                qim0 qim0VarE4 = zr7.E(x340Var6, qim0VarR2);
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                nko1.H(gfh0VarC3, x340Var6, lljVar);
                nko1.H(xos0VarM4, x340Var6, lljVar2);
                x0d.q(iHashCode4, x340Var6, lljVar3, x340Var6);
                nko1.H(qim0VarE4, x340Var6, lljVar4);
                jzn1.c(s9y0Var.a, x340Var6, 0);
                t1c.a(dug.e(u291.d(nim0Var, 1.0f), v9c.t(new mmr0[]{new mmr0(Float.valueOf(0.1f), new u7h(u7h.j)), new mmr0(Float.valueOf(1.0f), new u7h(u7h.b(u7h.b, 0.7f, 0.0f, 0.0f, 0.0f, 14)))}, 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6), x340Var6, 0);
                qim0 qim0VarD3 = u291.d(nim0Var, 1.0f);
                cvx cvxVar = cbx.b(x340Var6).b;
                qim0 qim0VarX = uyn1.x(qim0VarD3, 12.0f);
                mbh mbhVarA2 = jbh.a(h36.d, eraVar, x340Var6, 6);
                int iHashCode5 = Long.hashCode(x340Var6.T);
                xos0 xos0VarM5 = x340Var6.m();
                qim0 qim0VarE5 = zr7.E(x340Var6, qim0VarX);
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                nko1.H(mbhVarA2, x340Var6, lljVar);
                nko1.H(xos0VarM5, x340Var6, lljVar2);
                x0d.q(iHashCode5, x340Var6, lljVar3, x340Var6);
                nko1.H(qim0VarE5, x340Var6, lljVar4);
                uwo1.e(cwl1.o0(x340Var6, 2131960637), (qim0) null, cbx.d(x340Var6).l, cbx.a(x340Var6).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var6, 1572864, 0, 1714);
                cvx cvxVar2 = cbx.b(x340Var6).b;
                op71.g(x340Var6, u291.h(nim0Var, 4.0f));
                boolean zG = x340Var6.g(s9y0Var.b);
                Object objT = x340Var6.T();
                if (zG || objT == m4cVar) {
                    objT = v8r.q(Boolean.FALSE);
                    x340Var6.s0(objT);
                }
                ven0 ven0Var = (ven0) objT;
                String str = s9y0Var.b;
                qim0 qim0VarN2 = anm1.N("prompted.playlist.share.title", nim0Var);
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    x340Var6.i0(-511406951);
                    lee1Var = cbx.d(x340Var6).d;
                    x340Var6.r(false);
                } else {
                    x340Var6.i0(-511405320);
                    lee1Var = cbx.d(x340Var6).c;
                    x340Var6.r(false);
                }
                lee1 lee1Var2 = lee1Var;
                long j = cbx.a(x340Var6).b.a;
                cjc0 cjc0Var = new cjc0(((Boolean) ven0Var.getValue()).booleanValue() ? 3 : 2);
                boolean zG2 = x340Var6.g(ven0Var);
                Object objT2 = x340Var6.T();
                if (zG2 || objT2 == m4cVar) {
                    objT2 = new r9y0(ven0Var, (byte) 0);
                    x340Var6.s0(objT2);
                }
                uwo1.e(str, qim0VarN2, lee1Var2, j, (a0e1) null, (iu30) objT2, 2, false, cjc0Var, 0, (qx8) null, x340Var6, 1572912, 0, 1680);
                x340Var6.r(true);
                x340Var6.r(true);
                qim0 qim0VarF = u291.f(pbhVar.a(0.65f, nim0Var, true), 1.0f);
                cvx cvxVar3 = cbx.b(x340Var6).b;
                qim0 qim0VarX2 = uyn1.x(qim0VarF, 12.0f);
                mbh mbhVarA3 = jbh.a(f36Var, eraVar, x340Var6, 0);
                int iHashCode6 = Long.hashCode(x340Var6.T);
                xos0 xos0VarM6 = x340Var6.m();
                qim0 qim0VarE6 = zr7.E(x340Var6, qim0VarX2);
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                nko1.H(mbhVarA3, x340Var6, lljVar);
                nko1.H(xos0VarM6, x340Var6, lljVar2);
                x0d.q(iHashCode6, x340Var6, lljVar3, x340Var6);
                nko1.H(qim0VarE6, x340Var6, lljVar4);
                uwo1.e(s9y0Var.c, anm1.N("prompted.playlist.share.description", nim0Var), cbx.d(x340Var6).m, cbx.a(x340Var6).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(3), 0, (qx8) null, x340Var6, 1572912, 0, 1712);
                cvx cvxVar4 = cbx.b(x340Var6).b;
                op71.g(x340Var6, u291.h(nim0Var, 12.0f));
                x340Var6.i0(-545069402);
                Iterator it = s9y0Var.d.iterator();
                while (it.hasNext()) {
                    jzn1.i((f7y0) it.next(), x340Var6, 0);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar5 = cbx.b(x340Var6).b;
                    op71.g(x340Var6, u291.h(nim0Var, 8.0f));
                }
                x340Var6.r(false);
                op71.g(x340Var6, pbhVar.a(1.0f, nim0Var, true));
                mod.b(t4k.n.a(flb0.a), paj.c, x340Var6, 56);
                us71.m(x340Var6, true, true, true);
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                jzn1.l(s9y0Var, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q9y0(s9y0 s9y0Var, byte b) {
        super(2);
        this.a = b;
        this.b = s9y0Var;
    }
}
