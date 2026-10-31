package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vgn1 {
    public static final vgn1 a;
    public static final vgn1 b;
    public static final vgn1 c;
    public static final /* synthetic */ vgn1[] d;

    static {
        vgn1 vgn1Var = new vgn1("NIST_P256", 0);
        a = vgn1Var;
        vgn1 vgn1Var2 = new vgn1("NIST_P384", 1);
        b = vgn1Var2;
        vgn1 vgn1Var3 = new vgn1("NIST_P521", 2);
        c = vgn1Var3;
        d = new vgn1[]{vgn1Var, vgn1Var2, vgn1Var3};
    }

    public static vgn1[] values() {
        return (vgn1[]) d.clone();
    }
}
