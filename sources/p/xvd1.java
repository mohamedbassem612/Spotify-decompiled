package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xvd1 {
    public static final xvd1 a;
    public static final xvd1 b;
    public static final xvd1 c;
    public static final xvd1 d;
    public static final /* synthetic */ xvd1[] e;

    static {
        xvd1 xvd1Var = new xvd1("CAST", 0);
        a = xvd1Var;
        xvd1 xvd1Var2 = new xvd1("BLUETOOTH", 1);
        b = xvd1Var2;
        xvd1 xvd1Var3 = new xvd1("AIRPLAY", 2);
        xvd1 xvd1Var4 = new xvd1("CONNECT", 3);
        c = xvd1Var4;
        xvd1 xvd1Var5 = new xvd1("WIRED", 4);
        d = xvd1Var5;
        e = new xvd1[]{xvd1Var, xvd1Var2, xvd1Var3, xvd1Var4, xvd1Var5};
    }

    public static xvd1 valueOf(String str) {
        return (xvd1) Enum.valueOf(xvd1.class, str);
    }

    public static xvd1[] values() {
        return (xvd1[]) e.clone();
    }
}
