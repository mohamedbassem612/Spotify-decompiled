package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w1o0 {
    public static final w1o0 a;
    public static final w1o0 b;
    public static final w1o0 c;
    public static final /* synthetic */ w1o0[] d;

    static {
        w1o0 w1o0Var = new w1o0("Unset", 0);
        a = w1o0Var;
        w1o0 w1o0Var2 = new w1o0("SystemDialog", 1);
        b = w1o0Var2;
        w1o0 w1o0Var3 = new w1o0("EduDialog", 2);
        c = w1o0Var3;
        d = new w1o0[]{w1o0Var, w1o0Var2, w1o0Var3};
    }

    public static w1o0 valueOf(String str) {
        return (w1o0) Enum.valueOf(w1o0.class, str);
    }

    public static w1o0[] values() {
        return (w1o0[]) d.clone();
    }
}
