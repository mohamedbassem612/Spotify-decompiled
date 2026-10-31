package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class phe0 {
    public static final phe0 a;
    public static final phe0 b;
    public static final phe0 c;
    public static final /* synthetic */ phe0[] d;

    static {
        phe0 phe0Var = new phe0("ACQUIRED", 0);
        a = phe0Var;
        phe0 phe0Var2 = new phe0("FAILED", 1);
        b = phe0Var2;
        phe0 phe0Var3 = new phe0("SKIPPED", 2);
        c = phe0Var3;
        d = new phe0[]{phe0Var, phe0Var2, phe0Var3};
    }

    public static phe0 valueOf(String str) {
        return (phe0) Enum.valueOf(phe0.class, str);
    }

    public static phe0[] values() {
        return (phe0[]) d.clone();
    }
}
