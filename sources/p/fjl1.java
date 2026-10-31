package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@o661
public final class fjl1 {
    public static final ejl1 Companion;
    public static final znb0 a;
    public static final fjl1 b;
    public static final fjl1 c;
    public static final fjl1 d;
    public static final fjl1 e;
    public static final /* synthetic */ fjl1[] f;

    static {
        fjl1 fjl1Var = new fjl1("NO_URL", 0);
        b = fjl1Var;
        fjl1 fjl1Var2 = new fjl1("NO_URL_DELAYED", 1);
        c = fjl1Var2;
        fjl1 fjl1Var3 = new fjl1("SHOW_WEB", 2);
        d = fjl1Var3;
        fjl1 fjl1Var4 = new fjl1("WEB_ERROR", 3);
        e = fjl1Var4;
        f = new fjl1[]{fjl1Var, fjl1Var2, fjl1Var3, fjl1Var4};
        Companion = new ejl1();
        a = dm5.S(2, w3l1.P0);
    }

    public static fjl1 valueOf(String str) {
        return (fjl1) Enum.valueOf(fjl1.class, str);
    }

    public static fjl1[] values() {
        return (fjl1[]) f.clone();
    }
}
