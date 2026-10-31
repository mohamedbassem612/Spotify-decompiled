package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mpq0 {
    public static final mpq0 a;
    public static final mpq0 b;
    public static final mpq0 c;
    public static final /* synthetic */ mpq0[] d;

    static {
        mpq0 mpq0Var = new mpq0("ALARM", 0);
        a = mpq0Var;
        mpq0 mpq0Var2 = new mpq0("DEFAULT", 1);
        b = mpq0Var2;
        mpq0 mpq0Var3 = new mpq0("UNKNOWN_STREAMTYPE", 2);
        c = mpq0Var3;
        d = new mpq0[]{mpq0Var, mpq0Var2, mpq0Var3};
    }

    public static mpq0 valueOf(String str) {
        return (mpq0) Enum.valueOf(mpq0.class, str);
    }

    public static mpq0[] values() {
        return (mpq0[]) d.clone();
    }
}
