package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lrm0 {
    public static final lrm0 a;
    public static final lrm0 b;
    public static final lrm0 c;
    public static final /* synthetic */ lrm0[] d;

    static {
        lrm0 lrm0Var = new lrm0("IDLE", 0);
        a = lrm0Var;
        lrm0 lrm0Var2 = new lrm0("LAUNCH_REQUESTED", 1);
        b = lrm0Var2;
        lrm0 lrm0Var3 = new lrm0("AWAITING_RESULT", 2);
        c = lrm0Var3;
        d = new lrm0[]{lrm0Var, lrm0Var2, lrm0Var3};
    }

    public static lrm0 valueOf(String str) {
        return (lrm0) Enum.valueOf(lrm0.class, str);
    }

    public static lrm0[] values() {
        return (lrm0[]) d.clone();
    }
}
