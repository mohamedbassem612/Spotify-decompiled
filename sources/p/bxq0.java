package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bxq0 {
    public static final bxq0 a;
    public static final bxq0 b;
    public static final /* synthetic */ bxq0[] c;

    static {
        bxq0 bxq0Var = new bxq0("RENDER_OVERRIDE", 0);
        a = bxq0Var;
        bxq0 bxq0Var2 = new bxq0("RENDER_OPEN", 1);
        b = bxq0Var2;
        c = new bxq0[]{bxq0Var, bxq0Var2, new bxq0("RENDER_OPEN_OVERRIDE", 2)};
    }

    public static bxq0 valueOf(String str) {
        return (bxq0) Enum.valueOf(bxq0.class, str);
    }

    public static bxq0[] values() {
        return (bxq0[]) c.clone();
    }
}
