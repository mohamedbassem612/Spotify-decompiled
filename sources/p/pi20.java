package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pi20 {
    public static final pi20 a;
    public static final pi20 b;
    public static final pi20 c;
    public static final pi20 d;
    public static final /* synthetic */ pi20[] e;

    static {
        pi20 pi20Var = new pi20("AD_STORAGE", 0);
        a = pi20Var;
        pi20 pi20Var2 = new pi20("ANALYTICS_STORAGE", 1);
        b = pi20Var2;
        pi20 pi20Var3 = new pi20("AD_USER_DATA", 2);
        c = pi20Var3;
        pi20 pi20Var4 = new pi20("AD_PERSONALIZATION", 3);
        d = pi20Var4;
        e = new pi20[]{pi20Var, pi20Var2, pi20Var3, pi20Var4};
    }

    public static pi20 valueOf(String str) {
        return (pi20) Enum.valueOf(pi20.class, str);
    }

    public static pi20[] values() {
        return (pi20[]) e.clone();
    }
}
