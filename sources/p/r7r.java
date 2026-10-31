package p;

import android.content.ContentResolver;
import android.content.Context;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class r7r implements jly0 {
    public static thn A(m0q m0qVar) {
        return new thn(m0qVar, (byte) 2);
    }

    public static n7o B(l7c l7cVar) {
        return new n7o(l7cVar);
    }

    public static thn C(nzp nzpVar) {
        return new thn(nzpVar, (byte) 11);
    }

    public static gqg D() {
        LinkedHashMap linkedHashMapC0 = d0p1.c0(5);
        linkedHashMapC0.put(b6j0.class, wmt.d);
        linkedHashMapC0.put(cq41.class, wmt.e);
        linkedHashMapC0.put(qz70.class, wmt.c);
        linkedHashMapC0.put(ios.class, wmt.b);
        linkedHashMapC0.put(j9c1.class, wmt.f);
        return new gqg(linkedHashMapC0.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(linkedHashMapC0));
    }

    public static x1n0 a(xm41 xm41Var, oo70 oo70Var) {
        return new x1n0(((sam0) xm41Var).a, oo70Var, new ao41(xm41Var));
    }

    public static tdl b(ynb0 ynb0Var) {
        tdl tdlVar = new tdl((byte) 17);
        tdlVar.b = ynb0Var;
        return tdlVar;
    }

    public static gct c(jly0 jly0Var, jly0 jly0Var2, caq caqVar, caq caqVar2, jo80 jo80Var, kly0 kly0Var, kly0 kly0Var2, kly0 kly0Var3, caq caqVar3, caq caqVar4, jly0 jly0Var3, caq caqVar5, jly0 jly0Var4, jly0 jly0Var5, jo80 jo80Var2) {
        gct gctVar = new gct();
        gctVar.a = jly0Var;
        gctVar.b = jly0Var2;
        gctVar.c = caqVar;
        gctVar.d = caqVar2;
        gctVar.e = jo80Var;
        gctVar.f = kly0Var;
        gctVar.g = kly0Var2;
        gctVar.h = kly0Var3;
        gctVar.i = caqVar3;
        gctVar.j = caqVar4;
        gctVar.k = jly0Var3;
        gctVar.l = caqVar5;
        gctVar.m = jly0Var4;
        gctVar.n = jly0Var5;
        gctVar.o = jo80Var2;
        return gctVar;
    }

    public static hct d(jly0 jly0Var, jly0 jly0Var2, kly0 kly0Var, kly0 kly0Var2, caq caqVar, jly0 jly0Var3) {
        hct hctVar = new hct();
        hctVar.a = jly0Var;
        hctVar.b = jly0Var2;
        hctVar.c = kly0Var;
        hctVar.d = kly0Var2;
        hctVar.e = caqVar;
        hctVar.f = jly0Var3;
        return hctVar;
    }

    public static oct e(caq caqVar, caq caqVar2, caq caqVar3, caq caqVar4, jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3, jly0 jly0Var4, kly0 kly0Var, kly0 kly0Var2) {
        oct octVar = new oct();
        octVar.a = jly0Var;
        octVar.b = jly0Var2;
        octVar.c = jly0Var3;
        octVar.d = jly0Var4;
        octVar.e = caqVar;
        octVar.f = caqVar2;
        octVar.g = caqVar3;
        octVar.h = caqVar4;
        octVar.i = kly0Var;
        octVar.j = kly0Var2;
        return octVar;
    }

    public static pct f(jly0 jly0Var, jly0 jly0Var2, kly0 kly0Var, kly0 kly0Var2, caq caqVar, jly0 jly0Var3, g5t g5tVar) {
        pct pctVar = new pct();
        pctVar.a = jly0Var;
        pctVar.b = jly0Var2;
        pctVar.c = kly0Var;
        pctVar.d = kly0Var2;
        pctVar.e = caqVar;
        pctVar.f = jly0Var3;
        pctVar.g = g5tVar;
        return pctVar;
    }

    public static qct g(jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3, jly0 jly0Var4, jly0 jly0Var5) {
        qct qctVar = new qct();
        qctVar.a = jly0Var;
        qctVar.b = jly0Var2;
        qctVar.c = jly0Var3;
        qctVar.d = jly0Var4;
        qctVar.e = jly0Var5;
        return qctVar;
    }

    public static rct h(jly0 jly0Var, jly0 jly0Var2) {
        rct rctVar = new rct();
        rctVar.a = jly0Var;
        rctVar.b = jly0Var2;
        return rctVar;
    }

    public static sct i(jly0 jly0Var, jly0 jly0Var2, kly0 kly0Var, kly0 kly0Var2, jly0 jly0Var3, kly0 kly0Var3, caq caqVar, kly0 kly0Var4) {
        sct sctVar = new sct();
        sctVar.a = jly0Var;
        sctVar.b = jly0Var2;
        sctVar.c = kly0Var;
        sctVar.d = kly0Var2;
        sctVar.e = jly0Var3;
        sctVar.f = kly0Var3;
        sctVar.g = caqVar;
        sctVar.h = kly0Var4;
        return sctVar;
    }

    public static tct j(jly0 jly0Var, kly0 kly0Var, caq caqVar, jly0 jly0Var2) {
        tct tctVar = new tct();
        tctVar.a = jly0Var;
        tctVar.b = kly0Var;
        tctVar.c = caqVar;
        tctVar.d = jly0Var2;
        return tctVar;
    }

    public static pit k(r7q r7qVar, r7q r7qVar2) {
        pit pitVar = new pit();
        pitVar.a = r7qVar;
        pitVar.b = r7qVar2;
        return pitVar;
    }

    public static hqt l() {
        return new hqt();
    }

    public static mr20 m(xm41 xm41Var) {
        return hu20.b(hu20.a, new p3t(eth.V(xm41Var), (byte) 0), new jte(2, (lnm) null, (byte) 22));
    }

    public static vfl n(yap yapVar) {
        vfl vflVar = (vfl) yapVar.c.get();
        c8o.m(vflVar);
        return vflVar;
    }

    public static lls0 o(yap yapVar) {
        return new lls0((vfl) yapVar.c.get(), new kd4(false, (luk) ((kly0) yapVar.a.d).get()).a());
    }

    public static poj0 p(rap rapVar) {
        goq goqVar = rapVar.a;
        uz71 uz71VarF = goqVar.f();
        xap xapVarA = rapVar.a();
        h0y h0yVar = new h0y(rapVar.a(), (byte) 18);
        Context contextH = goqVar.h();
        c8o.l(contextH);
        return new poj0((Object) uz71VarF, (Object) xapVarA, (Object) h0yVar, (Object) contextH, (byte) 4);
    }

    public static adr q(rap rapVar) {
        goq goqVar = rapVar.a;
        k9r k9rVar = (k9r) goqVar.b;
        byp bypVar = (byp) goqVar.h;
        xap xapVarA = rapVar.a();
        uz71 uz71VarF = goqVar.f();
        xap xapVarA2 = rapVar.a();
        h0y h0yVar = new h0y(rapVar.a(), (byte) 18);
        Context contextH = goqVar.h();
        c8o.l(contextH);
        poj0 poj0Var = new poj0((Object) uz71VarF, (Object) xapVarA2, (Object) h0yVar, (Object) contextH, (byte) 4);
        x2g1 x2g1Var = (x2g1) goqVar.c;
        c8o.l(x2g1Var);
        h0y h0yVar2 = new h0y(rapVar.a(), (byte) 18);
        rm5 rm5Var = (rm5) goqVar.d;
        zbo0 zbo0Var = (zbo0) goqVar.e;
        c8o.l(zbo0Var);
        return new adr(k9rVar, bypVar, xapVarA, poj0Var, x2g1Var, h0yVar2, rm5Var, zbo0Var);
    }

    public static l6s r(wap wapVar) {
        mxr mxrVar = wapVar.a;
        cxc cxcVar = (cxc) mxrVar.a;
        c8o.l(cxcVar);
        i8b0 i8b0Var = (i8b0) mxrVar.b;
        c8o.l(i8b0Var);
        k370 k370Var = new k370();
        k370Var.i("https");
        k370Var.e("spclient.wg.spotify.com");
        l370 l370VarB = k370Var.b();
        ne neVar = new ne((byte) 10);
        neVar.a = cxcVar;
        neVar.h(l370VarB);
        neVar.c(i8b0Var);
        t2t t2tVar = (t2t) neVar.j().b(t2t.class);
        yqg yqgVar = (yqg) mxrVar.c;
        c8o.l(yqgVar);
        mr20 mr20Var = (mr20) mxrVar.d;
        c8o.l(mr20Var);
        return new l6s(t2tVar, yqgVar, mr20Var);
    }

    public static sam0 s(xm41 xm41Var, caq caqVar, dn41 dn41Var, t380 t380Var) {
        ym41 ym41Var = new ym41("Deferred");
        ym41Var.a = dn41Var;
        jge jgeVarE = hu20.e(eqr0.m(xm41Var), new ms4((lnm) null, new hf31(new o1t(t380Var, caqVar, (byte) 3), ym41Var, (byte) 17), (byte) 9));
        AtomicInteger atomicInteger = ym41.c;
        return hwb.u("Deferred", jgeVarE, Collections.singleton(xm41Var), ym41Var.b, ym41Var.a);
    }

    public static sam0 t(xm41 xm41Var, kw5 kw5Var, dn41 dn41Var, caq caqVar) {
        ym41 ym41Var = new ym41("DeferredUi");
        ym41Var.a = dn41Var;
        jge jgeVarE = hu20.e(eqr0.m(xm41Var), new ms4((lnm) null, new hf31(new o1t(kw5Var, caqVar, (byte) 4), ym41Var, (byte) 17), (byte) 9));
        AtomicInteger atomicInteger = ym41.c;
        return hwb.u("DeferredUi", jgeVarE, Collections.singleton(xm41Var), ym41Var.b, ym41Var.a);
    }

    public static jqt u(ContentResolver contentResolver, dma1 dma1Var) {
        return new jqt(contentResolver, dma1Var);
    }

    public static prt v(yap yapVar) {
        prt prtVar = (prt) yapVar.b.get();
        c8o.m(prtVar);
        return prtVar;
    }

    public static kst w(yap yapVar) {
        kst kstVar = (kst) yapVar.d.get();
        c8o.m(kstVar);
        return kstVar;
    }

    public static kst x(yap yapVar) {
        kst kstVar = (kst) yapVar.d.get();
        c8o.m(kstVar);
        return kstVar;
    }

    public static mr20 y(xm41 xm41Var) {
        return hu20.b(hu20.a, new p3t(eth.V(xm41Var), (byte) 2), new jte(2, (lnm) null, (byte) 24));
    }

    public static thn z(nzp nzpVar) {
        return new thn(nzpVar, (byte) 3);
    }
}
