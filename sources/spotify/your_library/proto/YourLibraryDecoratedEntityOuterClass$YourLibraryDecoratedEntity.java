package spotify.your_library.proto;

import com.google.protobuf.h;
import p.bf40;
import p.ftm1;
import p.gtm1;
import p.htm1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity extends h implements htm1 {
    public static final int ALBUM_FIELD_NUMBER = 2;
    public static final int ARTIST_FIELD_NUMBER = 3;
    public static final int AUTHOR_FIELD_NUMBER = 17;
    public static final int BOOK_FIELD_NUMBER = 12;
    public static final int CONCERT_CAMPAIGN_FIELD_NUMBER = 20;
    private static final YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity DEFAULT_INSTANCE;
    public static final int ENTITY_INFO_FIELD_NUMBER = 1;
    public static final int EVENT_FIELD_NUMBER = 16;
    public static final int FOLDER_FIELD_NUMBER = 6;
    public static final int NEW_EPISODES_FIELD_NUMBER = 10;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_FIELD_NUMBER = 4;
    public static final int PRERELEASE_FIELD_NUMBER = 15;
    public static final int SHOW_FIELD_NUMBER = 5;
    public static final int VENUE_FIELD_NUMBER = 19;
    private int bitField0_;
    private int entityCase_ = 0;
    private YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo entityInfo_;
    private Object entity_;

    static {
        YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity = new YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity();
        DEFAULT_INSTANCE = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity;
        h.registerDefaultInstance(YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.class, yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity);
    }

    private YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity r() {
        return DEFAULT_INSTANCE;
    }

    public final boolean A() {
        return this.entityCase_ == 12;
    }

    public final boolean B() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean C() {
        return this.entityCase_ == 6;
    }

    public final boolean D() {
        return this.entityCase_ == 10;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0001\u0001\u0001\u0014\r\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\n<\u0000\f<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0013<\u0000\u0014<\u0000", new Object[]{"entity_", "entityCase_", "bitField0_", "entityInfo_", YourLibraryDecoratedEntityOuterClass$YourLibraryAlbumExtraInfo.class, YourLibraryDecoratedEntityOuterClass$YourLibraryArtistExtraInfo.class, YourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo.class, YourLibraryDecoratedEntityOuterClass$YourLibraryShowExtraInfo.class, YourLibraryDecoratedEntityOuterClass$YourLibraryFolderExtraInfo.class, YourLibraryDecoratedEntityOuterClass$YourLibraryNewEpisodesExtraInfo.class, YourLibraryDecoratedEntityOuterClass$YourLibraryBookExtraInfo.class, YourLibraryDecoratedEntityOuterClass$YourLibraryPreReleaseExtraInfo.class, YourLibraryDecoratedEntityOuterClass$YourLibraryEventExtraInfo.class, YourLibraryDecoratedEntityOuterClass$YourLibraryAuthorExtraInfo.class, YourLibraryDecoratedEntityOuterClass$YourLibraryVenueExtraInfo.class, YourLibraryDecoratedEntityOuterClass$YourLibraryConcertCampaignExtraInfo.class});
        }
        if (iOrdinal == 3) {
            return new YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity();
        }
        if (iOrdinal == 4) {
            return new ftm1(DEFAULT_INSTANCE);
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
        synchronized (YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.class) {
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

    public final YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo e() {
        YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo = this.entityInfo_;
        return yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo == null ? YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo.n() : yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final boolean hasAlbum() {
        return this.entityCase_ == 2;
    }

    public final boolean hasArtist() {
        return this.entityCase_ == 3;
    }

    public final boolean hasPlaylist() {
        return this.entityCase_ == 4;
    }

    public final boolean hasShow() {
        return this.entityCase_ == 5;
    }

    public final YourLibraryDecoratedEntityOuterClass$YourLibraryAlbumExtraInfo n() {
        return this.entityCase_ == 2 ? (YourLibraryDecoratedEntityOuterClass$YourLibraryAlbumExtraInfo) this.entity_ : YourLibraryDecoratedEntityOuterClass$YourLibraryAlbumExtraInfo.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final YourLibraryDecoratedEntityOuterClass$YourLibraryArtistExtraInfo o() {
        return this.entityCase_ == 3 ? (YourLibraryDecoratedEntityOuterClass$YourLibraryArtistExtraInfo) this.entity_ : YourLibraryDecoratedEntityOuterClass$YourLibraryArtistExtraInfo.n();
    }

    public final YourLibraryDecoratedEntityOuterClass$YourLibraryBookExtraInfo p() {
        return this.entityCase_ == 12 ? (YourLibraryDecoratedEntityOuterClass$YourLibraryBookExtraInfo) this.entity_ : YourLibraryDecoratedEntityOuterClass$YourLibraryBookExtraInfo.p();
    }

    public final YourLibraryDecoratedEntityOuterClass$YourLibraryConcertCampaignExtraInfo q() {
        return this.entityCase_ == 20 ? (YourLibraryDecoratedEntityOuterClass$YourLibraryConcertCampaignExtraInfo) this.entity_ : YourLibraryDecoratedEntityOuterClass$YourLibraryConcertCampaignExtraInfo.n();
    }

    public final gtm1 s() {
        int i = this.entityCase_;
        if (i == 0) {
            return gtm1.Z;
        }
        if (i == 10) {
            return gtm1.f;
        }
        if (i == 12) {
            return gtm1.g;
        }
        if (i == 2) {
            return gtm1.a;
        }
        if (i == 3) {
            return gtm1.b;
        }
        if (i == 4) {
            return gtm1.c;
        }
        if (i == 5) {
            return gtm1.d;
        }
        if (i == 6) {
            return gtm1.e;
        }
        if (i == 19) {
            return gtm1.X;
        }
        if (i == 20) {
            return gtm1.Y;
        }
        switch (i) {
            case 15:
                return gtm1.h;
            case 16:
                return gtm1.i;
            case 17:
                return gtm1.t;
            default:
                return null;
        }
    }

    public final YourLibraryDecoratedEntityOuterClass$YourLibraryEventExtraInfo t() {
        return this.entityCase_ == 16 ? (YourLibraryDecoratedEntityOuterClass$YourLibraryEventExtraInfo) this.entity_ : YourLibraryDecoratedEntityOuterClass$YourLibraryEventExtraInfo.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final YourLibraryDecoratedEntityOuterClass$YourLibraryFolderExtraInfo u() {
        return this.entityCase_ == 6 ? (YourLibraryDecoratedEntityOuterClass$YourLibraryFolderExtraInfo) this.entity_ : YourLibraryDecoratedEntityOuterClass$YourLibraryFolderExtraInfo.n();
    }

    public final YourLibraryDecoratedEntityOuterClass$YourLibraryNewEpisodesExtraInfo v() {
        return this.entityCase_ == 10 ? (YourLibraryDecoratedEntityOuterClass$YourLibraryNewEpisodesExtraInfo) this.entity_ : YourLibraryDecoratedEntityOuterClass$YourLibraryNewEpisodesExtraInfo.n();
    }

    public final YourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo w() {
        return this.entityCase_ == 4 ? (YourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo) this.entity_ : YourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo.p();
    }

    public final YourLibraryDecoratedEntityOuterClass$YourLibraryPreReleaseExtraInfo x() {
        return this.entityCase_ == 15 ? (YourLibraryDecoratedEntityOuterClass$YourLibraryPreReleaseExtraInfo) this.entity_ : YourLibraryDecoratedEntityOuterClass$YourLibraryPreReleaseExtraInfo.o();
    }

    public final YourLibraryDecoratedEntityOuterClass$YourLibraryShowExtraInfo y() {
        return this.entityCase_ == 5 ? (YourLibraryDecoratedEntityOuterClass$YourLibraryShowExtraInfo) this.entity_ : YourLibraryDecoratedEntityOuterClass$YourLibraryShowExtraInfo.o();
    }

    public final YourLibraryDecoratedEntityOuterClass$YourLibraryVenueExtraInfo z() {
        return this.entityCase_ == 19 ? (YourLibraryDecoratedEntityOuterClass$YourLibraryVenueExtraInfo) this.entity_ : YourLibraryDecoratedEntityOuterClass$YourLibraryVenueExtraInfo.p();
    }
}
