package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class flb0 {
    public static final flb0 a;
    public static final flb0 b;
    public static final /* synthetic */ flb0[] c;

    static {
        flb0 flb0Var = new flb0("Ltr", 0);
        a = flb0Var;
        flb0 flb0Var2 = new flb0("Rtl", 1);
        b = flb0Var2;
        c = new flb0[]{flb0Var, flb0Var2};
    }

    public static flb0 valueOf(String str) {
        return (flb0) Enum.valueOf(flb0.class, str);
    }

    public static flb0[] values() {
        return (flb0[]) c.clone();
    }
}
