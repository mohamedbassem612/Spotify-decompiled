package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class onr {
    public final mw7 a;

    public onr(mw7 mw7Var) {
        this.a = mw7Var;
    }

    public final double a() {
        int streamMaxVolume;
        mw7 mw7Var = this.a;
        double d = ((uw7) mw7Var).d();
        try {
            streamMaxVolume = ((uw7) mw7Var).a.getStreamMaxVolume(3);
        } catch (NullPointerException unused) {
            streamMaxVolume = 0;
        }
        return d / ((double) streamMaxVolume);
    }
}
