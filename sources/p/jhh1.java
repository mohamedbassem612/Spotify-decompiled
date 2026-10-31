package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jhh1 {
    public static final jhh1 a;
    public static final jhh1 b;
    public static final /* synthetic */ jhh1[] c;

    static {
        jhh1 jhh1Var = new jhh1("UndoClicked", 0);
        a = jhh1Var;
        jhh1 jhh1Var2 = new jhh1("Dismissed", 1);
        b = jhh1Var2;
        c = new jhh1[]{jhh1Var, jhh1Var2};
    }

    public static jhh1 valueOf(String str) {
        return (jhh1) Enum.valueOf(jhh1.class, str);
    }

    public static jhh1[] values() {
        return (jhh1[]) c.clone();
    }
}
