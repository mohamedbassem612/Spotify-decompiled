package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class y5g1 {
    public static final y5g1 a;
    public static final y5g1 b;
    public static final y5g1 c;
    public static final /* synthetic */ y5g1[] d;

    static {
        y5g1 y5g1Var = new y5g1("Trailer", 0);
        a = y5g1Var;
        y5g1 y5g1Var2 = new y5g1("Sample", 1);
        b = y5g1Var2;
        y5g1 y5g1Var3 = new y5g1("None", 2);
        c = y5g1Var3;
        d = new y5g1[]{y5g1Var, y5g1Var2, y5g1Var3};
    }

    public static y5g1 valueOf(String str) {
        return (y5g1) Enum.valueOf(y5g1.class, str);
    }

    public static y5g1[] values() {
        return (y5g1[]) d.clone();
    }
}
