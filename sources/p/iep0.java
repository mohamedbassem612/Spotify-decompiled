package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class iep0 {
    public static final iep0 a;
    public static final iep0 b;
    public static final iep0 c;
    public static final /* synthetic */ iep0[] d;

    static {
        iep0 iep0Var = new iep0("FORCE_FLEXIBILITY", 0);
        a = iep0Var;
        iep0 iep0Var2 = new iep0("NULLABLE", 1);
        b = iep0Var2;
        iep0 iep0Var3 = new iep0("NOT_NULL", 2);
        c = iep0Var3;
        d = new iep0[]{iep0Var, iep0Var2, iep0Var3};
    }

    public static iep0 valueOf(String str) {
        return (iep0) Enum.valueOf(iep0.class, str);
    }

    public static iep0[] values() {
        return (iep0[]) d.clone();
    }
}
