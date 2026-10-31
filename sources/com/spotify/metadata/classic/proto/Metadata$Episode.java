package com.spotify.metadata.classic.proto;

import com.google.protobuf.h;
import java.util.List;
import p.a01;
import p.bf40;
import p.h290;
import p.jf40;
import p.phc;
import p.qij0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.tij0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class Metadata$Episode extends h implements v2j0 {
    public static final int ALLOW_BACKGROUND_PLAYBACK_FIELD_NUMBER = 81;
    public static final int AUDIO_FIELD_NUMBER = 12;
    public static final int AUDIO_PREVIEW_FIELD_NUMBER = 74;
    public static final int AVAILABILITY_FIELD_NUMBER = 82;
    public static final int CONTENT_RATINGS_FIELD_NUMBER = 95;
    public static final int COVER_IMAGE_FIELD_NUMBER = 68;
    private static final Metadata$Episode DEFAULT_INSTANCE;
    public static final int DEPRECATED_POPULARITY_FIELD_NUMBER = 67;
    public static final int DESCRIPTION_FIELD_NUMBER = 64;
    public static final int DURATION_FIELD_NUMBER = 7;
    public static final int EMPLOYEE_ONLY_FIELD_NUMBER = 85;
    public static final int EPISODE_NUMBER_FIELD_NUMBER = 89;
    public static final int EXPLICIT_FIELD_NUMBER = 70;
    public static final int EXTERNAL_URL_FIELD_NUMBER = 83;
    public static final int FREEZE_FRAME_FIELD_NUMBER = 76;
    public static final int GID_FIELD_NUMBER = 1;
    public static final int INTERPRET_RESTRICTION_USING_GEOIP_FIELD_NUMBER = 78;
    public static final int IS_AUDIOBOOK_CHAPTER_FIELD_NUMBER = 96;
    public static final int KEYWORD_FIELD_NUMBER = 77;
    public static final int LANGUAGE_FIELD_NUMBER = 69;
    public static final int LOCALIZED_NAME_FIELD_NUMBER = 23;
    public static final int MUSIC_AND_TALK_FIELD_NUMBER = 91;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NUMBER_FIELD_NUMBER = 65;
    public static final int ORIGINAL_AUDIO_FIELD_NUMBER = 84;
    private static volatile qzr0 PARSER = null;
    public static final int PUBLISH_TIME_FIELD_NUMBER = 66;
    public static final int RESTRICTION_FIELD_NUMBER = 75;
    public static final int RSS_GUID_FIELD_NUMBER = 86;
    public static final int SALE_PERIOD_FIELD_NUMBER = 80;
    public static final int SEASON_NUMBER_FIELD_NUMBER = 88;
    public static final int SHOW_FIELD_NUMBER = 71;
    public static final int SUPPRESS_MONETIZATION_FIELD_NUMBER = 79;
    public static final int TYPE_FIELD_NUMBER = 87;
    public static final int VIDEO_FIELD_NUMBER = 72;
    public static final int VIDEO_PREVIEW_FIELD_NUMBER = 73;
    private boolean allowBackgroundPlayback_;
    private int bitField0_;
    private Metadata$ImageGroup coverImage_;
    private int deprecatedPopularity_;
    private int duration_;
    private boolean employeeOnly_;
    private int episodeNumber_;
    private boolean explicit_;
    private Metadata$ImageGroup freezeFrame_;
    private boolean interpretRestrictionUsingGeoip_;
    private boolean isAudiobookChapter_;
    private boolean musicAndTalk_;
    private int number_;
    private Metadata$Audio originalAudio_;
    private Metadata$Date publishTime_;
    private int seasonNumber_;
    private Metadata$Show show_;
    private boolean suppressMonetization_;
    private int type_;
    private phc gid_ = phc.b;
    private String name_ = "";
    private h290 audio_ = h.emptyProtobufList();
    private h290 localizedName_ = h.emptyProtobufList();
    private String description_ = "";
    private String language_ = "";
    private h290 video_ = h.emptyProtobufList();
    private h290 videoPreview_ = h.emptyProtobufList();
    private h290 audioPreview_ = h.emptyProtobufList();
    private h290 restriction_ = h.emptyProtobufList();
    private h290 keyword_ = h.emptyProtobufList();
    private h290 salePeriod_ = h.emptyProtobufList();
    private h290 availability_ = h.emptyProtobufList();
    private String externalUrl_ = "";
    private String rssGuid_ = "";
    private h290 contentRatings_ = h.emptyProtobufList();

    static {
        Metadata$Episode metadata$Episode = new Metadata$Episode();
        DEFAULT_INSTANCE = metadata$Episode;
        h.registerDefaultInstance(Metadata$Episode.class, metadata$Episode);
    }

    private Metadata$Episode() {
    }

    public static Metadata$Episode A(byte[] bArr) {
        return (Metadata$Episode) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\"\u0000\u0001\u0001`\"\u0000\n\u0000\u0001ည\u0000\u0002ဈ\u0001\u0007ဏ\u0002\f\u001b\u0017\u001b@ဈ\u0003Aဏ\u0004Bဉ\u0005Cဏ\u0006Dဉ\u0007Eဈ\bFဇ\tGဉ\nH\u001bI\u001bJ\u001bK\u001bLဉ\u000bM\u001aNဇ\fOဇ\rP\u001bQဇ\u000eR\u001bSဈ\u000fTဉ\u0010Uဇ\u0011Vဈ\u0012W᠌\u0013Xင\u0014Yင\u0015[ဇ\u0016_\u001b`ဇ\u0017", new Object[]{"bitField0_", "gid_", "name_", "duration_", "audio_", Metadata$AudioFile.class, "localizedName_", Metadata$LocalizedString.class, "description_", "number_", "publishTime_", "deprecatedPopularity_", "coverImage_", "language_", "explicit_", "show_", "video_", Metadata$VideoFile.class, "videoPreview_", Metadata$VideoFile.class, "audioPreview_", Metadata$AudioFile.class, "restriction_", Metadata$Restriction.class, "freezeFrame_", "keyword_", "interpretRestrictionUsingGeoip_", "suppressMonetization_", "salePeriod_", Metadata$SalePeriod.class, "allowBackgroundPlayback_", "availability_", Metadata$Availability.class, "externalUrl_", "originalAudio_", "employeeOnly_", "rssGuid_", "type_", a01.w, "seasonNumber_", "episodeNumber_", "musicAndTalk_", "contentRatings_", Metadata$ContentRating.class, "isAudiobookChapter_"});
        }
        if (iOrdinal == 3) {
            return new Metadata$Episode();
        }
        if (iOrdinal == 4) {
            return new qij0(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (Metadata$Episode.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final int getDuration() {
        return this.duration_;
    }

    public final String getLanguage() {
        return this.language_;
    }

    public final String getName() {
        return this.name_;
    }

    public final List getVideoList() {
        return this.video_;
    }

    public final boolean hasShow() {
        return (this.bitField0_ & 1024) != 0;
    }

    public final h290 n() {
        return this.audio_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.audioPreview_;
    }

    public final List p() {
        return this.contentRatings_;
    }

    public final Metadata$ImageGroup q() {
        Metadata$ImageGroup metadata$ImageGroup = this.coverImage_;
        return metadata$ImageGroup == null ? Metadata$ImageGroup.n() : metadata$ImageGroup;
    }

    public final boolean r() {
        return this.explicit_;
    }

    public final String s() {
        return this.externalUrl_;
    }

    public final phc t() {
        return this.gid_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.isAudiobookChapter_;
    }

    public final boolean v() {
        return this.musicAndTalk_;
    }

    public final Metadata$Audio w() {
        Metadata$Audio metadata$Audio = this.originalAudio_;
        return metadata$Audio == null ? Metadata$Audio.n() : metadata$Audio;
    }

    public final Metadata$Date x() {
        Metadata$Date metadata$Date = this.publishTime_;
        return metadata$Date == null ? Metadata$Date.o() : metadata$Date;
    }

    public final Metadata$Show y() {
        Metadata$Show metadata$Show = this.show_;
        return metadata$Show == null ? Metadata$Show.p() : metadata$Show;
    }

    public final tij0 z() {
        tij0 tij0VarA = tij0.a(this.type_);
        return tij0VarA == null ? tij0.FULL : tij0VarA;
    }
}
