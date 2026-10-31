package com.spotify.metadata.classic.proto;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.h290;
import p.jf40;
import p.phc;
import p.qij0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class Metadata$Track extends h implements v2j0 {
    public static final int ALBUM_FIELD_NUMBER = 3;
    public static final int ALTERNATIVE_FIELD_NUMBER = 13;
    public static final int ARTIST_FIELD_NUMBER = 4;
    public static final int ARTIST_WITH_ROLE_FIELD_NUMBER = 32;
    public static final int AVAILABILITY_FIELD_NUMBER = 19;
    public static final int CONTENT_RATING_FIELD_NUMBER = 25;
    private static final Metadata$Track DEFAULT_INSTANCE;
    public static final int DISC_NUMBER_FIELD_NUMBER = 6;
    public static final int DURATION_FIELD_NUMBER = 7;
    public static final int EARLIEST_LIVE_TIMESTAMP_FIELD_NUMBER = 17;
    public static final int EXPLICIT_FIELD_NUMBER = 9;
    public static final int EXTERNAL_ID_FIELD_NUMBER = 10;
    public static final int FILE_FIELD_NUMBER = 12;
    public static final int GID_FIELD_NUMBER = 1;
    public static final int HAS_LYRICS_FIELD_NUMBER = 18;
    public static final int INDEX_VERSION_FIELD_NUMBER = 26;
    public static final int LANGUAGE_OF_PERFORMANCE_FIELD_NUMBER = 22;
    public static final int LICENSOR_FIELD_NUMBER = 21;
    public static final int LOCALIZED_NAME_FIELD_NUMBER = 23;
    public static final int LYRICS_COUNTRY_FIELD_NUMBER = 20;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NUMBER_FIELD_NUMBER = 5;
    public static final int ORIGINAL_AUDIO_FIELD_NUMBER = 24;
    public static final int ORIGINAL_TITLE_FIELD_NUMBER = 27;
    private static volatile qzr0 PARSER = null;
    public static final int POPULARITY_FIELD_NUMBER = 8;
    public static final int PREVIEW_FIELD_NUMBER = 15;
    public static final int RESTRICTION_FIELD_NUMBER = 11;
    public static final int SALE_PERIOD_FIELD_NUMBER = 14;
    public static final int TAGS_FIELD_NUMBER = 16;
    public static final int VERSION_TITLE_FIELD_NUMBER = 28;
    private Metadata$Album album_;
    private int bitField0_;
    private int discNumber_;
    private int duration_;
    private long earliestLiveTimestamp_;
    private boolean explicit_;
    private boolean hasLyrics_;
    private long indexVersion_;
    private Metadata$Licensor licensor_;
    private int number_;
    private Metadata$Audio originalAudio_;
    private int popularity_;
    private phc gid_ = phc.b;
    private String name_ = "";
    private h290 artist_ = h.emptyProtobufList();
    private h290 externalId_ = h.emptyProtobufList();
    private h290 restriction_ = h.emptyProtobufList();
    private h290 file_ = h.emptyProtobufList();
    private h290 alternative_ = h.emptyProtobufList();
    private h290 salePeriod_ = h.emptyProtobufList();
    private h290 preview_ = h.emptyProtobufList();
    private h290 tags_ = h.emptyProtobufList();
    private h290 availability_ = h.emptyProtobufList();
    private h290 lyricsCountry_ = h.emptyProtobufList();
    private h290 languageOfPerformance_ = h.emptyProtobufList();
    private h290 localizedName_ = h.emptyProtobufList();
    private h290 contentRating_ = h.emptyProtobufList();
    private String originalTitle_ = "";
    private String versionTitle_ = "";
    private h290 artistWithRole_ = h.emptyProtobufList();

    static {
        Metadata$Track metadata$Track = new Metadata$Track();
        DEFAULT_INSTANCE = metadata$Track;
        h.registerDefaultInstance(Metadata$Track.class, metadata$Track);
    }

    private Metadata$Track() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Metadata$Track z(byte[] bArr) {
        return (Metadata$Track) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u001d\u0000\u0001\u0001 \u001d\u0000\u000e\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004\u001b\u0005ဏ\u0003\u0006ဏ\u0004\u0007ဏ\u0005\bဏ\u0006\tဇ\u0007\n\u001b\u000b\u001b\f\u001b\r\u001b\u000e\u001b\u000f\u001b\u0010\u001a\u0011ဂ\b\u0012ဇ\t\u0013\u001b\u0014\u001a\u0015ဉ\n\u0016\u001a\u0017\u001b\u0018ဉ\u000b\u0019\u001b\u001aဂ\f\u001bဈ\r\u001cဈ\u000e \u001b", new Object[]{"bitField0_", "gid_", "name_", "album_", "artist_", Metadata$Artist.class, "number_", "discNumber_", "duration_", "popularity_", "explicit_", "externalId_", Metadata$ExternalId.class, "restriction_", Metadata$Restriction.class, "file_", Metadata$AudioFile.class, "alternative_", Metadata$Track.class, "salePeriod_", Metadata$SalePeriod.class, "preview_", Metadata$AudioFile.class, "tags_", "earliestLiveTimestamp_", "hasLyrics_", "availability_", Metadata$Availability.class, "lyricsCountry_", "licensor_", "languageOfPerformance_", "localizedName_", Metadata$LocalizedString.class, "originalAudio_", "contentRating_", Metadata$ContentRating.class, "indexVersion_", "originalTitle_", "versionTitle_", "artistWithRole_", Metadata$ArtistWithRole.class});
        }
        if (iOrdinal == 3) {
            return new Metadata$Track();
        }
        if (iOrdinal == 4) {
            return new qij0(DEFAULT_INSTANCE, (byte) 24);
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
        synchronized (Metadata$Track.class) {
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

    public final List getArtistList() {
        return this.artist_;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final int getDiscNumber() {
        return this.discNumber_;
    }

    public final int getDuration() {
        return this.duration_;
    }

    public final String getName() {
        return this.name_;
    }

    public final int getNumber() {
        return this.number_;
    }

    public final Metadata$Album n() {
        Metadata$Album metadata$Album = this.album_;
        return metadata$Album == null ? Metadata$Album.q() : metadata$Album;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.alternative_;
    }

    public final h290 p() {
        return this.artistWithRole_;
    }

    public final h290 q() {
        return this.availability_;
    }

    public final h290 r() {
        return this.contentRating_;
    }

    public final boolean s() {
        return this.explicit_;
    }

    public final h290 t() {
        return this.externalId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final h290 u() {
        return this.file_;
    }

    public final phc v() {
        return this.gid_;
    }

    public final String w() {
        return this.originalTitle_;
    }

    public final h290 x() {
        return this.preview_;
    }

    public final String y() {
        return this.versionTitle_;
    }
}
