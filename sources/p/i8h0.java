package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class i8h0 implements ark1 {
    public final q900 a;
    public final double b;
    public final Observable c;

    public i8h0(zsk1 zsk1Var, q900 q900Var) {
        this.a = q900Var;
        spq0 spq0Var = (spq0) zsk1Var.d.h();
        k0u k0uVar = spq0Var != null ? (k0u) spq0Var.h() : null;
        this.b = k0uVar != null ? k0uVar.a : -1.0d;
        this.c = zsk1Var.X.filter(yj20.Z).map(zj20.Z).distinctUntilChanged();
    }

    public final Observable a() {
        return this.c;
    }

    public final void b(String str, String str2, double d) {
        this.a.accept(new ksk1(new xl61(d, str, str2, (v7l) null)));
    }

    public final double c() {
        return this.b;
    }

    public final void e(String str, String str2, jor jorVar) {
        this.a.accept(new ask1(new b32(1, str, str2, jorVar)));
    }

    public final void h(String str, String str2, jor jorVar) {
        this.a.accept(new ask1(new b32(2, str, str2, jorVar)));
    }
}
