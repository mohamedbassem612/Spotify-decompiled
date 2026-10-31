package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class w8c0 {
    public static final w8c0 a;
    public static final w8c0 b;
    public static final w8c0 c;
    public static final w8c0 d;
    public static final w8c0 e;
    public static final /* synthetic */ w8c0[] f;

    static {
        w8c0 w8c0Var = new w8c0("DESTROYED", 0);
        a = w8c0Var;
        w8c0 w8c0Var2 = new w8c0("INITIALIZED", 1);
        b = w8c0Var2;
        w8c0 w8c0Var3 = new w8c0("CREATED", 2);
        c = w8c0Var3;
        w8c0 w8c0Var4 = new w8c0("STARTED", 3);
        d = w8c0Var4;
        w8c0 w8c0Var5 = new w8c0("RESUMED", 4);
        e = w8c0Var5;
        f = new w8c0[]{w8c0Var, w8c0Var2, w8c0Var3, w8c0Var4, w8c0Var5};
    }

    public static w8c0 valueOf(String str) {
        return (w8c0) Enum.valueOf(w8c0.class, str);
    }

    public static w8c0[] values() {
        return (w8c0[]) f.clone();
    }

    public final boolean a(w8c0 w8c0Var) {
        return compareTo(w8c0Var) >= 0;
    }
}
