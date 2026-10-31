package p;

import android.view.ViewGroup;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.nowplaying.scroll.ScrollCardType;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class xcz0 implements jly0 {
    public static m980 A(boolean z) {
        return new m980((byte) 27, z);
    }

    public static hgz0 B(RetrofitMaker retrofitMaker) {
        return (hgz0) retrofitMaker.createWebgateService(hgz0.class, "android-quickstart-pivot-playerimpl");
    }

    public static s241 C(en80 en80Var) {
        return new s241(en80Var);
    }

    public static mpm1 D(cyp cypVar, ar51 ar51Var) {
        return new mpm1(ar51Var.a(cypVar.a()));
    }

    public static ppw0 a(ynb0 ynb0Var) {
        ppw0 ppw0Var = new ppw0((byte) 8);
        ppw0Var.b = ynb0Var;
        return ppw0Var;
    }

    public static uww0 b(ynb0 ynb0Var) {
        return new uww0(ynb0Var, (byte) 2);
    }

    public static k4z0 c(ynb0 ynb0Var, ynb0 ynb0Var2) {
        k4z0 k4z0Var = new k4z0((byte) 4);
        k4z0Var.b = ynb0Var;
        k4z0Var.c = ynb0Var2;
        return k4z0Var;
    }

    public static kpz0 d(caq caqVar, r7q r7qVar, caq caqVar2, kly0 kly0Var, jo80 jo80Var, kly0 kly0Var2, kly0 kly0Var3, caq caqVar3, kly0 kly0Var4, r7q r7qVar2, g5t g5tVar, kly0 kly0Var5, caq caqVar4, kly0 kly0Var6, caq caqVar5, kly0 kly0Var7) {
        kpz0 kpz0Var = new kpz0();
        kpz0Var.a = caqVar;
        kpz0Var.b = r7qVar;
        kpz0Var.c = caqVar2;
        kpz0Var.d = kly0Var;
        kpz0Var.e = jo80Var;
        kpz0Var.f = kly0Var2;
        kpz0Var.g = kly0Var3;
        kpz0Var.h = caqVar3;
        kpz0Var.i = kly0Var4;
        kpz0Var.j = r7qVar2;
        kpz0Var.k = g5tVar;
        kpz0Var.l = kly0Var5;
        kpz0Var.m = caqVar4;
        kpz0Var.n = kly0Var6;
        kpz0Var.o = caqVar5;
        kpz0Var.f41p = kly0Var7;
        return kpz0Var;
    }

    public static n001 e(r7q r7qVar, r7q r7qVar2, kly0 kly0Var, kly0 kly0Var2) {
        n001 n001Var = new n001();
        n001Var.a = kly0Var;
        return n001Var;
    }

    public static s001 f(ynb0 ynb0Var, ynb0 ynb0Var2) {
        return new s001(ynb0Var, ynb0Var2);
    }

    public static v001 g(kly0 kly0Var, kly0 kly0Var2, jly0 jly0Var, jly0 jly0Var2, caq caqVar, jo80 jo80Var, jly0 jly0Var3, kly0 kly0Var3, caq caqVar2, caq caqVar3, jly0 jly0Var4, jly0 jly0Var5, kly0 kly0Var4, kly0 kly0Var5, caq caqVar4, caq caqVar5, jly0 jly0Var6, jly0 jly0Var7) {
        v001 v001Var = new v001();
        v001Var.a = kly0Var;
        v001Var.b = kly0Var2;
        v001Var.c = jly0Var;
        v001Var.d = jly0Var2;
        v001Var.e = caqVar;
        v001Var.f = jo80Var;
        v001Var.g = jly0Var3;
        v001Var.h = kly0Var3;
        v001Var.i = caqVar2;
        v001Var.j = caqVar3;
        v001Var.k = jly0Var4;
        v001Var.l = jly0Var5;
        v001Var.m = kly0Var4;
        v001Var.n = kly0Var5;
        v001Var.o = caqVar4;
        v001Var.f82p = caqVar5;
        v001Var.q = jly0Var6;
        v001Var.r = jly0Var7;
        return v001Var;
    }

    public static e101 h(caq caqVar, caq caqVar2, jly0 jly0Var, jly0 jly0Var2, kly0 kly0Var, kly0 kly0Var2, kly0 kly0Var3) {
        e101 e101Var = new e101();
        e101Var.a = kly0Var;
        e101Var.b = kly0Var2;
        e101Var.c = jly0Var;
        e101Var.d = caqVar;
        e101Var.e = jly0Var2;
        e101Var.f = kly0Var3;
        e101Var.g = caqVar2;
        return e101Var;
    }

    public static e401 i(caq caqVar, caq caqVar2, caq caqVar3, caq caqVar4, jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3, jly0 jly0Var4, kly0 kly0Var, kly0 kly0Var2) {
        e401 e401Var = new e401();
        e401Var.a = jly0Var;
        e401Var.b = caqVar;
        e401Var.c = jly0Var2;
        e401Var.d = jly0Var3;
        e401Var.e = kly0Var;
        e401Var.f = caqVar2;
        e401Var.g = jly0Var4;
        e401Var.h = kly0Var2;
        e401Var.i = caqVar3;
        e401Var.j = caqVar4;
        return e401Var;
    }

    public static f401 j(kly0 kly0Var) {
        f401 f401Var = new f401();
        f401Var.a = kly0Var;
        return f401Var;
    }

    public static v801 k(jly0 jly0Var, jly0 jly0Var2, kly0 kly0Var, caq caqVar, caq caqVar2, caq caqVar3, kly0 kly0Var2, kly0 kly0Var3, g5t g5tVar, kly0 kly0Var4, caq caqVar4, jly0 jly0Var3, caq caqVar5, caq caqVar6, jly0 jly0Var4, jly0 jly0Var5, jo80 jo80Var, caq caqVar7, caq caqVar8, caq caqVar9, caq caqVar10, kly0 kly0Var5, jly0 jly0Var6, jly0 jly0Var7, kly0 kly0Var6, kly0 kly0Var7, jly0 jly0Var8, jly0 jly0Var9, caq caqVar11, caq caqVar12) {
        v801 v801Var = new v801();
        v801Var.a = jly0Var;
        v801Var.b = jly0Var2;
        v801Var.c = kly0Var;
        v801Var.d = caqVar;
        v801Var.e = caqVar2;
        v801Var.f = caqVar3;
        v801Var.g = kly0Var2;
        v801Var.h = kly0Var3;
        v801Var.i = g5tVar;
        v801Var.j = kly0Var4;
        v801Var.k = caqVar4;
        v801Var.l = jly0Var3;
        v801Var.m = caqVar5;
        v801Var.n = caqVar6;
        v801Var.o = jly0Var4;
        v801Var.p = jly0Var5;
        v801Var.q = jo80Var;
        v801Var.r = caqVar7;
        v801Var.s = caqVar8;
        v801Var.t = caqVar9;
        v801Var.u = caqVar10;
        v801Var.v = kly0Var5;
        v801Var.w = jly0Var6;
        v801Var.x = jly0Var7;
        v801Var.y = kly0Var6;
        v801Var.z = kly0Var7;
        v801Var.A = jly0Var8;
        v801Var.B = jly0Var9;
        v801Var.C = caqVar11;
        v801Var.D = caqVar12;
        return v801Var;
    }

    public static ppw0 l(ynb0 ynb0Var) {
        ppw0 ppw0Var = new ppw0((byte) 11);
        ppw0Var.b = ynb0Var;
        return ppw0Var;
    }

    public static qtw m(n6r0 n6r0Var, iac0 iac0Var, fbg1 fbg1Var, f701 f701Var, k55 k55Var, tag1 tag1Var, q701 q701Var, sma1 sma1Var, s801 s801Var, jz51 jz51Var) {
        q701 q701Var2;
        sma1 sma1VarA;
        if (k55Var.b()) {
            q701Var2 = q701Var;
            sma1VarA = f6o1.A(new xzq(fbg1Var.a(q701Var2.a, iac0Var, f701Var), new yvf1(1, (byte) 2)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
        } else {
            q701Var2 = q701Var;
            sma1VarA = sma1Var;
        }
        return f6o1.A(new e701(n6r0Var, tag1Var, k55Var.a(), q701Var2, sma1VarA, s801Var, jz51Var), (ViewGroup.LayoutParams) null, ScrollCardType.TRANSCRIPTS, 1);
    }

    public static en80 n(RetrofitMaker retrofitMaker) {
        en80 en80Var = (en80) retrofitMaker.createWebgateService(en80.class, "android-radio-radio");
        c8o.m(en80Var);
        return en80Var;
    }

    public static iac0 o(q7r0 q7r0Var) {
        iac0 iac0Var = q7r0Var.d.c;
        c8o.m(iac0Var);
        return iac0Var;
    }

    public static Single p(yfu yfuVar) {
        return ((Flowable) yfuVar.b).z().map(zz10.t).map(new z8c0((Object) yfuVar, (byte) 1)).onErrorReturn(a020.t);
    }

    public static poj0 q(g2z g2zVar, w2z w2zVar, aje0 aje0Var, ltf1 ltf1Var) {
        return new poj0(g2zVar, w2zVar, aje0Var, ltf1Var, (byte) 17);
    }

    public static azp0 r(v7o0 v7o0Var, Optional optional, Optional optional2) {
        zyp0 zyp0Var = new zyp0();
        zyp0Var.c.add(v7o0Var);
        zyp0 zyp0VarK = t9p1.k(zyp0Var, optional2);
        o6b1 o6b1VarS = e4p1.s(optional);
        if (o6b1VarS != null) {
            zyp0VarK.b(o6b1VarS, o6b1VarS.a);
        }
        return new azp0(zyp0VarK);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static cbr0 s(p901 p901Var, e5b0 e5b0Var) {
        lik1 lik1Var;
        yxe1 yxe1Var = new yxe1(new jx21(2131960881));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarD4 = yon1.D4();
        try {
            lik1Var = nik1.p4.b(vzn1.m(p901Var.a));
        } catch (AssertionError unused) {
            lik1Var = new lik1("spotify:readalong:empty");
        }
        return new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarD4, lik1Var, (nar0) null), new pu00(true), e5b0Var}, false);
    }

    public static muz t(cyp cypVar) {
        return cypVar.d();
    }

    public static cyp u(t8u0 t8u0Var, s98 s98Var) {
        return t8u0Var.a(s98Var);
    }

    public static Single v(b8p1 b8p1Var) {
        Single single = (Single) b8p1Var.e;
        c8o.m(single);
        return single;
    }

    public static ruz w(cyp cypVar) {
        return cypVar.a();
    }

    public static c1y0 x(a0q a0qVar) {
        return new c1y0(a0qVar, (byte) 22);
    }

    public static c1y0 y(ibq ibqVar) {
        return new c1y0(ibqVar, (byte) 23);
    }

    public static c1y0 z(jbq jbqVar) {
        return new c1y0(jbqVar, (byte) 24);
    }
}
