package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jh10 implements es31 {
    public final ds31 a;

    public jh10(Throwable th) {
        this.a = new ds31(this, th, 2);
    }

    @Override // p.es31
    public final kf01 a() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // p.es31
    public final ds31 c() {
        return this.a;
    }

    @Override // p.es31, p.rl00
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // p.es31
    public final ds31 f() {
        return this.a;
    }

    @Override // p.es31
    public final boolean isReady() {
        return false;
    }

    @Override // p.es31
    public final es31 p() {
        throw new IllegalStateException("unexpected retry");
    }
}
