package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ix40 {
    public static final ix40 X;
    public static final /* synthetic */ ix40[] Y;
    public static final ix40 a;
    public static final ix40 b;
    public static final ix40 c;
    public static final ix40 d;
    public static final ix40 e;
    public static final ix40 f;
    public static final ix40 g;
    public static final ix40 h;
    public static final ix40 i;
    public static final ix40 t;

    static {
        ix40 ix40Var = new ix40("BIG_CARD", 0);
        a = ix40Var;
        ix40 ix40Var2 = new ix40("CARD", 1);
        b = ix40Var2;
        ix40 ix40Var3 = new ix40("HEADER", 2);
        c = ix40Var3;
        ix40 ix40Var4 = new ix40("ONE_COLUMN", 3);
        d = ix40Var4;
        ix40 ix40Var5 = new ix40("OUTSIDE_CONTENT_AREA", 4);
        e = ix40Var5;
        ix40 ix40Var6 = new ix40("SPACED_VERTICALLY", 5);
        f = ix40Var6;
        ix40 ix40Var7 = new ix40("SPINNER", 6);
        g = ix40Var7;
        ix40 ix40Var8 = new ix40("STACKABLE", 7);
        h = ix40Var8;
        ix40 ix40Var9 = new ix40("THREE_COLUMN", 8);
        i = ix40Var9;
        ix40 ix40Var10 = new ix40("TOP_ITEM", 9);
        t = ix40Var10;
        ix40 ix40Var11 = new ix40("TWO_COLUMN", 10);
        X = ix40Var11;
        Y = new ix40[]{ix40Var, ix40Var2, ix40Var3, ix40Var4, ix40Var5, ix40Var6, ix40Var7, ix40Var8, ix40Var9, ix40Var10, ix40Var11};
    }

    public static ix40 valueOf(String str) {
        return (ix40) Enum.valueOf(ix40.class, str);
    }

    public static ix40[] values() {
        return (ix40[]) Y.clone();
    }
}
