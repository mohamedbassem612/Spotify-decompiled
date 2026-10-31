package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gs41 {
    public static final gs41 a;
    public static final gs41 b;
    public static final gs41 c;
    public static final gs41 d;
    public static final gs41 e;
    public static final gs41 f;
    public static final gs41 g;
    public static final /* synthetic */ gs41[] h;

    static {
        gs41 gs41Var = new gs41("ERROR", 0);
        a = gs41Var;
        gs41 gs41Var2 = new gs41("UNKNOWN_ERROR", 1);
        b = gs41Var2;
        gs41 gs41Var3 = new gs41("SUCCESS", 2);
        c = gs41Var3;
        gs41 gs41Var4 = new gs41("TIMEOUT", 3);
        d = gs41Var4;
        gs41 gs41Var5 = new gs41("NO_DATA", 4);
        e = gs41Var5;
        gs41 gs41Var6 = new gs41("SCROLLSITA_TIMEOUT", 5);
        f = gs41Var6;
        gs41 gs41Var7 = new gs41("SCROLLSITA_ERROR", 6);
        g = gs41Var7;
        h = new gs41[]{gs41Var, gs41Var2, gs41Var3, gs41Var4, gs41Var5, gs41Var6, gs41Var7};
    }

    public static gs41 valueOf(String str) {
        return (gs41) Enum.valueOf(gs41.class, str);
    }

    public static gs41[] values() {
        return (gs41[]) h.clone();
    }
}
