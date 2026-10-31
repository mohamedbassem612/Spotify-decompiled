package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class na51 {
    public static final na51 a;
    public static final na51 b;
    public static final na51 c;
    public static final na51 d;
    public static final na51 e;
    public static final na51 f;
    public static final na51 g;
    public static final na51 h;
    public static final na51 i;
    public static final /* synthetic */ na51[] t;

    static {
        na51 na51Var = new na51("ALBUM", 0);
        a = na51Var;
        na51 na51Var2 = new na51("ARTIST", 1);
        b = na51Var2;
        na51 na51Var3 = new na51("AUDIOBOOK", 2);
        c = na51Var3;
        na51 na51Var4 = new na51("AUDIOBOOK_AUTHOR", 3);
        d = na51Var4;
        na51 na51Var5 = new na51("EPISODE", 4);
        e = na51Var5;
        na51 na51Var6 = new na51("GENRE", 5);
        f = na51Var6;
        na51 na51Var7 = new na51("HIDDEN", 6);
        g = na51Var7;
        na51 na51Var8 = new na51("PLAYLIST", 7);
        h = na51Var8;
        na51 na51Var9 = new na51("SHOW", 8);
        na51 na51Var10 = new na51("TRACK", 9);
        i = na51Var10;
        t = new na51[]{na51Var, na51Var2, na51Var3, na51Var4, na51Var5, na51Var6, na51Var7, na51Var8, na51Var9, na51Var10};
    }

    public static na51 valueOf(String str) {
        return (na51) Enum.valueOf(na51.class, str);
    }

    public static na51[] values() {
        return (na51[]) t.clone();
    }
}
