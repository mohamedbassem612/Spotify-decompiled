package p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.android.plugins.RxAndroidPlugins;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class wyj implements jly0 {
    public static lpd A(h0q h0qVar) {
        return new lpd(h0qVar, (byte) 18);
    }

    public static lpd B(b1q b1qVar) {
        return new lpd(b1qVar, (byte) 17);
    }

    public static lc20 C() {
        unk.a.getClass();
        lc20 lc20Var = tnk.b;
        c8o.m(lc20Var);
        return lc20Var;
    }

    public static bhh1 D() {
        bhh1 bhh1Var = igu.b;
        c8o.m(bhh1Var);
        return bhh1Var;
    }

    public static r7p a() {
        return new r7p();
    }

    public static h21 b(ynb0 ynb0Var) {
        return new h21(ynb0Var, (byte) 16);
    }

    public static odc c(ynb0 ynb0Var, ynb0 ynb0Var2) {
        odc odcVar = new odc((byte) 11);
        odcVar.b = ynb0Var;
        odcVar.c = ynb0Var2;
        return odcVar;
    }

    public static syj d(caq caqVar, caq caqVar2, jly0 jly0Var, kly0 kly0Var) {
        syj syjVar = new syj((byte) 1);
        syjVar.b = caqVar;
        syjVar.c = kly0Var;
        syjVar.d = jly0Var;
        syjVar.e = caqVar2;
        return syjVar;
    }

    public static syj e(caq caqVar, kly0 kly0Var, r7q r7qVar, caq caqVar2) {
        syj syjVar = new syj((byte) 0);
        syjVar.b = caqVar;
        syjVar.c = kly0Var;
        syjVar.d = r7qVar;
        syjVar.e = caqVar2;
        return syjVar;
    }

    public static uyj f(caq caqVar, caq caqVar2, jly0 jly0Var, kly0 kly0Var) {
        uyj uyjVar = new uyj((byte) 17);
        uyjVar.b = caqVar;
        uyjVar.c = kly0Var;
        uyjVar.d = jly0Var;
        uyjVar.e = caqVar2;
        return uyjVar;
    }

    public static uyj g(caq caqVar, kly0 kly0Var, r7q r7qVar, caq caqVar2) {
        uyj uyjVar = new uyj((byte) 15);
        uyjVar.b = caqVar;
        uyjVar.c = kly0Var;
        uyjVar.d = r7qVar;
        uyjVar.e = caqVar2;
        return uyjVar;
    }

    public static j0k h(r7q r7qVar, r7q r7qVar2, r7q r7qVar3, kly0 kly0Var, kly0 kly0Var2, kly0 kly0Var3, caq caqVar, r7q r7qVar4, r7q r7qVar5, r7q r7qVar6, jo80 jo80Var, r7q r7qVar7, caq caqVar2, caq caqVar3, r7q r7qVar8, r7q r7qVar9, kly0 kly0Var4, kly0 kly0Var5, caq caqVar4, kly0 kly0Var6, r7q r7qVar10, g5t g5tVar, r7q r7qVar11, kly0 kly0Var7, kly0 kly0Var8, jly0 jly0Var) {
        j0k j0kVar = new j0k();
        j0kVar.a = r7qVar;
        j0kVar.b = r7qVar2;
        j0kVar.c = r7qVar3;
        j0kVar.d = kly0Var;
        j0kVar.e = kly0Var2;
        j0kVar.f = kly0Var3;
        j0kVar.g = caqVar;
        j0kVar.h = r7qVar4;
        j0kVar.i = r7qVar5;
        j0kVar.j = r7qVar6;
        j0kVar.k = jo80Var;
        j0kVar.l = r7qVar7;
        j0kVar.m = caqVar2;
        j0kVar.n = caqVar3;
        j0kVar.o = r7qVar8;
        j0kVar.f28p = r7qVar9;
        j0kVar.q = kly0Var4;
        j0kVar.r = kly0Var5;
        j0kVar.s = caqVar4;
        j0kVar.t = kly0Var6;
        j0kVar.u = r7qVar10;
        j0kVar.v = g5tVar;
        j0kVar.w = r7qVar11;
        j0kVar.x = kly0Var7;
        j0kVar.y = kly0Var8;
        j0kVar.z = jly0Var;
        return j0kVar;
    }

    public static mjk i(jo80 jo80Var, r7q r7qVar, r7q r7qVar2, r7q r7qVar3, thq thqVar, kly0 kly0Var, caq caqVar, r7q r7qVar4, caq caqVar2, r7q r7qVar5, g5t g5tVar, jo80 jo80Var2, jly0 jly0Var, kly0 kly0Var2, kly0 kly0Var3, r7q r7qVar6, caq caqVar3, caq caqVar4, kly0 kly0Var4, gbp gbpVar, r7q r7qVar7, caq caqVar5, r7q r7qVar8, caq caqVar6, caq caqVar7, jo80 jo80Var3, r7q r7qVar9, kly0 kly0Var5, caq caqVar8, g5t g5tVar2, caq caqVar9, r7q r7qVar10, kly0 kly0Var6, r7q r7qVar11, caq caqVar10, thq thqVar2, r7q r7qVar12, caq caqVar11, gbp gbpVar2, kly0 kly0Var7, r7q r7qVar13, caq caqVar12, r7q r7qVar14, caq caqVar13, caq caqVar14, caq caqVar15, thq thqVar3, caq caqVar16, caq caqVar17, caq caqVar18, kly0 kly0Var8, kly0 kly0Var9, caq caqVar19, r7q r7qVar15, r7q r7qVar16, caq caqVar20, kly0 kly0Var10, kly0 kly0Var11, r7q r7qVar17, thq thqVar4, kly0 kly0Var12) {
        mjk mjkVar = new mjk();
        mjkVar.a = jo80Var;
        mjkVar.b = r7qVar;
        mjkVar.c = r7qVar2;
        mjkVar.d = r7qVar3;
        mjkVar.e = thqVar;
        mjkVar.f = kly0Var;
        mjkVar.g = caqVar;
        mjkVar.h = r7qVar4;
        mjkVar.i = caqVar2;
        mjkVar.j = r7qVar5;
        mjkVar.k = g5tVar;
        mjkVar.l = jo80Var2;
        mjkVar.m = jly0Var;
        mjkVar.n = kly0Var2;
        mjkVar.o = kly0Var3;
        mjkVar.f40p = r7qVar6;
        mjkVar.q = caqVar3;
        mjkVar.r = caqVar4;
        mjkVar.s = kly0Var4;
        mjkVar.t = gbpVar;
        mjkVar.u = r7qVar7;
        mjkVar.v = caqVar5;
        mjkVar.w = r7qVar8;
        mjkVar.x = caqVar6;
        mjkVar.y = caqVar7;
        mjkVar.z = jo80Var3;
        mjkVar.A = r7qVar9;
        mjkVar.B = kly0Var5;
        mjkVar.C = caqVar8;
        mjkVar.D = g5tVar2;
        mjkVar.E = caqVar9;
        mjkVar.F = r7qVar10;
        mjkVar.G = kly0Var6;
        mjkVar.H = r7qVar11;
        mjkVar.I = caqVar10;
        mjkVar.J = thqVar2;
        mjkVar.K = r7qVar12;
        mjkVar.L = caqVar11;
        mjkVar.M = gbpVar2;
        mjkVar.N = kly0Var7;
        mjkVar.O = r7qVar13;
        mjkVar.P = caqVar12;
        mjkVar.Q = r7qVar14;
        mjkVar.R = caqVar13;
        mjkVar.S = caqVar14;
        mjkVar.T = caqVar15;
        mjkVar.U = thqVar3;
        mjkVar.V = caqVar16;
        mjkVar.W = caqVar17;
        mjkVar.X = caqVar18;
        mjkVar.Y = kly0Var8;
        mjkVar.Z = kly0Var9;
        mjkVar.a0 = caqVar19;
        mjkVar.b0 = r7qVar15;
        mjkVar.c0 = r7qVar16;
        mjkVar.d0 = caqVar20;
        mjkVar.e0 = kly0Var10;
        mjkVar.f0 = kly0Var11;
        mjkVar.g0 = r7qVar17;
        mjkVar.h0 = thqVar4;
        mjkVar.i0 = kly0Var12;
        return mjkVar;
    }

    public static jok j(r7q r7qVar, caq caqVar, kly0 kly0Var, r7q r7qVar2, r7q r7qVar3, kly0 kly0Var2, kly0 kly0Var3, r7q r7qVar4, kly0 kly0Var4, r7q r7qVar5, caq caqVar2, caq caqVar3, g5t g5tVar) {
        jok jokVar = new jok();
        jokVar.a = r7qVar;
        jokVar.b = caqVar;
        jokVar.c = kly0Var;
        jokVar.d = r7qVar2;
        jokVar.e = r7qVar3;
        jokVar.f = kly0Var2;
        jokVar.g = kly0Var3;
        jokVar.h = r7qVar4;
        jokVar.i = kly0Var4;
        jokVar.j = r7qVar5;
        jokVar.k = caqVar2;
        jokVar.l = caqVar3;
        jokVar.m = g5tVar;
        return jokVar;
    }

    public static uyj k(caq caqVar, kly0 kly0Var, r7q r7qVar, caq caqVar2) {
        uyj uyjVar = new uyj((byte) 16);
        uyjVar.b = caqVar;
        uyjVar.c = kly0Var;
        uyjVar.d = r7qVar;
        uyjVar.e = caqVar2;
        return uyjVar;
    }

    public static List l(e2x0 e2x0Var, ep31 ep31Var, jd1 jd1Var, s8y0 s8y0Var) {
        return p7h.M(new k1v0[]{new k1v0(jd1Var, e2x0Var), new k1v0(s8y0Var, ep31Var)});
    }

    public static n1k m() {
        return new n1k();
    }

    public static Scheduler n() {
        Scheduler scheduler = Schedulers.b;
        c8o.m(scheduler);
        return scheduler;
    }

    public static ybk o(RetrofitMaker retrofitMaker) {
        return (ybk) retrofitMaker.createWebgateService(ybk.class, "android-system-live-events");
    }

    public static List p(v9c v9cVar, eea0 eea0Var, pvc pvcVar, sua suaVar, cua cuaVar, av8 av8Var, rgm rgmVar, gna0 gna0Var, gna0 gna0Var2, vee0 vee0Var) {
        return p7h.M(new k1v0[]{new k1v0(av8Var, v9cVar), new k1v0(gna0Var, eea0Var), new k1v0(gna0Var2, pvcVar), new k1v0(vee0Var, suaVar), new k1v0(rgmVar, cuaVar)});
    }

    public static fns q() {
        fns fnsVar = igu.a;
        c8o.m(fnsVar);
        return fnsVar;
    }

    public static List r(e2x0 e2x0Var, i2i1 i2i1Var, mhc mhcVar, oql oqlVar, nhc nhcVar, jd1 jd1Var, twa1 twa1Var, ujc1 ujc1Var, gna0 gna0Var, rgm rgmVar) {
        return p7h.M(new k1v0[]{new k1v0(ujc1Var, i2i1Var), new k1v0(gna0Var, new uve0(r6p1.u(mhcVar, nhcVar))), new k1v0(jd1Var, e2x0Var), new k1v0(twa1Var, new ypa((byte) 20, false)), new k1v0(rgmVar, oqlVar)});
    }

    public static void s() {
        fns fnsVar = igu.a;
        b3s b3sVar = b3s.c;
    }

    public static Scheduler t() {
        Scheduler scheduler = Schedulers.c;
        c8o.m(scheduler);
        return scheduler;
    }

    public static List u(eea0 eea0Var, pvc pvcVar, lhc lhcVar, gna0 gna0Var, vee0 vee0Var, gna0 gna0Var2) {
        return p7h.M(new k1v0[]{new k1v0(gna0Var, eea0Var), new k1v0(vee0Var, pvcVar), new k1v0(gna0Var2, lhcVar)});
    }

    public static List v(eea0 eea0Var, oql oqlVar, m4e0 m4e0Var, ymm0 ymm0Var, nfb nfbVar, rgm rgmVar, twa1 twa1Var, jd1 jd1Var, gna0 gna0Var, rgm rgmVar2, tpp0 tpp0Var, rgm rgmVar3) {
        k1v0 k1v0Var = new k1v0(rgmVar, new ypa((byte) 20, false));
        k1v0 k1v0Var2 = new k1v0(twa1Var, new ypa((byte) 20, false));
        k1v0 k1v0Var3 = new k1v0(jd1Var, new ypa((byte) 20, false));
        k1v0 k1v0Var4 = new k1v0(rgmVar2, new ypa((byte) 20, false));
        k1v0 k1v0Var5 = new k1v0(gna0Var, eea0Var);
        uo5 uo5Var = new uo5((vve0) r6p1.u(ymm0Var, nfbVar).b, (byte) 16);
        uo5Var.d = new uo5(m4e0Var);
        return p7h.M(new k1v0[]{k1v0Var, k1v0Var2, k1v0Var3, k1v0Var4, k1v0Var5, new k1v0(tpp0Var, new uve0(new uo5(uo5Var))), new k1v0(rgmVar3, oqlVar)});
    }

    public static q8n w() {
        return brt.x();
    }

    public static q8n x() {
        return brt.y();
    }

    public static Scheduler y() {
        Scheduler scheduler = AndroidSchedulers.a;
        RxAndroidPlugins.b(scheduler);
        return scheduler;
    }

    public static lpd z(kzp kzpVar) {
        return new lpd(kzpVar, (byte) 19);
    }
}
