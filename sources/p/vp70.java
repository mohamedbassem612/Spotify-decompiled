package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vp70 {
    public static final vp70 a;
    public static final vp70 b;
    public static final vp70 c;
    public static final vp70 d;
    public static final vp70 e;
    public static final /* synthetic */ vp70[] f;

    static {
        vp70 vp70Var = new vp70("UNSPECIFIED", 0);
        a = vp70Var;
        vp70 vp70Var2 = new vp70("SMALL", 1);
        b = vp70Var2;
        vp70 vp70Var3 = new vp70("DEFAULT", 2);
        c = vp70Var3;
        vp70 vp70Var4 = new vp70("LARGE", 3);
        d = vp70Var4;
        vp70 vp70Var5 = new vp70("XLARGE", 4);
        e = vp70Var5;
        f = new vp70[]{vp70Var, vp70Var2, vp70Var3, vp70Var4, vp70Var5};
    }

    public static vp70 valueOf(String str) {
        return (vp70) Enum.valueOf(vp70.class, str);
    }

    public static vp70[] values() {
        return (vp70[]) f.clone();
    }
}
