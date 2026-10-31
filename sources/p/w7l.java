package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class w7l implements ark1 {
    public final zsk1 a;
    public final q900 b;

    public w7l(zsk1 zsk1Var, q900 q900Var) {
        this.a = zsk1Var;
        this.b = q900Var;
    }

    @Override // p.ark1
    public final Observable a() {
        return this.a.t.filter(vrg.R0).map(bbn.R0).distinctUntilChanged();
    }

    @Override // p.ark1
    public final void b(String str, String str2, double d) {
        this.b.accept(new isk1(new xl61(d, str, str2, (v7l) null)));
    }

    @Override // p.ark1
    public final double c() {
        spq0 spq0Var = (spq0) this.a.c.h();
        k0u k0uVar = spq0Var != null ? (k0u) spq0Var.h() : null;
        if (k0uVar != null) {
            return k0uVar.a;
        }
        return -1.0d;
    }

    @Override // p.ark1
    public final void e(String str, String str2, jor jorVar) {
        this.b.accept(new yrk1(new b32(1, str, str2, jorVar)));
    }

    @Override // p.ark1
    public final void h(String str, String str2, jor jorVar) {
        this.b.accept(new yrk1(new b32(2, str, str2, jorVar)));
    }
}
