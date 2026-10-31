package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ckf1 {
    public static final ckf1 a;
    public static final ckf1 b;
    public static final /* synthetic */ ckf1[] c;

    static {
        ckf1 ckf1Var = new ckf1("SwipeForward", 0);
        a = ckf1Var;
        ckf1 ckf1Var2 = new ckf1("SwipeBackward", 1);
        b = ckf1Var2;
        c = new ckf1[]{ckf1Var, ckf1Var2};
    }

    public static ckf1 valueOf(String str) {
        return (ckf1) Enum.valueOf(ckf1.class, str);
    }

    public static ckf1[] values() {
        return (ckf1[]) c.clone();
    }
}
