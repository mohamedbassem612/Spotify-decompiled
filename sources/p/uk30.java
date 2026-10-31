package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uk30 extends RuntimeException {
    public final int a;
    public final Throwable b;

    public uk30(int i, Throwable th) {
        super(th);
        this.a = i;
        this.b = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.b;
    }
}
