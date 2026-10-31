package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vl5 {
    public static final vl5 a;
    public static final vl5 b;
    public static final vl5 c;
    public static final vl5 d;
    public static final /* synthetic */ vl5[] e;

    static {
        vl5 vl5Var = new vl5("VALID", 0);
        a = vl5Var;
        vl5 vl5Var2 = new vl5("INVALID_URI_PROVIDER", 1);
        b = vl5Var2;
        vl5 vl5Var3 = new vl5("INVALID_REQUESTER_PACKAGE", 2);
        c = vl5Var3;
        vl5 vl5Var4 = new vl5("SIGNATURE_CHECK_FAILED", 3);
        d = vl5Var4;
        e = new vl5[]{vl5Var, vl5Var2, vl5Var3, vl5Var4};
    }

    public static vl5 valueOf(String str) {
        return (vl5) Enum.valueOf(vl5.class, str);
    }

    public static vl5[] values() {
        return (vl5[]) e.clone();
    }
}
