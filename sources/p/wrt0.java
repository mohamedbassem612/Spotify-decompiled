package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wrt0 {
    public static final wrt0 a;
    public static final wrt0 b;
    public static final wrt0 c;
    public static final /* synthetic */ wrt0[] d;

    static {
        wrt0 wrt0Var = new wrt0("PLAYING", 0);
        a = wrt0Var;
        wrt0 wrt0Var2 = new wrt0("PAUSED", 1);
        b = wrt0Var2;
        wrt0 wrt0Var3 = new wrt0("NONE", 2);
        c = wrt0Var3;
        d = new wrt0[]{wrt0Var, wrt0Var2, wrt0Var3};
    }

    public static wrt0 valueOf(String str) {
        return (wrt0) Enum.valueOf(wrt0.class, str);
    }

    public static wrt0[] values() {
        return (wrt0[]) d.clone();
    }
}
