package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w5d0 {
    public static final w5d0 a;
    public static final w5d0 b;
    public static final w5d0 c;
    public static final /* synthetic */ w5d0[] d;

    static {
        w5d0 w5d0Var = new w5d0("GotItClicked", 0);
        a = w5d0Var;
        w5d0 w5d0Var2 = new w5d0("ManageAccessClicked", 1);
        b = w5d0Var2;
        w5d0 w5d0Var3 = new w5d0("SystemDismissed", 2);
        c = w5d0Var3;
        d = new w5d0[]{w5d0Var, w5d0Var2, w5d0Var3};
    }

    public static w5d0 valueOf(String str) {
        return (w5d0) Enum.valueOf(w5d0.class, str);
    }

    public static w5d0[] values() {
        return (w5d0[]) d.clone();
    }
}
