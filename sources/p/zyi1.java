package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zyi1 {
    public static final zyi1 a;
    public static final zyi1 b;
    public static final zyi1 c;
    public static final zyi1 d;
    public static final /* synthetic */ zyi1[] e;

    static {
        zyi1 zyi1Var = new zyi1("Good", 0);
        a = zyi1Var;
        zyi1 zyi1Var2 = new zyi1("Neutral", 1);
        b = zyi1Var2;
        zyi1 zyi1Var3 = new zyi1("Warn", 2);
        c = zyi1Var3;
        zyi1 zyi1Var4 = new zyi1("Bad", 3);
        d = zyi1Var4;
        e = new zyi1[]{zyi1Var, zyi1Var2, zyi1Var3, zyi1Var4};
    }

    public static zyi1 valueOf(String str) {
        return (zyi1) Enum.valueOf(zyi1.class, str);
    }

    public static zyi1[] values() {
        return (zyi1[]) e.clone();
    }
}
