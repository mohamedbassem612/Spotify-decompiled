package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wly0 {
    public static final wly0 a;
    public static final wly0 b;
    public static final wly0 c;
    public static final wly0 d;
    public static final wly0 e;
    public static final /* synthetic */ wly0[] f;

    static {
        wly0 wly0Var = new wly0("Dodo", 0);
        a = wly0Var;
        wly0 wly0Var2 = new wly0("Connect", 1);
        b = wly0Var2;
        wly0 wly0Var3 = new wly0("Jam", 2);
        c = wly0Var3;
        wly0 wly0Var4 = new wly0("Bluetooth", 3);
        d = wly0Var4;
        wly0 wly0Var5 = new wly0("AppleTv", 4);
        e = wly0Var5;
        f = new wly0[]{wly0Var, wly0Var2, wly0Var3, wly0Var4, wly0Var5};
    }

    public static wly0 valueOf(String str) {
        return (wly0) Enum.valueOf(wly0.class, str);
    }

    public static wly0[] values() {
        return (wly0[]) f.clone();
    }
}
