package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class u1q0 {
    public static final u1q0 a;
    public static final u1q0 b;
    public static final u1q0 c;
    public static final /* synthetic */ u1q0[] d;

    static {
        u1q0 u1q0Var = new u1q0("SUCCESS", 0);
        a = u1q0Var;
        u1q0 u1q0Var2 = new u1q0("CANCELLATION", 1);
        b = u1q0Var2;
        u1q0 u1q0Var3 = new u1q0("FAILURE", 2);
        c = u1q0Var3;
        d = new u1q0[]{u1q0Var, u1q0Var2, u1q0Var3};
    }

    public static u1q0 valueOf(String str) {
        return (u1q0) Enum.valueOf(u1q0.class, str);
    }

    public static u1q0[] values() {
        return (u1q0[]) d.clone();
    }
}
