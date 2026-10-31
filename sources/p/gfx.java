package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class gfx {
    public static final kiv a = mod.t(xzu.Z0);

    public static final void a(long j, long j2, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        long j3;
        int i3;
        long jP;
        long jQ;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(946675373);
        if ((i & 6) == 0) {
            i2 = (x340Var.f(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                int i4 = u7h.l;
                i3 = i2 & (-113);
                jP = nfb.p();
            } else {
                x340Var.b0();
                i3 = i2 & (-113);
                jP = j2;
            }
            int i5 = i3;
            x340Var.s();
            int i6 = ihx.f;
            u7h u7hVar = new u7h(jP);
            if (jP == 16 || ihx.c(j, jP) <= 4.45f) {
                u7hVar = null;
            }
            if (u7hVar != null) {
                jQ = u7hVar.a;
            } else {
                int i7 = u7h.l;
                jQ = ihx.c(j, nfb.q()) >= ihx.c(j, nfb.i()) ? nfb.q() : nfb.i();
            }
            spw spwVarF = ihx.f(j, jQ);
            long j4 = jQ;
            c(new afx(new icx(spwVarF, spwVarF, j, spwVarF.c(), spwVarF.b()), new yxx(j4, j4, j4, j4, j4, j4, j4), new ohx(j4, j4, j4, j4, j4, j4, j4), new wgx(j4, j4)), j2iVar, x340Var, (i5 >> 3) & 112);
            j3 = jP;
        } else {
            x340Var.b0();
            j3 = j2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bfx(j, j3, j2iVar, i);
        }
    }

    public static final void b(int i, j2i j2iVar, b0k b0kVar, int i2) {
        int i3;
        h311 h311VarV;
        cfx dfxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1634982383);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.e(l1d.C(i)) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            if (i == 19) {
                x340Var.i0(1464076135);
                j2iVar.invoke(x340Var, Integer.valueOf((i3 >> 3) & 14));
                x340Var.r(false);
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    dfxVar = new cfx(i, j2iVar, i2);
                }
            } else {
                x340Var.i0(1464178001);
                x340Var.r(false);
                c(rjx.l(x340Var, i), j2iVar, x340Var, i3 & 112);
            }
            h311VarV.d = dfxVar;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            dfxVar = new dfx(i, j2iVar, i2, (byte) 0);
            h311VarV.d = dfxVar;
        }
    }

    public static final void c(afx afxVar, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        h311 h311VarV;
        efx efxVar;
        boolean zB;
        boolean zB2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-427277442);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(afxVar) : x340Var.i(afxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            long j = afxVar.b.a;
            kiv kivVar = a;
            if (afxVar == x340Var.k(kivVar)) {
                x340Var.i0(1703244493);
                zB = z4h1.b(j, ((u7h) x340Var.k(qgx.a)).a);
                x340Var.r(false);
            } else {
                x340Var.i0(1260972968);
                x340Var.r(false);
                zB = false;
            }
            if (zB) {
                x340Var.i0(1703246311);
                zB2 = z4h1.b(j, ((u7h) x340Var.k(wrl.a)).a);
                x340Var.r(false);
            } else {
                x340Var.i0(1261029326);
                x340Var.r(false);
                zB2 = false;
            }
            if (zB2) {
                x340Var.i0(1261073382);
                j2iVar.invoke(x340Var, Integer.valueOf((i2 >> 3) & 14));
                x340Var.r(false);
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    efxVar = new efx(afxVar, j2iVar, i, (byte) 0);
                }
            } else {
                x340Var.i0(1261102212);
                x340Var.r(false);
                mod.c(new ely0[]{kivVar.a(afxVar), qgx.a.a(new u7h(j)), p3d1.o(j, wrl.a)}, j2iVar, x340Var, (i2 & 112) | 8);
            }
            h311VarV.d = efxVar;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            efxVar = new efx(afxVar, j2iVar, i, (byte) 1);
            h311VarV.d = efxVar;
        }
    }

    public static final void d(afx afxVar, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(691268621);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(afxVar) : x340Var.i(afxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            c(afxVar, j2iVar, x340Var, i2 & 126);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new efx(afxVar, j2iVar, i, (byte) 2);
        }
    }

    public static final void e(long j, long j2, long j3, long j4, long j5, j2i j2iVar, b0k b0kVar, int i) {
        j2i j2iVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1472937667);
        int i2 = i | (x340Var.f(j) ? 4 : 2) | (x340Var.f(j2) ? 32 : 16) | (x340Var.f(j3) ? 256 : 128) | (x340Var.f(j4) ? 2048 : 1024) | (x340Var.f(j5) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            int i3 = ihx.f;
            j2iVar2 = j2iVar;
            c(ihx.d(j, j2, j3, j4, j5), j2iVar2, x340Var, 48);
        } else {
            j2iVar2 = j2iVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ffx(j, j2, j3, j4, j5, j2iVar2, i);
        }
    }

    public static final void f(int i, j2i j2iVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1679707091);
        if (x340Var.Y(i & 1, (i & 3) != 2)) {
            uwr uwrVar = cbx.a;
            g(((double) z4p1.B(cbx.a(x340Var).b.a)) > 0.5d ? 8 : 7, j2iVar, x340Var, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pu2(j2iVar, i, (byte) 26);
        }
    }

    public static final void g(int i, j2i j2iVar, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1062449353);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.e(l1d.C(i)) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            mod.b(a.a(rjx.l(x340Var, i)), j2iVar, x340Var, (i3 & 112) | 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dfx(i, j2iVar, i2, (byte) 1);
        }
    }

    public static final void h(int i, j2i j2iVar, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1131453433);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.e(l1d.C(i)) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            mod.b(a.a(rjx.k(i)), j2iVar, x340Var, (i3 & 112) | 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dfx(i, j2iVar, i2, (byte) 2);
        }
    }
}
