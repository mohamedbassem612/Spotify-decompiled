package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rzy0 {
    public static final rzy0 a;
    public static final rzy0 b;
    public static final rzy0 c;
    public static final rzy0 d;
    public static final rzy0 e;
    public static final rzy0 f;
    public static final rzy0 g;
    public static final rzy0 h;
    public static final /* synthetic */ rzy0[] i;
    public static final /* synthetic */ t0z t;

    static {
        rzy0 rzy0Var = new rzy0("STANDARD", 0);
        a = rzy0Var;
        rzy0 rzy0Var2 = new rzy0("STANDARD_WITH_ALL_UPSELLS", 1);
        b = rzy0Var2;
        rzy0 rzy0Var3 = new rzy0("STANDARD_WITH_MULTI_TIERED_UPSELLS", 2);
        c = rzy0Var3;
        rzy0 rzy0Var4 = new rzy0("STANDARD_WITH_PREMIUM_VALUE_UPSELLS", 3);
        d = rzy0Var4;
        rzy0 rzy0Var5 = new rzy0("VERY_HIGH", 4);
        e = rzy0Var5;
        rzy0 rzy0Var6 = new rzy0("VERY_HIGH_WITH_MULTI_TIERED_UPSELLS", 5);
        f = rzy0Var6;
        rzy0 rzy0Var7 = new rzy0("LOSSLESS", 6);
        g = rzy0Var7;
        rzy0 rzy0Var8 = new rzy0("PETREL", 7);
        h = rzy0Var8;
        rzy0[] rzy0VarArr = {rzy0Var, rzy0Var2, rzy0Var3, rzy0Var4, rzy0Var5, rzy0Var6, rzy0Var7, rzy0Var8};
        i = rzy0VarArr;
        t = new t0z(rzy0VarArr);
    }

    public static rzy0 valueOf(String str) {
        return (rzy0) Enum.valueOf(rzy0.class, str);
    }

    public static rzy0[] values() {
        return (rzy0[]) i.clone();
    }
}
