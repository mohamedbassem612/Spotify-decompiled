package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ij10 {
    public static final ij10 a;
    public static final ij10 b;
    public static final ij10 c;
    public static final /* synthetic */ ij10[] d;

    static {
        ij10 ij10Var = new ij10("CardClicked", 0);
        a = ij10Var;
        ij10 ij10Var2 = new ij10("PremiumCtaButtonClicked", 1);
        b = ij10Var2;
        ij10 ij10Var3 = new ij10("FreeLockedCtaButtonClicked", 2);
        c = ij10Var3;
        d = new ij10[]{ij10Var, ij10Var2, ij10Var3};
    }

    public static ij10 valueOf(String str) {
        return (ij10) Enum.valueOf(ij10.class, str);
    }

    public static ij10[] values() {
        return (ij10[]) d.clone();
    }
}
