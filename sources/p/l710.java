package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l710 {
    public static final l710 a;
    public static final /* synthetic */ l710[] b;

    static {
        l710 l710Var = new l710("TRACKS", 0);
        a = l710Var;
        b = new l710[]{l710Var, new l710("ALBUMS", 1), new l710("ARTISTS", 2), new l710("PLAYLISTS", 3), new l710("EPISODES", 4), new l710("PODCASTS", 5), new l710("AUDIOBOOKS", 6)};
    }

    public static l710 valueOf(String str) {
        return (l710) Enum.valueOf(l710.class, str);
    }

    public static l710[] values() {
        return (l710[]) b.clone();
    }
}
