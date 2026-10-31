package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pmp0 {
    public static final pmp0 a;
    public static final pmp0 b;
    public static final pmp0 c;
    public static final /* synthetic */ pmp0[] d;

    static {
        pmp0 pmp0Var = new pmp0("INVITE", 0);
        a = pmp0Var;
        pmp0 pmp0Var2 = new pmp0("QR_CODE", 1);
        b = pmp0Var2;
        pmp0 pmp0Var3 = new pmp0("QR_CODE_ERROR", 2);
        c = pmp0Var3;
        d = new pmp0[]{pmp0Var, pmp0Var2, pmp0Var3};
    }

    public static pmp0 valueOf(String str) {
        return (pmp0) Enum.valueOf(pmp0.class, str);
    }

    public static pmp0[] values() {
        return (pmp0[]) d.clone();
    }
}
