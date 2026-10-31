package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class fm5 implements Runnable {
    public final /* synthetic */ int a;

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        if (dhn.a.contains(gm5.class)) {
            return;
        }
        try {
            gm5.d(i);
        } catch (Throwable th) {
            dhn.a(gm5.class, th);
        }
    }
}
