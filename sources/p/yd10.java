package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yd10 {
    public static final yd10 a;
    public static final yd10 b;
    public static final yd10 c;
    public static final /* synthetic */ yd10[] d;

    static {
        yd10 yd10Var = new yd10("ImageClicked", 0);
        a = yd10Var;
        yd10 yd10Var2 = new yd10("BackButtonClicked", 1);
        b = yd10Var2;
        yd10 yd10Var3 = new yd10("TitleClicked", 2);
        c = yd10Var3;
        d = new yd10[]{yd10Var, yd10Var2, yd10Var3};
    }

    public static yd10 valueOf(String str) {
        return (yd10) Enum.valueOf(yd10.class, str);
    }

    public static yd10[] values() {
        return (yd10[]) d.clone();
    }
}
