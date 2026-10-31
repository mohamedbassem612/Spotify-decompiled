package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l650 {
    public static final l650 a;
    public static final l650 b;
    public static final l650 c;
    public static final /* synthetic */ l650[] d;

    static {
        l650 l650Var = new l650("GRAB", 0);
        a = l650Var;
        l650 l650Var2 = new l650("DO_NOT_GRAB", 1);
        b = l650Var2;
        l650 l650Var3 = new l650("INDIFFERENT", 2);
        c = l650Var3;
        d = new l650[]{l650Var, l650Var2, l650Var3};
    }

    public static l650 valueOf(String str) {
        return (l650) Enum.valueOf(l650.class, str);
    }

    public static l650[] values() {
        return (l650[]) d.clone();
    }
}
