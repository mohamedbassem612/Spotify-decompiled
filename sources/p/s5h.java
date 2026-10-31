package p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract class s5h implements jly0 {
    public static y6p a(ll3 ll3Var) {
        return new y6p(ll3Var);
    }

    public static b7p b(vi2 vi2Var) {
        return new b7p(vi2Var);
    }

    public static llm c(q8n q8nVar) {
        return us71.h(q8nVar);
    }

    public static h21 d(ynb0 ynb0Var) {
        return new h21(ynb0Var, (byte) 15);
    }

    public static t8c e(ynb0 ynb0Var) {
        t8c t8cVar = new t8c((byte) 24);
        t8cVar.b = ynb0Var;
        return t8cVar;
    }

    public static odc f(ynb0 ynb0Var, ynb0 ynb0Var2) {
        odc odcVar = new odc((byte) 9);
        odcVar.b = ynb0Var;
        odcVar.c = ynb0Var2;
        return odcVar;
    }

    public static amh g(jo80 jo80Var, kly0 kly0Var, jo80 jo80Var2, kly0 kly0Var2, caq caqVar, caq caqVar2, jly0 jly0Var, kly0 kly0Var3, kly0 kly0Var4, kly0 kly0Var5, jly0 jly0Var2, caq caqVar3) {
        amh amhVar = new amh();
        amhVar.a = jo80Var;
        amhVar.b = kly0Var;
        amhVar.c = jo80Var2;
        amhVar.d = kly0Var2;
        amhVar.e = caqVar;
        amhVar.f = caqVar2;
        amhVar.g = jly0Var;
        amhVar.h = kly0Var3;
        amhVar.i = kly0Var4;
        amhVar.j = kly0Var5;
        amhVar.k = jly0Var2;
        amhVar.l = caqVar3;
        return amhVar;
    }

    public static bnh h(kly0 kly0Var, kly0 kly0Var2, caq caqVar, kly0 kly0Var3, jo80 jo80Var, jly0 jly0Var, jly0 jly0Var2, kly0 kly0Var4, jly0 jly0Var3, kly0 kly0Var5, jly0 jly0Var4, g5t g5tVar, kly0 kly0Var6, caq caqVar2, caq caqVar3, jly0 jly0Var5, jo80 jo80Var2, jly0 jly0Var6, kly0 kly0Var7, g5t g5tVar2, caq caqVar4, kly0 kly0Var8, jly0 jly0Var7, jly0 jly0Var8, caq caqVar5, kly0 kly0Var9, jly0 jly0Var9, caq caqVar6, caq caqVar7, jly0 jly0Var10, jly0 jly0Var11, caq caqVar8, caq caqVar9, caq caqVar10, caq caqVar11) {
        bnh bnhVar = new bnh();
        bnhVar.a = kly0Var;
        bnhVar.b = kly0Var2;
        bnhVar.c = caqVar;
        bnhVar.d = kly0Var3;
        bnhVar.e = jo80Var;
        bnhVar.f = jly0Var;
        bnhVar.g = jly0Var2;
        bnhVar.h = kly0Var4;
        bnhVar.i = jly0Var3;
        bnhVar.j = kly0Var5;
        bnhVar.k = jly0Var4;
        bnhVar.l = g5tVar;
        bnhVar.m = kly0Var6;
        bnhVar.n = caqVar2;
        bnhVar.o = caqVar3;
        bnhVar.f1p = jly0Var5;
        bnhVar.q = jo80Var2;
        bnhVar.r = jly0Var6;
        bnhVar.s = kly0Var7;
        bnhVar.t = g5tVar2;
        bnhVar.u = caqVar4;
        bnhVar.v = kly0Var8;
        bnhVar.w = jly0Var7;
        bnhVar.x = jly0Var8;
        bnhVar.y = caqVar5;
        bnhVar.z = kly0Var9;
        bnhVar.A = jly0Var9;
        bnhVar.B = caqVar6;
        bnhVar.C = caqVar7;
        bnhVar.D = jly0Var10;
        bnhVar.E = jly0Var11;
        bnhVar.F = caqVar8;
        bnhVar.G = caqVar9;
        bnhVar.H = caqVar10;
        bnhVar.I = caqVar11;
        return bnhVar;
    }

    public static wph i(kly0 kly0Var, jo80 jo80Var, r7q r7qVar, caq caqVar, r7q r7qVar2, r7q r7qVar3, caq caqVar2, kly0 kly0Var2, r7q r7qVar4, kly0 kly0Var3, r7q r7qVar5, caq caqVar3, r7q r7qVar6, r7q r7qVar7, r7q r7qVar8, kly0 kly0Var4, r7q r7qVar9, kly0 kly0Var5, kly0 kly0Var6, r7q r7qVar10, caq caqVar4, g5t g5tVar, g5t g5tVar2, caq caqVar5, caq caqVar6, kly0 kly0Var7, caq caqVar7, r7q r7qVar11, kly0 kly0Var8, kly0 kly0Var9, r7q r7qVar12, r7q r7qVar13, caq caqVar8, caq caqVar9, caq caqVar10) {
        wph wphVar = new wph();
        wphVar.a = kly0Var;
        wphVar.b = jo80Var;
        wphVar.c = r7qVar;
        wphVar.d = caqVar;
        wphVar.e = r7qVar2;
        wphVar.f = r7qVar3;
        wphVar.g = caqVar2;
        wphVar.h = kly0Var2;
        wphVar.i = r7qVar4;
        wphVar.j = kly0Var3;
        wphVar.k = r7qVar5;
        wphVar.l = caqVar3;
        wphVar.m = r7qVar6;
        wphVar.n = r7qVar7;
        wphVar.o = r7qVar8;
        wphVar.f17p = kly0Var4;
        wphVar.q = r7qVar9;
        wphVar.r = kly0Var5;
        wphVar.s = kly0Var6;
        wphVar.t = r7qVar10;
        wphVar.u = caqVar4;
        wphVar.v = g5tVar;
        wphVar.w = g5tVar2;
        wphVar.x = caqVar5;
        wphVar.y = caqVar6;
        wphVar.z = kly0Var7;
        wphVar.A = caqVar7;
        wphVar.B = r7qVar11;
        wphVar.C = kly0Var8;
        wphVar.D = kly0Var9;
        wphVar.E = r7qVar12;
        wphVar.F = r7qVar13;
        wphVar.G = caqVar8;
        wphVar.H = caqVar9;
        wphVar.I = caqVar10;
        return wphVar;
    }

    public static bvj j(caq caqVar, kly0 kly0Var, r7q r7qVar, caq caqVar2) {
        bvj bvjVar = new bvj((byte) 11);
        bvjVar.b = caqVar;
        bvjVar.c = kly0Var;
        bvjVar.d = r7qVar;
        bvjVar.e = caqVar2;
        return bvjVar;
    }

    public static r5h k(RxRouter rxRouter) {
        return new r5h(new CosmosTransport(new sn0(rxRouter, (byte) 9)));
    }

    public static p8h l(ynb0 ynb0Var, ynb0 ynb0Var2, ynb0 ynb0Var3, k85 k85Var) {
        int iOrdinal = k85Var.a().ordinal();
        if (iOrdinal != 1) {
            return iOrdinal != 2 ? (p8h) ynb0Var.get() : (p8h) ynb0Var3.get();
        }
        return (p8h) ynb0Var2.get();
    }

    public static rfx m(yqg yqgVar, i8h1 i8h1Var, hwe1 hwe1Var, xfx xfxVar, l6h1 l6h1Var, xjh xjhVar, f4q f4qVar) {
        return new rfx(new uxj(f4qVar, hwe1Var, i8h1Var, l6h1Var), yqgVar, xjhVar, xfxVar.c);
    }

    public static pp n(xfx xfxVar) {
        return new pp(xfxVar.c, (byte) 22);
    }

    public static krh o(y6p y6pVar) {
        return y6pVar.a();
    }

    public static orh p(y6p y6pVar) {
        return new orh(y6pVar.a(), (q8n) y6pVar.a.b.get());
    }

    public static uwh q(b7p b7pVar) {
        uwh uwhVar = (uwh) b7pVar.b.get();
        c8o.m(uwhVar);
        return uwhVar;
    }

    public static lwh r(k9k k9kVar) {
        bxd bxdVar = (bxd) k9kVar.b;
        gw70 gw70VarB = bxdVar.b();
        c8o.l(gw70VarB);
        woa woaVarP = bxdVar.p();
        c8o.l(woaVarP);
        kma kmaVarE0 = bxdVar.e0();
        c8o.l(kmaVarE0);
        vhy vhyVarR = bxdVar.r();
        c8o.l(vhyVarR);
        return new lwh(gw70VarB, woaVarP, kmaVarE0, vhyVarR, bxdVar.n(), (z6p) ((jly0) k9kVar.e).get());
    }

    public static x981 s(b7p b7pVar) {
        return new x981((uwh) b7pVar.b.get(), b7pVar.a(), new qi4(false, false, (luk) b7pVar.a.g.get()).b());
    }

    public static veu0 t(b7p b7pVar) {
        return new veu0((uwh) b7pVar.b.get(), b7pVar.a(), new qi4(false, false, (luk) b7pVar.a.g.get()));
    }

    public static lpd u(nzp nzpVar) {
        return new lpd(nzpVar, (byte) 14);
    }

    public static zfx v(xfx xfxVar) {
        return new zfx(xfxVar.c, (byte) 20);
    }

    public static ldi1 w(RetrofitMaker retrofitMaker) {
        return (ldi1) retrofitMaker.createWebgateService(ldi1.class, "android-podcast-interactivity-comments-data-impl");
    }
}
