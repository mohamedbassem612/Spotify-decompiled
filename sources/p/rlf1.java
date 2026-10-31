package p;

import android.app.Application;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rlf1 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;

    public rlf1(Application application, qeh1 qeh1Var, bz11 bz11Var, aen1 aen1Var, yuo1 yuo1Var, den1 den1Var, vfo1 vfo1Var, fqn1 fqn1Var, alg1 alg1Var, cik1 cik1Var, elo1 elo1Var, brk1 brk1Var, dmj1 dmj1Var) {
        this.a = application;
        this.l = qeh1Var;
        this.b = bz11Var;
        this.c = yuo1Var;
        this.d = den1Var;
        this.k = vfo1Var;
        this.e = fqn1Var;
        this.f = alg1Var;
        this.g = cik1Var;
        this.h = elo1Var;
        this.i = brk1Var;
        this.j = dmj1Var;
    }

    public yuo1 a() {
        return (yuo1) this.c;
    }

    public den1 b() {
        return (den1) this.d;
    }

    public eto1 c(String str, i2x0 i2x0Var) {
        return u890.j(i2x0Var, i2x0.X0) ? new gso1(f(str)) : new yro1((qeh1) this.l, f(str));
    }

    public vfo1 d() {
        return (vfo1) this.k;
    }

    public qeh1 e() {
        return (qeh1) this.l;
    }

    public cik1 f(String str) {
        utw0 utw0Var = new utw0((byte) 25);
        Application application = (Application) this.a;
        dmj1 dmj1Var = (dmj1) this.j;
        mxa1 mxa1Var = new mxa1(str, dmj1Var, (brk1) this.i, utw0Var, application);
        return new cik1(new cik1((elo1) this.h, (alg1) this.f, (qeh1) this.l, mxa1Var), new fqn1((fqn1) this.e, (cik1) this.g, new zsc(mxa1Var, dmj1Var, application), false, (byte) 8), (bz11) this.b);
    }

    public rlf1(Flowable flowable, zr00 zr00Var, yh2 yh2Var, o241 o241Var, f8b f8bVar, rh11 rh11Var, ne neVar, krh krhVar, waz0 waz0Var, di4 di4Var, bv40 bv40Var, t7y t7yVar) {
        this.a = flowable;
        this.b = zr00Var;
        this.c = yh2Var;
        this.d = o241Var;
        this.e = f8bVar;
        this.f = rh11Var;
        this.g = neVar;
        this.h = krhVar;
        this.i = waz0Var;
        this.j = di4Var;
        this.k = bv40Var;
        this.l = t7yVar;
    }
}
