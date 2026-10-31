package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zqd1 {
    public static final zqd1 a;
    public static final zqd1 b;
    public static final zqd1 c;
    public static final zqd1 d;
    public static final zqd1 e;
    public static final /* synthetic */ zqd1[] f;

    static {
        zqd1 zqd1Var = new zqd1("GENRE", 0);
        a = zqd1Var;
        zqd1 zqd1Var2 = new zqd1("TRACK_COVER", 1);
        zqd1 zqd1Var3 = new zqd1("TRACK_ROW", 2);
        b = zqd1Var3;
        zqd1 zqd1Var4 = new zqd1("PLAYLIST_COVER", 3);
        zqd1 zqd1Var5 = new zqd1("PLAYLIST_ROW", 4);
        c = zqd1Var5;
        zqd1 zqd1Var6 = new zqd1("ALBUM_COVER", 5);
        d = zqd1Var6;
        zqd1 zqd1Var7 = new zqd1("ALBUM_ROW", 6);
        e = zqd1Var7;
        f = new zqd1[]{zqd1Var, zqd1Var2, zqd1Var3, zqd1Var4, zqd1Var5, zqd1Var6, zqd1Var7};
    }

    public static zqd1 valueOf(String str) {
        return (zqd1) Enum.valueOf(zqd1.class, str);
    }

    public static zqd1[] values() {
        return (zqd1[]) f.clone();
    }
}
