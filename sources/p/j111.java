package p;

import com.spotify.campfire.chatcontentpickerpage.search.domain.EntityType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract /* synthetic */ class j111 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EntityType.values().length];
        try {
            iArr[EntityType.Artist.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EntityType.Song.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EntityType.Album.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EntityType.Playlist.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EntityType.Podcast.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[EntityType.Episode.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[EntityType.Audiobook.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
