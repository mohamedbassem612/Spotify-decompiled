package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gej0 {
    public static final gej0 a;
    public static final gej0 b;
    public static final /* synthetic */ gej0[] c;

    static {
        gej0 gej0Var = new gej0("RetryButtonClicked", 0);
        a = gej0Var;
        gej0 gej0Var2 = new gej0("CloseButtonClicked", 1);
        b = gej0Var2;
        c = new gej0[]{gej0Var, gej0Var2};
    }

    public static gej0 valueOf(String str) {
        return (gej0) Enum.valueOf(gej0.class, str);
    }

    public static gej0[] values() {
        return (gej0[]) c.clone();
    }
}
