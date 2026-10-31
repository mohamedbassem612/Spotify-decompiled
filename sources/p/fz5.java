package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fz5 {
    public static final fz5 X;
    public static final /* synthetic */ fz5[] Y;
    public static final fz5 a;
    public static final fz5 b;
    public static final fz5 c;
    public static final fz5 d;
    public static final fz5 e;
    public static final fz5 f;
    public static final fz5 g;
    public static final fz5 h;
    public static final fz5 i;
    public static final fz5 t;

    static {
        fz5 fz5Var = new fz5("INVALID_PIN_FORMAT", 0);
        a = fz5Var;
        fz5 fz5Var2 = new fz5("HAP_AUTHENTICATION", 1);
        b = fz5Var2;
        fz5 fz5Var3 = new fz5("HAP_BACKOFF", 2);
        c = fz5Var3;
        fz5 fz5Var4 = new fz5("HAP_MAX_PEERS", 3);
        d = fz5Var4;
        fz5 fz5Var5 = new fz5("HAP_MAX_TRIES", 4);
        e = fz5Var5;
        fz5 fz5Var6 = new fz5("HAP_UNAVAILABLE", 5);
        f = fz5Var6;
        fz5 fz5Var7 = new fz5("HAP_BUSY", 6);
        g = fz5Var7;
        fz5 fz5Var8 = new fz5("DEVICE_NOT_RESPONDING", 7);
        h = fz5Var8;
        fz5 fz5Var9 = new fz5("CONNECTION_LOST", 8);
        i = fz5Var9;
        fz5 fz5Var10 = new fz5("TRANSPORT", 9);
        t = fz5Var10;
        fz5 fz5Var11 = new fz5("UNKNOWN", 10);
        X = fz5Var11;
        Y = new fz5[]{fz5Var, fz5Var2, fz5Var3, fz5Var4, fz5Var5, fz5Var6, fz5Var7, fz5Var8, fz5Var9, fz5Var10, fz5Var11};
    }

    public static fz5 valueOf(String str) {
        return (fz5) Enum.valueOf(fz5.class, str);
    }

    public static fz5[] values() {
        return (fz5[]) Y.clone();
    }
}
