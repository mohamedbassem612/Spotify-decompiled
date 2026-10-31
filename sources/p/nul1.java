package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nul1 {
    public static final nul1 a;
    public static final nul1 b;
    public static final nul1 c;
    public static final nul1 d;
    public static final nul1 e;
    public static final nul1 f;
    public static final nul1 g;
    public static final nul1 h;
    public static final nul1 i;
    public static final /* synthetic */ nul1[] t;

    static {
        nul1 nul1Var = new nul1("INT", 0);
        a = nul1Var;
        nul1 nul1Var2 = new nul1("LONG", 1);
        b = nul1Var2;
        nul1 nul1Var3 = new nul1("FLOAT", 2);
        c = nul1Var3;
        nul1 nul1Var4 = new nul1("DOUBLE", 3);
        d = nul1Var4;
        nul1 nul1Var5 = new nul1("BOOLEAN", 4);
        e = nul1Var5;
        nul1 nul1Var6 = new nul1("STRING", 5);
        f = nul1Var6;
        hhc hhcVar = phc.b;
        nul1 nul1Var7 = new nul1("BYTE_STRING", 6);
        g = nul1Var7;
        nul1 nul1Var8 = new nul1("ENUM", 7);
        h = nul1Var8;
        nul1 nul1Var9 = new nul1("MESSAGE", 8);
        i = nul1Var9;
        t = new nul1[]{nul1Var, nul1Var2, nul1Var3, nul1Var4, nul1Var5, nul1Var6, nul1Var7, nul1Var8, nul1Var9};
    }

    public static nul1 valueOf(String str) {
        return (nul1) Enum.valueOf(nul1.class, str);
    }

    public static nul1[] values() {
        return (nul1[]) t.clone();
    }
}
