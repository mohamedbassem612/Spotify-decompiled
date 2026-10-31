package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pas0 {
    public static final pas0 a;
    public static final pas0 b;
    public static final pas0 c;
    public static final pas0 d;
    public static final pas0 e;
    public static final pas0 f;
    public static final pas0 g;
    public static final /* synthetic */ pas0[] h;

    static {
        pas0 pas0Var = new pas0("Invalid", 0);
        a = pas0Var;
        pas0 pas0Var2 = new pas0("Cancelled", 1);
        b = pas0Var2;
        pas0 pas0Var3 = new pas0("InitialPending", 2);
        c = pas0Var3;
        pas0 pas0Var4 = new pas0("RecomposePending", 3);
        d = pas0Var4;
        pas0 pas0Var5 = new pas0("Recomposing", 4);
        e = pas0Var5;
        pas0 pas0Var6 = new pas0("ApplyPending", 5);
        f = pas0Var6;
        pas0 pas0Var7 = new pas0("Applied", 6);
        g = pas0Var7;
        h = new pas0[]{pas0Var, pas0Var2, pas0Var3, pas0Var4, pas0Var5, pas0Var6, pas0Var7};
    }

    public static pas0 valueOf(String str) {
        return (pas0) Enum.valueOf(pas0.class, str);
    }

    public static pas0[] values() {
        return (pas0[]) h.clone();
    }
}
