package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v920 {
    public static final /* synthetic */ v920[] a = {new v920("VideosOnly", 0), new v920("ExcludeVideos", 1), new v920("UnplayedOnly", 2), new v920("NotLocalTrack", 3), new v920("ExcludeBanned", 4), new v920("InProgressOnly", 5), new v920("ExcludeEpisodes", 6), new v920("ExcludeExplicit", 7), new v920("ExcludeUnavailable", 8), new v920("ExcludeEpisodeTrailers", 9), new v920("FullyPlayedOnly", 10), new v920("NotFullyPlayedOnly", 11), new v920("NotFullyPlayedOrInProgressOnly", 12), new v920("AvailableOfflineOnly", 13), new v920("VideoAvailableOfflineOnly", 14), new v920("VideoNotAvailableOfflineOnly", 15), new v920("ExcludeItemsWithBannedArtist", 16), new v920("ExcludeInjectedRecommendations", 17), new v920("OnlyInjectedRecommendations", 18), new v920("RowId", 19), new v920("Text", 20), new v920("Descriptor", 21), new v920("FormatListAttributeKeys", 22), new v920("TagManifestIds", 23)};

    /* JADX INFO: Fake field, exist only in values array */
    v920 EF5;

    public static v920 valueOf(String str) {
        return (v920) Enum.valueOf(v920.class, str);
    }

    public static v920[] values() {
        return (v920[]) a.clone();
    }
}
