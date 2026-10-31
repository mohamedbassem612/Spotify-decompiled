package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g890 {
    public final int a;
    public final int b;
    public final Object c;

    public g890(int i, int i2, Object obj) {
        this.a = i;
        this.b = i2;
        this.c = obj;
        if (i < 0) {
            tf80.a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        tf80.a("size should be > 0");
    }
}
