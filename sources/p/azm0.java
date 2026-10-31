package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class azm0 {
    public static final azm0 a;
    public static final azm0 b;
    public static final /* synthetic */ azm0[] c;

    static {
        azm0 azm0Var = new azm0("NON_AUTH", 0);
        a = azm0Var;
        azm0 azm0Var2 = new azm0("AUTH", 1);
        b = azm0Var2;
        c = new azm0[]{azm0Var, azm0Var2};
    }

    public static azm0 valueOf(String str) {
        return (azm0) Enum.valueOf(azm0.class, str);
    }

    public static azm0[] values() {
        return (azm0[]) c.clone();
    }
}
