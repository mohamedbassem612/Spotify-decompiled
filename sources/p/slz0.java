package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class slz0 {
    public static final rlz0 Companion;
    public static final znb0 a;
    public static final slz0 b;
    public static final /* synthetic */ slz0[] c;

    static {
        slz0 slz0Var = new slz0("UNSPECIFIED", 0);
        b = slz0Var;
        c = new slz0[]{slz0Var, new slz0("RECURRENT", 1), new slz0("TOP_UP", 2)};
        Companion = new rlz0();
        a = dm5.S(2, ijz0.e);
    }

    public static slz0 valueOf(String str) {
        return (slz0) Enum.valueOf(slz0.class, str);
    }

    public static slz0[] values() {
        return (slz0[]) c.clone();
    }
}
