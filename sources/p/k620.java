package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class k620 {
    public static final k620 a;
    public static final k620 b;
    public static final k620 c;
    public static final k620 d;
    public static final k620 e;
    public static final k620 f;
    public static final k620 g;
    public static final k620 h;
    public static final /* synthetic */ k620[] i;

    static {
        k620 k620Var = new k620("All", 0);
        a = k620Var;
        k620 k620Var2 = new k620("Artists", 1);
        b = k620Var2;
        k620 k620Var3 = new k620("Songs", 2);
        c = k620Var3;
        k620 k620Var4 = new k620("Albums", 3);
        d = k620Var4;
        k620 k620Var5 = new k620("Playlists", 4);
        e = k620Var5;
        k620 k620Var6 = new k620("Podcasts", 5);
        f = k620Var6;
        k620 k620Var7 = new k620("Episodes", 6);
        g = k620Var7;
        k620 k620Var8 = new k620("Audiobooks", 7);
        h = k620Var8;
        i = new k620[]{k620Var, k620Var2, k620Var3, k620Var4, k620Var5, k620Var6, k620Var7, k620Var8};
    }

    public static k620 valueOf(String str) {
        return (k620) Enum.valueOf(k620.class, str);
    }

    public static k620[] values() {
        return (k620[]) i.clone();
    }
}
