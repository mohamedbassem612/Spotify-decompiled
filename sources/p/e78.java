package p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class e78 implements jly0 {
    public static g341 A(d2p d2pVar) {
        yze1 yze1Var = (yze1) d2pVar.c.get();
        w88 w88Var = d2pVar.a;
        return new g341(yze1Var, (Scheduler) w88Var.g.get(), (o241) w88Var.h.get());
    }

    public static ka8 B(RetrofitMaker retrofitMaker) {
        return (ka8) retrofitMaker.createWebgateService(ka8.class, "android-ereader-endpoint-impl");
    }

    public static yze1 C(d2p d2pVar) {
        yze1 yze1Var = (yze1) d2pVar.c.get();
        c8o.m(yze1Var);
        return yze1Var;
    }

    public static o78 D(RetrofitMaker retrofitMaker) {
        return (o78) retrofitMaker.createWebgateService(o78.class, "android-content-access-gatedcontentimpl");
    }

    public static d2p a(w88 w88Var) {
        return new d2p(w88Var);
    }

    public static pt0 b(ynb0 ynb0Var) {
        pt0 pt0Var = new pt0((byte) 21);
        pt0Var.b = ynb0Var;
        return pt0Var;
    }

    public static h21 c(ynb0 ynb0Var) {
        return new h21(ynb0Var, (byte) 6);
    }

    public static rc8 d(jo80 jo80Var, kly0 kly0Var, r7q r7qVar, kly0 kly0Var2, kly0 kly0Var3, kly0 kly0Var4, r7q r7qVar2, caq caqVar, r7q r7qVar3, g5t g5tVar, caq caqVar2, r7q r7qVar4, r7q r7qVar5, kly0 kly0Var5, caq caqVar3, caq caqVar4, caq caqVar5, caq caqVar6, kly0 kly0Var6, kly0 kly0Var7, r7q r7qVar6, r7q r7qVar7, r7q r7qVar8, caq caqVar7, kly0 kly0Var8, r7q r7qVar9, caq caqVar8) {
        rc8 rc8Var = new rc8();
        rc8Var.a = jo80Var;
        rc8Var.b = kly0Var;
        rc8Var.c = r7qVar;
        rc8Var.d = kly0Var2;
        rc8Var.e = kly0Var3;
        rc8Var.f = kly0Var4;
        rc8Var.g = r7qVar2;
        rc8Var.h = caqVar;
        rc8Var.i = r7qVar3;
        rc8Var.j = g5tVar;
        rc8Var.k = caqVar2;
        rc8Var.l = r7qVar4;
        rc8Var.m = r7qVar5;
        rc8Var.n = kly0Var5;
        rc8Var.o = caqVar3;
        rc8Var.f59p = caqVar4;
        rc8Var.q = caqVar5;
        rc8Var.r = caqVar6;
        rc8Var.s = kly0Var6;
        rc8Var.t = kly0Var7;
        rc8Var.u = r7qVar6;
        rc8Var.v = r7qVar7;
        rc8Var.w = r7qVar8;
        rc8Var.x = caqVar7;
        rc8Var.y = kly0Var8;
        rc8Var.z = r7qVar9;
        rc8Var.A = caqVar8;
        return rc8Var;
    }

    public static de8 e(r7q r7qVar, jo80 jo80Var, kly0 kly0Var, r7q r7qVar2, caq caqVar, r7q r7qVar3, jo80 jo80Var2, caq caqVar2) {
        de8 de8Var = new de8();
        de8Var.a = r7qVar;
        de8Var.b = jo80Var;
        de8Var.c = kly0Var;
        de8Var.d = r7qVar2;
        de8Var.e = caqVar;
        de8Var.f = r7qVar3;
        de8Var.g = jo80Var2;
        de8Var.h = caqVar2;
        return de8Var;
    }

    public static ej8 f(jo80 jo80Var, caq caqVar, caq caqVar2, kly0 kly0Var, kly0 kly0Var2, caq caqVar3, caq caqVar4, jo80 jo80Var2, caq caqVar5, jly0 jly0Var, jly0 jly0Var2, caq caqVar6, caq caqVar7, caq caqVar8, caq caqVar9, jly0 jly0Var3, kly0 kly0Var3, kly0 kly0Var4) {
        ej8 ej8Var = new ej8();
        ej8Var.a = jo80Var;
        ej8Var.b = caqVar;
        ej8Var.c = caqVar2;
        ej8Var.d = kly0Var;
        ej8Var.e = kly0Var2;
        ej8Var.f = caqVar3;
        ej8Var.g = caqVar4;
        ej8Var.h = jo80Var2;
        ej8Var.i = caqVar5;
        ej8Var.j = jly0Var;
        ej8Var.k = jly0Var2;
        ej8Var.l = caqVar6;
        ej8Var.m = caqVar7;
        ej8Var.n = caqVar8;
        ej8Var.o = caqVar9;
        ej8Var.p = jly0Var3;
        ej8Var.q = kly0Var3;
        ej8Var.r = kly0Var4;
        return ej8Var;
    }

    public static fn8 g(jo80 jo80Var, caq caqVar, caq caqVar2, caq caqVar3, jly0 jly0Var, jly0 jly0Var2) {
        fn8 fn8Var = new fn8();
        fn8Var.a = jo80Var;
        fn8Var.b = caqVar;
        fn8Var.c = caqVar2;
        fn8Var.d = caqVar3;
        fn8Var.e = jly0Var;
        fn8Var.f = jly0Var2;
        return fn8Var;
    }

    public static qo8 h(jo80 jo80Var, kly0 kly0Var, kly0 kly0Var2, r7q r7qVar, g5t g5tVar, kly0 kly0Var3, r7q r7qVar2, r7q r7qVar3, kly0 kly0Var4, kly0 kly0Var5, kly0 kly0Var6, r7q r7qVar4, caq caqVar, kly0 kly0Var7) {
        qo8 qo8Var = new qo8();
        qo8Var.a = jo80Var;
        qo8Var.b = kly0Var;
        qo8Var.c = kly0Var2;
        qo8Var.d = r7qVar;
        qo8Var.e = g5tVar;
        qo8Var.f = kly0Var3;
        qo8Var.g = r7qVar2;
        qo8Var.h = r7qVar3;
        qo8Var.i = kly0Var4;
        qo8Var.j = kly0Var5;
        qo8Var.k = kly0Var6;
        qo8Var.l = r7qVar4;
        qo8Var.m = caqVar;
        qo8Var.n = kly0Var7;
        return qo8Var;
    }

    public static j59 i(caq caqVar, caq caqVar2, caq caqVar3, kly0 kly0Var, caq caqVar4, r7q r7qVar, kly0 kly0Var2, caq caqVar5, caq caqVar6, kly0 kly0Var3, caq caqVar7, jo80 jo80Var, caq caqVar8, caq caqVar9, caq caqVar10, caq caqVar11, caq caqVar12, g5t g5tVar, caq caqVar13, caq caqVar14, g5t g5tVar2, caq caqVar15, caq caqVar16, caq caqVar17) {
        j59 j59Var = new j59();
        j59Var.a = caqVar;
        j59Var.b = caqVar2;
        j59Var.c = caqVar3;
        j59Var.d = kly0Var;
        j59Var.e = caqVar4;
        j59Var.f = r7qVar;
        j59Var.g = kly0Var2;
        j59Var.h = caqVar5;
        j59Var.i = caqVar6;
        j59Var.j = kly0Var3;
        j59Var.k = caqVar7;
        j59Var.l = jo80Var;
        j59Var.m = caqVar8;
        j59Var.n = caqVar9;
        j59Var.o = caqVar10;
        j59Var.f29p = caqVar11;
        j59Var.q = caqVar12;
        j59Var.r = g5tVar;
        j59Var.s = caqVar13;
        j59Var.t = caqVar14;
        j59Var.u = g5tVar2;
        j59Var.v = caqVar15;
        j59Var.w = caqVar16;
        j59Var.x = caqVar17;
        return j59Var;
    }

    public static pt0 j(ynb0 ynb0Var) {
        pt0 pt0Var = new pt0((byte) 23);
        pt0Var.b = ynb0Var;
        return pt0Var;
    }

    public static h21 k(ynb0 ynb0Var) {
        return new h21(ynb0Var, (byte) 7);
    }

    public static a2p l(w88 w88Var) {
        return new a2p(w88Var);
    }

    public static u3f0 m(d2p d2pVar) {
        u3f0 u3f0Var = (u3f0) d2pVar.b.get();
        c8o.m(u3f0Var);
        return u3f0Var;
    }

    public static uh8 n(d2p d2pVar) {
        return new uh8(new y48(new CosmosTransport(new sn0((RxRouter) d2pVar.a.c.get(), (byte) 4))));
    }

    public static sam0 o(kly0 kly0Var, xm41 xm41Var, lxg lxgVar, dn41 dn41Var, tif1 tif1Var) {
        ym41 ym41Var = new ym41("Authenticated");
        ym41Var.a = dn41Var;
        jge jgeVarE = hu20.e(eqr0.m(xm41Var), new ms4((lnm) null, new hf31(new zt6(tif1Var, lxgVar, kly0Var, (byte) 7), ym41Var, (byte) 17), (byte) 9));
        AtomicInteger atomicInteger = ym41.c;
        return hwb.u("Authenticated", jgeVarE, Collections.singleton(xm41Var), ym41Var.b, ym41Var.a);
    }

    public static BehaviorSubject p() {
        return BehaviorSubject.f();
    }

    public static PublishSubject q() {
        return new PublishSubject();
    }

    public static g2p r(dt8 dt8Var) {
        return new g2p(dt8Var);
    }

    public static mt8 s(g2p g2pVar) {
        mt8 mt8Var = (mt8) g2pVar.b.get();
        c8o.m(mt8Var);
        return mt8Var;
    }

    public static pob t() {
        return new pob((byte) 0, false);
    }

    public static z9n u(xfx xfxVar) {
        return new z9n(xfxVar);
    }

    public static wve0 v(d2p d2pVar) {
        return new wve0(new CosmosTransport(new sn0((RxRouter) d2pVar.a.c.get(), (byte) 3)));
    }

    public static zrh w(a2p a2pVar) {
        l78 l78Var = (l78) a2pVar.b.get();
        w88 w88Var = a2pVar.a;
        return new zrh(l78Var, (Flowable) w88Var.d.get(), (Scheduler) w88Var.f.get(), (Scheduler) w88Var.g.get());
    }

    public static vq6 x(kzp kzpVar) {
        return new vq6(kzpVar, (byte) 13);
    }

    public static vq6 y(nzp nzpVar) {
        return new vq6(nzpVar, (byte) 14);
    }

    public static ytp0 z(a2p a2pVar) {
        w88 w88Var = a2pVar.a;
        return new ytp0((Observable) w88Var.e.get(), (krh) w88Var.b.get(), new q54((tgp0) w88Var.i.get(), (luk) w88Var.h.get()), (Scheduler) w88Var.g.get());
    }
}
