package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ckl1 {
    public static final ckl1 a;
    public static final ckl1 b;
    public static final ckl1 c;
    public static final /* synthetic */ ckl1[] d;

    static {
        ckl1 ckl1Var = new ckl1("Loading", 0);
        a = ckl1Var;
        ckl1 ckl1Var2 = new ckl1("Content", 1);
        b = ckl1Var2;
        ckl1 ckl1Var3 = new ckl1("Error", 2);
        c = ckl1Var3;
        d = new ckl1[]{ckl1Var, ckl1Var2, ckl1Var3};
    }

    public static ckl1 valueOf(String str) {
        return (ckl1) Enum.valueOf(ckl1.class, str);
    }

    public static ckl1[] values() {
        return (ckl1[]) d.clone();
    }
}
