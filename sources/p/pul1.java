package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pul1 {
    public static final pul1 a;
    public static final pul1 b;
    public static final pul1 c;
    public static final pul1 d;
    public static final pul1 e;
    public static final pul1 f;
    public static final pul1 g;
    public static final pul1 h;
    public static final pul1 i;
    public static final /* synthetic */ pul1[] t;

    static {
        pul1 pul1Var = new pul1("INT", 0);
        a = pul1Var;
        pul1 pul1Var2 = new pul1("LONG", 1);
        b = pul1Var2;
        pul1 pul1Var3 = new pul1("FLOAT", 2);
        c = pul1Var3;
        pul1 pul1Var4 = new pul1("DOUBLE", 3);
        d = pul1Var4;
        pul1 pul1Var5 = new pul1("BOOLEAN", 4);
        e = pul1Var5;
        pul1 pul1Var6 = new pul1("STRING", 5);
        f = pul1Var6;
        ihc ihcVar = ihc.c;
        pul1 pul1Var7 = new pul1("BYTE_STRING", 6);
        g = pul1Var7;
        pul1 pul1Var8 = new pul1("ENUM", 7);
        h = pul1Var8;
        pul1 pul1Var9 = new pul1("MESSAGE", 8);
        i = pul1Var9;
        t = new pul1[]{pul1Var, pul1Var2, pul1Var3, pul1Var4, pul1Var5, pul1Var6, pul1Var7, pul1Var8, pul1Var9};
    }

    public static pul1 valueOf(String str) {
        return (pul1) Enum.valueOf(pul1.class, str);
    }

    public static pul1[] values() {
        return (pul1[]) t.clone();
    }
}
