package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vxs0 {
    public static final vxs0 a;
    public static final vxs0 b;
    public static final vxs0 c;
    public static final /* synthetic */ vxs0[] d;

    static {
        vxs0 vxs0Var = new vxs0("VISIBLE", 0);
        a = vxs0Var;
        vxs0 vxs0Var2 = new vxs0("HIDDEN", 1);
        b = vxs0Var2;
        vxs0 vxs0Var3 = new vxs0("DISPOSED", 2);
        c = vxs0Var3;
        d = new vxs0[]{vxs0Var, vxs0Var2, vxs0Var3};
    }

    public static vxs0 valueOf(String str) {
        return (vxs0) Enum.valueOf(vxs0.class, str);
    }

    public static vxs0[] values() {
        return (vxs0[]) d.clone();
    }
}
