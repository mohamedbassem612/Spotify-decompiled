package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b960 {
    public static final b960 a;
    public static final b960 b;
    public static final /* synthetic */ b960[] c;

    static {
        b960 b960Var = new b960("LikedSongs", 0);
        a = b960Var;
        b960 b960Var2 = new b960("YourEpisodes", 1);
        b = b960Var2;
        c = new b960[]{b960Var, b960Var2};
    }

    public static b960 valueOf(String str) {
        return (b960) Enum.valueOf(b960.class, str);
    }

    public static b960[] values() {
        return (b960[]) c.clone();
    }
}
