package p;

import android.os.Build;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class mca0 implements jly0 {
    public static mna0 A(ubc ubcVar) {
        return new mna0(ubcVar, (byte) 0);
    }

    public static cna0 B() {
        return new cna0((byte) 0);
    }

    public static w7w a(ynb0 ynb0Var, ynb0 ynb0Var2) {
        w7w w7wVar = new w7w((byte) 13);
        w7wVar.b = ynb0Var;
        w7wVar.c = ynb0Var2;
        return w7wVar;
    }

    public static eh50 b(ynb0 ynb0Var) {
        eh50 eh50Var = new eh50((byte) 17);
        eh50Var.b = ynb0Var;
        return eh50Var;
    }

    public static tva0 c(r7q r7qVar, kly0 kly0Var, kly0 kly0Var2, kly0 kly0Var3, caq caqVar, jo80 jo80Var, r7q r7qVar2, caq caqVar2) {
        tva0 tva0Var = new tva0();
        tva0Var.a = r7qVar;
        tva0Var.b = kly0Var;
        tva0Var.c = kly0Var2;
        tva0Var.d = kly0Var3;
        tva0Var.e = caqVar;
        tva0Var.f = jo80Var;
        tva0Var.g = r7qVar2;
        tva0Var.h = caqVar2;
        return tva0Var;
    }

    public static zva0 d(r7q r7qVar, r7q r7qVar2, caq caqVar, caq caqVar2, kly0 kly0Var, kly0 kly0Var2) {
        zva0 zva0Var = new zva0();
        zva0Var.a = r7qVar;
        zva0Var.b = caqVar;
        zva0Var.c = caqVar2;
        zva0Var.d = kly0Var;
        zva0Var.e = kly0Var2;
        zva0Var.f = r7qVar2;
        return zva0Var;
    }

    public static dwa0 e(r7q r7qVar, caq caqVar, gbp gbpVar, r7q r7qVar2, r7q r7qVar3, r7q r7qVar4, kly0 kly0Var, thq thqVar, jo80 jo80Var, caq caqVar2, caq caqVar3, kly0 kly0Var2, r7q r7qVar5, caq caqVar4) {
        dwa0 dwa0Var = new dwa0();
        dwa0Var.a = r7qVar;
        dwa0Var.b = caqVar;
        dwa0Var.c = gbpVar;
        dwa0Var.d = r7qVar2;
        dwa0Var.e = r7qVar3;
        dwa0Var.f = r7qVar4;
        dwa0Var.g = kly0Var;
        dwa0Var.h = thqVar;
        dwa0Var.i = jo80Var;
        dwa0Var.j = caqVar2;
        dwa0Var.k = caqVar3;
        dwa0Var.l = kly0Var2;
        dwa0Var.m = r7qVar5;
        dwa0Var.n = caqVar4;
        return dwa0Var;
    }

    public static owa0 f(caq caqVar, caq caqVar2, r7q r7qVar, kly0 kly0Var, kly0 kly0Var2, caq caqVar3, r7q r7qVar2) {
        owa0 owa0Var = new owa0();
        owa0Var.a = caqVar;
        owa0Var.b = caqVar2;
        owa0Var.c = r7qVar;
        owa0Var.d = kly0Var;
        owa0Var.e = kly0Var2;
        owa0Var.f = caqVar3;
        owa0Var.g = r7qVar2;
        return owa0Var;
    }

    public static vwa0 g(kly0 kly0Var, r7q r7qVar, kly0 kly0Var2, caq caqVar, thq thqVar, jo80 jo80Var, r7q r7qVar2) {
        vwa0 vwa0Var = new vwa0();
        vwa0Var.a = kly0Var;
        vwa0Var.b = r7qVar;
        vwa0Var.c = kly0Var2;
        vwa0Var.d = caqVar;
        vwa0Var.e = thqVar;
        vwa0Var.f = jo80Var;
        vwa0Var.g = r7qVar2;
        return vwa0Var;
    }

    public static kxa0 h(r7q r7qVar, r7q r7qVar2, kly0 kly0Var, kly0 kly0Var2) {
        kxa0 kxa0Var = new kxa0();
        kxa0Var.a = kly0Var;
        kxa0Var.b = kly0Var2;
        kxa0Var.c = r7qVar;
        kxa0Var.d = r7qVar2;
        return kxa0Var;
    }

    public static nxa0 i(kly0 kly0Var, r7q r7qVar, kly0 kly0Var2) {
        nxa0 nxa0Var = new nxa0();
        nxa0Var.a = kly0Var;
        nxa0Var.b = r7qVar;
        nxa0Var.c = kly0Var2;
        return nxa0Var;
    }

    public static uya0 j(r7q r7qVar, kly0 kly0Var, r7q r7qVar2, r7q r7qVar3, thq thqVar, gbp gbpVar, caq caqVar) {
        uya0 uya0Var = new uya0();
        uya0Var.a = r7qVar;
        uya0Var.b = kly0Var;
        uya0Var.c = r7qVar2;
        uya0Var.d = r7qVar3;
        uya0Var.e = thqVar;
        uya0Var.f = gbpVar;
        uya0Var.g = caqVar;
        return uya0Var;
    }

    public static j1b0 k(r7q r7qVar, r7q r7qVar2, caq caqVar, kly0 kly0Var, kly0 kly0Var2, caq caqVar2, caq caqVar3, jo80 jo80Var, caq caqVar4, kly0 kly0Var3) {
        j1b0 j1b0Var = new j1b0();
        j1b0Var.a = r7qVar;
        j1b0Var.b = r7qVar2;
        j1b0Var.c = caqVar;
        j1b0Var.d = kly0Var;
        j1b0Var.e = kly0Var2;
        j1b0Var.f = caqVar2;
        j1b0Var.g = caqVar3;
        j1b0Var.h = jo80Var;
        j1b0Var.i = caqVar4;
        j1b0Var.j = kly0Var3;
        return j1b0Var;
    }

    public static w7w l(ynb0 ynb0Var, ynb0 ynb0Var2) {
        w7w w7wVar = new w7w((byte) 14);
        w7wVar.b = ynb0Var;
        w7wVar.c = ynb0Var2;
        return w7wVar;
    }

    public static eh50 m(ynb0 ynb0Var) {
        eh50 eh50Var = new eh50((byte) 18);
        eh50Var.b = ynb0Var;
        return eh50Var;
    }

    public static w7w n(ynb0 ynb0Var, ynb0 ynb0Var2) {
        w7w w7wVar = new w7w((byte) 15);
        w7wVar.b = ynb0Var;
        w7wVar.c = ynb0Var2;
        return w7wVar;
    }

    public static eh50 o(ynb0 ynb0Var) {
        eh50 eh50Var = new eh50((byte) 19);
        eh50Var.b = ynb0Var;
        return eh50Var;
    }

    public static eh50 p(ynb0 ynb0Var) {
        eh50 eh50Var = new eh50((byte) 20);
        eh50Var.b = ynb0Var;
        return eh50Var;
    }

    public static eh50 q(ynb0 ynb0Var) {
        eh50 eh50Var = new eh50((byte) 21);
        eh50Var.b = ynb0Var;
        return eh50Var;
    }

    public static eh50 r(ynb0 ynb0Var) {
        eh50 eh50Var = new eh50((byte) 23);
        eh50Var.b = ynb0Var;
        return eh50Var;
    }

    public static ezc s(hg4 hg4Var) {
        Observable observableH;
        if (hg4Var.c != null) {
            observableH = ((Observable) hg4Var.e.getValue()).map(rzs0.f).distinctUntilChanged();
            observableH.getClass();
        } else {
            observableH = l1d.h(hg4Var.a);
        }
        return yoi1.g(observableH);
    }

    public static zma0 t() {
        return new zma0();
    }

    public static xna0 u() {
        return new xna0();
    }

    public static eua0 v(vql1 vql1Var) {
        return Build.VERSION.SDK_INT >= 30 ? new hua0(vql1Var) : new iua0();
    }

    public static bf70 w(wzp wzpVar) {
        return new bf70(wzpVar, (byte) 6);
    }

    public static bf70 x(q0q q0qVar) {
        return new bf70(q0qVar, (byte) 7);
    }

    public static bf70 y(y0q y0qVar) {
        return new bf70(y0qVar, (byte) 8);
    }

    public static bf70 z(z0q z0qVar) {
        return new bf70(z0qVar, (byte) 9);
    }
}
