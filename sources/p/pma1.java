package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pma1 {
    public static final pma1 a;
    public static final pma1 b;
    public static final /* synthetic */ pma1[] c;

    static {
        pma1 pma1Var = new pma1("MEDIUM", 0);
        a = pma1Var;
        pma1 pma1Var2 = new pma1("LARGE", 1);
        b = pma1Var2;
        c = new pma1[]{pma1Var, pma1Var2};
    }

    public static pma1 valueOf(String str) {
        return (pma1) Enum.valueOf(pma1.class, str);
    }

    public static pma1[] values() {
        return (pma1[]) c.clone();
    }
}
