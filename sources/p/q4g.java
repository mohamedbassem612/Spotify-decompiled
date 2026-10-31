package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q4g {
    public static final q4g a;
    public static final /* synthetic */ q4g[] b;

    static {
        q4g q4gVar = new q4g("MediaToggle", 0);
        a = q4gVar;
        b = new q4g[]{q4gVar, new q4g("EntitySegments", 1), new q4g("ChapterList", 2), new q4g("FullEpisode", 3), new q4g("SkipAd", 4)};
    }

    public static q4g valueOf(String str) {
        return (q4g) Enum.valueOf(q4g.class, str);
    }

    public static q4g[] values() {
        return (q4g[]) b.clone();
    }
}
