package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class h7g1 {
    public static final ThreadLocal a = new ThreadLocal();

    public static o7g1 a() {
        return (o7g1) a.get();
    }

    public static ThreadLocal b() {
        return a;
    }
}
