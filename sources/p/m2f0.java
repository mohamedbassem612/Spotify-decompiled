package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m2f0 {
    public static final m2f0 a;
    public static final m2f0 b;
    public static final /* synthetic */ m2f0[] c;

    static {
        m2f0 m2f0Var = new m2f0("LOGGED_IN", 0);
        a = m2f0Var;
        m2f0 m2f0Var2 = new m2f0("LOGGED_OUT", 1);
        b = m2f0Var2;
        c = new m2f0[]{m2f0Var, m2f0Var2};
    }

    public static m2f0 valueOf(String str) {
        return (m2f0) Enum.valueOf(m2f0.class, str);
    }

    public static m2f0[] values() {
        return (m2f0[]) c.clone();
    }
}
