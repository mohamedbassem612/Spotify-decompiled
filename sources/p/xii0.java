package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xii0 {
    public static final xii0 a;
    public static final xii0 b;
    public static final xii0 c;
    public static final /* synthetic */ xii0[] d;

    static {
        xii0 xii0Var = new xii0("NO_MEETING", 0);
        a = xii0Var;
        xii0 xii0Var2 = new xii0("MEETING", 1);
        b = xii0Var2;
        xii0 xii0Var3 = new xii0("ADDON_SESSION", 2);
        c = xii0Var3;
        d = new xii0[]{xii0Var, xii0Var2, xii0Var3};
    }

    public static xii0 valueOf(String str) {
        return (xii0) Enum.valueOf(xii0.class, str);
    }

    public static xii0[] values() {
        return (xii0[]) d.clone();
    }
}
