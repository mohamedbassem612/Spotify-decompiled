package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jix0 {
    public static final jix0 a;
    public static final jix0 b;
    public static final /* synthetic */ jix0[] c;

    static {
        jix0 jix0Var = new jix0("PAUSED", 0);
        a = jix0Var;
        jix0 jix0Var2 = new jix0("RESUMED", 1);
        b = jix0Var2;
        c = new jix0[]{jix0Var, jix0Var2};
    }

    public static jix0 valueOf(String str) {
        return (jix0) Enum.valueOf(jix0.class, str);
    }

    public static jix0[] values() {
        return (jix0[]) c.clone();
    }
}
