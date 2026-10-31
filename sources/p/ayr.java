package p;

import com.spotify.cosmos.util.proto.EpisodeMetadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract /* synthetic */ class ayr {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[EpisodeMetadata.MediaType.values().length];
        try {
            iArr[EpisodeMetadata.MediaType.VODCAST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EpisodeMetadata.MediaType.AUDIO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EpisodeMetadata.MediaType.VIDEO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[EpisodeMetadata.EpisodeType.values().length];
        try {
            iArr2[EpisodeMetadata.EpisodeType.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EpisodeMetadata.EpisodeType.FULL.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EpisodeMetadata.EpisodeType.TRAILER.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[EpisodeMetadata.EpisodeType.BONUS.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
