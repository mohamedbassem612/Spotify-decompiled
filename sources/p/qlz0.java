package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qlz0 {
    public static final qlz0 a;
    public static final qlz0 b;
    public static final qlz0 c;
    public static final /* synthetic */ qlz0[] d;

    static {
        qlz0 qlz0Var = new qlz0("NO_QUOTA_DATA", 0);
        a = qlz0Var;
        qlz0 qlz0Var2 = new qlz0("HAS_REMAINING_QUOTA", 1);
        b = qlz0Var2;
        qlz0 qlz0Var3 = new qlz0("QUOTA_FULLY_CONSUMED", 2);
        c = qlz0Var3;
        d = new qlz0[]{qlz0Var, qlz0Var2, qlz0Var3};
    }

    public static qlz0 valueOf(String str) {
        return (qlz0) Enum.valueOf(qlz0.class, str);
    }

    public static qlz0[] values() {
        return (qlz0[]) d.clone();
    }
}
