package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q0p0 {
    public static final q0p0 a;
    public static final q0p0 b;
    public static final /* synthetic */ q0p0[] c;

    static {
        q0p0 q0p0Var = new q0p0("REGULAR", 0);
        a = q0p0Var;
        q0p0 q0p0Var2 = new q0p0("LIVE_ROOM", 1);
        b = q0p0Var2;
        c = new q0p0[]{q0p0Var, q0p0Var2};
    }

    public static q0p0 valueOf(String str) {
        return (q0p0) Enum.valueOf(q0p0.class, str);
    }

    public static q0p0[] values() {
        return (q0p0[]) c.clone();
    }
}
