package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cr9 {
    public static final cr9 a;
    public static final cr9 b;
    public static final cr9 c;
    public static final /* synthetic */ cr9[] d;

    static {
        cr9 cr9Var = new cr9("NON_MUSIC_CHOSEN", 0);
        a = cr9Var;
        cr9 cr9Var2 = new cr9("RESTRICTION_LIFTED", 1);
        b = cr9Var2;
        cr9 cr9Var3 = new cr9("OBSERVATION_FAILED", 2);
        c = cr9Var3;
        d = new cr9[]{cr9Var, cr9Var2, cr9Var3};
    }

    public static cr9 valueOf(String str) {
        return (cr9) Enum.valueOf(cr9.class, str);
    }

    public static cr9[] values() {
        return (cr9[]) d.clone();
    }
}
