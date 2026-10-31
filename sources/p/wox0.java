package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wox0 {
    public static final wox0 a;
    public static final wox0 b;
    public static final wox0 c;
    public static final wox0 d;
    public static final wox0 e;
    public static final wox0 f;
    public static final wox0 g;
    public static final /* synthetic */ wox0[] h;

    static {
        wox0 wox0Var = new wox0("QUEUED", 0);
        a = wox0Var;
        wox0 wox0Var2 = new wox0("PRESENTED", 1);
        b = wox0Var2;
        wox0 wox0Var3 = new wox0("DISMISSED_BY_TIMEOUT", 2);
        c = wox0Var3;
        wox0 wox0Var4 = new wox0("DISMISSED_BY_REQUEST", 3);
        d = wox0Var4;
        wox0 wox0Var5 = new wox0("DISMISSED_BY_SURFACE", 4);
        e = wox0Var5;
        wox0 wox0Var6 = new wox0("DISMISSED_BY_USER", 5);
        f = wox0Var6;
        wox0 wox0Var7 = new wox0("COULD_NOT_BE_PRESENTED", 6);
        g = wox0Var7;
        h = new wox0[]{wox0Var, wox0Var2, wox0Var3, wox0Var4, wox0Var5, wox0Var6, wox0Var7};
    }

    public static wox0 valueOf(String str) {
        return (wox0) Enum.valueOf(wox0.class, str);
    }

    public static wox0[] values() {
        return (wox0[]) h.clone();
    }
}
