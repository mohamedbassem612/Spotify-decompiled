package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class sg01 {
    public static final og01 Companion;
    public static final znb0 a;
    public static final sg01 b;
    public static final sg01 c;
    public static final /* synthetic */ sg01[] d;

    static {
        sg01 sg01Var = new sg01("FINISHED", 0);
        b = sg01Var;
        sg01 sg01Var2 = new sg01("UNPLAYABLE", 1);
        c = sg01Var2;
        d = new sg01[]{sg01Var, sg01Var2};
        Companion = new og01();
        a = dm5.S(2, ijz0.X);
    }

    public static sg01 valueOf(String str) {
        return (sg01) Enum.valueOf(sg01.class, str);
    }

    public static sg01[] values() {
        return (sg01[]) d.clone();
    }
}
