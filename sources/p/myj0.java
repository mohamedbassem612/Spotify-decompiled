package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class myj0 implements eck1 {
    public final int a;

    public myj0(int i) {
        this.a = i;
    }

    public final xbk1 b(Class cls) {
        if (cls.isAssignableFrom(oyj0.class)) {
            return new oyj0(this.a);
        }
        hhg1.n("Failed requirement.");
        return null;
    }
}
