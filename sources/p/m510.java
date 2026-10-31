package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m510 {
    public static final m510 a;
    public static final m510 b;
    public static final m510 c;
    public static final /* synthetic */ m510[] d;

    static {
        m510 m510Var = new m510("StaleCache", 0);
        a = m510Var;
        m510 m510Var2 = new m510("Cache", 1);
        b = m510Var2;
        m510 m510Var3 = new m510("Network", 2);
        c = m510Var3;
        d = new m510[]{m510Var, m510Var2, m510Var3};
    }

    public static m510 valueOf(String str) {
        return (m510) Enum.valueOf(m510.class, str);
    }

    public static m510[] values() {
        return (m510[]) d.clone();
    }
}
