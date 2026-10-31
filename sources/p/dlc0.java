package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dlc0 {
    public static final /* synthetic */ dlc0[] X;
    public static final dlc0 a;
    public static final dlc0 b;
    public static final dlc0 c;
    public static final dlc0 d;
    public static final dlc0 e;
    public static final dlc0 f;
    public static final dlc0 g;
    public static final dlc0 h;
    public static final dlc0 i;
    public static final dlc0 t;

    static {
        dlc0 dlc0Var = new dlc0("Clip", 0);
        a = dlc0Var;
        dlc0 dlc0Var2 = new dlc0("Show", 1);
        b = dlc0Var2;
        dlc0 dlc0Var3 = new dlc0("Album", 2);
        c = dlc0Var3;
        dlc0 dlc0Var4 = new dlc0("Track", 3);
        d = dlc0Var4;
        dlc0 dlc0Var5 = new dlc0("Artist", 4);
        e = dlc0Var5;
        dlc0 dlc0Var6 = new dlc0("Kallax", 5);
        f = dlc0Var6;
        dlc0 dlc0Var7 = new dlc0("Episode", 6);
        g = dlc0Var7;
        dlc0 dlc0Var8 = new dlc0("LocalTrack", 7);
        h = dlc0Var8;
        dlc0 dlc0Var9 = new dlc0("Unrecognized", 8);
        i = dlc0Var9;
        dlc0 dlc0Var10 = new dlc0("PodcastChapter", 9);
        t = dlc0Var10;
        X = new dlc0[]{dlc0Var, dlc0Var2, dlc0Var3, dlc0Var4, dlc0Var5, dlc0Var6, dlc0Var7, dlc0Var8, dlc0Var9, dlc0Var10};
    }

    public static dlc0 valueOf(String str) {
        return (dlc0) Enum.valueOf(dlc0.class, str);
    }

    public static dlc0[] values() {
        return (dlc0[]) X.clone();
    }
}
