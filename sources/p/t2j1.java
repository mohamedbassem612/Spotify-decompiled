package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t2j1 {
    public static final t2j1 a;
    public static final t2j1 b;
    public static final t2j1 c;
    public static final /* synthetic */ t2j1[] d;

    static {
        t2j1 t2j1Var = new t2j1("VERIFIED", 0);
        a = t2j1Var;
        t2j1 t2j1Var2 = new t2j1("INELIGIBLE", 1);
        b = t2j1Var2;
        t2j1 t2j1Var3 = new t2j1("VERIFICATION_NEEDED", 2);
        c = t2j1Var3;
        d = new t2j1[]{t2j1Var, t2j1Var2, t2j1Var3};
    }

    public static t2j1 valueOf(String str) {
        return (t2j1) Enum.valueOf(t2j1.class, str);
    }

    public static t2j1[] values() {
        return (t2j1[]) d.clone();
    }
}
