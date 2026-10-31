package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nwq0 {
    public static final nwq0 a;
    public static final nwq0 b;
    public static final nwq0 c;
    public static final /* synthetic */ nwq0[] d;

    static {
        nwq0 nwq0Var = new nwq0("VISIBLE", 0);
        a = nwq0Var;
        nwq0 nwq0Var2 = new nwq0("HIDDEN", 1);
        b = nwq0Var2;
        nwq0 nwq0Var3 = new nwq0("MINIMIZED", 2);
        c = nwq0Var3;
        d = new nwq0[]{nwq0Var, nwq0Var2, nwq0Var3};
    }

    public static nwq0 valueOf(String str) {
        return (nwq0) Enum.valueOf(nwq0.class, str);
    }

    public static nwq0[] values() {
        return (nwq0[]) d.clone();
    }
}
