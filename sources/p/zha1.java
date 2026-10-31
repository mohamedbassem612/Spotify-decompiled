package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zha1 {
    public static final /* synthetic */ zha1[] X;
    public static final zha1 a;
    public static final zha1 b;
    public static final zha1 c;
    public static final zha1 d;
    public static final zha1 e;
    public static final zha1 f;
    public static final zha1 g;
    public static final zha1 h;
    public static final zha1 i;
    public static final zha1 t;

    static {
        zha1 zha1Var = new zha1("Alphabetical", 0);
        a = zha1Var;
        zha1 zha1Var2 = new zha1("Author", 1);
        b = zha1Var2;
        zha1 zha1Var3 = new zha1("Creator", 2);
        c = zha1Var3;
        zha1 zha1Var4 = new zha1("Custom", 3);
        d = zha1Var4;
        zha1 zha1Var5 = new zha1("Date", 4);
        e = zha1Var5;
        zha1 zha1Var6 = new zha1("ReleaseDate", 5);
        f = zha1Var6;
        zha1 zha1Var7 = new zha1("RecentlyAdded", 6);
        g = zha1Var7;
        zha1 zha1Var8 = new zha1("RecentlyPlayedOrAdded", 7);
        h = zha1Var8;
        zha1 zha1Var9 = new zha1("RecentlyUpdated", 8);
        i = zha1Var9;
        zha1 zha1Var10 = new zha1("Relevance", 9);
        t = zha1Var10;
        X = new zha1[]{zha1Var, zha1Var2, zha1Var3, zha1Var4, zha1Var5, zha1Var6, zha1Var7, zha1Var8, zha1Var9, zha1Var10};
    }

    public static zha1 valueOf(String str) {
        return (zha1) Enum.valueOf(zha1.class, str);
    }

    public static zha1[] values() {
        return (zha1[]) X.clone();
    }
}
