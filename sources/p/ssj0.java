package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ssj0 {
    public static final ssj0 a;
    public static final ssj0 b;
    public static final /* synthetic */ ssj0[] c;

    static {
        ssj0 ssj0Var = new ssj0("TAP", 0);
        a = ssj0Var;
        ssj0 ssj0Var2 = new ssj0("DRAG", 1);
        b = ssj0Var2;
        c = new ssj0[]{ssj0Var, ssj0Var2};
    }

    public static ssj0 valueOf(String str) {
        return (ssj0) Enum.valueOf(ssj0.class, str);
    }

    public static ssj0[] values() {
        return (ssj0[]) c.clone();
    }
}
