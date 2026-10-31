package p;

import android.widget.FrameLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class luj implements iuj {
    public final xfx a;
    public final lzn0 b;
    public final boolean c;
    public final agc0 d;
    public final gw70 e;

    public luj(xfx xfxVar, gw70 gw70Var, agc0 agc0Var, lzn0 lzn0Var, boolean z) {
        this.a = xfxVar;
        this.b = lzn0Var;
        this.c = z;
        this.d = agc0Var;
        this.e = gw70Var;
    }

    @Override // p.iuj
    public final void a(x360 x360Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1125677403);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(x360Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(this) ? 32 : 16;
        }
        boolean z = true;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z2 = x360Var instanceof hvl1;
            lzn0 lzn0Var = this.b;
            if (z2) {
                x340Var.i0(555776614);
                b(lzn0Var, (hvl1) x360Var, x340Var, (i2 << 3) & 1008);
                x340Var.r(false);
            } else if (x360Var instanceof jzg1) {
                x340Var.i0(555778841);
                e(this.a, this.b, (jzg1) x360Var, x340Var, (i2 << 6) & 8064);
                x340Var.r(false);
            } else if (x360Var instanceof mhq0) {
                x340Var.i0(555781658);
                c(this.b, this.e, (mhq0) x360Var, x340Var, (i2 << 6) & 8064);
                this = this;
                x340Var.r(false);
            } else if (x360Var instanceof i460) {
                x340Var.i0(49460176);
                i460 i460Var = (i460) x360Var;
                if (i460Var.c() == null) {
                    this = this;
                    z = false;
                }
                this = this;
                boolean zH = x340Var.h(z);
                Object objT = x340Var.T();
                if (zH || objT == fkj0.X) {
                    objT = new l460(k1o1.v(lzn0Var), z);
                    x340Var.s0(objT);
                }
                otw.c((l460) objT, tho1.u(i460Var), (qim0) null, (ipb1) null, x340Var, 0, 12);
                x340Var.r(false);
            } else {
                this = this;
                x340Var.i0(555796617);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bkh(this, x360Var, i, (byte) 3);
        }
    }

    public final void b(lzn0 lzn0Var, hvl1 hvl1Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1740429088);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(lzn0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(hvl1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            d(hvl1Var.g, apo.r(1461170880, new swc(hvl1Var, this, lzn0Var, (byte) 27), x340Var), x340Var, (i2 & 896) | 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p1b(this, lzn0Var, hvl1Var, i, (byte) 28);
        }
    }

    public final void c(lzn0 lzn0Var, gw70 gw70Var, mhq0 mhq0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1781563324);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(lzn0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(gw70Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(mhq0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = new thq0(gw70Var, lzn0Var);
                x340Var.s0(objT);
            }
            otw.c((thq0) objT, tho1.w(mhq0Var), (qim0) null, (ipb1) null, x340Var, 0, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c2i(i, this, lzn0Var, gw70Var, mhq0Var, (byte) 2);
        }
    }

    public final void d(boolean z, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        j2i j2iVar2;
        h311 h311VarV;
        juj jujVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(492184054);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.h(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            if (z) {
                j2iVar2 = j2iVar;
                x340Var.i0(-363060916);
                x340Var.r(false);
                cb80 cb80VarG = t5p1.g(t5p1.r("shimmer", x340Var, 0), -1.0f, 2.0f, irn1.Y(irn1.o0(1500, 0, mlv.d, 2), 1, 0L, 4), "shimmer_offset", x340Var, 29064, 0);
                uwr uwrVar = cbx.a;
                long j = cbx.a(x340Var).b.b;
                qim0 qim0VarD = i541.D(nim0.a, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 1, (f2b) null, 983039);
                boolean zF = x340Var.f(j) | x340Var.g(cb80VarG);
                Object objT = x340Var.T();
                if (zF || objT == fkj0.X) {
                    objT = new kuj(j, cb80VarG, (byte) 0);
                    x340Var.s0(objT);
                }
                qim0 qim0VarR = exd0.r(qim0VarD, (iu30) objT);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(tgp1.l(x340Var));
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarR);
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
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                dv20.l((i3 >> 3) & 14, j2iVar2, x340Var, true);
            } else {
                x340Var.i0(-363095512);
                j2iVar.invoke(x340Var, Integer.valueOf((i3 >> 3) & 14));
                x340Var.r(false);
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    jujVar = new juj(this, z, j2iVar, i, (byte) 0);
                }
            }
            h311VarV.d = jujVar;
        }
        j2iVar2 = j2iVar;
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            jujVar = new juj(this, z, j2iVar2, i, (byte) 1);
            h311VarV.d = jujVar;
        }
    }

    public final void e(xfx xfxVar, lzn0 lzn0Var, jzg1 jzg1Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-820351842);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(xfxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(lzn0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(jzg1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = q1o1.u(new ozg1(upo1.x(xfxVar.e), lzn0Var, this.c, this.d), (qim0) null, (FrameLayout.LayoutParams) null, 7);
                x340Var.s0(objT);
            }
            otw.c((xpw) objT, tho1.y(jzg1Var), (qim0) null, (ipb1) null, x340Var, 0, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c2i(i, this, xfxVar, lzn0Var, jzg1Var, (byte) 3);
        }
    }
}
