package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mb8 {
    public static final mb8 a;
    public static final mb8 b;
    public static final /* synthetic */ mb8[] c;

    static {
        mb8 mb8Var = new mb8("RowClicked", 0);
        a = mb8Var;
        mb8 mb8Var2 = new mb8("AddClicked", 1);
        b = mb8Var2;
        c = new mb8[]{mb8Var, mb8Var2};
    }

    public static mb8 valueOf(String str) {
        return (mb8) Enum.valueOf(mb8.class, str);
    }

    public static mb8[] values() {
        return (mb8[]) c.clone();
    }
}
