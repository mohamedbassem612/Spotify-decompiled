package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rze1 {
    public static final rze1 a;
    public static final rze1 b;
    public static final rze1 c;
    public static final /* synthetic */ rze1[] d;

    static {
        rze1 rze1Var = new rze1("On", 0);
        a = rze1Var;
        rze1 rze1Var2 = new rze1("Off", 1);
        b = rze1Var2;
        rze1 rze1Var3 = new rze1("Indeterminate", 2);
        c = rze1Var3;
        d = new rze1[]{rze1Var, rze1Var2, rze1Var3};
    }

    public static rze1 valueOf(String str) {
        return (rze1) Enum.valueOf(rze1.class, str);
    }

    public static rze1[] values() {
        return (rze1[]) d.clone();
    }
}
