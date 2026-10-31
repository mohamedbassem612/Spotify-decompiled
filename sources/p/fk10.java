package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fk10 {
    public static final fk10 a;
    public static final fk10 b;
    public static final /* synthetic */ fk10[] c;

    static {
        fk10 fk10Var = new fk10("INVALID_CODE", 0);
        a = fk10Var;
        fk10 fk10Var2 = new fk10("UNABLE_TO_VERIFY", 1);
        b = fk10Var2;
        c = new fk10[]{fk10Var, fk10Var2};
    }

    public static fk10 valueOf(String str) {
        return (fk10) Enum.valueOf(fk10.class, str);
    }

    public static fk10[] values() {
        return (fk10[]) c.clone();
    }
}
