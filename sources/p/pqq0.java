package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pqq0 {
    public static final pqq0 a;
    public static final pqq0 b;
    public static final /* synthetic */ pqq0[] c;

    static {
        pqq0 pqq0Var = new pqq0("PORTRAIT", 0);
        a = pqq0Var;
        pqq0 pqq0Var2 = new pqq0("LANDSCAPE", 1);
        b = pqq0Var2;
        c = new pqq0[]{pqq0Var, pqq0Var2};
    }

    public static pqq0 valueOf(String str) {
        return (pqq0) Enum.valueOf(pqq0.class, str);
    }

    public static pqq0[] values() {
        return (pqq0[]) c.clone();
    }
}
