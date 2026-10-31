package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class m380 {
    public static final s6z0 a;
    public static final s6z0 b;

    static {
        try {
            a = new s6z0(e380.class.getDeclaredField("map"));
            try {
                b = new s6z0(e380.class.getDeclaredField("size"));
            } catch (NoSuchFieldException e) {
                eg.f(e);
            }
        } catch (NoSuchFieldException e2) {
            eg.f(e2);
        }
    }
}
