package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class o5h {
    public static final kiv a = new kiv(nyf.Z, (byte) 1);

    public static final void a(boolean z, boolean z2, String str, y0q0 y0q0Var, vu30 vu30Var, b0k b0kVar, int i) {
        int i2;
        int i3;
        vu30 vu30Var2;
        llj lljVar;
        qim0 qim0Var;
        boolean z3;
        nyf nyfVar = nyf.N0;
        gra graVar = een.h;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1306726230);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(y0q0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(vu30Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            mta mtaVar2 = cbx.b(x340Var).d;
            zov0 zov0Var = cbx.b(x340Var).g;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(-10.0f, true, new um5(false)), een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var2);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z4 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar2 = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar2);
            llj lljVar3 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar4 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar4);
            nko1.F(x340Var);
            vu30 vu30Var3 = y580.Y;
            nko1.H(qim0VarE, x340Var, vu30Var3);
            if (!z || vu30Var == null) {
                i3 = i2;
                vu30Var2 = vu30Var3;
                lljVar = lljVar4;
                qim0Var = qim0Var2;
                x340Var.i0(-288884848);
                x340Var.r(false);
            } else {
                x340Var.i0(-289346128);
                qim0 qim0VarN = anm1.N("collection_preview_action_save", u291.m(qim0Var2, 48.0f));
                Object objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = ktd.n(x340Var);
                }
                i3 = i2;
                vu30Var2 = vu30Var3;
                qim0Var = qim0Var2;
                lljVar = lljVar4;
                qim0 qim0VarV = bin.v(qim0VarN, (idn0) objT, (ga80) null, false, (String) null, (pm31) null, nyfVar, 28);
                gfh0 gfh0VarC = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarV);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, lljVar2);
                nko1.H(xos0VarM2, x340Var, lljVar3);
                x0d.q(iHashCode2, x340Var, lljVar, x340Var);
                nko1.H(qim0VarE2, x340Var, vu30Var2);
                boolean zD = x340Var.d(1.25f);
                Object objT2 = x340Var.T();
                if (zD || objT2 == m4cVar) {
                    objT2 = new rs7(1, (byte) 24);
                    x340Var.s0(objT2);
                }
                qim0 qim0VarC = i541.C(qim0Var, (iu30) objT2);
                gfh0 gfh0VarC2 = t1c.c(een.d, false);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarC);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar2);
                nko1.H(xos0VarM3, x340Var, lljVar3);
                x0d.q(iHashCode3, x340Var, lljVar, x340Var);
                nko1.H(qim0VarE3, x340Var, vu30Var2);
                us71.k((i3 >> 12) & 14, vu30Var, x340Var, true, true);
                x340Var.r(false);
            }
            if (!z2 || y0q0Var == null) {
                z3 = true;
                x340Var.i0(-288401744);
                x340Var.r(false);
            } else {
                x340Var.i0(-288819779);
                qim0 qim0VarN2 = anm1.N("collection_preview_action_play", u291.m(qim0Var, 48.0f));
                Object objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = ktd.n(x340Var);
                }
                qim0 qim0VarV2 = bin.v(qim0VarN2, (idn0) objT3, (ga80) null, false, (String) null, (pm31) null, nyfVar, 28);
                gfh0 gfh0VarC3 = t1c.c(graVar, false);
                int iHashCode4 = Long.hashCode(x340Var.T);
                xos0 xos0VarM4 = x340Var.m();
                qim0 qim0VarE4 = zr7.E(x340Var, qim0VarV2);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC3, x340Var, lljVar2);
                nko1.H(xos0VarM4, x340Var, lljVar3);
                x0d.q(iHashCode4, x340Var, lljVar, x340Var);
                nko1.H(qim0VarE4, x340Var, vu30Var2);
                otw.c(y0q0Var, new n0q0(str), (qim0) null, (ipb1) null, x340Var, (i3 >> 9) & 14, 12);
                z3 = true;
                x340Var.r(true);
                x340Var.r(false);
            }
            x340Var.r(z3);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bmg(z, z2, str, y0q0Var, vu30Var, i, (byte) 1);
        }
    }

    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v4 */
    public static final void b(String str, String str2, String str3, boolean z, String str4, c380 c380Var, y0q0 y0q0Var, qim0 qim0Var, boolean z2, boolean z3, boolean z4, u7h u7hVar, boolean z5, vu30 vu30Var, float f, b0k b0kVar, int i) {
        x340 x340Var;
        m5h m5hVar;
        h311 h311Var;
        smr0 smr0VarA;
        ?? r7;
        ?? r8;
        String str5;
        x340 x340Var2;
        boolean z6;
        boolean z7;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        fra fraVar = een.N0;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(537095693);
        j06 j06Var = x340Var3.a;
        int i2 = i | (x340Var3.g(str) ? 4 : 2) | (x340Var3.g(str2) ? 32 : 16) | (x340Var3.g(str3) ? 256 : 128) | (x340Var3.h(z) ? 2048 : 1024) | (x340Var3.g(str4) ? 16384 : 8192) | (x340Var3.g(c380Var) ? 131072 : 65536) | (x340Var3.i(y0q0Var) ? 1048576 : 524288) | (x340Var3.i(qim0Var) ? 8388608 : 4194304) | (x340Var3.h(z2) ? 67108864 : 33554432) | (x340Var3.h(z3) ? 536870912 : 268435456);
        int i3 = 3072 | (x340Var3.h(z4) ? (char) 4 : (char) 2) | (x340Var3.g(u7hVar) ? ' ' : (char) 16) | (x340Var3.h(z5) ? (char) 256 : (char) 128) | (x340Var3.d(f) ? (char) 16384 : (char) 8192);
        if (x340Var3.Y(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 9363) == 9362) ? false : true)) {
            x340Var3.d0();
            if ((i & 1) != 0 && !x340Var3.E()) {
                x340Var3.b0();
            }
            x340Var3.s();
            float fM = dsa0.m(x340Var3, 2131166073);
            u7h u7hVarQ = (u7hVar == null || u7h.c(u7hVar.a) <= 0.0f) ? null : u7hVar;
            boolean z8 = z3 && u7hVarQ == null && str3 != null && !ihc1.y0(str3);
            xb10 xb10VarO = x4p1.o(x340Var3);
            if (!z3 || (u7hVarQ == null && ((smr0VarA = xb10VarO.a()) == null || (u7hVarQ = ywo1.q(smr0VarA)) == null || !z8))) {
                u7hVarQ = null;
            }
            j260 j260Var = (j260) x340Var3.k(a);
            boolean zI = x340Var3.i(j260Var) | ((i3 & 14) == 4) | x340Var3.g(u7hVarQ);
            Object objT = x340Var3.T();
            if (zI || objT == fkj0.X) {
                objT = new vm1(j260Var, z4, u7hVarQ, (byte) 4);
                x340Var3.s0(objT);
            }
            qxd0.S((Function0) objT, x340Var3);
            n4k n4kVar = hmb0.t1;
            gex0 gex0Var = h36.a;
            nim0 nim0Var = nim0.a;
            if (z4) {
                x340Var3.i0(1865804949);
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                jw31 jw31VarA = ew31.a(gex0Var, fraVar, x340Var3, 0);
                int iHashCode = Long.hashCode(x340Var3.T);
                xos0 xos0VarM = x340Var3.m();
                qim0 qim0VarE = zr7.E(x340Var3, qim0VarF);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(jw31VarA, x340Var3, lljVar4);
                nko1.H(xos0VarM, x340Var3, lljVar3);
                x0d.q(iHashCode, x340Var3, lljVar2, x340Var3);
                nko1.H(qim0VarE, x340Var3, lljVar);
                uwr uwrVar = cbx.a;
                uwo1.e(str, anm1.N("agent_list_title", new wnb0(1.0f, true)), cbx.d(x340Var3).e, cbx.a(x340Var3).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var3, i2 & 14, 0, 1712);
                if (y0q0Var != null) {
                    x340Var3.i0(1781393681);
                    mta mtaVar = cbx.b(x340Var3).d;
                    qim0 qim0VarN = anm1.N("collection_preview_action_play", u291.m(nim0Var, 48.0f));
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode2 = Long.hashCode(x340Var3.T);
                    xos0 xos0VarM2 = x340Var3.m();
                    qim0 qim0VarE2 = zr7.E(x340Var3, qim0VarN);
                    x340Var3.m0();
                    if (x340Var3.S) {
                        x340Var3.l(n4kVar);
                    } else {
                        x340Var3.v0();
                    }
                    nko1.H(gfh0VarC, x340Var3, lljVar4);
                    nko1.H(xos0VarM2, x340Var3, lljVar3);
                    x0d.q(iHashCode2, x340Var3, lljVar2, x340Var3);
                    nko1.H(qim0VarE2, x340Var3, lljVar);
                    str5 = str4;
                    otw.c(y0q0Var, new n0q0(str5), (qim0) null, (ipb1) null, x340Var3, (i2 >> 18) & 14, 12);
                    x340Var2 = x340Var3;
                    z6 = true;
                    x340Var2.r(true);
                    z7 = false;
                    x340Var2.r(false);
                } else {
                    str5 = str4;
                    x340Var2 = x340Var3;
                    z6 = true;
                    z7 = false;
                    x340Var2.i0(1781767510);
                    x340Var2.r(false);
                }
                x340Var2.r(z6);
                x340Var2.r(z7);
                h311 h311VarV = x340Var2.v();
                if (h311VarV == null) {
                    return;
                }
                m5hVar = new m5h(str, str2, str3, z, str5, c380Var, y0q0Var, qim0Var, z2, z3, z4, u7hVar, z5, vu30Var, f, i, (byte) 0);
                h311Var = h311VarV;
            } else {
                x340Var3.i0(1866604501);
                x340Var3.r(false);
                boolean z9 = (!z2 || z || c380Var.isEmpty() || y0q0Var == null) ? false : true;
                boolean z10 = (!z5 || z || vu30Var == null) ? false : true;
                boolean z11 = z3 && z;
                boolean z12 = z8;
                qim0 qim0VarB = uyn1.B(qim0Var, 0.0f, 0.0f, 0.0f, f, 7);
                gfh0 gfh0VarC2 = t1c.c(een.d, false);
                int iHashCode3 = Long.hashCode(x340Var3.T);
                xos0 xos0VarM3 = x340Var3.m();
                qim0 qim0VarE3 = zr7.E(x340Var3, qim0VarB);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(gfh0VarC2, x340Var3, lljVar4);
                nko1.H(xos0VarM3, x340Var3, lljVar3);
                x0d.q(iHashCode3, x340Var3, lljVar2, x340Var3);
                nko1.H(qim0VarE3, x340Var3, lljVar);
                jw31 jw31VarA2 = ew31.a(gex0Var, fraVar, x340Var3, 0);
                int iHashCode4 = Long.hashCode(x340Var3.T);
                xos0 xos0VarM4 = x340Var3.m();
                qim0 qim0VarE4 = zr7.E(x340Var3, nim0Var);
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(jw31VarA2, x340Var3, lljVar4);
                nko1.H(xos0VarM4, x340Var3, lljVar3);
                x0d.q(iHashCode4, x340Var3, lljVar2, x340Var3);
                nko1.H(qim0VarE4, x340Var3, lljVar);
                int i4 = i2 >> 6;
                x340Var = x340Var3;
                tm80.c(str3, z, u291.r(nim0Var, fM), z12 ? xb10VarO : null, x340Var, i4 & 126, 0);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarH = kx40.h(1.0f, uyn1.B(nim0Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), true);
                mbh mbhVarA = jbh.a(h36.e, een.P0, x340Var, 0);
                int iHashCode5 = Long.hashCode(x340Var.T);
                xos0 xos0VarM5 = x340Var.m();
                qim0 qim0VarE5 = zr7.E(x340Var, qim0VarH);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA, x340Var, lljVar4);
                nko1.H(xos0VarM5, x340Var, lljVar3);
                x0d.q(iHashCode5, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE5, x340Var, lljVar);
                if (z && ihc1.y0(str)) {
                    x340Var.i0(1179744541);
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    tm80.p(0.6f, 16.0f, x340Var, 6);
                    x340Var.r(false);
                    r8 = 0;
                    r7 = 1;
                } else {
                    x340Var.i0(1179854219);
                    r7 = 1;
                    r8 = 0;
                    uwo1.e(str, (qim0) null, cbx.d(x340Var).g, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, i2 & 14, 0, 1714);
                    x340Var.r(false);
                }
                cvx cvxVar3 = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(nim0Var, 4.0f));
                if (z && ihc1.y0(str2)) {
                    x340Var.i0(1180218686);
                    tm80.p(0.4f, 14.0f, x340Var, 6);
                    x340Var.r((boolean) r8);
                } else {
                    x340Var.i0(1180327558);
                    uwo1.e(str2, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0((int) r7), 0, (qx8) null, x340Var, (i2 >> 3) & 14, 0, 1714);
                    x340Var.r((boolean) r8);
                }
                x340Var.r((boolean) r7);
                if (z11) {
                    x340Var.i0(383328846);
                    d(x340Var, r8);
                    x340Var.r((boolean) r8);
                } else if (z10 || z9) {
                    x340Var.i0(383331166);
                    a(z10, z9, str4, y0q0Var, vu30Var, x340Var, (i4 & 896) | ((i2 >> 9) & 7168) | 24576);
                    x340Var = x340Var;
                    x340Var.r((boolean) r8);
                } else {
                    x340Var.i0(-1001405813);
                    x340Var.r((boolean) r8);
                }
                x340Var.r((boolean) r7);
                x340Var.r((boolean) r7);
            }
            h311Var.d = m5hVar;
        }
        x340Var = x340Var3;
        x340Var.b0();
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            m5hVar = new m5h(str, str2, str3, z, str4, c380Var, y0q0Var, qim0Var, z2, z3, z4, u7hVar, z5, vu30Var, f, i, (byte) 1);
            h311Var = h311VarV2;
            h311Var.d = m5hVar;
        }
    }

    public static final void c(int i, long j, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2036237245);
        int i2 = (x340Var.f(j) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            float fM = dsa0.m(x340Var, 2131166073);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0Var3 = nim0.a;
            t1c.a(dug.e(anm1.N("collection_preview_header_shade", u291.h(u291.f(qim0Var3, 1.0f), fM + 16.0f + 16.0f + fM)), v9c.t(new mmr0[]{new mmr0(Float.valueOf(0.0f), new u7h(j)), new mmr0(Float.valueOf(0.55f), new u7h(u7h.b(j, 0.45f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(1.0f), new u7h(u7h.j))}, 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6), x340Var, 0);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e82(j, qim0Var2, i, (byte) 1);
        }
    }

    public static final void d(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-399321154);
        if (x340Var.Y(i & 1, i != 0)) {
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, nim0.a);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            e(20.0f, 0, x340Var);
            mta mtaVar = cbx.b(x340Var).d;
            e(32.0f, 0, x340Var);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qza((byte) 22, i, false);
        }
    }

    public static final void e(float f, int i, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1385019912);
        int i2 = (x340Var.d(f) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            long jC = cbx.a(x340Var).a.b.c();
            qim0 qim0VarR = u291.r(nim0.a, f);
            cr31 cr31Var = er31.a;
            t1c.a(cwl1.l0(dug.f(qim0VarR, jC, cr31Var), jC, cr31Var, 12), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n5h((byte) 0, f, i);
        }
    }
}
