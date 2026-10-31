package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class o1f0 {
    public static final o1f0 a;
    public static final o1f0 b;
    public static final /* synthetic */ o1f0[] c;

    static {
        o1f0 o1f0Var = new o1f0("HasLoggedInSession", 0);
        a = o1f0Var;
        o1f0 o1f0Var2 = new o1f0("NoLoggedInSession", 1);
        b = o1f0Var2;
        c = new o1f0[]{o1f0Var, o1f0Var2};
    }

    public static o1f0 valueOf(String str) {
        return (o1f0) Enum.valueOf(o1f0.class, str);
    }

    public static o1f0[] values() {
        return (o1f0[]) c.clone();
    }
}
