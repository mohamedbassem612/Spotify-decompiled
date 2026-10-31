package p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hgg0 {
    public final gj10 a;
    public final uh8 b;
    public final o241 c;

    public hgg0(gj10 gj10Var, uh8 uh8Var, o241 o241Var) {
        this.a = gj10Var;
        this.b = uh8Var;
        this.c = o241Var;
    }

    public final Single a() {
        return Single.zip(((p241) this.c).a("allow-managed-accounts-auto-save", "false").map(qs10.O0).take(1L).single(Boolean.FALSE), this.b.a().map(as10.N0), y580.h1).concatMap(new yfc0(this, (byte) 12));
    }
}
