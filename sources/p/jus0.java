package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jus0 {
    public static final jus0 a;
    public static final jus0 b;
    public static final /* synthetic */ jus0[] c;

    static {
        jus0 jus0Var = new jus0("Idle", 0);
        a = jus0Var;
        jus0 jus0Var2 = new jus0("Invalid", 1);
        b = jus0Var2;
        c = new jus0[]{jus0Var, jus0Var2};
    }

    public static jus0 valueOf(String str) {
        return (jus0) Enum.valueOf(jus0.class, str);
    }

    public static jus0[] values() {
        return (jus0[]) c.clone();
    }
}
