package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wte0 {
    public static final wte0 a;
    public static final wte0 b;
    public static final /* synthetic */ wte0[] c;

    static {
        wte0 wte0Var = new wte0("LOGIN", 0);
        a = wte0Var;
        wte0 wte0Var2 = new wte0("LOGOUT", 1);
        b = wte0Var2;
        c = new wte0[]{wte0Var, wte0Var2};
    }

    public static wte0 valueOf(String str) {
        return (wte0) Enum.valueOf(wte0.class, str);
    }

    public static wte0[] values() {
        return (wte0[]) c.clone();
    }
}
