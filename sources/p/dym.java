package p;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class dym {
    public static final long a = jhc1.c(140.0f, 16.0f);
    public static final long b = jhc1.c(220.0f, 12.0f);

    public static final void a(txm txmVar, long j, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(700936319);
        int i2 = (x340Var.g(txmVar) ? 4 : 2) | i | (x340Var.f(j) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            w2g0.k(txmVar.f, txmVar.b, 48.0f, (qim0) null, new u7h(j), txmVar.g, x340Var, ((i2 << 9) & 57344) | 384, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk7(txmVar, j, i, (byte) 2);
        }
    }

    public static final void b(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2116312127);
        if (x340Var.Y(i & 1, i != 0)) {
            plx plxVar = plx.c;
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.b;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(plxVar, isl.a, u291.m(nim0.a, 16.0f), j, 0L, false, x340Var, plx.d | 48, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sqk((byte) 7, i, false);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void c(wxm wxmVar, vu30 vu30Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-870798001);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(wxmVar) : x340Var.i(wxmVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(vu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            boolean zEquals = wxmVar.equals(uxm.a);
            qim0 qim0Var3 = nim0.a;
            if (zEquals) {
                x340Var.i0(681749799);
                f(qim0Var3, x340Var, (i3 >> 6) & 14);
                x340Var.r(false);
            } else if (wxmVar.equals(vxm.a)) {
                x340Var.i0(681751379);
                x340Var.r(false);
            } else {
                if (!(wxmVar instanceof txm)) {
                    throw p3d1.k(x340Var, 681748791, false);
                }
                x340Var.i0(681752321);
                d((txm) wxmVar, vu30Var, x340Var, i3 & 1022);
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nok(wxmVar, vu30Var, qim0Var2, i, (byte) 19);
        }
    }

    public static final void d(txm txmVar, vu30 vu30Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        long j;
        Object au0Var;
        long j2;
        xu30 xu30Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(158511030);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(txmVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(vu30Var) ? 32 : 16;
        }
        int i3 = i & 384;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= b0kVar3.g(nim0Var) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            u7h u7hVar = txmVar.h;
            if (u7hVar != null) {
                j = u7hVar.a;
            } else {
                uwr uwrVar = cbx.a;
                j = ((yex) zex.a.d).e;
            }
            qim0 qim0VarN = anm1.N("contributor-sheet-header", u291.f(nim0Var, 1.0f));
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = u2m.Z0;
                b0kVar3.s0(objT);
            }
            kgx kgxVar = new kgx(0, (vu30) objT, (vu30) null, (vu30) null, 13);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            zzq0 zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            cvx cvxVar5 = cbx.b(b0kVar3).b;
            uvx uvxVar = new uvx(1, kgxVar, 0, zzq0Var, (zzq0) null, new tvx(2.0f, 12.0f, 2.0f), d4o1.a, 0, (p3v) null, 404);
            String strO0 = cwl1.o0(b0kVar3, 2131954582);
            boolean zF = ((i2 & 14) == 4) | ((i2 & 112) == 32) | b0kVar3.f(j);
            Object objT2 = b0kVar3.T();
            if (zF || objT2 == m4cVar) {
                j2 = j;
                au0Var = new au0(vu30Var, txmVar, j2, (byte) 4);
                b0kVar3.s0(au0Var);
            } else {
                au0Var = objT2;
                j2 = j;
            }
            Function0 function0 = (Function0) au0Var;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function0);
            j2i j2iVarR = apo.r(-975212564, new gv6(txmVar, j2, (byte) 4), b0kVar3);
            if (txmVar.c.isEmpty() && txmVar.d == null) {
                b0kVar3.i0(2034536022);
                b0kVar3.r(false);
                xu30Var = null;
            } else {
                b0kVar3.i0(2034442898);
                xu30 xu30VarR = apo.r(1509996979, new bym(txmVar, (byte) 0), b0kVar3);
                b0kVar3.r(false);
                xu30Var = xu30VarR;
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarN, uvxVar, (max) null, false, (idn0) null, ny3.a, gbxVar, (gbx) null, j2iVarR, (xu30) null, (xu30) null, xu30Var, mgi.a, (xu30) null, (xu30) null, apo.r(-250804750, new bym(txmVar, (byte) 1), b0kVar3), b0kVar2, 100859968, 196992, 26268);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bkh(txmVar, vu30Var, i);
        }
    }

    public static final void e(qim0 qim0Var, b0k b0kVar, int i) {
        j2i j2iVar = mgi.b;
        j2i j2iVar2 = mgi.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-388597156);
        j06 j06Var = x340Var.a;
        int i2 = (x340Var.g(qim0Var) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, 16.0f, 12.0f);
            cvx cvxVar3 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), een.N0, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            j2iVar.invoke(x340Var, 6);
            wnb0 wnb0Var = new wnb0(1.0f, true);
            cvx cvxVar4 = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(2.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, wnb0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            ktd.s(j2iVar2, x340Var, 6, true, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wdk(i, qim0Var);
        }
    }

    public static final void f(qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2055376315);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarN = anm1.N("contributor-sheet-header-skeleton", qim0Var);
            j2i j2iVar = mgi.a;
            j2i j2iVar2 = mgi.a;
            e(qim0VarN, x340Var, 390);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mq2(qim0Var, i, (byte) 6);
        }
    }

    public static final void g(c380 c380Var, rwm rwmVar, Integer num, b0k b0kVar, int i) {
        h311 h311VarV;
        cym cymVar;
        String strM;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1034778686);
        int i2 = i | (x340Var.g(c380Var) ? 4 : 2) | (x340Var.e(rwmVar == null ? -1 : rwmVar.ordinal()) ? 32 : 16) | (x340Var.g(num) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            if (c380Var.isEmpty()) {
                if (rwmVar != null) {
                    x340Var.i0(-2010087146);
                    x340Var.i0(-1740942479);
                    strM = g3p1.m(rwmVar, x340Var);
                    if (num != null) {
                        strM = cwl1.n0(2131954590, new Object[]{strM, cwl1.U(2131820640, num.intValue(), new Object[]{num}, x340Var)}, x340Var);
                    }
                    x340Var.r(false);
                    x340Var.r(false);
                } else {
                    x340Var.i0(2111876798);
                    x340Var.r(false);
                    h311VarV = x340Var.v();
                    if (h311VarV == null) {
                        return;
                    } else {
                        cymVar = new cym(c380Var, rwmVar, num, i, (byte) 1);
                    }
                }
                h311VarV.d = cymVar;
            }
            x340Var.i0(-2010089651);
            strM = gg.C(c380Var, x340Var, (i2 & 14) | 48, 0);
            x340Var.r(false);
            uwr uwrVar = cbx.a;
            uwo1.e(strM, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(3), 0, (qx8) null, x340Var, 1572864, 0, 1714);
        } else {
            x340Var.b0();
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            cymVar = new cym(c380Var, rwmVar, num, i, (byte) 0);
            h311VarV.d = cymVar;
        }
    }

    public static final void h(long j, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2144717665);
        if (x340Var.Y(i & 1, (i & 3) != 2)) {
            d620 d620Var = u291.a;
            qim0 qim0VarN = u291.n(nim0.a, s3v.b(j), s3v.a(j));
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(qim0VarN, jA, er31.b(8.0f));
            cua cuaVar2 = cbx.b(x340Var).f;
            t1c.a(cwl1.l0(qim0VarF, 0L, er31.b(8.0f), 13), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sre(j, i, (byte) 13);
        }
    }
}
