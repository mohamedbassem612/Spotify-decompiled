package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hzo0 {
    public static final hzo0 a;
    public static final hzo0 b;
    public static final /* synthetic */ hzo0[] c;

    static {
        hzo0 hzo0Var = new hzo0("OneLineMetadata", 0);
        a = hzo0Var;
        hzo0 hzo0Var2 = new hzo0("TwoLineMetadata", 1);
        b = hzo0Var2;
        c = new hzo0[]{hzo0Var, hzo0Var2};
    }

    public static hzo0 valueOf(String str) {
        return (hzo0) Enum.valueOf(hzo0.class, str);
    }

    public static hzo0[] values() {
        return (hzo0[]) c.clone();
    }
}
