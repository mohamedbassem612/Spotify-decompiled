package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zcn0 {
    public static final zcn0 a;
    public static final zcn0 b;
    public static final zcn0 c;
    public static final /* synthetic */ zcn0[] d;

    static {
        zcn0 zcn0Var = new zcn0("RESET_EVENT_SCHEDULER", 0);
        a = zcn0Var;
        zcn0 zcn0Var2 = new zcn0("RESET_EVENT_MONITOR", 1);
        b = zcn0Var2;
        zcn0 zcn0Var3 = new zcn0("UPDATE_RATE_LIMITER", 2);
        c = zcn0Var3;
        d = new zcn0[]{zcn0Var, zcn0Var2, zcn0Var3};
    }

    public static zcn0 valueOf(String str) {
        return (zcn0) Enum.valueOf(zcn0.class, str);
    }

    public static zcn0[] values() {
        return (zcn0[]) d.clone();
    }
}
