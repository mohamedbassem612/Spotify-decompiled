package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wcx extends hab0 implements vu30 {
    public final /* synthetic */ xu30 X;
    public final /* synthetic */ ga80 Y;
    public final /* synthetic */ max a;
    public final /* synthetic */ pgx b;
    public final /* synthetic */ idn0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ gbx f;
    public final /* synthetic */ gbx g;
    public final /* synthetic */ hw61 h;
    public final /* synthetic */ vzq0 i;
    public final /* synthetic */ tl3 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wcx(max maxVar, pgx pgxVar, idn0 idn0Var, boolean z, qim0 qim0Var, gbx gbxVar, gbx gbxVar2, hw61 hw61Var, vzq0 vzq0Var, tl3 tl3Var, xu30 xu30Var, ga80 ga80Var) {
        super(2);
        this.a = maxVar;
        this.b = pgxVar;
        this.c = idn0Var;
        this.d = z;
        this.e = qim0Var;
        this.f = gbxVar;
        this.g = gbxVar2;
        this.h = hw61Var;
        this.i = vzq0Var;
        this.t = tl3Var;
        this.X = xu30Var;
        this.Y = ga80Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        vux vuxVar;
        boolean z;
        Object objP0;
        boolean z2;
        Object objP1;
        boolean z3;
        Object objP2;
        vu30 vu30Var;
        pgx pgxVar;
        hb5 hb5Var;
        long j;
        b0k b0kVar = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (x340) b0kVar;
        if (x340Var.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean zJ = u890.j(this.a, jax.a);
            uwr uwrVar = cbx.a;
            afx afxVarA = cbx.a(x340Var);
            pgx pgxVar2 = this.b;
            vu30 vu30Var2 = pgxVar2.d;
            vu30 vu30Var3 = pgxVar2.b;
            vu30 vu30Var4 = pgxVar2.c;
            boolean zM = cwl1.m(vu30Var2, afxVarA);
            vux vuxVar2 = vux.a;
            if (zM || cwl1.m(vu30Var4, afxVarA)) {
                x340Var.i0(-825462453);
                m4h m4hVar = m4h.Y0;
                m4c m4cVar = fkj0.X;
                if (((Boolean) k1u.m(this.c, x340Var, 0).getValue()).booleanValue()) {
                    vuxVar = vux.b;
                } else {
                    vuxVar = this.d ? vux.c : vuxVar2;
                }
                bjg1 bjg1VarY = bno1.y(vuxVar, "buttonState", x340Var, 48, 0);
                hrr0 hrr0Var = bjg1VarY.d;
                k9 k9Var = bjg1VarY.a;
                gft gftVar = gft.P0;
                vux vuxVar3 = (vux) hrr0Var.getValue();
                x340Var.i0(481538607);
                long j2 = ((u7h) vu30Var3.invoke(afxVarA, vuxVar3)).a;
                x340Var.r(false);
                hah hahVarE = u7h.e(j2);
                boolean zG = x340Var.g(hahVarE);
                Object objT = x340Var.T();
                if (zG || objT == m4cVar) {
                    objT = (tzg1) m4hVar.invoke(hahVarE);
                    x340Var.s0(objT);
                }
                tzg1 tzg1Var = (tzg1) objT;
                if (bjg1VarY.g()) {
                    z = false;
                    x340Var.i0(1666827533);
                    x340Var.r(false);
                    objP0 = k9Var.P0();
                } else {
                    x340Var.i0(1666573488);
                    boolean zG2 = x340Var.g(bjg1VarY);
                    objP0 = x340Var.T();
                    if (zG2 || objP0 == m4cVar) {
                        jv91 jv91VarO = ekb.o();
                        iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
                        jv91 jv91VarU = ekb.u(jv91VarO);
                        try {
                            Object objP3 = k9Var.P0();
                            ekb.C(jv91VarO, jv91VarU, iu30VarE);
                            x340Var.s0(objP3);
                            objP0 = objP3;
                        } catch (Throwable th) {
                            ekb.C(jv91VarO, jv91VarU, iu30VarE);
                            throw th;
                        }
                    }
                    z = false;
                    x340Var.r(false);
                }
                x340Var.i0(481538607);
                u7h u7hVar = (u7h) vu30Var3.invoke(afxVarA, (vux) objP0);
                long j3 = u7hVar.a;
                x340Var.r(z);
                boolean zG3 = x340Var.g(bjg1VarY);
                Object objT2 = x340Var.T();
                if (zG3 || objT2 == m4cVar) {
                    objT2 = xto.l(new dck(bjg1VarY, (byte) 19));
                    x340Var.s0(objT2);
                }
                vux vuxVar4 = (vux) ((tob1) objT2).getValue();
                x340Var.i0(481538607);
                u7h u7hVar2 = (u7h) vu30Var3.invoke(afxVarA, vuxVar4);
                long j4 = u7hVar2.a;
                x340Var.r(false);
                boolean zG4 = x340Var.g(bjg1VarY);
                Object objT3 = x340Var.T();
                if (zG4 || objT3 == m4cVar) {
                    objT3 = xto.l(new dck(bjg1VarY, (byte) 20));
                    x340Var.s0(objT3);
                }
                fhg1 fhg1VarO = bno1.o(bjg1VarY, u7hVar, u7hVar2, (ni20) gftVar.invoke(((tob1) objT3).getValue(), x340Var, 0), tzg1Var, x340Var, 196608);
                gft gftVar2 = gft.Q0;
                vux vuxVar5 = (vux) hrr0Var.getValue();
                x340Var.i0(-187954899);
                long j5 = ((u7h) vu30Var4.invoke(afxVarA, vuxVar5)).a;
                x340Var.r(false);
                hah hahVarE2 = u7h.e(j5);
                boolean zG5 = x340Var.g(hahVarE2);
                Object objT4 = x340Var.T();
                if (zG5 || objT4 == m4cVar) {
                    objT4 = (tzg1) m4hVar.invoke(hahVarE2);
                    x340Var.s0(objT4);
                }
                tzg1 tzg1Var2 = (tzg1) objT4;
                if (bjg1VarY.g()) {
                    fhg1VarO = fhg1VarO;
                    z2 = false;
                    x340Var.i0(1666827533);
                    x340Var.r(false);
                    objP1 = k9Var.P0();
                } else {
                    x340Var.i0(1666573488);
                    boolean zG6 = x340Var.g(bjg1VarY);
                    objP1 = x340Var.T();
                    if (zG6 || objP1 == m4cVar) {
                        jv91 jv91VarO2 = ekb.o();
                        iu30 iu30VarE2 = jv91VarO2 != null ? jv91VarO2.e() : null;
                        jv91 jv91VarU2 = ekb.u(jv91VarO2);
                        try {
                            Object objP4 = k9Var.P0();
                            ekb.C(jv91VarO2, jv91VarU2, iu30VarE2);
                            x340Var.s0(objP4);
                            objP1 = objP4;
                        } catch (Throwable th2) {
                            ekb.C(jv91VarO2, jv91VarU2, iu30VarE2);
                            throw th2;
                        }
                    }
                    z2 = false;
                    x340Var.r(false);
                }
                x340Var.i0(-187954899);
                u7h u7hVar3 = (u7h) vu30Var4.invoke(afxVarA, (vux) objP1);
                long j6 = u7hVar3.a;
                x340Var.r(z2);
                boolean zG7 = x340Var.g(bjg1VarY);
                Object objT5 = x340Var.T();
                if (zG7 || objT5 == m4cVar) {
                    objT5 = xto.l(new dck(bjg1VarY, (byte) 21));
                    x340Var.s0(objT5);
                }
                vux vuxVar6 = (vux) ((tob1) objT5).getValue();
                x340Var.i0(-187954899);
                u7h u7hVar4 = (u7h) vu30Var4.invoke(afxVarA, vuxVar6);
                long j7 = u7hVar4.a;
                x340Var.r(false);
                boolean zG8 = x340Var.g(bjg1VarY);
                Object objT6 = x340Var.T();
                if (zG8 || objT6 == m4cVar) {
                    objT6 = xto.l(new dck(bjg1VarY, (byte) 22));
                    x340Var.s0(objT6);
                }
                ni20 ni20Var = (ni20) gftVar2.invoke(((tob1) objT6).getValue(), x340Var, 0);
                fhg1 fhg1Var = fhg1VarO;
                fhg1 fhg1VarO2 = bno1.o(bjg1VarY, u7hVar3, u7hVar4, ni20Var, tzg1Var2, x340Var, 196608);
                gft gftVar3 = gft.R0;
                vux vuxVar7 = (vux) hrr0Var.getValue();
                x340Var.i0(303527672);
                long j8 = ((u7h) vu30Var2.invoke(afxVarA, vuxVar7)).a;
                x340Var.r(false);
                hah hahVarE3 = u7h.e(j8);
                boolean zG9 = x340Var.g(hahVarE3);
                Object objT7 = x340Var.T();
                if (zG9 || objT7 == m4cVar) {
                    objT7 = (tzg1) m4hVar.invoke(hahVarE3);
                    x340Var.s0(objT7);
                }
                tzg1 tzg1Var3 = (tzg1) objT7;
                if (bjg1VarY.g()) {
                    z3 = false;
                    x340Var.i0(1666827533);
                    x340Var.r(false);
                    objP2 = k9Var.P0();
                } else {
                    x340Var.i0(1666573488);
                    boolean zG10 = x340Var.g(bjg1VarY);
                    objP2 = x340Var.T();
                    if (zG10 || objP2 == m4cVar) {
                        jv91 jv91VarO3 = ekb.o();
                        iu30 iu30VarE3 = jv91VarO3 != null ? jv91VarO3.e() : null;
                        jv91 jv91VarU3 = ekb.u(jv91VarO3);
                        try {
                            Object objP5 = k9Var.P0();
                            ekb.C(jv91VarO3, jv91VarU3, iu30VarE3);
                            x340Var.s0(objP5);
                            objP2 = objP5;
                        } catch (Throwable th3) {
                            ekb.C(jv91VarO3, jv91VarU3, iu30VarE3);
                            throw th3;
                        }
                    }
                    z3 = false;
                    x340Var.r(false);
                }
                x340Var.i0(303527672);
                u7h u7hVar5 = (u7h) vu30Var2.invoke(afxVarA, (vux) objP2);
                long j9 = u7hVar5.a;
                x340Var.r(z3);
                boolean zG11 = x340Var.g(bjg1VarY);
                Object objT8 = x340Var.T();
                if (zG11 || objT8 == m4cVar) {
                    objT8 = xto.l(new dck(bjg1VarY, (byte) 23));
                    x340Var.s0(objT8);
                }
                vux vuxVar8 = (vux) ((tob1) objT8).getValue();
                x340Var.i0(303527672);
                u7h u7hVar6 = (u7h) vu30Var2.invoke(afxVarA, vuxVar8);
                long j10 = u7hVar6.a;
                x340Var.r(false);
                boolean zG12 = x340Var.g(bjg1VarY);
                Object objT9 = x340Var.T();
                if (zG12 || objT9 == m4cVar) {
                    objT9 = xto.l(new dck(bjg1VarY, (byte) 24));
                    x340Var.s0(objT9);
                }
                vu30Var = vu30Var2;
                fhg1 fhg1VarO3 = bno1.o(bjg1VarY, u7hVar5, u7hVar6, (ni20) gftVar3.invoke(((tob1) objT9).getValue(), x340Var, 0), tzg1Var3, x340Var, 196608);
                pgxVar = pgxVar2;
                long j11 = pgxVar instanceof jgx ? ((u7h) pgxVar.b.invoke(afxVarA, vuxVar2)).a : afxVarA.c.a;
                long j12 = ((u7h) fhg1Var.t.getValue()).a;
                long j13 = ((u7h) fhg1VarO2.t.getValue()).a;
                long j14 = ((u7h) fhg1VarO3.t.getValue()).a;
                avw0 avw0Var = cbx.b(x340Var).c;
                hb5 hb5Var2 = new hb5(j12, j13, j14, j11);
                x340Var.r(false);
                hb5Var = hb5Var2;
            } else {
                x340Var.i0(-825251685);
                x340Var.r(false);
                hb5Var = null;
                pgxVar = pgxVar2;
                vu30Var = vu30Var2;
            }
            long j15 = hb5Var != null ? hb5Var.b : ((u7h) vu30Var4.invoke(afxVarA, vuxVar2)).a;
            avw0 avw0Var2 = cbx.b(x340Var).c;
            long j16 = hb5Var != null ? hb5Var.c : ((u7h) vu30Var.invoke(afxVarA, vuxVar2)).a;
            if (hb5Var != null) {
                j = hb5Var.d;
            } else {
                j = pgxVar instanceof jgx ? ((u7h) vu30Var3.invoke(afxVarA, vuxVar2)).a : afxVarA.c.a;
            }
            hb5 hb5Var3 = hb5Var;
            long j17 = j16;
            mod.b(py20.a.a(new u7h(j)), apo.r(1878748386, new vcx(j17, this.e, zJ, this.a, this.f, this.g, hb5Var3, this.h, j15, pgxVar, afxVarA, this.c, this.d, this.i, this.t, this.X, this.Y), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        return rih1.a;
    }
}
