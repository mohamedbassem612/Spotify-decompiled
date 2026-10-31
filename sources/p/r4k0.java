package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class r4k0 {
    public final d0r a;
    public final nm1 b;

    public r4k0(d0r d0rVar, yfq yfqVar) {
        this.a = d0rVar;
        this.b = yfqVar.a(d0rVar, hxj0.g);
    }

    public final void a(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-569864857);
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gbx gbxVar = new gbx(z50.c, function0);
            ldx ldxVar = ldx.c;
            gdx gdxVarS = yla.s(x340Var);
            j2i j2iVar = s1j.b;
            qim0 qim0Var3 = nim0.a;
            foo1.c(gbxVar, ldxVar, qim0Var3, jax.a, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, j2iVar, x340Var, 384, 48, 1992);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m4k0(this, function0, qim0Var2, i, (byte) 0);
        }
    }

    public final void b(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1129253426);
        j06 j06Var = x340Var2.a;
        int i2 = i | (x340Var2.i(qim0Var) ? 4 : 2) | (x340Var2.i(function0) ? 32 : 16);
        if (x340Var2.Y(i2 & 1, (i2 & 19) != 18)) {
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
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
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE2 = zr7.E(x340Var2, nim0Var);
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
            String strO0 = cwl1.o0(x340Var2, 2131958720);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, (qim0) null, cbx.d(x340Var2).g, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2042);
            boolean z2 = (i2 & 112) == 32;
            Object objT = x340Var2.T();
            if (z2 || objT == fkj0.X) {
                objT = new tze0(function0, (byte) 29);
                x340Var2.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            ldx ldxVar = ldx.c;
            gdx gdxVarS = yla.s(x340Var2);
            cvx cvxVar = cbx.b(x340Var2).b;
            foo1.c(gbxVar, ldxVar, uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), (max) null, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, s1j.f, x340Var2, 0, 48, 2008);
            x340Var = x340Var2;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m4k0(this, qim0Var, function0, i);
        }
    }

    public final void c(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1112339190);
        j06 j06Var = x340Var.a;
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarN = anm1.N("mixing_extended_versions_loading_content", qim0Var);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            era eraVar = een.Q0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, nim0.a);
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
            yto1.e(1, 48, 1, x340Var, (qim0) null);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n4k0(this, qim0Var, i, (byte) 0);
        }
    }

    public final void d(s5k0 s5k0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2008318205);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(s5k0Var) : x340Var.i(s5k0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(nim0.a) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            nyx.a(2, (wux) null, apo.r(-1135673008, new p4k0(this, s5k0Var, iu30Var), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqd0(this, s5k0Var, iu30Var, i);
        }
    }

    public final void e(s5k0 s5k0Var, iu30 iu30Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-890214092);
        int i2 = (b0kVar3.g(s5k0Var) ? 4 : 2) | i | (b0kVar3.i(iu30Var) ? 32 : 16);
        nim0 nim0Var = nim0.a;
        int i3 = i2 | (b0kVar3.i(nim0Var) ? 256 : 128) | (b0kVar3.i(this) ? 2048 : 1024);
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            b0kVar2 = b0kVar3;
            cgj1.n(nim0Var, apo.r(25750264, new loi0(this, iu30Var, (byte) 6), b0kVar3), (vu30) null, (vu30) null, (vu30) null, 0, 0L, 0L, (erl1) null, apo.r(1162314115, new o4k0(s5k0Var, this, iu30Var), b0kVar3), b0kVar2, ((i3 >> 6) & 14) | 805306416, 508);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new p4k0(this, s5k0Var, iu30Var, i);
        }
    }

    public final void f(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1607040969);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | 48 | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            j2i j2iVarR = apo.r(1586372274, new yih0(this, (byte) 25), x340Var);
            j2i j2iVarR2 = apo.r(718444912, new loi0(this, function0, (byte) 7), x340Var);
            qim0 qim0Var3 = nim0.a;
            ti5.a(j2iVarR, qim0Var3, j2iVarR2, (xu30) null, 0.0f, (erl1) null, (x7f1) null, x340Var, 438, 248);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m4k0(this, function0, qim0Var2, i, (byte) 2);
        }
    }

    public final void g(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(919968523);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131958723);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).h;
            cjc0 cjc0Var = new cjc0(1);
            px8 px8Var = new px8(cbx.d(x340Var).n.a.b, cbx.d(x340Var).h.a.b, fc11.G(1), (mx8) null, 8);
            qim0Var2 = nim0.a;
            uwo1.e(strO0, qim0Var2, lee1Var, 0L, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, px8Var, x340Var, 48, 8, 696);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n4k0(this, qim0Var2, i, (byte) 1);
        }
    }

    public final void h(c380 c380Var, vzq0 vzq0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(407903333);
        int i2 = i | (b0kVar3.g(c380Var) ? 4 : 2) | (b0kVar3.i(vzq0Var) ? 32 : 16) | (b0kVar3.i(iu30Var) ? 256 : 128) | 3072 | (b0kVar3.i(this) ? 16384 : 8192);
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            boolean zI = ((i2 & 14) == 4) | b0kVar3.i(this) | ((i2 & 896) == 256);
            Object objT = b0kVar3.T();
            if (zI || objT == fkj0.X) {
                objT = new gnf0(c380Var, this, iu30Var, (byte) 19);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            ujo1.d(qim0VarD, (xtb0) null, vzq0Var, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, b0kVar2, (i2 << 3) & 896, 506);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new e9g0((byte) 5, i, this, c380Var, vzq0Var, iu30Var, qim0Var2);
        }
    }

    public final void i(fy00 fy00Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        fy00 fy00Var2 = fy00Var;
        m4c m4cVar = fkj0.X;
        gra graVar = een.h;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-888836046);
        j06 j06Var = x340Var.a;
        int i4 = i | (x340Var.g(fy00Var2) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | 384;
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var4);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
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
            int i5 = fy00Var2.e;
            boolean z4 = fy00Var2.d;
            if (i5 == 2) {
                x340Var.i0(-913650525);
                qim0 qim0VarR = u291.r(qim0Var4, 48.0f);
                gfh0 gfh0VarC = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarR);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                z = true;
                yto1.e(1, 48, 1, x340Var, (qim0) null);
                x340Var.r(true);
                x340Var.r(false);
                qim0Var3 = qim0Var4;
            } else if (i5 == 3) {
                x340Var.i0(-913408322);
                qim0 qim0VarR2 = u291.r(qim0Var4, 48.0f);
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarR2);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar);
                nko1.H(xos0VarM3, x340Var, lljVar2);
                x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar4);
                ilx ilxVar = ilx.c;
                uwr uwrVar = cbx.a;
                w0h1.a(ilxVar, isl.a, (qim0) null, cbx.a(x340Var).b.c, 0L, false, x340Var, ilx.d | 48, 52);
                x340Var.r(true);
                x340Var.r(false);
                z = true;
                qim0Var3 = qim0Var4;
            } else {
                if (fy00Var2.c != null) {
                    x340Var.i0(-913016668);
                    if (z4) {
                        i2 = 663288402;
                        i3 = 2131958722;
                    } else {
                        i2 = 663291346;
                        i3 = 2131958721;
                    }
                    String strK = x0d.k(x340Var, i2, i3, x340Var, false);
                    int i6 = i4 & 112;
                    int i7 = i4 & 14;
                    boolean z5 = (i6 == 32) | (i7 == 4);
                    Object objT = x340Var.T();
                    if (z5 || objT == m4cVar) {
                        objT = new q4k0(iu30Var, fy00Var2, (byte) 0);
                        x340Var.s0(objT);
                    }
                    Function0 function0 = (Function0) objT;
                    if (ihc1.y0(strK)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return;
                    }
                    wro1.h(new gbx(new y50(strK), function0), z4 ? kdx.c : ldx.c, (qim0) null, (max) null, yla.s(x340Var), (vzq0) null, false, (idn0) null, (ga80) null, s1j.d, x340Var, 0, 6, 988);
                    x340Var = x340Var;
                    if (z4) {
                        x340Var.i0(-912170709);
                        boolean z6 = (i7 == 4) | (i6 == 32);
                        Object objT2 = x340Var.T();
                        if (z6 || objT2 == m4cVar) {
                            fy00Var2 = fy00Var;
                            objT2 = new q4k0(iu30Var, fy00Var2, (byte) 1);
                            x340Var.s0(objT2);
                        } else {
                            fy00Var2 = fy00Var;
                        }
                        gbx gbxVar = new gbx(z50.c, (Function0) objT2);
                        idx idxVar = new idx(4);
                        gdx gdxVarS = yla.s(x340Var);
                        uwr uwrVar2 = cbx.a;
                        cvx cvxVar = cbx.b(x340Var).b;
                        qim0Var3 = qim0Var4;
                        foo1.c(gbxVar, idxVar, anm1.N("mixing_extended_versions_replace_".concat(fy00Var2.a), uyn1.B(qim0Var4, 0.0f, 0.0f, 8.0f, 0.0f, 11)), (max) null, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, s1j.e, x340Var, 0, 48, 2008);
                        x340Var = x340Var;
                        z2 = false;
                        x340Var.r(false);
                    } else {
                        fy00Var2 = fy00Var;
                        qim0Var3 = qim0Var4;
                        z2 = false;
                        x340Var.i0(-911473612);
                        x340Var.r(false);
                    }
                    x340Var.r(z2);
                } else {
                    qim0Var3 = qim0Var4;
                    x340Var.i0(-911455756);
                    x340Var.r(false);
                }
                z = true;
            }
            x340Var.r(z);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w0f0(i, this, fy00Var2, iu30Var, qim0Var2, (byte) 20);
        }
    }
}
