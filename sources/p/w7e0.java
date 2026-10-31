package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w7e0 {
    public static final w7e0 a;
    public static final w7e0 b;
    public static final w7e0 c;
    public static final w7e0 d;
    public static final /* synthetic */ w7e0[] e;

    static {
        w7e0 w7e0Var = new w7e0("STOPPED", 0);
        a = w7e0Var;
        w7e0 w7e0Var2 = new w7e0("LOADING", 1);
        b = w7e0Var2;
        w7e0 w7e0Var3 = new w7e0("LOADED", 2);
        c = w7e0Var3;
        w7e0 w7e0Var4 = new w7e0("FAILED", 3);
        d = w7e0Var4;
        e = new w7e0[]{w7e0Var, w7e0Var2, w7e0Var3, w7e0Var4};
    }

    public static w7e0 valueOf(String str) {
        return (w7e0) Enum.valueOf(w7e0.class, str);
    }

    public static w7e0[] values() {
        return (w7e0[]) e.clone();
    }
}
