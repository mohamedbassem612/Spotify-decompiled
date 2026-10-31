package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cmj1 {
    public static final cmj1 a;
    public static final cmj1 b;
    public static final cmj1 c;
    public static final /* synthetic */ cmj1[] d;

    static {
        cmj1 cmj1Var = new cmj1("Inactive", 0);
        a = cmj1Var;
        cmj1 cmj1Var2 = new cmj1("UserToggled", 1);
        b = cmj1Var2;
        cmj1 cmj1Var3 = new cmj1("ForcedByPlaylist", 2);
        c = cmj1Var3;
        d = new cmj1[]{cmj1Var, cmj1Var2, cmj1Var3};
    }

    public static cmj1 valueOf(String str) {
        return (cmj1) Enum.valueOf(cmj1.class, str);
    }

    public static cmj1[] values() {
        return (cmj1[]) d.clone();
    }
}
