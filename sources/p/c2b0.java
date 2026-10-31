package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c2b0 {
    public static final c2b0 a;
    public static final c2b0 b;
    public static final c2b0 c;
    public static final c2b0 d;
    public static final c2b0 e;
    public static final /* synthetic */ c2b0[] f;

    static {
        c2b0 c2b0Var = new c2b0("UNKNOWN", 0);
        a = c2b0Var;
        c2b0 c2b0Var2 = new c2b0("CAN_REQUEST", 1);
        b = c2b0Var2;
        c2b0 c2b0Var3 = new c2b0("PENDING", 2);
        c = c2b0Var3;
        c2b0 c2b0Var4 = new c2b0("DAILY_LIMIT_REACHED", 3);
        d = c2b0Var4;
        c2b0 c2b0Var5 = new c2b0("COOLDOWN", 4);
        e = c2b0Var5;
        f = new c2b0[]{c2b0Var, c2b0Var2, c2b0Var3, c2b0Var4, c2b0Var5};
    }

    public static c2b0 valueOf(String str) {
        return (c2b0) Enum.valueOf(c2b0.class, str);
    }

    public static c2b0[] values() {
        return (c2b0[]) f.clone();
    }
}
