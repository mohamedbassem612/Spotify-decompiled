package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class nyx {
    public static final kiv a = mod.t(oxx.c);
    public static final kiv b = mod.t(oxx.d);
    public static final kiv c = mod.h(oxx.e);

    public static final void a(int i, wux wuxVar, vu30 vu30Var, b0k b0kVar, int i2, int i3) {
        bvx bvxVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if ((i3 & 1) != 0) {
            i = 1;
        }
        wux wuxVarA = null;
        if ((i3 & 2) != 0) {
            wuxVar = null;
        }
        x340 x340Var = (x340) b0kVar;
        bvx bvxVar2 = (bvx) x340Var.k(b);
        bvx bvxVar3 = bvx.a;
        if (wuxVar != null) {
            bvxVar = bvx.b;
        } else {
            bvxVar = bvxVar2 == null ? bvxVar3 : bvxVar2;
        }
        if (wuxVar == null && bvxVar == bvxVar3) {
            x340Var.i0(1668355531);
            wuxVarA = xux.a(x340Var);
            x340Var.r(false);
        } else {
            x340Var.i0(1668521567);
            x340Var.r(false);
        }
        if (bvxVar2 == null || wuxVarA == null) {
            x340Var.i0(1668672935);
            x340Var.r(false);
            z = false;
        } else {
            x340Var.i0(-1331645202);
            z = !(wuxVarA == x340Var.k(xux.a));
            x340Var.r(false);
        }
        x340Var.i0(-1331642132);
        if (bvxVar2 != null) {
            if (i != 1) {
                x340Var.i0(-1331638691);
                z2 = !u890.j(rjx.m(i), x340Var.k(a));
                x340Var.r(false);
            } else {
                x340Var.i0(1668874776);
                x340Var.r(false);
                z2 = false;
            }
            if (!z2) {
                if (wuxVar != null) {
                    x340Var.i0(-1331636066);
                    z3 = !(wuxVar == x340Var.k(xux.a));
                    x340Var.r(false);
                } else {
                    x340Var.i0(1668956151);
                    x340Var.r(false);
                    z3 = false;
                }
                if (!z3 && !z && bvxVar == bvxVar2) {
                    z4 = false;
                }
            }
        }
        x340Var.r(false);
        if (!z4) {
            x340Var.i0(1669641566);
            us71.j((i2 >> 9) & 14, vu30Var, x340Var, false);
            return;
        }
        x340Var.i0(1669432254);
        if (wuxVar == null) {
            wuxVar = wuxVarA;
        }
        if (wuxVar == null) {
            x340Var.i0(-1331616616);
            wuxVar = (wux) x340Var.k(xux.a);
        } else {
            x340Var.i0(-1331618755);
        }
        x340Var.r(false);
        b(i, wuxVar, bvxVar, vu30Var, x340Var, i2 & 7182);
        x340Var.r(false);
    }

    public static final void b(int i, wux wuxVar, bvx bvxVar, vu30 vu30Var, b0k b0kVar, int i2) {
        int i3;
        bvx bvxVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-620308357);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.e(l1d.C(i)) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.g(wuxVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.e(bvxVar.ordinal()) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(vu30Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            hfx hfxVarM = rjx.m(i);
            kiv kivVar = a;
            if (hfxVarM == null) {
                x340Var.i0(884129890);
                hfxVarM = (hfx) x340Var.k(kivVar);
            } else {
                x340Var.i0(884128743);
            }
            x340Var.r(false);
            uyx uyxVarB = wwo1.B(wuxVar.a, x340Var);
            bvxVar2 = bvxVar;
            ely0 ely0VarA = b.a(bvxVar2);
            ely0 ely0VarA2 = kivVar.a(hfxVarM);
            ely0 ely0VarA3 = c.a(uyxVarB);
            ely0 ely0VarA4 = gfx.a.a(hfxVarM.a);
            kiv kivVar2 = mde0.a;
            uwr uwrVar = cbx.a;
            mod.c(new ely0[]{ely0VarA, ely0VarA2, ely0VarA3, ely0VarA4, kivVar2.a(cbx.c(x340Var)), xux.a.a(wuxVar), qgx.a.a(new u7h(hfxVarM.a.b.a)), rgx.a.a(uyxVarB.g)}, apo.r(486235451, new qfx(wuxVar, hfxVarM, uyxVarB, vu30Var, (byte) 5), x340Var), x340Var, 56);
        } else {
            bvxVar2 = bvxVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk0(i, wuxVar, bvxVar2, vu30Var, i2, (byte) 7);
        }
    }
}
