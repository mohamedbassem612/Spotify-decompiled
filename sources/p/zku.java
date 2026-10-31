package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zku implements bgd {
    public final qku a;

    public zku(qku qkuVar) {
        this.a = qkuVar;
    }

    @Override // p.bgd
    public final void a(Throwable th) {
        this.a.dispose();
    }

    public final String toString() {
        return "DisposeOnCancel[" + this.a + ']';
    }
}
