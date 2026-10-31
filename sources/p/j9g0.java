package p;

import android.os.Handler;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import com.spotify.tome.pageactivity.PageActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class j9g0 implements jly0 {
    public static erp a(uy2 uy2Var) {
        return new erp(uy2Var);
    }

    public static gzc0 b(ynb0 ynb0Var) {
        gzc0 gzc0Var = new gzc0((byte) 14);
        gzc0Var.b = ynb0Var;
        return gzc0Var;
    }

    public static jkg0 c(r7q r7qVar, caq caqVar, caq caqVar2, caq caqVar3, kly0 kly0Var, kly0 kly0Var2, kly0 kly0Var3, caq caqVar4, caq caqVar5, caq caqVar6, caq caqVar7, jo80 jo80Var, caq caqVar8, caq caqVar9, caq caqVar10, caq caqVar11, caq caqVar12, r7q r7qVar2, g5t g5tVar, caq caqVar13, caq caqVar14, g5t g5tVar2, caq caqVar15, caq caqVar16, caq caqVar17) {
        jkg0 jkg0Var = new jkg0();
        jkg0Var.a = r7qVar;
        jkg0Var.b = caqVar;
        jkg0Var.c = caqVar2;
        jkg0Var.d = caqVar3;
        jkg0Var.e = kly0Var;
        jkg0Var.f = kly0Var2;
        jkg0Var.g = kly0Var3;
        jkg0Var.h = caqVar4;
        jkg0Var.i = caqVar5;
        jkg0Var.j = caqVar6;
        jkg0Var.k = caqVar7;
        jkg0Var.l = jo80Var;
        jkg0Var.m = caqVar8;
        jkg0Var.n = caqVar9;
        jkg0Var.o = caqVar10;
        jkg0Var.f13p = caqVar11;
        jkg0Var.q = caqVar12;
        jkg0Var.r = r7qVar2;
        jkg0Var.s = g5tVar;
        jkg0Var.t = caqVar13;
        jkg0Var.u = caqVar14;
        jkg0Var.v = g5tVar2;
        jkg0Var.w = caqVar15;
        jkg0Var.x = caqVar16;
        jkg0Var.y = caqVar17;
        return jkg0Var;
    }

    public static pwg0 d(kly0 kly0Var, caq caqVar, caq caqVar2, kly0 kly0Var2, caq caqVar3, g5t g5tVar, r7q r7qVar, g5t g5tVar2, caq caqVar4) {
        pwg0 pwg0Var = new pwg0();
        pwg0Var.a = kly0Var;
        pwg0Var.b = caqVar;
        pwg0Var.c = caqVar2;
        pwg0Var.d = kly0Var2;
        pwg0Var.e = caqVar3;
        pwg0Var.f = g5tVar;
        pwg0Var.g = r7qVar;
        pwg0Var.h = g5tVar2;
        pwg0Var.i = caqVar4;
        return pwg0Var;
    }

    public static h6h0 e(caq caqVar, caq caqVar2, caq caqVar3, caq caqVar4, caq caqVar5, g5t g5tVar, jly0 jly0Var, caq caqVar6, jly0 jly0Var2, kly0 kly0Var, kly0 kly0Var2, caq caqVar7, jly0 jly0Var3, caq caqVar8, caq caqVar9, jly0 jly0Var4, caq caqVar10, caq caqVar11, kly0 kly0Var3, kly0 kly0Var4, kly0 kly0Var5, kly0 kly0Var6, kly0 kly0Var7, kly0 kly0Var8, kly0 kly0Var9, kly0 kly0Var10, jly0 jly0Var5, kly0 kly0Var11, jly0 jly0Var6, jly0 jly0Var7, caq caqVar12, caq caqVar13, jly0 jly0Var8, jly0 jly0Var9, jly0 jly0Var10, caq caqVar14, kly0 kly0Var12, kly0 kly0Var13, kly0 kly0Var14, caq caqVar15, caq caqVar16, kly0 kly0Var15, jo80 jo80Var, kly0 kly0Var16, jly0 jly0Var11, kly0 kly0Var17, jly0 jly0Var12, jly0 jly0Var13, caq caqVar17, caq caqVar18, caq caqVar19, kly0 kly0Var18, kly0 kly0Var19, caq caqVar20, caq caqVar21, caq caqVar22, caq caqVar23, kly0 kly0Var20, g5t g5tVar2, jly0 jly0Var14, kly0 kly0Var21, jly0 jly0Var15, caq caqVar24) {
        h6h0 h6h0Var = new h6h0();
        h6h0Var.a = caqVar;
        h6h0Var.b = caqVar2;
        h6h0Var.c = caqVar3;
        h6h0Var.d = caqVar4;
        h6h0Var.e = caqVar5;
        h6h0Var.f = g5tVar;
        h6h0Var.g = jly0Var;
        h6h0Var.h = caqVar6;
        h6h0Var.i = jly0Var2;
        h6h0Var.j = kly0Var;
        h6h0Var.k = kly0Var2;
        h6h0Var.l = caqVar7;
        h6h0Var.m = jly0Var3;
        h6h0Var.n = caqVar8;
        h6h0Var.o = caqVar9;
        h6h0Var.f8p = jly0Var4;
        h6h0Var.q = caqVar10;
        h6h0Var.r = caqVar11;
        h6h0Var.s = kly0Var3;
        h6h0Var.t = kly0Var4;
        h6h0Var.u = kly0Var5;
        h6h0Var.v = kly0Var6;
        h6h0Var.w = kly0Var7;
        h6h0Var.x = kly0Var8;
        h6h0Var.y = kly0Var9;
        h6h0Var.z = kly0Var10;
        h6h0Var.A = jly0Var5;
        h6h0Var.B = kly0Var11;
        h6h0Var.C = jly0Var6;
        h6h0Var.D = jly0Var7;
        h6h0Var.E = caqVar12;
        h6h0Var.F = caqVar13;
        h6h0Var.G = jly0Var8;
        h6h0Var.H = jly0Var9;
        h6h0Var.I = jly0Var10;
        h6h0Var.J = caqVar14;
        h6h0Var.K = kly0Var12;
        h6h0Var.L = kly0Var13;
        h6h0Var.M = kly0Var14;
        h6h0Var.N = caqVar15;
        h6h0Var.O = caqVar16;
        h6h0Var.P = kly0Var15;
        h6h0Var.Q = jo80Var;
        h6h0Var.R = kly0Var16;
        h6h0Var.S = jly0Var11;
        h6h0Var.T = kly0Var17;
        h6h0Var.U = jly0Var12;
        h6h0Var.V = jly0Var13;
        h6h0Var.W = caqVar17;
        h6h0Var.X = caqVar18;
        h6h0Var.Y = caqVar19;
        h6h0Var.Z = kly0Var18;
        h6h0Var.a0 = kly0Var19;
        h6h0Var.b0 = caqVar20;
        h6h0Var.c0 = caqVar21;
        h6h0Var.d0 = caqVar22;
        h6h0Var.e0 = caqVar23;
        h6h0Var.f0 = kly0Var20;
        h6h0Var.g0 = g5tVar2;
        h6h0Var.h0 = jly0Var14;
        h6h0Var.i0 = kly0Var21;
        h6h0Var.j0 = jly0Var15;
        h6h0Var.k0 = caqVar24;
        return h6h0Var;
    }

    public static gzc0 f(ynb0 ynb0Var) {
        gzc0 gzc0Var = new gzc0((byte) 16);
        gzc0Var.b = ynb0Var;
        return gzc0Var;
    }

    public static gzc0 g(ynb0 ynb0Var) {
        gzc0 gzc0Var = new gzc0((byte) 17);
        gzc0Var.b = ynb0Var;
        return gzc0Var;
    }

    public static wr2 h(erp erpVar) {
        return new wr2((vt2) erpVar.b.get());
    }

    public static qt2 i(erp erpVar) {
        uy2 uy2Var = erpVar.a;
        return new qt2(uy2Var.b(), uy2Var.a());
    }

    public static gy2 j(erp erpVar) {
        gy2 gy2Var = (gy2) erpVar.c.get();
        c8o.m(gy2Var);
        return gy2Var;
    }

    public static dlf k(erp erpVar) {
        dlf dlfVar = (dlf) erpVar.d.get();
        c8o.m(dlfVar);
        return dlfVar;
    }

    public static a2n l(erp erpVar) {
        uy2 uy2Var = erpVar.a;
        return new a2n(uy2Var.c(), uy2Var.a(), (gy2) erpVar.c.get(), (dlf) erpVar.d.get(), (c9n) erpVar.e.get());
    }

    public static yrn m(erp erpVar) {
        yrn yrnVar = (yrn) erpVar.f.get();
        c8o.m(yrnVar);
        return yrnVar;
    }

    public static s880 n(ynb0 ynb0Var, y7p y7pVar, z7p z7pVar, g0l g0lVar, l7s l7sVar, y7l y7lVar, ilr ilrVar, q8n q8nVar) {
        return new s880(y7pVar, z7pVar, ynb0Var, g0lVar, l7sVar, y7lVar, ilrVar, q8nVar);
    }

    public static owg0 o() {
        owg0 owg0Var = new owg0();
        owg0Var.a = z6x.a;
        return owg0Var;
    }

    public static int p(kr4 kr4Var) {
        int iOrdinal = kr4Var.a().ordinal();
        if (iOrdinal == 0) {
            return 1;
        }
        if (iOrdinal == 1) {
            return 2;
        }
        if (iOrdinal == 2) {
            return 3;
        }
        eg.o();
        return 0;
    }

    public static wsg0 q(b8p1 b8p1Var) {
        int iC = l1d.C(b8p1Var.b);
        if (iC == 0) {
            return (wsg0) ((kly0) b8p1Var.c).get();
        }
        if (iC == 1) {
            return (wsg0) ((kly0) b8p1Var.d).get();
        }
        if (iC == 2) {
            return (wsg0) ((kly0) b8p1Var.e).get();
        }
        eg.o();
        return null;
    }

    public static brp r(luk lukVar, i8h1 i8h1Var) {
        return new brp(new fad0(lukVar, i8h1Var, (byte) 20));
    }

    public static xug0 s(brp brpVar) {
        xug0 xug0Var = (xug0) brpVar.b.get();
        c8o.m(xug0Var);
        return xug0Var;
    }

    public static cyg0 t(brp brpVar) {
        i8h1 i8h1Var = (i8h1) brpVar.a.c;
        c8o.l(i8h1Var);
        return new cyg0(i8h1Var);
    }

    public static b6h0 u() {
        return new b6h0();
    }

    public static p7h0 v(yun0 yun0Var, hds hdsVar, lzn0 lzn0Var, PageActivity pageActivity) {
        return new p7h0(yun0Var, hdsVar, lzn0Var, pageActivity);
    }

    public static fnh0 w(Handler handler, mw7 mw7Var, jnh0 jnh0Var, j54 j54Var) {
        return new fnh0(mw7Var, handler, jnh0Var, j54Var.a());
    }

    public static jnh0 x(Handler handler) {
        return new jnh0(handler);
    }

    public static be y(RxRouter rxRouter) {
        return new be(new CosmosTransport(new sn0(rxRouter, (byte) 27)));
    }
}
