package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y5a0 implements xpw {
    public final z5a0 a;
    public final k8d1 b = k1o1.u(new r20((Object) this, (lnm) null, (byte) 22));
    public final ia00 c = n3o1.q(this).a(mx90.N0, mx90.O0);
    public final psw d;

    public y5a0(z5a0 z5a0Var) {
        this.a = z5a0Var;
        j2i j2iVar = new j2i(1034889900, new wv60(this, (byte) 28), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.c;
    }

    public final jsw c() {
        return this.d;
    }

    public final void e(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2050455187);
        int i2 = i & 1;
        if (x340Var.Y(i2, i2 != 0)) {
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            nl70.c(i3o1.n(2131233432, x340Var, 0), (String) null, anm1.N("jam-toggle-auto-invite-element-device-disabled-icon", u291.r(nim0.a, 24.0f)), cbx.a(x340Var).c.b, x340Var, 56, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u5a0(this, i, (byte) 0);
        }
    }

    public final void f(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1130217185);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= b0kVar3.i(this) ? 256 : 128;
        }
        if (b0kVar3.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            cwl1.b(qim0Var3, een.h, (hw61) null, (pgx) null, (vzq0) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(-1965599978, new zw2(z, this, (byte) 10), b0kVar3), b0kVar2, (i3 >> 3) & 14, 48, 2044);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new e30(this, z, qim0Var2, i, (byte) 18);
        }
    }

    public final void g(int i, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1589902974);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            qim0 qim0VarN = anm1.N("jam-toggle-auto-invite-element-device-description", nim0.a);
            uwr uwrVar = cbx.a;
            uwo1.e(cwl1.o0(x340Var, i), qim0VarN, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hl9(this, i, i2, (byte) 4);
        }
    }

    public final mqw getBehavior() {
        return this.b;
    }

    public final void h(x5a0 x5a0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        long j;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(244433327);
        if ((i & 6) == 0) {
            i2 = i | (x340Var2.g(x5a0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(qim0Var) ? 32 : 16;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            mbh mbhVarA = jbh.a(new d36(4.0f, false, new g21(een.Z, (byte) 28)), een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            nim0 nim0Var = nim0.a;
            uwo1.e(cwl1.o0(x340Var2, 2131956931), anm1.N("jam-toggle-auto-invite-element-label", nim0Var), cbx.d(x340Var2).g, cbx.a(x340Var2).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2032);
            x340Var = x340Var2;
            String str = x5a0Var.a;
            if (str == null) {
                x340Var.i0(-1528386687);
                x340Var.r(false);
            } else {
                x340Var.i0(-1528386686);
                qim0 qim0VarN = anm1.N("jam-toggle-auto-invite-element-device-name", nim0Var);
                lee1 lee1Var = cbx.d(x340Var).j;
                if (x5a0Var.b) {
                    x340Var.i0(-709187821);
                    j = cbx.a(x340Var).b.c;
                    x340Var.r(false);
                } else {
                    x340Var.i0(-709186194);
                    j = cbx.a(x340Var).b.b;
                    x340Var.r(false);
                }
                uwo1.e(str, qim0VarN, lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
                x340Var = x340Var;
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ri60(this, x5a0Var, qim0Var, i, (byte) 16);
        }
    }

    public final void i(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(964555607);
        int i2 = i & 1;
        if (x340Var.Y(i2, i2 != 0)) {
            ncf0 ncf0VarG = h5p1.G(new ocf0(2131886083), (String) null, (xu30) null, x340Var, 0, 62);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            mp10.f(ncf0VarG.c(), anm1.N("jam-toggle-auto-invite-element-device-disabled-icon-on-animation", u291.r(nim0.a, 24.0f)), false, false, (bcf0) null, Integer.MAX_VALUE, (ddf0) null, (tl3) null, mif1.Q0, x340Var, 1572864, 0, 2064316);
            x340Var = x340Var;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u5a0(this, i, (byte) 1);
        }
    }

    public final void j(boolean z, x5a0 x5a0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        iu30 iu30Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1821664634);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(x5a0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarZ = uyn1.z(0.0f, 16.0f, 1, nim0Var);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            fra fraVar = een.N0;
            cvx cvxVar2 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            int i4 = i3 & 14;
            int i5 = i3 >> 3;
            f((i5 & 896) | i4, x340Var, null, z);
            h(x5a0Var, new wnb0(1.0f, true), x340Var, i5 & 910);
            qim0 qim0VarN = anm1.N("jam-toggle-auto-invite-element-switch", nim0Var);
            boolean z3 = (i3 & 896) == 256;
            Object objT = x340Var.T();
            if (z3 || objT == fkj0.X) {
                iu30Var2 = iu30Var;
                objT = new bv70(iu30Var2, (byte) 18);
                x340Var.s0(objT);
            } else {
                iu30Var2 = iu30Var;
            }
            anm1.c(z, (iu30) objT, qim0VarN, (max) null, (idn0) null, x340Var, i4, 24);
            x340Var.r(true);
            x340Var.i0(-1022916123);
            cvx cvxVar3 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            g(2131956930, x340Var, (i3 >> 6) & 112);
            x340Var.r(false);
            x340Var.r(true);
        } else {
            iu30Var2 = iu30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d30(this, z, x5a0Var, iu30Var2, i, (byte) 24);
        }
    }
}
