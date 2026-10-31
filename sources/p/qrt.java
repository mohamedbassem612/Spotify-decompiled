package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface qrt {
    boolean a();

    default boolean b() {
        return c() == 1 || c() == 2;
    }

    int c();
}
