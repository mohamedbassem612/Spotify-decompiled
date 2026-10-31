package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pv20 {
    public static final pv20 a;
    public static final pv20 b;
    public static final /* synthetic */ pv20[] c;

    static {
        pv20 pv20Var = new pv20("PREMIUM", 0);
        a = pv20Var;
        pv20 pv20Var2 = new pv20("FREE", 1);
        b = pv20Var2;
        c = new pv20[]{pv20Var, pv20Var2};
    }

    public static pv20 valueOf(String str) {
        return (pv20) Enum.valueOf(pv20.class, str);
    }

    public static pv20[] values() {
        return (pv20[]) c.clone();
    }
}
