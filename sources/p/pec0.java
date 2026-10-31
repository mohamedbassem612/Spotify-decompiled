package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pec0 {
    public static final pec0 a;
    public static final pec0 b;
    public static final /* synthetic */ pec0[] c;

    static {
        pec0 pec0Var = new pec0("OnApplyFilter", 0);
        a = pec0Var;
        pec0 pec0Var2 = new pec0("OnClearFilter", 1);
        b = pec0Var2;
        c = new pec0[]{pec0Var, pec0Var2};
    }

    public static pec0 valueOf(String str) {
        return (pec0) Enum.valueOf(pec0.class, str);
    }

    public static pec0[] values() {
        return (pec0[]) c.clone();
    }
}
