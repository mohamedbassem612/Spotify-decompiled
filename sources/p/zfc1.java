package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zfc1 {
    public static final zfc1 a;
    public static final zfc1 b;
    public static final zfc1 c;
    public static final zfc1 d;
    public static final zfc1 e;
    public static final zfc1 f;
    public static final zfc1 g;
    public static final /* synthetic */ zfc1[] h;
    public static final /* synthetic */ t0z i;

    static {
        zfc1 zfc1Var = new zfc1("UNKNOWN", 0);
        a = zfc1Var;
        zfc1 zfc1Var2 = new zfc1("LOW", 1);
        b = zfc1Var2;
        zfc1 zfc1Var3 = new zfc1("NORMAL", 2);
        c = zfc1Var3;
        zfc1 zfc1Var4 = new zfc1("HIGH", 3);
        d = zfc1Var4;
        zfc1 zfc1Var5 = new zfc1("VERY_HIGH", 4);
        e = zfc1Var5;
        zfc1 zfc1Var6 = new zfc1("LOSSLESS_16_BIT", 5);
        f = zfc1Var6;
        zfc1 zfc1Var7 = new zfc1("LOSSLESS_24_BIT", 6);
        g = zfc1Var7;
        zfc1[] zfc1VarArr = {zfc1Var, zfc1Var2, zfc1Var3, zfc1Var4, zfc1Var5, zfc1Var6, zfc1Var7};
        h = zfc1VarArr;
        i = new t0z(zfc1VarArr);
    }

    public static zfc1 valueOf(String str) {
        return (zfc1) Enum.valueOf(zfc1.class, str);
    }

    public static zfc1[] values() {
        return (zfc1[]) h.clone();
    }
}
