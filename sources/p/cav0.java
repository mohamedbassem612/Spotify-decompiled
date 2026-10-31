package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cav0 {
    public static final cav0 a;
    public static final cav0 b;
    public static final cav0 c;
    public static final /* synthetic */ cav0[] d;

    static {
        cav0 cav0Var = new cav0("Initial", 0);
        a = cav0Var;
        cav0 cav0Var2 = new cav0("Main", 1);
        b = cav0Var2;
        cav0 cav0Var3 = new cav0("Final", 2);
        c = cav0Var3;
        d = new cav0[]{cav0Var, cav0Var2, cav0Var3};
    }

    public static cav0 valueOf(String str) {
        return (cav0) Enum.valueOf(cav0.class, str);
    }

    public static cav0[] values() {
        return (cav0[]) d.clone();
    }
}
