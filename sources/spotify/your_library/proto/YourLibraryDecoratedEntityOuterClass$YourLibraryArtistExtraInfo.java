package spotify.your_library.proto;

import com.google.protobuf.h;
import p.bf40;
import p.dnm1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class YourLibraryDecoratedEntityOuterClass$YourLibraryArtistExtraInfo extends h implements v2j0 {
    private static final YourLibraryDecoratedEntityOuterClass$YourLibraryArtistExtraInfo DEFAULT_INSTANCE;
    public static final int HAS_LIKED_TRACKS_OR_ALBUMS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int RELEASES_COUNT_FIELD_NUMBER = 3;
    public static final int TRACK_COUNT_FIELD_NUMBER = 2;
    private boolean hasLikedTracksOrAlbums_;
    private int releasesCount_;
    private int trackCount_;

    static {
        YourLibraryDecoratedEntityOuterClass$YourLibraryArtistExtraInfo yourLibraryDecoratedEntityOuterClass$YourLibraryArtistExtraInfo = new YourLibraryDecoratedEntityOuterClass$YourLibraryArtistExtraInfo();
        DEFAULT_INSTANCE = yourLibraryDecoratedEntityOuterClass$YourLibraryArtistExtraInfo;
        h.registerDefaultInstance(YourLibraryDecoratedEntityOuterClass$YourLibraryArtistExtraInfo.class, yourLibraryDecoratedEntityOuterClass$YourLibraryArtistExtraInfo);
    }

    private YourLibraryDecoratedEntityOuterClass$YourLibraryArtistExtraInfo() {
    }

    public static YourLibraryDecoratedEntityOuterClass$YourLibraryArtistExtraInfo n() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u000b\u0003\u000b", new Object[]{"hasLikedTracksOrAlbums_", "trackCount_", "releasesCount_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryDecoratedEntityOuterClass$YourLibraryArtistExtraInfo();
        }
        if (iOrdinal == 4) {
            return new dnm1(DEFAULT_INSTANCE, (byte) 9);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        qzr0 qzr0Var = PARSER;
        if (qzr0Var != null) {
            return qzr0Var;
        }
        synchronized (YourLibraryDecoratedEntityOuterClass$YourLibraryArtistExtraInfo.class) {
            try {
                bf40Var = PARSER;
                if (bf40Var == null) {
                    bf40Var = new bf40(DEFAULT_INSTANCE);
                    PARSER = bf40Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bf40Var;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.releasesCount_;
    }

    public final int p() {
        return this.trackCount_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
