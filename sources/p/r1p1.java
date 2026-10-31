package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class r1p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(Function0 function0, Function0 function1, Function0 function2, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1672174588);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(function1) ? 32 : 16) | (x340Var.i(function2) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new ukf(function2, (byte) 16);
                x340Var.s0(objT);
            }
            mqo1.e((Function0) objT, null, null, xci.a, xci.b, apo.r(1355895942, new wm(function0, (byte) 25), x340Var), apo.r(1934662087, new wm(function1, (byte) 26), x340Var), x340Var, 1797120, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w96(function0, function1, function2, i, (byte) 1);
        }
    }

    public static final void b(String str, Function0 function0, qim0 qim0Var, Function0 function1, j2i j2iVar, b0k b0kVar, int i, int i2) {
        Function0 function2;
        int i3;
        j2i j2iVar2;
        qim0 qim0Var2;
        Function0 function3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2156751);
        int i4 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16);
        int i5 = i4 | 384;
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 = i4 | 3456;
            function2 = function1;
        } else {
            function2 = function1;
            i3 = i5 | (x340Var.i(function2) ? 2048 : 1024);
        }
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            if (i6 != 0) {
                function2 = null;
            }
            Function0 function4 = function2;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var);
            }
            jtr jtrVar = jtr.f;
            pm31 pm31Var = new pm31(0);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("share_sheet_item_tag", bin.y(qim0Var3, (idn0) objT, jtrVar, true, null, pm31Var, null, function4, function0, 424));
            boolean z = (i3 & 14) == 4;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new pg61(str, (byte) 12);
                x340Var.s0(objT2);
            }
            j2iVar2 = j2iVar;
            v1p1.b(48, 0, apo.r(-1481204374, new j2r0(j2iVar2, (byte) 15), x340Var), x340Var, s161.a(qim0VarN, (iu30) objT2));
            qim0Var2 = qim0Var3;
            function3 = function4;
        } else {
            j2iVar2 = j2iVar;
            x340Var.b0();
            qim0Var2 = qim0Var;
            function3 = function2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ik2(str, function0, qim0Var2, function3, j2iVar2, i, i2);
        }
    }

    public static final void c(int i, j2i j2iVar, b0k b0kVar, vu30 vu30Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1211856952);
        int i2 = (x340Var.i(vu30Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            nyx.a(2, (wux) null, apo.r(1589121477, new a61(vu30Var, j2iVar, (byte) 3), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new a61(vu30Var, j2iVar, i, (byte) 4);
        }
    }

    public static final Class d(pim0 pim0Var) {
        return pim0Var.getClass();
    }

    public static uw0 e(wd01 wd01Var, xd01 xd01Var, q7r0 q7r0Var, rih1 rih1Var) {
        wd01Var.getClass();
        rih1Var.getClass();
        return new uw0(wd01Var, xd01Var, q7r0Var);
    }

    public static final long f() {
        return System.currentTimeMillis();
    }

    public static final String g(String str) {
        return "spotify:list:listening-party:".concat(str);
    }

    public static final go80 h(klm klmVar, xbp0 xbp0Var, ybp0 ybp0Var, xbp0 xbp0Var2) {
        return klmVar.a("PassthroughAdsDetectorDaemon", new iyo0(xbp0Var, ybp0Var, xbp0Var2, (byte) 27));
    }

    public static final boolean i(boolean z, boolean z2, boolean z3, ibk0 ibk0Var, boolean z4) {
        boolean z5 = !z4 && z2 && ibk0Var.b();
        ebk0 ebk0Var = ebk0.a;
        return (z5 || (z4 && z2 && ibk0Var.equals(ebk0Var)) || (z4 && ibk0Var.b() && !ibk0Var.equals(ebk0Var) && z2 && z)) && z3;
    }

    public static final au70 j() {
        if (gv70.a[l1d.C(1)] == 1) {
            return new au70();
        }
        eg.o();
        return null;
    }

    public static final wkc1 k(c3f1 c3f1Var) {
        String str = c3f1Var.a;
        return new wkc1(str, c3f1Var.c, ihc1.h0(str, "podcasts-following", false) ? "FOLLOW" : "EVO");
    }

    public static final Class l(ClassLoader classLoader, String str) {
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final vdj1 m(kl20 kl20Var, di4 di4Var) {
        boolean z = true;
        if (kl20Var == kl20.t) {
            if (!di4Var.q0() && di4Var.s0() == ci4.b) {
                z = false;
            }
            return new vdj1(z, di4Var.q0(), false);
        }
        if (kl20Var != kl20.U0) {
            if (kl20Var.b) {
                return new vdj1(true, true, false);
            }
            return null;
        }
        vdj1 vdj1Var = new vdj1(true, true, true);
        if (jon1.i(kl20Var, di4Var).a) {
            return vdj1Var;
        }
        return null;
    }
}
