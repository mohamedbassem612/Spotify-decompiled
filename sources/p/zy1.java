package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zy1 implements bz1 {
    public static final zy1 a;
    public static final zy1 b;
    public static final zy1 c;
    public static final zy1 d;
    public static final zy1 e;
    public static final zy1 f;
    public static final /* synthetic */ zy1[] g;

    static {
        zy1 zy1Var = new zy1("MftDisallowReason", 0);
        a = zy1Var;
        zy1 zy1Var2 = new zy1("NotPlayingContextReason", 1);
        b = zy1Var2;
        zy1 zy1Var3 = new zy1("MftUpsellReason", 2);
        c = zy1Var3;
        zy1 zy1Var4 = new zy1("Restricted", 3);
        d = zy1Var4;
        zy1 zy1Var5 = new zy1("UnsupportedUriType", 4);
        e = zy1Var5;
        zy1 zy1Var6 = new zy1("GeneralError", 5);
        f = zy1Var6;
        g = new zy1[]{zy1Var, zy1Var2, zy1Var3, zy1Var4, zy1Var5, zy1Var6};
    }

    public static zy1 valueOf(String str) {
        return (zy1) Enum.valueOf(zy1.class, str);
    }

    public static zy1[] values() {
        return (zy1[]) g.clone();
    }
}
