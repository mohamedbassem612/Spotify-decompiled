package p;

import android.content.Context;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import com.spotify.puffin.core.data.filtermetadata.database.FilterMetadataDatabase;
import com.spotify.puffin.core.data.headphonefilterstate.database.HeadphoneFilterStateDatabase;
import io.reactivex.rxjava3.core.Flowable;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class imy0 implements jly0 {
    public static elq A(tbl tblVar) {
        return new elq(tblVar);
    }

    public static s4z0 B(glq glqVar) {
        fcz0 fcz0VarA = glqVar.a();
        ecz0 ecz0Var = glqVar.a;
        g5p0 g5p0VarW0 = ecz0Var.w0();
        c8o.l(g5p0VarW0);
        Flowable flowableC = ecz0Var.c();
        c8o.l(flowableC);
        vbm[] vbmVarArr = q601.a;
        return new s4z0(fcz0VarA, g5p0VarW0, new kge(flowableC), cto1.q(krw0.i), ecz0Var.A0(), ecz0Var.D0());
    }

    public static fcz0 C(glq glqVar) {
        return glqVar.a();
    }

    public static glq D(dcz0 dcz0Var) {
        return new glq(dcz0Var.create());
    }

    public static FilterMetadataDatabase a(dlq dlqVar) {
        FilterMetadataDatabase filterMetadataDatabase = (FilterMetadataDatabase) dlqVar.b.get();
        c8o.m(filterMetadataDatabase);
        return filterMetadataDatabase;
    }

    public static HeadphoneFilterStateDatabase b(dlq dlqVar) {
        HeadphoneFilterStateDatabase headphoneFilterStateDatabase = (HeadphoneFilterStateDatabase) dlqVar.c.get();
        c8o.m(headphoneFilterStateDatabase);
        return headphoneFilterStateDatabase;
    }

    public static mfb0 c(dlq dlqVar) {
        mfb0 mfb0Var = (mfb0) dlqVar.e.get();
        c8o.m(mfb0Var);
        return mfb0Var;
    }

    public static nfb0 d(dlq dlqVar) {
        nfb0 nfb0Var = (nfb0) dlqVar.d.get();
        c8o.m(nfb0Var);
        return nfb0Var;
    }

    public static l9g0 e(ynb0 ynb0Var, ynb0 ynb0Var2) {
        l9g0 l9g0Var = new l9g0((byte) 26);
        l9g0Var.b = ynb0Var;
        l9g0Var.c = ynb0Var2;
        return l9g0Var;
    }

    public static ppw0 f(ynb0 ynb0Var) {
        ppw0 ppw0Var = new ppw0((byte) 7);
        ppw0Var.b = ynb0Var;
        return ppw0Var;
    }

    public static dry0 g(caq caqVar, kly0 kly0Var, caq caqVar2, caq caqVar3, caq caqVar4, g5t g5tVar) {
        dry0 dry0Var = new dry0();
        dry0Var.a = caqVar;
        dry0Var.b = kly0Var;
        dry0Var.c = caqVar2;
        dry0Var.d = caqVar3;
        dry0Var.e = caqVar4;
        dry0Var.f = g5tVar;
        return dry0Var;
    }

    public static asy0 h(caq caqVar, kly0 kly0Var, caq caqVar2, caq caqVar3, caq caqVar4, g5t g5tVar) {
        asy0 asy0Var = new asy0();
        asy0Var.a = caqVar;
        asy0Var.b = kly0Var;
        asy0Var.c = caqVar2;
        asy0Var.d = caqVar3;
        asy0Var.e = caqVar4;
        asy0Var.f = g5tVar;
        return asy0Var;
    }

    public static jty0 i(caq caqVar, caq caqVar2, kly0 kly0Var) {
        jty0 jty0Var = new jty0();
        jty0Var.a = caqVar;
        jty0Var.b = caqVar2;
        jty0Var.c = kly0Var;
        return jty0Var;
    }

    public static ouy0 j(caq caqVar, caq caqVar2, kly0 kly0Var, caq caqVar3, caq caqVar4, caq caqVar5, caq caqVar6, caq caqVar7, g5t g5tVar, g5t g5tVar2, kly0 kly0Var2, caq caqVar8, caq caqVar9) {
        ouy0 ouy0Var = new ouy0();
        ouy0Var.a = caqVar;
        ouy0Var.b = caqVar2;
        ouy0Var.c = kly0Var;
        ouy0Var.d = caqVar3;
        ouy0Var.e = caqVar4;
        ouy0Var.f = caqVar5;
        ouy0Var.g = caqVar6;
        ouy0Var.h = caqVar7;
        ouy0Var.i = g5tVar;
        ouy0Var.j = g5tVar2;
        ouy0Var.k = kly0Var2;
        ouy0Var.l = caqVar8;
        ouy0Var.m = caqVar9;
        return ouy0Var;
    }

    public static tbz0 k(jo80 jo80Var, jo80 jo80Var2, jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3, kly0 kly0Var, jly0 jly0Var4, jly0 jly0Var5, caq caqVar, caq caqVar2, caq caqVar3, caq caqVar4, jly0 jly0Var6, jly0 jly0Var7, jly0 jly0Var8, jly0 jly0Var9, caq caqVar5, caq caqVar6, caq caqVar7, kly0 kly0Var2, caq caqVar8, kly0 kly0Var3, kly0 kly0Var4, jly0 jly0Var10, caq caqVar9, caq caqVar10, caq caqVar11, jly0 jly0Var11, g5t g5tVar, kly0 kly0Var5, caq caqVar12, caq caqVar13, jly0 jly0Var12, jly0 jly0Var13, kly0 kly0Var6, caq caqVar14, caq caqVar15, caq caqVar16, kly0 kly0Var7, caq caqVar17, jly0 jly0Var14, jly0 jly0Var15, kly0 kly0Var8, caq caqVar18, kly0 kly0Var9, caq caqVar19, caq caqVar20, caq caqVar21, kly0 kly0Var10, jly0 jly0Var16, jly0 jly0Var17, jly0 jly0Var18, jly0 jly0Var19, caq caqVar22, jly0 jly0Var20) {
        tbz0 tbz0Var = new tbz0();
        tbz0Var.a = jo80Var;
        tbz0Var.b = jo80Var2;
        tbz0Var.c = jly0Var;
        tbz0Var.d = jly0Var2;
        tbz0Var.e = jly0Var3;
        tbz0Var.f = kly0Var;
        tbz0Var.g = jly0Var4;
        tbz0Var.h = jly0Var5;
        tbz0Var.i = caqVar;
        tbz0Var.j = caqVar2;
        tbz0Var.k = caqVar3;
        tbz0Var.l = caqVar4;
        tbz0Var.m = jly0Var6;
        tbz0Var.n = jly0Var7;
        tbz0Var.o = jly0Var8;
        tbz0Var.f65p = jly0Var9;
        tbz0Var.q = caqVar5;
        tbz0Var.r = caqVar6;
        tbz0Var.s = caqVar7;
        tbz0Var.t = kly0Var2;
        tbz0Var.u = caqVar8;
        tbz0Var.v = kly0Var3;
        tbz0Var.w = kly0Var4;
        tbz0Var.x = jly0Var10;
        tbz0Var.y = caqVar9;
        tbz0Var.z = caqVar10;
        tbz0Var.A = caqVar11;
        tbz0Var.B = jly0Var11;
        tbz0Var.C = g5tVar;
        tbz0Var.D = kly0Var5;
        tbz0Var.E = caqVar12;
        tbz0Var.F = caqVar13;
        tbz0Var.G = jly0Var12;
        tbz0Var.H = jly0Var13;
        tbz0Var.I = kly0Var6;
        tbz0Var.J = caqVar14;
        tbz0Var.K = caqVar15;
        tbz0Var.L = caqVar16;
        tbz0Var.M = kly0Var7;
        tbz0Var.N = caqVar17;
        tbz0Var.O = jly0Var14;
        tbz0Var.P = jly0Var15;
        tbz0Var.Q = kly0Var8;
        tbz0Var.R = caqVar18;
        tbz0Var.S = kly0Var9;
        tbz0Var.T = caqVar19;
        tbz0Var.U = caqVar20;
        tbz0Var.V = caqVar21;
        tbz0Var.W = kly0Var10;
        tbz0Var.X = jly0Var16;
        tbz0Var.Y = jly0Var17;
        tbz0Var.Z = jly0Var18;
        tbz0Var.a0 = jly0Var19;
        tbz0Var.b0 = caqVar22;
        tbz0Var.c0 = jly0Var20;
        return tbz0Var;
    }

    public static ucz0 l(caq caqVar, jo80 jo80Var, jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3) {
        ucz0 ucz0Var = new ucz0();
        ucz0Var.a = jly0Var;
        ucz0Var.b = jly0Var2;
        ucz0Var.c = caqVar;
        ucz0Var.d = jo80Var;
        ucz0Var.e = jly0Var3;
        return ucz0Var;
    }

    public static l9g0 m(ynb0 ynb0Var, ynb0 ynb0Var2) {
        l9g0 l9g0Var = new l9g0((byte) 27);
        l9g0Var.b = ynb0Var;
        l9g0Var.c = ynb0Var2;
        return l9g0Var;
    }

    public static l9g0 n(ynb0 ynb0Var, ynb0 ynb0Var2) {
        l9g0 l9g0Var = new l9g0((byte) 28);
        l9g0Var.b = ynb0Var;
        l9g0Var.c = ynb0Var2;
        return l9g0Var;
    }

    public static l9g0 o(ynb0 ynb0Var, ynb0 ynb0Var2) {
        l9g0 l9g0Var = new l9g0((byte) 29);
        l9g0Var.b = ynb0Var;
        l9g0Var.c = ynb0Var2;
        return l9g0Var;
    }

    public static ttz p(elq elqVar) {
        ttz ttzVar = (ttz) elqVar.b.get();
        c8o.m(ttzVar);
        return ttzVar;
    }

    public static azp0 q(Optional optional, Optional optional2) {
        zyp0 zyp0Var = new zyp0();
        zyp0Var.B = z4n1.b("interval", 30L, TimeUnit.SECONDS);
        zyp0 zyp0VarK = t9p1.k(zyp0Var, optional2);
        o6b1 o6b1VarS = e4p1.s(optional);
        if (o6b1VarS != null) {
            zyp0VarK.b(o6b1VarS, o6b1VarS.a);
        }
        return new azp0(zyp0VarK);
    }

    public static s920 r(RetrofitMaker retrofitMaker) {
        k370 k370Var = new k370();
        k370Var.f((l370) null, "https://puffin-files.spotifycdn.com/");
        return (s920) retrofitMaker.createCustomHostService(s920.class, k370Var.b());
    }

    public static dsy0 s(ng20 ng20Var) {
        return new dsy0(ng20Var);
    }

    public static c1y0 t(k3q k3qVar) {
        return new c1y0(k3qVar, (byte) 21);
    }

    public static lmy0 u(clq clqVar) {
        lmy0 lmy0Var = (lmy0) clqVar.b.get();
        c8o.m(lmy0Var);
        return lmy0Var;
    }

    public static jkp0 v(RxRouter rxRouter) {
        return new jkp0(new be(new CosmosTransport(new opy0(rxRouter, (byte) 0))), (byte) 28);
    }

    public static String w(Context context) {
        return f4i1.e(context.getFilesDir().getPath(), "/puffin/");
    }

    public static clq x(ugb ugbVar) {
        return new clq(ugbVar);
    }

    public static dlq y(uy2 uy2Var) {
        return new dlq(uy2Var);
    }

    public static eqy0 z(dlq dlqVar) {
        eqy0 eqy0Var = (eqy0) dlqVar.f.get();
        c8o.m(eqy0Var);
        return eqy0Var;
    }
}
