package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface dhg1 {
    Object b();

    Object e();

    default boolean f(Object obj, Object obj2) {
        return obj.equals(e()) && obj2.equals(b());
    }
}
