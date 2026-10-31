package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hfn0 {
    public static final hfn0 a;
    public static final hfn0 b;
    public static final hfn0 c;
    public static final /* synthetic */ hfn0[] d;

    static {
        hfn0 hfn0Var = new hfn0("Default", 0);
        a = hfn0Var;
        hfn0 hfn0Var2 = new hfn0("UserInput", 1);
        b = hfn0Var2;
        hfn0 hfn0Var3 = new hfn0("PreventUserInput", 2);
        c = hfn0Var3;
        d = new hfn0[]{hfn0Var, hfn0Var2, hfn0Var3};
    }

    public static hfn0 valueOf(String str) {
        return (hfn0) Enum.valueOf(hfn0.class, str);
    }

    public static hfn0[] values() {
        return (hfn0[]) d.clone();
    }
}
