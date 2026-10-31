package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q2s0 {
    public static final q2s0 a;
    public static final /* synthetic */ q2s0[] b;

    static {
        q2s0 q2s0Var = new q2s0("CONNECTED", 0);
        a = q2s0Var;
        b = new q2s0[]{q2s0Var, new q2s0("NOT_CONNECTED", 1), new q2s0("INVALID", 2)};
    }

    public static q2s0 valueOf(String str) {
        return (q2s0) Enum.valueOf(q2s0.class, str);
    }

    public static q2s0[] values() {
        return (q2s0[]) b.clone();
    }
}
