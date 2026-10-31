package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eq10 {
    public static final eq10 a;
    public static final eq10 b;
    public static final eq10 c;
    public static final /* synthetic */ eq10[] d;

    static {
        eq10 eq10Var = new eq10("DM", 0);
        a = eq10Var;
        eq10 eq10Var2 = new eq10("Group", 1);
        b = eq10Var2;
        eq10 eq10Var3 = new eq10("Following", 2);
        c = eq10Var3;
        d = new eq10[]{eq10Var, eq10Var2, eq10Var3};
    }

    public static eq10 valueOf(String str) {
        return (eq10) Enum.valueOf(eq10.class, str);
    }

    public static eq10[] values() {
        return (eq10[]) d.clone();
    }
}
