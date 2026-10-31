package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ld31 implements es31 {
    public final kf01 a;

    public ld31(kf01 kf01Var) {
        this.a = kf01Var;
    }

    @Override // p.es31
    public final kf01 a() {
        return this.a;
    }

    @Override // p.es31
    public final ds31 c() {
        throw new IllegalStateException("already connected");
    }

    @Override // p.es31, p.rl00
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // p.es31
    public final ds31 f() {
        throw new IllegalStateException("already connected");
    }

    @Override // p.es31
    public final boolean isReady() {
        return true;
    }

    @Override // p.es31
    public final es31 p() {
        throw new IllegalStateException("unexpected retry");
    }
}
