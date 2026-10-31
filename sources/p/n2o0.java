package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n2o0 {
    public static final n2o0 a;
    public static final n2o0 b;
    public static final n2o0 c;
    public static final /* synthetic */ n2o0[] d;

    static {
        n2o0 n2o0Var = new n2o0("Granted", 0);
        a = n2o0Var;
        n2o0 n2o0Var2 = new n2o0("Denied", 1);
        b = n2o0Var2;
        n2o0 n2o0Var3 = new n2o0("Dismissed", 2);
        c = n2o0Var3;
        d = new n2o0[]{n2o0Var, n2o0Var2, n2o0Var3};
    }

    public static n2o0 valueOf(String str) {
        return (n2o0) Enum.valueOf(n2o0.class, str);
    }

    public static n2o0[] values() {
        return (n2o0[]) d.clone();
    }
}
