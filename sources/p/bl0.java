package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bl0 {
    public static final bl0 a;
    public static final bl0 b;
    public static final bl0 c;
    public static final /* synthetic */ bl0[] d;

    static {
        bl0 bl0Var = new bl0("DEFAULT", 0);
        a = bl0Var;
        bl0 bl0Var2 = new bl0("SEE_MORE", 1);
        b = bl0Var2;
        bl0 bl0Var3 = new bl0("SEE_LESS", 2);
        c = bl0Var3;
        d = new bl0[]{bl0Var, bl0Var2, bl0Var3};
    }

    public static bl0 valueOf(String str) {
        return (bl0) Enum.valueOf(bl0.class, str);
    }

    public static bl0[] values() {
        return (bl0[]) d.clone();
    }
}
