package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vbc0 {
    public static final vbc0 a;
    public static final vbc0 b;
    public static final /* synthetic */ vbc0[] c;

    static {
        vbc0 vbc0Var = new vbc0("Success", 0);
        a = vbc0Var;
        vbc0 vbc0Var2 = new vbc0("Failure", 1);
        b = vbc0Var2;
        c = new vbc0[]{vbc0Var, vbc0Var2};
    }

    public static vbc0 valueOf(String str) {
        return (vbc0) Enum.valueOf(vbc0.class, str);
    }

    public static vbc0[] values() {
        return (vbc0[]) c.clone();
    }
}
