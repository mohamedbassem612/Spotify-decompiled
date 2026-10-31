package p;

import com.spotify.cosmos.util.proto.EpisodeMetadata;
import com.spotify.cosmos.util.proto.PlayabilityRestriction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract /* synthetic */ class kih1 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[PlayabilityRestriction.values().length];
        try {
            iArr[PlayabilityRestriction.AGE_RESTRICTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlayabilityRestriction.EXPLICIT_CONTENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlayabilityRestriction.NO_RESTRICTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PlayabilityRestriction.NOT_IN_CATALOGUE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[EpisodeMetadata.EpisodeType.values().length];
        try {
            iArr2[EpisodeMetadata.EpisodeType.BONUS.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EpisodeMetadata.EpisodeType.TRAILER.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[EpisodeMetadata.EpisodeType.FULL.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
        int[] iArr3 = new int[EpisodeMetadata.MediaType.values().length];
        try {
            iArr3[EpisodeMetadata.MediaType.VODCAST.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[EpisodeMetadata.MediaType.AUDIO.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[EpisodeMetadata.MediaType.VIDEO.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        c = iArr3;
    }
}
