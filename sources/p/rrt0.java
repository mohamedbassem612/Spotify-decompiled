package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rrt0 {
    public static final rrt0 a;
    public static final rrt0 b;
    public static final rrt0 c;
    public static final /* synthetic */ rrt0[] d;

    static {
        rrt0 rrt0Var = new rrt0("PLAYING", 0);
        a = rrt0Var;
        rrt0 rrt0Var2 = new rrt0("INACTIVE", 1);
        b = rrt0Var2;
        rrt0 rrt0Var3 = new rrt0("PAUSED", 2);
        c = rrt0Var3;
        d = new rrt0[]{rrt0Var, rrt0Var2, rrt0Var3};
    }

    public static rrt0 valueOf(String str) {
        return (rrt0) Enum.valueOf(rrt0.class, str);
    }

    public static rrt0[] values() {
        return (rrt0[]) d.clone();
    }
}
