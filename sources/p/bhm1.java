package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bhm1 {
    public static final bhm1 a;
    public static final bhm1 b;
    public static final bhm1 c;
    public static final /* synthetic */ bhm1[] d;

    static {
        bhm1 bhm1Var = new bhm1("Handled", 0);
        a = bhm1Var;
        bhm1 bhm1Var2 = new bhm1("Ignored", 1);
        b = bhm1Var2;
        bhm1 bhm1Var3 = new bhm1("Retryable", 2);
        c = bhm1Var3;
        d = new bhm1[]{bhm1Var, bhm1Var2, bhm1Var3};
    }

    public static bhm1 valueOf(String str) {
        return (bhm1) Enum.valueOf(bhm1.class, str);
    }

    public static bhm1[] values() {
        return (bhm1[]) d.clone();
    }
}
