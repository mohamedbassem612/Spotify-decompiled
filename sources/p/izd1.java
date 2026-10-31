package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class izd1 {
    public static final boolean a;

    static {
        boolean z;
        try {
            Class.forName("org.robolectric.Robolectric");
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        a = z;
    }
}
