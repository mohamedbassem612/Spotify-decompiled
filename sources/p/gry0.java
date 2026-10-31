package p;

import io.reactivex.rxjava3.core.Completable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gry0 implements g1r0 {
    public final hgo a;
    public final vku b = new vku();

    public gry0(hgo hgoVar) {
        this.a = hgoVar;
    }

    public final void c() {
        this.b.a(((Completable) this.a.invoke()).subscribe());
    }

    public final void d() {
        this.b.c();
    }
}
