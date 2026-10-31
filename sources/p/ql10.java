package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ql10 {
    public static final ql10 a;
    public static final ql10 b;
    public static final ql10 c;
    public static final ql10 d;
    public static final ql10 e;
    public static final ql10 f;
    public static final ql10 g;
    public static final /* synthetic */ ql10[] h;

    static {
        ql10 ql10Var = new ql10("PICK_AND_SHUFFLE", 0);
        a = ql10Var;
        ql10 ql10Var2 = new ql10("AUDIOBOOKS", 1);
        b = ql10Var2;
        ql10 ql10Var3 = new ql10("LYRICS", 2);
        c = ql10Var3;
        ql10 ql10Var4 = new ql10("BLUEJAY", 3);
        d = ql10Var4;
        ql10 ql10Var5 = new ql10("KALLAX", 4);
        e = ql10Var5;
        ql10 ql10Var6 = new ql10("PROMPT_PLAYLIST", 5);
        f = ql10Var6;
        ql10 ql10Var7 = new ql10("RUNNING_MODE", 6);
        g = ql10Var7;
        h = new ql10[]{ql10Var, ql10Var2, ql10Var3, ql10Var4, ql10Var5, ql10Var6, ql10Var7};
    }

    public static ql10 valueOf(String str) {
        return (ql10) Enum.valueOf(ql10.class, str);
    }

    public static ql10[] values() {
        return (ql10[]) h.clone();
    }
}
