package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g7e1 {
    public static final g7e1 a;
    public static final g7e1 b;
    public static final g7e1 c;
    public static final /* synthetic */ g7e1[] d;

    static {
        g7e1 g7e1Var = new g7e1("None", 0);
        a = g7e1Var;
        g7e1 g7e1Var2 = new g7e1("Touch", 1);
        b = g7e1Var2;
        g7e1 g7e1Var3 = new g7e1("Mouse", 2);
        c = g7e1Var3;
        d = new g7e1[]{g7e1Var, g7e1Var2, g7e1Var3};
    }

    public static g7e1 valueOf(String str) {
        return (g7e1) Enum.valueOf(g7e1.class, str);
    }

    public static g7e1[] values() {
        return (g7e1[]) d.clone();
    }
}
