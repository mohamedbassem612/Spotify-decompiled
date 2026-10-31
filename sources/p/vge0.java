package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vge0 {
    public static final vge0 a;
    public static final vge0 b;
    public static final /* synthetic */ vge0[] c;

    static {
        vge0 vge0Var = new vge0("CONNECTED", 0);
        a = vge0Var;
        vge0 vge0Var2 = new vge0("NOT_CONNECTED", 1);
        b = vge0Var2;
        c = new vge0[]{vge0Var, vge0Var2};
    }

    public static vge0 valueOf(String str) {
        return (vge0) Enum.valueOf(vge0.class, str);
    }

    public static vge0[] values() {
        return (vge0[]) c.clone();
    }
}
