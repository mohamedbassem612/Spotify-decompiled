package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class oac {
    public int a;

    public final void e(int i) {
        this.a = i | this.a;
    }

    public final boolean f(int i) {
        return (this.a & i) == i;
    }
}
