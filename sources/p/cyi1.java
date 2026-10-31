package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cyi1 {
    public static final cyi1 a;
    public static final cyi1 b;
    public static final /* synthetic */ cyi1[] c;

    static {
        cyi1 cyi1Var = new cyi1("MapClicked", 0);
        a = cyi1Var;
        cyi1 cyi1Var2 = new cyi1("AttributionClicked", 1);
        b = cyi1Var2;
        c = new cyi1[]{cyi1Var, cyi1Var2};
    }

    public static cyi1 valueOf(String str) {
        return (cyi1) Enum.valueOf(cyi1.class, str);
    }

    public static cyi1[] values() {
        return (cyi1[]) c.clone();
    }
}
