package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zhu0 {
    public static final zhu0 a;
    public static final zhu0 b;
    public static final zhu0 c;
    public static final zhu0 d;
    public static final zhu0 e;
    public static final zhu0 f;
    public static final /* synthetic */ zhu0[] g;

    static {
        zhu0 zhu0Var = new zhu0("SONG", 0);
        a = zhu0Var;
        zhu0 zhu0Var2 = new zhu0("EPISODE", 1);
        b = zhu0Var2;
        zhu0 zhu0Var3 = new zhu0("AUDIOBOOK", 2);
        c = zhu0Var3;
        zhu0 zhu0Var4 = new zhu0("PODCAST_CHAPTER", 3);
        d = zhu0Var4;
        zhu0 zhu0Var5 = new zhu0("CLIP", 4);
        e = zhu0Var5;
        zhu0 zhu0Var6 = new zhu0("OTHER", 5);
        f = zhu0Var6;
        g = new zhu0[]{zhu0Var, zhu0Var2, zhu0Var3, zhu0Var4, zhu0Var5, zhu0Var6};
    }

    public static zhu0 valueOf(String str) {
        return (zhu0) Enum.valueOf(zhu0.class, str);
    }

    public static zhu0[] values() {
        return (zhu0[]) g.clone();
    }
}
