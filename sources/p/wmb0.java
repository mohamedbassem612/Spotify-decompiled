package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wmb0 {
    public static final wmb0 a;
    public static final wmb0 b;
    public static final /* synthetic */ wmb0[] c;

    static {
        wmb0 wmb0Var = new wmb0("PORTRAIT", 0);
        a = wmb0Var;
        wmb0 wmb0Var2 = new wmb0("LANDSCAPE", 1);
        b = wmb0Var2;
        c = new wmb0[]{wmb0Var, wmb0Var2};
    }

    public static wmb0 valueOf(String str) {
        return (wmb0) Enum.valueOf(wmb0.class, str);
    }

    public static wmb0[] values() {
        return (wmb0[]) c.clone();
    }
}
