package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c0s0 {
    public static final c0s0 a;
    public static final c0s0 b;
    public static final c0s0 c;
    public static final c0s0 d;
    public static final c0s0 e;
    public static final c0s0 f;
    public static final /* synthetic */ c0s0[] g;

    static {
        c0s0 c0s0Var = new c0s0("LINK_TAPPED", 0);
        a = c0s0Var;
        c0s0 c0s0Var2 = new c0s0("DISMISSED_SWIPED_DOWN", 1);
        b = c0s0Var2;
        c0s0 c0s0Var3 = new c0s0("DISMISSED_BACK_PRESSED", 2);
        c = c0s0Var3;
        c0s0 c0s0Var4 = new c0s0("BLOCK_TAPPED", 3);
        d = c0s0Var4;
        c0s0 c0s0Var5 = new c0s0("BLOCK_CANCELLED", 4);
        e = c0s0Var5;
        c0s0 c0s0Var6 = new c0s0("BLOCK_CONFIRMED", 5);
        f = c0s0Var6;
        g = new c0s0[]{c0s0Var, c0s0Var2, c0s0Var3, c0s0Var4, c0s0Var5, c0s0Var6};
    }

    public static c0s0 valueOf(String str) {
        return (c0s0) Enum.valueOf(c0s0.class, str);
    }

    public static c0s0[] values() {
        return (c0s0[]) g.clone();
    }
}
