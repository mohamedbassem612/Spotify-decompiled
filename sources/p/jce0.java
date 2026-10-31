package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jce0 {
    public static final jce0 a;
    public static final jce0 b;
    public static final /* synthetic */ jce0[] c;

    static {
        jce0 jce0Var = new jce0("CACHE_FIRST", 0);
        a = jce0Var;
        jce0 jce0Var2 = new jce0("REVALIDATE", 1);
        b = jce0Var2;
        c = new jce0[]{jce0Var, jce0Var2};
    }

    public static jce0 valueOf(String str) {
        return (jce0) Enum.valueOf(jce0.class, str);
    }

    public static jce0[] values() {
        return (jce0[]) c.clone();
    }
}
