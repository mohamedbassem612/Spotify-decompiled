package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ujj1 {
    public static final ujj1 a;
    public static final ujj1 b;
    public static final ujj1 c;
    public static final ujj1 d;
    public static final ujj1 e;
    public static final /* synthetic */ ujj1[] f;

    static {
        ujj1 ujj1Var = new ujj1("DRIVER_DISTRACTION_MODE", 0);
        a = ujj1Var;
        ujj1 ujj1Var2 = new ujj1("VIDEO_PODCAST_DATA_SAVER", 1);
        b = ujj1Var2;
        ujj1 ujj1Var3 = new ujj1("DISABLED_BY_CONTEXT_PLAYER", 2);
        c = ujj1Var3;
        ujj1 ujj1Var4 = new ujj1("NO_SURFACE_ATTACHED", 3);
        d = ujj1Var4;
        ujj1 ujj1Var5 = new ujj1("PLAYBACK_DEFERRED", 4);
        e = ujj1Var5;
        f = new ujj1[]{ujj1Var, ujj1Var2, ujj1Var3, ujj1Var4, ujj1Var5};
    }

    public static ujj1 valueOf(String str) {
        return (ujj1) Enum.valueOf(ujj1.class, str);
    }

    public static ujj1[] values() {
        return (ujj1[]) f.clone();
    }
}
