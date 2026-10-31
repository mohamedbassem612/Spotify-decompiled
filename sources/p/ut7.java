package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ut7 {
    public static final ut7 a;
    public static final ut7 b;
    public static final /* synthetic */ ut7[] c;

    static {
        ut7 ut7Var = new ut7("ENABLED", 0);
        a = ut7Var;
        ut7 ut7Var2 = new ut7("DISABLED", 1);
        b = ut7Var2;
        c = new ut7[]{ut7Var, ut7Var2};
    }

    public static ut7 valueOf(String str) {
        return (ut7) Enum.valueOf(ut7.class, str);
    }

    public static ut7[] values() {
        return (ut7[]) c.clone();
    }
}
