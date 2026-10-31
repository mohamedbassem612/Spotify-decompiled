package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ywi0 {
    public static final ywi0 a;
    public static final ywi0 b;
    public static final ywi0 c;
    public static final ywi0 d;
    public static final ywi0 e;
    public static final ywi0 f;
    public static final /* synthetic */ ywi0[] g;

    static {
        ywi0 ywi0Var = new ywi0("APPLE_TV_APP_NOT_INSTALLED", 0);
        a = ywi0Var;
        ywi0 ywi0Var2 = new ywi0("EMP", 1);
        b = ywi0Var2;
        ywi0 ywi0Var3 = new ywi0("LOSSLESS", 2);
        c = ywi0Var3;
        ywi0 ywi0Var4 = new ywi0("PUFFIN", 3);
        d = ywi0Var4;
        ywi0 ywi0Var5 = new ywi0("PERMISSIONS", 4);
        e = ywi0Var5;
        ywi0 ywi0Var6 = new ywi0("CONNECT_DEBUG", 5);
        f = ywi0Var6;
        g = new ywi0[]{ywi0Var, ywi0Var2, ywi0Var3, ywi0Var4, ywi0Var5, ywi0Var6};
    }

    public static ywi0 valueOf(String str) {
        return (ywi0) Enum.valueOf(ywi0.class, str);
    }

    public static ywi0[] values() {
        return (ywi0[]) g.clone();
    }
}
