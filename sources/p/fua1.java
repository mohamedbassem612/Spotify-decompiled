package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fua1 {
    public static final fua1 a;
    public static final fua1 b;
    public static final fua1 c;
    public static final fua1 d;
    public static final /* synthetic */ fua1[] e;

    static {
        fua1 fua1Var = new fua1("OptIn", 0);
        a = fua1Var;
        fua1 fua1Var2 = new fua1("AdjustedSpeedDisclosure", 1);
        b = fua1Var2;
        fua1 fua1Var3 = new fua1("AdjustedSpeedDisclosureWithOptOutGuidance", 2);
        c = fua1Var3;
        fua1 fua1Var4 = new fua1("TurnOffSpeedChangesConfirmation", 3);
        d = fua1Var4;
        e = new fua1[]{fua1Var, fua1Var2, fua1Var3, fua1Var4};
    }

    public static fua1 valueOf(String str) {
        return (fua1) Enum.valueOf(fua1.class, str);
    }

    public static fua1[] values() {
        return (fua1[]) e.clone();
    }
}
