package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zkd0 {
    public static final zkd0 a;
    public static final zkd0 b;
    public static final /* synthetic */ zkd0[] c;

    static {
        zkd0 zkd0Var = new zkd0("Preview", 0);
        a = zkd0Var;
        zkd0 zkd0Var2 = new zkd0("AlmostUp", 1);
        b = zkd0Var2;
        c = new zkd0[]{zkd0Var, zkd0Var2};
    }

    public static zkd0 valueOf(String str) {
        return (zkd0) Enum.valueOf(zkd0.class, str);
    }

    public static zkd0[] values() {
        return (zkd0[]) c.clone();
    }
}
