package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s7n0 {
    public static final s7n0 a;
    public static final s7n0 b;
    public static final s7n0 c;
    public static final /* synthetic */ s7n0[] d;

    static {
        s7n0 s7n0Var = new s7n0("Linear", 0);
        a = s7n0Var;
        s7n0 s7n0Var2 = new s7n0("Shuffle", 1);
        b = s7n0Var2;
        s7n0 s7n0Var3 = new s7n0("SmartShuffle", 2);
        c = s7n0Var3;
        d = new s7n0[]{s7n0Var, s7n0Var2, s7n0Var3};
    }

    public static s7n0 valueOf(String str) {
        return (s7n0) Enum.valueOf(s7n0.class, str);
    }

    public static s7n0[] values() {
        return (s7n0[]) d.clone();
    }
}
