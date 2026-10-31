package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xbf0 {
    public static final xbf0 a;
    public static final xbf0 b;
    public static final xbf0 c;
    public static final xbf0 d;
    public static final xbf0 e;
    public static final xbf0 f;
    public static final /* synthetic */ xbf0[] g;

    static {
        xbf0 xbf0Var = new xbf0("SET_ANIMATION", 0);
        a = xbf0Var;
        xbf0 xbf0Var2 = new xbf0("SET_PROGRESS", 1);
        b = xbf0Var2;
        xbf0 xbf0Var3 = new xbf0("SET_REPEAT_MODE", 2);
        c = xbf0Var3;
        xbf0 xbf0Var4 = new xbf0("SET_REPEAT_COUNT", 3);
        d = xbf0Var4;
        xbf0 xbf0Var5 = new xbf0("SET_IMAGE_ASSETS", 4);
        e = xbf0Var5;
        xbf0 xbf0Var6 = new xbf0("PLAY_OPTION", 5);
        f = xbf0Var6;
        g = new xbf0[]{xbf0Var, xbf0Var2, xbf0Var3, xbf0Var4, xbf0Var5, xbf0Var6};
    }

    public static xbf0 valueOf(String str) {
        return (xbf0) Enum.valueOf(xbf0.class, str);
    }

    public static xbf0[] values() {
        return (xbf0[]) g.clone();
    }
}
