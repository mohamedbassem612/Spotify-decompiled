package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g4o0 {
    public static final g4o0 a;
    public static final g4o0 b;
    public static final g4o0 c;
    public static final /* synthetic */ g4o0[] d;

    static {
        g4o0 g4o0Var = new g4o0("AlreadyGranted", 0);
        a = g4o0Var;
        g4o0 g4o0Var2 = new g4o0("NewlyGranted", 1);
        b = g4o0Var2;
        g4o0 g4o0Var3 = new g4o0("NotGranted", 2);
        c = g4o0Var3;
        d = new g4o0[]{g4o0Var, g4o0Var2, g4o0Var3};
    }

    public static g4o0 valueOf(String str) {
        return (g4o0) Enum.valueOf(g4o0.class, str);
    }

    public static g4o0[] values() {
        return (g4o0[]) d.clone();
    }
}
