package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class veg1 implements xeg1 {
    public static final veg1 a;
    public static final veg1 b;
    public static final veg1 c;
    public static final veg1 d;
    public static final /* synthetic */ veg1[] e;

    static {
        veg1 veg1Var = new veg1("NOT_FOUND", 0);
        a = veg1Var;
        veg1 veg1Var2 = new veg1("INVALID_ARGUMENTS", 1);
        b = veg1Var2;
        veg1 veg1Var3 = new veg1("BACKEND_FAILURE", 2);
        c = veg1Var3;
        veg1 veg1Var4 = new veg1("UNKNOWN", 3);
        d = veg1Var4;
        e = new veg1[]{veg1Var, veg1Var2, veg1Var3, veg1Var4};
    }

    public static veg1 valueOf(String str) {
        return (veg1) Enum.valueOf(veg1.class, str);
    }

    public static veg1[] values() {
        return (veg1[]) e.clone();
    }
}
