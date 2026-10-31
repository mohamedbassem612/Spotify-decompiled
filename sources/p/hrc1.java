package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class hrc1 {
    public static final grc1 Companion;
    public static final znb0 a;
    public static final hrc1 b;
    public static final hrc1 c;
    public static final /* synthetic */ hrc1[] d;

    static {
        hrc1 hrc1Var = new hrc1("ORIGINAL", 0);
        b = hrc1Var;
        hrc1 hrc1Var2 = new hrc1("TRANSLATION", 1);
        c = hrc1Var2;
        d = new hrc1[]{hrc1Var, hrc1Var2};
        Companion = new grc1();
        a = dm5.S(2, l4b1.b1);
    }

    public static hrc1 valueOf(String str) {
        return (hrc1) Enum.valueOf(hrc1.class, str);
    }

    public static hrc1[] values() {
        return (hrc1[]) d.clone();
    }
}
