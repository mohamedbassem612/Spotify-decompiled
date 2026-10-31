package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class b46 {
    public static final int a;

    static {
        Object m231Var;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            m231Var = property != null ? nhc1.c0(property) : null;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Integer num = (Integer) (m231Var instanceof m231 ? null : m231Var);
        a = num != null ? num.intValue() : 2097152;
    }
}
