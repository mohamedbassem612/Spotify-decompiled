package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class o8r0 {
    public static final o8r0 a;
    public static final o8r0 b;
    public static final /* synthetic */ o8r0[] c;

    static {
        o8r0 o8r0Var = new o8r0("STRONG", 0);
        a = o8r0Var;
        o8r0 o8r0Var2 = new o8r0("SUCCESS", 1);
        b = o8r0Var2;
        c = new o8r0[]{o8r0Var, o8r0Var2};
    }

    public static o8r0 valueOf(String str) {
        return (o8r0) Enum.valueOf(o8r0.class, str);
    }

    public static o8r0[] values() {
        return (o8r0[]) c.clone();
    }
}
