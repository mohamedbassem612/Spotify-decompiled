package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kk10 {
    public static final kk10 a;
    public static final kk10 b;
    public static final kk10 c;
    public static final /* synthetic */ kk10[] d;

    static {
        kk10 kk10Var = new kk10("SUCCESS", 0);
        a = kk10Var;
        kk10 kk10Var2 = new kk10("INVALID_CODE", 1);
        b = kk10Var2;
        kk10 kk10Var3 = new kk10("ALREADY_REDEEMED", 2);
        c = kk10Var3;
        d = new kk10[]{kk10Var, kk10Var2, kk10Var3};
    }

    public static kk10 valueOf(String str) {
        return (kk10) Enum.valueOf(kk10.class, str);
    }

    public static kk10[] values() {
        return (kk10[]) d.clone();
    }
}
