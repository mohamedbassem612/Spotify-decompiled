package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class syh1 {
    public static final syh1 a;
    public static final syh1 b;
    public static final syh1 c;
    public static final /* synthetic */ syh1[] d;

    static {
        syh1 syh1Var = new syh1("CtaClicked", 0);
        a = syh1Var;
        syh1 syh1Var2 = new syh1("DismissBtnClicked", 1);
        b = syh1Var2;
        syh1 syh1Var3 = new syh1("Dismissed", 2);
        c = syh1Var3;
        d = new syh1[]{syh1Var, syh1Var2, syh1Var3};
    }

    public static syh1 valueOf(String str) {
        return (syh1) Enum.valueOf(syh1.class, str);
    }

    public static syh1[] values() {
        return (syh1[]) d.clone();
    }
}
