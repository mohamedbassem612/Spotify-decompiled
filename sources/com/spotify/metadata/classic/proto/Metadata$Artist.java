package com.spotify.metadata.classic.proto;

import com.google.protobuf.h;
import p.bf40;
import p.eij0;
import p.h290;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class Metadata$Artist extends h implements v2j0 {
    public static final int ACTIVITY_PERIOD_FIELD_NUMBER = 13;
    public static final int ALBUM_GROUP_FIELD_NUMBER = 5;
    public static final int APPEARS_ON_GROUP_FIELD_NUMBER = 8;
    public static final int AVAILABILITY_FIELD_NUMBER = 20;
    public static final int BIOGRAPHY_FIELD_NUMBER = 12;
    public static final int COMPILATION_GROUP_FIELD_NUMBER = 7;
    private static final Metadata$Artist DEFAULT_INSTANCE;
    public static final int EXTERNAL_ID_FIELD_NUMBER = 10;
    public static final int GENRE_FIELD_NUMBER = 9;
    public static final int GID_FIELD_NUMBER = 1;
    public static final int INDEX_VERSION_FIELD_NUMBER = 21;
    public static final int IS_PORTRAIT_ALBUM_COVER_FIELD_NUMBER = 16;
    public static final int LOCALIZED_NAME_FIELD_NUMBER = 19;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int POPULARITY_FIELD_NUMBER = 3;
    public static final int PORTRAIT_FIELD_NUMBER = 11;
    public static final int PORTRAIT_GROUP_FIELD_NUMBER = 17;
    public static final int RELATED_FIELD_NUMBER = 15;
    public static final int RESTRICTION_FIELD_NUMBER = 14;
    public static final int SALE_PERIOD_FIELD_NUMBER = 18;
    public static final int SINGLE_GROUP_FIELD_NUMBER = 6;
    public static final int TOP_TRACK_FIELD_NUMBER = 4;
    private int bitField0_;
    private long indexVersion_;
    private boolean isPortraitAlbumCover_;
    private int popularity_;
    private Metadata$ImageGroup portraitGroup_;
    private phc gid_ = phc.b;
    private String name_ = "";
    private h290 topTrack_ = h.emptyProtobufList();
    private h290 albumGroup_ = h.emptyProtobufList();
    private h290 singleGroup_ = h.emptyProtobufList();
    private h290 compilationGroup_ = h.emptyProtobufList();
    private h290 appearsOnGroup_ = h.emptyProtobufList();
    private h290 genre_ = h.emptyProtobufList();
    private h290 externalId_ = h.emptyProtobufList();
    private h290 portrait_ = h.emptyProtobufList();
    private h290 biography_ = h.emptyProtobufList();
    private h290 activityPeriod_ = h.emptyProtobufList();
    private h290 restriction_ = h.emptyProtobufList();
    private h290 related_ = h.emptyProtobufList();
    private h290 salePeriod_ = h.emptyProtobufList();
    private h290 localizedName_ = h.emptyProtobufList();
    private h290 availability_ = h.emptyProtobufList();

    static {
        Metadata$Artist metadata$Artist = new Metadata$Artist();
        DEFAULT_INSTANCE = metadata$Artist;
        h.registerDefaultInstance(Metadata$Artist.class, metadata$Artist);
    }

    private Metadata$Artist() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Metadata$Artist t(byte[] bArr) {
        return (Metadata$Artist) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u000f\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003ဏ\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b\b\u001b\t\u001a\n\u001b\u000b\u001b\f\u001b\r\u001b\u000e\u001b\u000f\u001b\u0010ဇ\u0003\u0011ဉ\u0004\u0012\u001b\u0013\u001b\u0014\u001b\u0015ဂ\u0005", new Object[]{"bitField0_", "gid_", "name_", "popularity_", "topTrack_", Metadata$TopTracks.class, "albumGroup_", Metadata$AlbumGroup.class, "singleGroup_", Metadata$AlbumGroup.class, "compilationGroup_", Metadata$AlbumGroup.class, "appearsOnGroup_", Metadata$AlbumGroup.class, "genre_", "externalId_", Metadata$ExternalId.class, "portrait_", Metadata$Image.class, "biography_", Metadata$Biography.class, "activityPeriod_", Metadata$ActivityPeriod.class, "restriction_", Metadata$Restriction.class, "related_", Metadata$Artist.class, "isPortraitAlbumCover_", "portraitGroup_", "salePeriod_", Metadata$SalePeriod.class, "localizedName_", Metadata$LocalizedString.class, "availability_", Metadata$Availability.class, "indexVersion_"});
        }
        if (iOrdinal == 3) {
            return new Metadata$Artist();
        }
        if (iOrdinal == 4) {
            return new eij0(DEFAULT_INSTANCE, (byte) 5);
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
        synchronized (Metadata$Artist.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final h290 n() {
        return this.albumGroup_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.appearsOnGroup_;
    }

    public final phc p() {
        return this.gid_;
    }

    public final Metadata$ImageGroup q() {
        Metadata$ImageGroup metadata$ImageGroup = this.portraitGroup_;
        return metadata$ImageGroup == null ? Metadata$ImageGroup.n() : metadata$ImageGroup;
    }

    public final h290 r() {
        return this.singleGroup_;
    }

    public final h290 s() {
        return this.topTrack_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
