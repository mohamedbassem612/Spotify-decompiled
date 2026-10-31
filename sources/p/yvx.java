package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class yvx {
    public static final cr31 a = er31.b(6.0f);

    public static final void a(hfx hfxVar, uyx uyxVar, dvx dvxVar, vu30 vu30Var, b0k b0kVar, int i) {
        hfx hfxVar2;
        dah dahVarF;
        m4c m4cVar = fkj0.X;
        afx afxVar = hfxVar.a;
        wgx wgxVar = afxVar.d;
        ohx ohxVar = afxVar.c;
        icx icxVar = afxVar.a;
        yxx yxxVar = afxVar.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1792275762);
        int i2 = i | (x340Var.g(hfxVar) ? 4 : 2) | (x340Var.i(uyxVar) ? 32 : 16) | (x340Var.g(dvxVar) ? 256 : 128) | (x340Var.i(vu30Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zY = c2p1.y(x340Var);
            boolean zG = x340Var.g(afxVar) | x340Var.h(zY);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                if (zY) {
                    long j = yxxVar.a;
                    long j2 = icxVar.c;
                    ixx ixxVar = icxVar.a;
                    long j3 = yxxVar.b;
                    long j4 = yxxVar.c;
                    long j5 = ohxVar.a;
                    long jA = icxVar.b.a();
                    long j6 = yxxVar.b;
                    long j7 = yxxVar.a;
                    long j8 = icxVar.d;
                    long j9 = yxxVar.d;
                    long j10 = icxVar.c;
                    long j11 = wgxVar.b;
                    long j12 = wgxVar.a;
                    uwr uwrVar = cbx.a;
                    dahVarF = eah.c(j, j2, j, j2, j2, j4, j5, j4, j5, j3, j2, j3, j2, j2, j, j2, j, jA, j6, j7, j7, j8, j9, j10, j9, j10, j11, j12, ((vex) zex.a.e).f, j8, ixxVar.a(), ixxVar.a(), ixxVar.a(), ixxVar.a(), ixxVar.a(), 0, 65528);
                } else {
                    long j13 = yxxVar.a;
                    long j14 = icxVar.c;
                    ixx ixxVar2 = icxVar.a;
                    long j15 = yxxVar.b;
                    long j16 = yxxVar.c;
                    long j17 = ohxVar.a;
                    long jA2 = icxVar.b.a();
                    long j18 = yxxVar.b;
                    long j19 = yxxVar.a;
                    long j20 = icxVar.d;
                    long j21 = yxxVar.d;
                    long j22 = icxVar.c;
                    long j23 = wgxVar.b;
                    long j24 = wgxVar.a;
                    uwr uwrVar2 = cbx.a;
                    dahVarF = eah.f(j13, j14, j13, j14, j14, j16, j17, j16, j17, j15, j14, j15, j14, j14, j13, j14, j13, jA2, j18, j19, j19, j20, j21, j22, j21, j22, j23, j24, ((vex) zex.a.e).f, ixxVar2.a(), ixxVar2.a(), ixxVar2.a(), ixxVar2.a(), ixxVar2.a(), 536870912, 65528);
                }
                x340Var = x340Var;
                objT = dahVarF;
                x340Var.s0(objT);
            }
            dah dahVar = (dah) objT;
            boolean z = (i2 & 896) == 256;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                lee1 lee1Var = uyxVar.a;
                lee1 lee1Var2 = uyxVar.b;
                lee1 lee1Var3 = uyxVar.c;
                lee1 lee1Var4 = uyxVar.d;
                lee1 lee1Var5 = uyxVar.e;
                lee1 lee1Var6 = uyxVar.h;
                lee1 lee1Var7 = uyxVar.k;
                lee1 lee1Var8 = uyxVar.g;
                lee1 lee1Var9 = uyxVar.j;
                objT2 = new k2h1(lee1Var, lee1Var2, lee1Var2, lee1Var3, lee1Var3, lee1Var4, lee1Var5, lee1Var6, lee1Var7, lee1Var8, lee1Var6, lee1Var9, lee1Var7, lee1Var7, lee1Var2, lee1Var, lee1Var2, lee1Var2, lee1Var3, lee1Var3, lee1Var4, lee1Var5, lee1Var6, lee1Var7, lee1Var8, lee1Var6, lee1Var9, lee1Var7, lee1Var7, lee1Var2);
                x340Var.s0(objT2);
            }
            k2h1 k2h1Var = (k2h1) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                cr31 cr31Var = a;
                mx61 mx61Var = new mx61(cr31Var, cr31Var, cr31Var, cr31Var, cr31Var);
                x340Var.s0(mx61Var);
                objT3 = mx61Var;
            }
            hfxVar2 = hfxVar;
            ich0.b(dahVar, (mx61) objT3, k2h1Var, apo.r(-27200802, new g6w(hfxVar2, uyxVar, vu30Var, (byte) 12), x340Var), x340Var, 3072, 0);
        } else {
            hfxVar2 = hfxVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qfx(i, hfxVar2, uyxVar, dvxVar, vu30Var, (byte) 3);
        }
    }
}
