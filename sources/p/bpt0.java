package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bpt0 {
    public static final bpt0 a;
    public static final bpt0 b;
    public static final /* synthetic */ bpt0[] c;

    static {
        bpt0 bpt0Var = new bpt0("PlayHit", 0);
        a = bpt0Var;
        bpt0 bpt0Var2 = new bpt0("PauseHit", 1);
        b = bpt0Var2;
        c = new bpt0[]{bpt0Var, bpt0Var2};
    }

    public static bpt0 valueOf(String str) {
        return (bpt0) Enum.valueOf(bpt0.class, str);
    }

    public static bpt0[] values() {
        return (bpt0[]) c.clone();
    }
}
