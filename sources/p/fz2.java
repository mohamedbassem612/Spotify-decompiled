package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class fz2 {
    public static final pxg1 a = irn1.o0(300, 0, (dlv) null, 6);

    public static final void a(jb30 jb30Var, kp5 kp5Var, float f, float f2, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-355570153);
        kp5 kp5Var2 = kp5Var;
        int i2 = i | (x340Var.i(jb30Var) ? 4 : 2) | (x340Var.i(kp5Var2) ? 32 : 16) | (x340Var.d(f) ? 256 : 128) | (x340Var.d(f2) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            float f3 = (2.0f * f2) + f;
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            x340Var.i0(1612755073);
            for (mmr0 mmr0Var : p7h.M(new mmr0[]{new mmr0(kb30.TertiaryAccessory, (Object) null), new mmr0(kb30.SecondaryAccessory, hb30.b)})) {
                b((kb30) mmr0Var.a, (hb30) mmr0Var.b, kp5Var2, u291.r(nim0Var, f3), x340Var, (i2 << 3) & 896);
                kp5Var2 = kp5Var;
            }
            x340Var.r(false);
            b(kb30.PrimaryAccessory, hb30.a, kp5Var, u291.x(0.0f, 5.0f * f, 1, u291.h(nim0Var, f3)), x340Var, ((i2 << 3) & 896) | 6);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dz2(jb30Var, kp5Var, f, f2, i);
        }
    }

    public static final void b(kb30 kb30Var, hb30 hb30Var, kp5 kp5Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        kb30 kb30Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(216494373);
        if ((i & 6) == 0) {
            i2 = (x340Var.e(kb30Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.e(hb30Var == null ? -1 : hb30Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(kp5Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = fw2.X0;
                x340Var.s0(objT);
            }
            kb30Var2 = kb30Var;
            hm5.a(hb30Var, (qim0) null, (iu30) objT, (tl3) null, kb30Var.name(), (iu30) null, apo.r(-1785949038, new gk0(kb30Var2, kp5Var, qim0Var, (byte) 1), x340Var), x340Var, ((i2 >> 3) & 14) | 1573248, 42);
        } else {
            kb30Var2 = kb30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l8(i, kb30Var2, hb30Var, kp5Var, qim0Var, (byte) 13);
        }
    }

    public static final void c(jb30 jb30Var, kp5 kp5Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1685910714);
        int i2 = i | (x340Var.i(jb30Var) ? 4 : 2) | (x340Var.i(kp5Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            float fM = dsa0.m(x340Var, 2131166879);
            float fM2 = dsa0.m(x340Var, 2131165905);
            float fM3 = dsa0.m(x340Var, 2131165482);
            j2i j2iVarR = apo.r(2006175570, new ez2(kp5Var, fM), x340Var);
            j2i j2iVarR2 = apo.r(2015946131, new ez2(jb30Var, kp5Var, fM), x340Var);
            j2i j2iVarR3 = apo.r(2025716692, new dz2(jb30Var, kp5Var, fM, fM2), x340Var);
            qim0 qim0Var3 = nim0.a;
            ljo1.b(fM3, 438, j2iVarR, j2iVarR2, j2iVarR3, x340Var, uyn1.B(uyn1.z(dsa0.m(x340Var, 2131166058), 0.0f, 2, anm1.N("agnostic_footer", qim0Var3)), 0.0f, dsa0.m(x340Var, 2131166059), 0.0f, dsa0.m(x340Var, 2131166057), 5));
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oj2(jb30Var, kp5Var, qim0Var2, i, (byte) 5);
        }
    }

    public static final void d(kp5 kp5Var, float f, b0k b0kVar, int i) {
        h311 h311VarV;
        ez2 ez2Var;
        x340 x340Var = (x340) b0kVar;
        int i2 = (kk0.t(-1590453954, 1, x340Var) ? 4 : 2) | i | (x340Var.i(kp5Var) ? 32 : 16) | (x340Var.d(f) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zG = x340Var.g(kp5Var) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                int iC = l1d.C(1);
                objT = null;
                if (iC == 0) {
                    gs71 gs71Var = (gs71) ((spq0) ((kly0) kp5Var.h).get()).h();
                    if (gs71Var != null) {
                        objT = new kpg0(gs71Var, fw2.U0);
                    }
                } else if (iC != 1) {
                    eg.o();
                    return;
                }
                x340Var.s0(objT);
            }
            xpw xpwVar = (xpw) objT;
            if (xpwVar == null) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    ez2Var = new ez2(kp5Var, f, i, (byte) 3);
                }
            } else {
                otw.c(xpwVar, rih1.a, u291.j(0.0f, f, 1, anm1.N(kb30.Center.a, nim0.a)), (ipb1) null, x340Var, 48, 8);
            }
            h311VarV.d = ez2Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            ez2Var = new ez2(kp5Var, f, i, (byte) 2);
            h311VarV.d = ez2Var;
        }
    }

    public static final void e(kp5 kp5Var, float f, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-623999977);
        int i2 = (x340Var.i(kp5Var) ? 4 : 2) | i | (x340Var.d(f) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean zG = x340Var.g(kp5Var);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                kpg0 kpg0Var = new kpg0((xpw) ((kly0) kp5Var.b).get(), fw2.V0);
                x340Var.s0(kpg0Var);
                objT = kpg0Var;
            }
            otw.c((xpw) objT, rih1.a, u291.x(f, 0.0f, 2, anm1.N(kb30.Connect.a, nim0.a)), (ipb1) null, x340Var, 48, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ez2(kp5Var, f, i, (byte) 4);
        }
    }
}
