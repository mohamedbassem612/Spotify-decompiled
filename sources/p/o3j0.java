package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o3j0 {
    public static final o3j0 a;
    public static final o3j0 b;
    public static final /* synthetic */ o3j0[] c;

    static {
        o3j0 o3j0Var = new o3j0("PRESENT", 0);
        a = o3j0Var;
        o3j0 o3j0Var2 = new o3j0("DISCARD", 1);
        o3j0 o3j0Var3 = new o3j0("QUEUE", 2);
        b = o3j0Var3;
        c = new o3j0[]{o3j0Var, o3j0Var2, o3j0Var3};
    }

    public static o3j0 valueOf(String str) {
        return (o3j0) Enum.valueOf(o3j0.class, str);
    }

    public static o3j0[] values() {
        return (o3j0[]) c.clone();
    }
}
