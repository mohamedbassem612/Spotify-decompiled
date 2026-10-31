package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cug0 {
    public static final cug0 a;
    public static final cug0 b;
    public static final cug0 c;
    public static final /* synthetic */ cug0[] d;

    static {
        cug0 cug0Var = new cug0("DEFAULT", 0);
        a = cug0Var;
        cug0 cug0Var2 = new cug0("GBB", 1);
        b = cug0Var2;
        cug0 cug0Var3 = new cug0("UNKNOWN", 2);
        c = cug0Var3;
        d = new cug0[]{cug0Var, cug0Var2, cug0Var3};
    }

    public static cug0 valueOf(String str) {
        return (cug0) Enum.valueOf(cug0.class, str);
    }

    public static cug0[] values() {
        return (cug0[]) d.clone();
    }
}
