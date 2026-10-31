package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y0i0 {
    public static final y0i0 a;
    public static final y0i0 b;
    public static final y0i0 c;
    public static final /* synthetic */ y0i0[] d;

    static {
        y0i0 y0i0Var = new y0i0("NONE", 0);
        a = y0i0Var;
        y0i0 y0i0Var2 = new y0i0("ONE", 1);
        b = y0i0Var2;
        y0i0 y0i0Var3 = new y0i0("ALL", 2);
        c = y0i0Var3;
        d = new y0i0[]{y0i0Var, y0i0Var2, y0i0Var3};
    }

    public static y0i0 valueOf(String str) {
        return (y0i0) Enum.valueOf(y0i0.class, str);
    }

    public static y0i0[] values() {
        return (y0i0[]) d.clone();
    }
}
