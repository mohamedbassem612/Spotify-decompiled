package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gn90 {
    public static final gn90 a;
    public static final gn90 b;
    public static final gn90 c;
    public static final /* synthetic */ gn90[] d;

    static {
        gn90 gn90Var = new gn90("TRACK", 0);
        a = gn90Var;
        gn90 gn90Var2 = new gn90("SHOW_EPISODES", 1);
        b = gn90Var2;
        gn90 gn90Var3 = new gn90("AUDIOBOOK", 2);
        c = gn90Var3;
        d = new gn90[]{gn90Var, gn90Var2, gn90Var3};
    }

    public static gn90 valueOf(String str) {
        return (gn90) Enum.valueOf(gn90.class, str);
    }

    public static gn90[] values() {
        return (gn90[]) d.clone();
    }
}
