package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w7u0 {
    public static final w7u0 a;
    public static final w7u0 b;
    public static final w7u0 c;
    public static final /* synthetic */ w7u0[] d;

    static {
        w7u0 w7u0Var = new w7u0("FOCUSED_ONLY", 0);
        a = w7u0Var;
        w7u0 w7u0Var2 = new w7u0("FOCUSED_OR_OCCLUDED", 1);
        b = w7u0Var2;
        w7u0 w7u0Var3 = new w7u0("ALWAYS", 2);
        c = w7u0Var3;
        d = new w7u0[]{w7u0Var, w7u0Var2, w7u0Var3};
    }

    public static w7u0 valueOf(String str) {
        return (w7u0) Enum.valueOf(w7u0.class, str);
    }

    public static w7u0[] values() {
        return (w7u0[]) d.clone();
    }
}
