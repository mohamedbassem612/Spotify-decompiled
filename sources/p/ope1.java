package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class ope1 {
    public static final npe1 Companion;
    public static final znb0 a;
    public static final ope1 b;
    public static final ope1 c;
    public static final /* synthetic */ ope1[] d;

    static {
        ope1 ope1Var = new ope1("WORD_TIMESTAMP_ACCURACY_UNSPECIFIED", 0);
        b = ope1Var;
        ope1 ope1Var2 = new ope1("WORD_TIMESTAMP_ACCURACY_PRECISE", 1);
        c = ope1Var2;
        d = new ope1[]{ope1Var, ope1Var2, new ope1("WORD_TIMESTAMP_ACCURACY_APPROXIMATE", 2)};
        Companion = new npe1();
        a = dm5.S(2, orc1.W0);
    }

    public static ope1 valueOf(String str) {
        return (ope1) Enum.valueOf(ope1.class, str);
    }

    public static ope1[] values() {
        return (ope1[]) d.clone();
    }
}
