package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m5p0 {
    public static final m5p0 a;
    public static final m5p0 b;
    public static final m5p0 c;
    public static final /* synthetic */ m5p0[] d;

    static {
        m5p0 m5p0Var = new m5p0("Eligible", 0);
        a = m5p0Var;
        m5p0 m5p0Var2 = new m5p0("NotEligible", 1);
        b = m5p0Var2;
        m5p0 m5p0Var3 = new m5p0("Inconclusive", 2);
        c = m5p0Var3;
        d = new m5p0[]{m5p0Var, m5p0Var2, m5p0Var3};
    }

    public static m5p0 valueOf(String str) {
        return (m5p0) Enum.valueOf(m5p0.class, str);
    }

    public static m5p0[] values() {
        return (m5p0[]) d.clone();
    }
}
