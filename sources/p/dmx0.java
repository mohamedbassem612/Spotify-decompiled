package p;

import android.content.Context;
import j$.time.Clock;
import j$.time.format.DateTimeFormatter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class dmx0 implements jly0 {
    public static c1y0 A(jbq jbqVar) {
        return new c1y0(jbqVar, (byte) 17);
    }

    public static c1y0 B(l3q l3qVar) {
        return new c1y0(l3qVar, (byte) 14);
    }

    public static utw0 C(g420 g420Var) {
        return new utw0(g420Var.a());
    }

    public static t8r0 D(gma1 gma1Var, Context context) {
        return new t8r0(gma1Var.a(), context.getApplicationContext());
    }

    public static ppw0 a(ynb0 ynb0Var) {
        ppw0 ppw0Var = new ppw0((byte) 2);
        ppw0Var.b = ynb0Var;
        return ppw0Var;
    }

    public static uww0 b(ynb0 ynb0Var) {
        return new uww0(ynb0Var, (byte) 1);
    }

    public static cmx0 c(g5t g5tVar, caq caqVar, kly0 kly0Var, jly0 jly0Var, caq caqVar2) {
        cmx0 cmx0Var = new cmx0();
        cmx0Var.a = g5tVar;
        cmx0Var.b = caqVar;
        cmx0Var.c = kly0Var;
        cmx0Var.d = jly0Var;
        cmx0Var.e = caqVar2;
        return cmx0Var;
    }

    public static gmx0 d(kly0 kly0Var) {
        gmx0 gmx0Var = new gmx0();
        gmx0Var.a = kly0Var;
        return gmx0Var;
    }

    public static ppw0 e(ynb0 ynb0Var) {
        ppw0 ppw0Var = new ppw0((byte) 5);
        ppw0Var.b = ynb0Var;
        return ppw0Var;
    }

    public static ppw0 f(ynb0 ynb0Var) {
        ppw0 ppw0Var = new ppw0((byte) 6);
        ppw0Var.b = ynb0Var;
        return ppw0Var;
    }

    public static fad0 g(yqg yqgVar) {
        Clock clockSystemUTC = Clock.systemUTC();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        return new fad0(clockSystemUTC, yqgVar.g());
    }

    public static nkx0 h(nfb nfbVar) {
        return new nkx0(nfbVar, (byte) 1);
    }

    public static nkx0 i(dgb dgbVar) {
        return new nkx0(dgbVar, (byte) 2);
    }

    public static c1y0 j(mzp mzpVar) {
        return new c1y0(mzpVar, (byte) 12);
    }

    public static c1y0 k(ozp ozpVar) {
        return new c1y0(ozpVar, (byte) 1);
    }

    public static c1y0 l(uzp uzpVar) {
        return new c1y0(uzpVar, (byte) 13);
    }

    public static c1y0 m(h0q h0qVar) {
        return new c1y0(h0qVar, (byte) 6);
    }

    public static c1y0 n(m0q m0qVar) {
        return new c1y0(m0qVar, (byte) 15);
    }

    public static c1y0 o(p0q p0qVar) {
        return new c1y0(p0qVar, (byte) 18);
    }

    public static c1y0 p(k3q k3qVar) {
        return new c1y0(k3qVar, (byte) 2);
    }

    public static c1y0 q(l3q l3qVar) {
        return new c1y0(l3qVar, (byte) 0);
    }

    public static c1y0 r(jbq jbqVar) {
        return new c1y0(jbqVar, (byte) 3);
    }

    public static c1y0 s(k3q k3qVar) {
        return new c1y0(k3qVar, (byte) 8);
    }

    public static c1y0 t(l3q l3qVar) {
        return new c1y0(l3qVar, (byte) 4);
    }

    public static c1y0 u(jbq jbqVar) {
        return new c1y0(jbqVar, (byte) 5);
    }

    public static c1y0 v(k3q k3qVar) {
        return new c1y0(k3qVar, (byte) 11);
    }

    public static c1y0 w(l3q l3qVar) {
        return new c1y0(l3qVar, (byte) 7);
    }

    public static c1y0 x(jbq jbqVar) {
        return new c1y0(jbqVar, (byte) 10);
    }

    public static c1y0 y(k3q k3qVar) {
        return new c1y0(k3qVar, (byte) 16);
    }

    public static c1y0 z(l3q l3qVar) {
        return new c1y0(l3qVar, (byte) 9);
    }
}
