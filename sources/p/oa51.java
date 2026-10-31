package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oa51 {
    public static final oa51 a;
    public static final oa51 b;
    public static final /* synthetic */ oa51[] c;

    static {
        oa51 oa51Var = new oa51("SQUARE", 0);
        a = oa51Var;
        oa51 oa51Var2 = new oa51("CIRCLE", 1);
        b = oa51Var2;
        c = new oa51[]{oa51Var, oa51Var2};
    }

    public static oa51 valueOf(String str) {
        return (oa51) Enum.valueOf(oa51.class, str);
    }

    public static oa51[] values() {
        return (oa51[]) c.clone();
    }
}
