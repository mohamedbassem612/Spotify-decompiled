package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class f42 implements jly0 {
    public static v1b1 A(qxo qxoVar) {
        v1b1 v1b1Var = (v1b1) qxoVar.f65p.get();
        c8o.m(v1b1Var);
        return v1b1Var;
    }

    public static ipk1 B(xm41 xm41Var) {
        ipk1 ipk1Var = (ipk1) eth.z(xm41Var, fw2.P0);
        return ipk1Var == null ? new ipk1() : ipk1Var;
    }

    public static qxo a(k42 k42Var) {
        return new qxo(k42Var);
    }

    public static ayo b(vi2 vi2Var) {
        return new ayo(vi2Var);
    }

    public static v2 c(ynb0 ynb0Var, ynb0 ynb0Var2) {
        v2 v2Var = new v2((byte) 8);
        v2Var.b = ynb0Var;
        v2Var.c = ynb0Var2;
        return v2Var;
    }

    public static pt0 d(ynb0 ynb0Var) {
        pt0 pt0Var = new pt0((byte) 6);
        pt0Var.b = ynb0Var;
        return pt0Var;
    }

    public static h21 e(ynb0 ynb0Var) {
        return new h21(ynb0Var, (byte) 5);
    }

    public static w52 f(r7q r7qVar, r7q r7qVar2, r7q r7qVar3, jo80 jo80Var, gbp gbpVar) {
        w52 w52Var = new w52();
        w52Var.a = r7qVar;
        w52Var.b = r7qVar2;
        w52Var.c = r7qVar3;
        w52Var.d = jo80Var;
        w52Var.e = gbpVar;
        return w52Var;
    }

    public static zb2 g(jo80 jo80Var, jly0 jly0Var, jly0 jly0Var2, kly0 kly0Var) {
        zb2 zb2Var = new zb2();
        zb2Var.a = jo80Var;
        zb2Var.b = jly0Var;
        zb2Var.c = jly0Var2;
        zb2Var.d = kly0Var;
        return zb2Var;
    }

    public static bn2 h(r7q r7qVar, kly0 kly0Var, r7q r7qVar2, r7q r7qVar3, caq caqVar, caq caqVar2, jo80 jo80Var, r7q r7qVar4, caq caqVar3) {
        bn2 bn2Var = new bn2();
        bn2Var.a = r7qVar;
        bn2Var.b = kly0Var;
        bn2Var.c = r7qVar2;
        bn2Var.d = r7qVar3;
        bn2Var.e = caqVar;
        bn2Var.f = caqVar2;
        bn2Var.g = jo80Var;
        bn2Var.h = r7qVar4;
        bn2Var.i = caqVar3;
        return bn2Var;
    }

    public static v2 i(ynb0 ynb0Var, ynb0 ynb0Var2) {
        v2 v2Var = new v2((byte) 10);
        v2Var.b = ynb0Var;
        v2Var.c = ynb0Var2;
        return v2Var;
    }

    public static Set j(qxo qxoVar) {
        Set setSingleton;
        t360 t360Var = new t360(11);
        t360Var.a(new d2x(xqu.a(qxoVar.d), (byte) 0));
        t360Var.a(new d2x(xqu.a(qxoVar.e), (byte) 0));
        t360Var.a(new d2x(xqu.a(qxoVar.f), (byte) 0));
        t360Var.a(new d2x(xqu.a(qxoVar.g), (byte) 0));
        t360Var.a(new d2x(xqu.a(qxoVar.h), (byte) 0));
        t360Var.a(new be31(new pg5(qxoVar.j), xqu.a(qxoVar.i)));
        t360Var.a(new d2x(xqu.a(qxoVar.k), (byte) 1));
        t360Var.a(new s1b1((o44) qxoVar.m.get(), xqu.a(qxoVar.l)));
        k42 k42Var = qxoVar.a;
        kly0 kly0Var = (kly0) k42Var.c;
        kly0 kly0Var2 = (kly0) k42Var.n;
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new qg61((ay0) qxoVar.n.get()));
        Object obj = qxoVar.o.get();
        c8o.j(obj, "Set contributions cannot be null");
        arrayList.add(obj);
        if (arrayList.isEmpty()) {
            setSingleton = Collections.EMPTY_SET;
        } else {
            setSingleton = arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : Collections.unmodifiableSet(new HashSet(arrayList));
        }
        t360Var.a(new cn0(setSingleton, new x15((Context) ((kly0) k42Var.a).get()), new j44((luk) ((kly0) k42Var.s).get())));
        t360Var.a(new dza1((Flowable) kly0Var2.get(), (be91) ((kly0) k42Var.f).get(), (fza1) qxoVar.r.get(), qxoVar.m, qxoVar.l, (q8n) kly0Var.get()));
        t360Var.a(new kza1((fza1) qxoVar.r.get(), (qq0) ((kly0) k42Var.q).get(), (Flowable) kly0Var2.get(), (xn0) ((kly0) k42Var.r).get(), (q8n) kly0Var.get()));
        Set setD = t360Var.d();
        c8o.m(setD);
        return setD;
    }

    public static dy0 k(qxo qxoVar) {
        k42 k42Var = qxoVar.a;
        return new dy0((me91) ((kly0) k42Var.i).get(), (q8n) ((kly0) k42Var.b).get());
    }

    public static il0 l(qxo qxoVar) {
        il0 il0Var = (il0) qxoVar.b.get();
        c8o.m(il0Var);
        return il0Var;
    }

    public static ri2 m(ayo ayoVar) {
        ri2 ri2Var = (ri2) ayoVar.b.get();
        c8o.m(ri2Var);
        return ri2Var;
    }

    public static vt2 n(w5b1 w5b1Var) {
        k370 k370Var = new k370();
        k370Var.i("https");
        k370Var.e("spclient.wg.spotify.com");
        l370 l370VarB = k370Var.b();
        yyp0 yyp0Var = w5b1Var.d;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        yyp0 yyp0VarD = yyp0Var.f(1L, timeUnit).g(1L, timeUnit).d(new xyp0(1L, timeUnit, (byte) 0));
        ne neVar = new ne((byte) 10);
        neVar.h(l370VarB);
        neVar.l(yyp0VarD.c());
        neVar.c(new tpq0((byte) 1));
        return (vt2) neVar.j().b(vt2.class);
    }

    public static u9c0 o() {
        return cto1.q(krw0.i);
    }

    public static zo2 p(c9n c9nVar, byp0 byp0Var) {
        return new zo2(c9nVar, byp0Var);
    }

    public static mbo0 q(Optional optional) {
        return (mbo0) optional.orElse(mbo0.a);
    }

    public static d1x r(qxo qxoVar) {
        d1x d1xVar = (d1x) qxoVar.o.get();
        c8o.m(d1xVar);
        return d1xVar;
    }

    public static ay0 s(qxo qxoVar) {
        ay0 ay0Var = (ay0) qxoVar.f.get();
        c8o.m(ay0Var);
        return ay0Var;
    }

    public static ay0 t(qxo qxoVar) {
        ay0 ay0Var = (ay0) qxoVar.n.get();
        c8o.m(ay0Var);
        return ay0Var;
    }

    public static pxo u(qxo qxoVar) {
        pxo pxoVar = (pxo) qxoVar.t.get();
        c8o.m(pxoVar);
        return pxoVar;
    }

    public static ytp0 v(qxo qxoVar) {
        k42 k42Var = qxoVar.a;
        return new ytp0(new ge4((luk) ((kly0) k42Var.s).get()), (fza1) qxoVar.r.get(), (nu0) ((kly0) k42Var.k).get(), (ay0) qxoVar.f.get(), (q8n) ((kly0) k42Var.b).get(), (byte) 14);
    }

    public static g21 w(kzp kzpVar) {
        return new g21(kzpVar, (byte) 9);
    }

    public static g21 x(rzp rzpVar) {
        return new g21(rzpVar, (byte) 10);
    }

    public static u13 y(qxo qxoVar) {
        return new u13(qxoVar.u);
    }

    public static fza1 z(qxo qxoVar) {
        fza1 fza1Var = (fza1) qxoVar.r.get();
        c8o.m(fza1Var);
        return fza1Var;
    }
}
