package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class iqq0 {
    public static final iqq0 a;
    public static final iqq0 b;
    public static final iqq0 c;
    public static final iqq0 d;
    public static final /* synthetic */ iqq0[] e;

    static {
        iqq0 iqq0Var = new iqq0("NOT_LOADED", 0);
        a = iqq0Var;
        iqq0 iqq0Var2 = new iqq0("LOADING", 1);
        b = iqq0Var2;
        iqq0 iqq0Var3 = new iqq0("LOADED", 2);
        c = iqq0Var3;
        iqq0 iqq0Var4 = new iqq0("FAILED_TO_LOAD", 3);
        d = iqq0Var4;
        e = new iqq0[]{iqq0Var, iqq0Var2, iqq0Var3, iqq0Var4};
    }

    public static iqq0 valueOf(String str) {
        return (iqq0) Enum.valueOf(iqq0.class, str);
    }

    public static iqq0[] values() {
        return (iqq0[]) e.clone();
    }
}
