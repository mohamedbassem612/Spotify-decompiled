package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xo90 {
    public static final xo90 a;
    public static final xo90 b;
    public static final xo90 c;
    public static final /* synthetic */ xo90[] d;

    static {
        xo90 xo90Var = new xo90("ON", 0);
        a = xo90Var;
        xo90 xo90Var2 = new xo90("OFF", 1);
        b = xo90Var2;
        xo90 xo90Var3 = new xo90("HIDDEN", 2);
        c = xo90Var3;
        d = new xo90[]{xo90Var, xo90Var2, xo90Var3};
    }

    public static xo90 valueOf(String str) {
        return (xo90) Enum.valueOf(xo90.class, str);
    }

    public static xo90[] values() {
        return (xo90[]) d.clone();
    }
}
