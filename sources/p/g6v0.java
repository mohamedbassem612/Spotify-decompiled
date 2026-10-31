package p;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g6v0 extends xca {
    public Disposable f;
    public float g;

    @Override // p.xca
    public final void c() {
        this.f = t3k1.n((pta1) this.c.c().l.getValue()).onErrorReturn(new qpp0((byte) 21)).subscribe(new fv5(this, (byte) 14));
    }

    @Override // p.xca
    public final void d() {
        this.f.dispose();
    }

    @Override // p.xca
    public final void e(q881 q881Var, int i) {
        float f = this.g;
        if (f != Float.MIN_VALUE) {
            b(new ts5(Float.valueOf(f)));
        }
    }
}
