package p;

import android.content.Context;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import com.spotify.esperanto.esperantocosmos.EsperantoRxRouter;
import com.spotify.localfiles.settings.localfiles.impl.LocalFilesSettingsValueAccessor;
import io.reactivex.rxjava3.core.Observable;
import j$.time.ZoneId;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class iwv0 implements jly0 {
    public static ren0 A(i7d i7dVar) {
        dao daoVar = (dao) i7dVar.a;
        j440 j440Var = (j440) i7dVar.b;
        uce0 uce0Var = (uce0) i7dVar.c;
        LocalFilesSettingsValueAccessor localFilesSettingsValueAccessor = (LocalFilesSettingsValueAccessor) i7dVar.d;
        yfo0 yfo0Var = (yfo0) i7dVar.e;
        bup0 bup0Var = (bup0) i7dVar.f;
        r1c1 r1c1Var = (r1c1) i7dVar.g;
        u5x u5xVar = (u5x) i7dVar.h;
        qmk1 qmk1Var = (qmk1) i7dVar.i;
        tfo0 tfo0Var = (tfo0) i7dVar.t;
        grt grtVar = (grt) i7dVar.X;
        h581 h581Var = (h581) i7dVar.Y;
        g981 g981Var = (g981) i7dVar.Z;
        uy11 uy11Var = (uy11) i7dVar.N0;
        rv61 rv61Var = new rv61(localFilesSettingsValueAccessor, (ol0) i7dVar.Q0, daoVar, grtVar, (b6u) i7dVar.O0, u5xVar, j440Var, uce0Var, tfo0Var, yfo0Var, bup0Var, (ivw0) i7dVar.P0, uy11Var, h581Var, g981Var, r1c1Var, qmk1Var);
        ren0 ren0Var = new ren0();
        rv61Var.invoke(ren0Var);
        return ren0Var;
    }

    public static ZoneId B(yqg yqgVar) {
        m4w0.a.getClass();
        String id = yqgVar.g().getID();
        Set availableZoneIds = ZoneId.getAvailableZoneIds();
        Map map = l4w0.b;
        return (!map.containsKey(id) || availableZoneIds.contains(id)) ? ZoneId.of(id) : ZoneId.of((String) map.get(id));
    }

    public static egn0 a(ynb0 ynb0Var) {
        egn0 egn0Var = new egn0((byte) 28);
        egn0Var.b = ynb0Var;
        return egn0Var;
    }

    public static npw0 b(caq caqVar, jly0 jly0Var, jly0 jly0Var2, kly0 kly0Var, kly0 kly0Var2) {
        npw0 npw0Var = new npw0();
        npw0Var.a = jly0Var;
        npw0Var.b = jly0Var2;
        npw0Var.c = kly0Var;
        npw0Var.d = kly0Var2;
        npw0Var.e = caqVar;
        return npw0Var;
    }

    public static ppw0 c(ynb0 ynb0Var) {
        ppw0 ppw0Var = new ppw0((byte) 0);
        ppw0Var.b = ynb0Var;
        return ppw0Var;
    }

    public static fqw0 d(Context context) {
        return new fqw0(context);
    }

    public static n3x0 e(caq caqVar, caq caqVar2, caq caqVar3, caq caqVar4, caq caqVar5, caq caqVar6, r7q r7qVar, caq caqVar7, caq caqVar8, caq caqVar9, kly0 kly0Var, caq caqVar10, kly0 kly0Var2, r7q r7qVar2, jo80 jo80Var, r7q r7qVar3, caq caqVar11, caq caqVar12, r7q r7qVar4, g5t g5tVar, gbp gbpVar, kly0 kly0Var3, thq thqVar, r7q r7qVar5, r7q r7qVar6, thq thqVar2, r7q r7qVar7, r7q r7qVar8, thq thqVar3, thq thqVar4, thq thqVar5, thq thqVar6, thq thqVar7, thq thqVar8, caq caqVar13, thq thqVar9, thq thqVar10, kly0 kly0Var4, r7q r7qVar9, caq caqVar14, jly0 jly0Var, thq thqVar11, r7q r7qVar10, caq caqVar15, kly0 kly0Var5, kly0 kly0Var6, kly0 kly0Var7, r7q r7qVar11, caq caqVar16, caq caqVar17, caq caqVar18, caq caqVar19, r7q r7qVar12, kly0 kly0Var8, kly0 kly0Var9, thq thqVar12, thq thqVar13, thq thqVar14) {
        n3x0 n3x0Var = new n3x0();
        n3x0Var.a = caqVar;
        n3x0Var.b = caqVar2;
        n3x0Var.c = caqVar3;
        n3x0Var.d = caqVar4;
        n3x0Var.e = caqVar5;
        n3x0Var.f = caqVar6;
        n3x0Var.g = r7qVar;
        n3x0Var.h = caqVar7;
        n3x0Var.i = caqVar8;
        n3x0Var.j = caqVar9;
        n3x0Var.k = kly0Var;
        n3x0Var.l = caqVar10;
        n3x0Var.m = kly0Var2;
        n3x0Var.n = r7qVar2;
        n3x0Var.o = jo80Var;
        n3x0Var.f24p = r7qVar3;
        n3x0Var.q = caqVar11;
        n3x0Var.r = caqVar12;
        n3x0Var.s = r7qVar4;
        n3x0Var.t = g5tVar;
        n3x0Var.u = gbpVar;
        n3x0Var.v = kly0Var3;
        n3x0Var.w = thqVar;
        n3x0Var.x = r7qVar5;
        n3x0Var.y = r7qVar6;
        n3x0Var.z = thqVar2;
        n3x0Var.A = r7qVar7;
        n3x0Var.B = r7qVar8;
        n3x0Var.C = thqVar3;
        n3x0Var.D = thqVar4;
        n3x0Var.E = thqVar5;
        n3x0Var.F = thqVar6;
        n3x0Var.G = thqVar7;
        n3x0Var.H = thqVar8;
        n3x0Var.I = caqVar13;
        n3x0Var.J = thqVar9;
        n3x0Var.K = thqVar10;
        n3x0Var.L = kly0Var4;
        n3x0Var.M = r7qVar9;
        n3x0Var.N = caqVar14;
        n3x0Var.O = jly0Var;
        n3x0Var.P = thqVar11;
        n3x0Var.Q = r7qVar10;
        n3x0Var.R = caqVar15;
        n3x0Var.S = kly0Var5;
        n3x0Var.T = kly0Var6;
        n3x0Var.U = kly0Var7;
        n3x0Var.V = r7qVar11;
        n3x0Var.W = caqVar16;
        n3x0Var.X = caqVar17;
        n3x0Var.Y = caqVar18;
        n3x0Var.Z = caqVar19;
        n3x0Var.a0 = r7qVar12;
        n3x0Var.b0 = kly0Var8;
        n3x0Var.c0 = kly0Var9;
        n3x0Var.d0 = thqVar12;
        n3x0Var.e0 = thqVar13;
        n3x0Var.f0 = thqVar14;
        return n3x0Var;
    }

    public static ov20 f(stw0 stw0Var) {
        ov20 ov20VarE = stw0Var.e();
        c8o.m(ov20VarE);
        return ov20VarE;
    }

    public static wqk0 g() {
        return new wqk0((byte) 27);
    }

    public static aru0 h(gw70 gw70Var, m35 m35Var, ycm ycmVar) {
        return new aru0(gw70Var, m35Var, ycmVar, (byte) 21);
    }

    public static g3s0 i(RetrofitMaker retrofitMaker) {
        return (g3s0) retrofitMaker.createWebgateService(g3s0.class, "android-crash-reporting-identifiers");
    }

    public static pjq0 j(yzp yzpVar) {
        return new pjq0(yzpVar, (byte) 28);
    }

    public static pjq0 k(p0q p0qVar) {
        return new pjq0(p0qVar, (byte) 22);
    }

    public static aru0 l(yqg yqgVar, nwt nwtVar, clm clmVar) {
        return new aru0(yqgVar, nwtVar, clmVar, (byte) 20);
    }

    public static tbw0 m(o35 o35Var, kly0 kly0Var, jly0 jly0Var) {
        return (tbw0) (o35Var.a() ? jly0Var.get() : kly0Var.get());
    }

    public static be n(final RxRouter rxRouter) {
        return new be(new CosmosTransport(new EsperantoRxRouter() { // from class: p.muw0
            public final Observable resolve(Request request) {
                return rxRouter.resolve(request);
            }
        }));
    }

    public static Observable o(o241 o241Var) {
        return ((p241) o241Var).a.map(ytw0.b).distinctUntilChanged();
    }

    public static ztw0 p(stw0 stw0Var) {
        return stw0Var.c();
    }

    public static luw0 q(be beVar) {
        return new luw0(beVar);
    }

    public static luw0 r(stw0 stw0Var) {
        return stw0Var.a();
    }

    public static b0x0 s() {
        return new b0x0();
    }

    public static w0x0 t(RetrofitMaker retrofitMaker) {
        return (w0x0) retrofitMaker.createWebgateService(w0x0.class, "android-profile-completionsheetimpl");
    }

    public static fdx0 u(RetrofitMaker retrofitMaker) {
        return (fdx0) retrofitMaker.createWebgateService(fdx0.class, "android-profile-privacy");
    }

    public static l20 v(jn7 jn7Var) {
        return new l20(gbw0.P0, new k2(new w63(jn7Var, null, (byte) 16), (lnm) null, (byte) 3));
    }

    public static pix0 w(x7q x7qVar) {
        return new pix0(x7qVar);
    }

    public static jn7 x(CallbackRouter callbackRouter) {
        return new jn7(new CosmosCoroutineTransport(new r8c(callbackRouter, (byte) 7)));
    }

    public static o241 y(stw0 stw0Var) {
        o241 o241VarB = stw0Var.b();
        c8o.m(o241VarB);
        return o241VarB;
    }

    public static r241 z(stw0 stw0Var) {
        return stw0Var.d();
    }
}
