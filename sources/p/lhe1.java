package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lhe1 {
    public static final lhe1 a;
    public static final lhe1 b;
    public static final /* synthetic */ lhe1[] c;

    static {
        lhe1 lhe1Var = new lhe1("ACTIVATED", 0);
        a = lhe1Var;
        lhe1 lhe1Var2 = new lhe1("NOT_ACTIVATED", 1);
        b = lhe1Var2;
        c = new lhe1[]{lhe1Var, lhe1Var2};
    }

    public static lhe1 valueOf(String str) {
        return (lhe1) Enum.valueOf(lhe1.class, str);
    }

    public static lhe1[] values() {
        return (lhe1[]) c.clone();
    }
}
