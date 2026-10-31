package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class se90 extends iaa0 {
    public static final /* synthetic */ long h = avg.a.objectFieldOffset(se90.class.getDeclaredField("_invoked$volatile"));
    private volatile /* synthetic */ int _invoked$volatile;
    public final v6a g;

    public se90(v6a v6aVar) {
        this.g = v6aVar;
    }

    public final boolean k() {
        return true;
    }

    public final void l(Throwable th) {
        if (avg.a.compareAndSwapInt(this, h, 0, 1)) {
            this.g.invoke(th);
        }
    }
}
