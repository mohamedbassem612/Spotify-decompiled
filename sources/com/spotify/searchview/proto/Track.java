package com.spotify.searchview.proto;

import com.google.protobuf.Duration;
import p.bf40;
import p.bjf1;
import p.cjf1;
import p.djf1;
import p.h290;
import p.hye1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Track extends com.google.protobuf.h implements v2j0 {
    public static final int AGE_ASSURED_FIELD_NUMBER = 15;
    public static final int ALTERNATE_IMAGE_URI_FIELD_NUMBER = 11;
    public static final int ALTERNATE_URI_FIELD_NUMBER = 13;
    public static final int CLASSIFICATION_FIELD_NUMBER = 17;
    public static final int CONTENT_ACCESS_FIELD_NUMBER = 19;
    private static final Track DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 18;
    public static final int EXPLICIT_FIELD_NUMBER = 1;
    public static final int IS_CHAPTERED_FIELD_NUMBER = 20;
    public static final int LYRICS_FIELD_NUMBER = 16;
    public static final int LYRICS_MATCH_FIELD_NUMBER = 7;
    public static final int MOGEF19_FIELD_NUMBER = 6;
    public static final int ON_DEMAND_FIELD_NUMBER = 8;
    private static volatile qzr0 PARSER = null;
    public static final int PREMIUM_ONLY_FIELD_NUMBER = 10;
    public static final int RELEASE_SIGNIFIER_TEXT_FIELD_NUMBER = 12;
    public static final int TRACK_ALBUM_FIELD_NUMBER = 3;
    public static final int TRACK_ARTISTS_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 14;
    public static final int WINDOWED_FIELD_NUMBER = 2;
    private boolean ageAssured_;
    private int bitField0_;
    private int classification_;
    private int contentAccess_;
    private Duration duration_;
    private boolean explicit_;
    private boolean isChaptered_;
    private boolean lyricsMatch_;
    private Snippet lyrics_;
    private boolean mogef19_;
    private OnDemand onDemand_;
    private boolean premiumOnly_;
    private RelatedEntity trackAlbum_;
    private int type_;
    private boolean windowed_;
    private h290 trackArtists_ = com.google.protobuf.h.emptyProtobufList();
    private String alternateImageUri_ = "";
    private String releaseSignifierText_ = "";
    private String alternateUri_ = "";

    static {
        Track track = new Track();
        DEFAULT_INSTANCE = track;
        com.google.protobuf.h.registerDefaultInstance(Track.class, track);
    }

    private Track() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Track s() {
        return DEFAULT_INSTANCE;
    }

    public final RelatedEntity A() {
        RelatedEntity relatedEntity = this.trackAlbum_;
        return relatedEntity == null ? RelatedEntity.n() : relatedEntity;
    }

    public final h290 B() {
        return this.trackArtists_;
    }

    public final djf1 C() {
        djf1 djf1Var;
        int i = this.type_;
        if (i == 0) {
            djf1Var = djf1.UNKNOWN;
        } else if (i == 1) {
            djf1Var = djf1.AUDIO_ONLY;
        } else if (i == 2) {
            djf1Var = djf1.AUDIO_WITH_VIDEO;
        } else if (i != 3) {
            djf1Var = i != 4 ? null : djf1.VIDEO_UNMAPPED;
        } else {
            djf1Var = djf1.VIDEO_MAPPED;
        }
        return djf1Var == null ? djf1.UNRECOGNIZED : djf1Var;
    }

    public final boolean D() {
        return this.windowed_;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0001\u0000\u0001\u0007\u0002\u0007\u0003ဉ\u0000\u0004\u001b\u0006\u0007\u0007\u0007\bဉ\u0001\n\u0007\u000bȈ\fȈ\rȈ\u000e\f\u000f\u0007\u0010ဉ\u0002\u0011\f\u0012ဉ\u0003\u0013\f\u0014\u0007", new Object[]{"bitField0_", "explicit_", "windowed_", "trackAlbum_", "trackArtists_", RelatedEntity.class, "mogef19_", "lyricsMatch_", "onDemand_", "premiumOnly_", "alternateImageUri_", "releaseSignifierText_", "alternateUri_", "type_", "ageAssured_", "lyrics_", "classification_", "duration_", "contentAccess_", "isChaptered_"});
        }
        if (iOrdinal == 3) {
            return new Track();
        }
        if (iOrdinal == 4) {
            return new hye1(DEFAULT_INSTANCE, (byte) 28);
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
        synchronized (Track.class) {
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

    public final Duration getDuration() {
        Duration duration = this.duration_;
        return duration == null ? Duration.n() : duration;
    }

    public final boolean n() {
        return this.ageAssured_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.alternateImageUri_;
    }

    public final String p() {
        return this.alternateUri_;
    }

    public final cjf1 q() {
        cjf1 cjf1Var;
        int i = this.classification_;
        if (i == 0) {
            cjf1Var = cjf1.TRACK_CLASSIFICATION_UNKNOWN;
        } else if (i != 1) {
            cjf1Var = i != 2 ? null : cjf1.TRACK_CLASSIFICATION_MTV;
        } else {
            cjf1Var = cjf1.TRACK_CLASSIFICATION_PERFORMANCE;
        }
        return cjf1Var == null ? cjf1.UNRECOGNIZED : cjf1Var;
    }

    public final bjf1 r() {
        bjf1 bjf1Var;
        int i = this.contentAccess_;
        if (i == 0) {
            bjf1Var = bjf1.CONTENT_ACCESS_NONE;
        } else if (i != 1) {
            bjf1Var = i != 2 ? null : bjf1.CONTENT_ACCESS_GATED;
        } else {
            bjf1Var = bjf1.CONTENT_ACCESS_WINDOWING;
        }
        return bjf1Var == null ? bjf1.UNRECOGNIZED : bjf1Var;
    }

    public final boolean t() {
        return this.explicit_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.isChaptered_;
    }

    public final Snippet v() {
        Snippet snippet = this.lyrics_;
        return snippet == null ? Snippet.n() : snippet;
    }

    public final boolean w() {
        return this.lyricsMatch_;
    }

    public final boolean x() {
        return this.mogef19_;
    }

    public final OnDemand y() {
        OnDemand onDemand = this.onDemand_;
        return onDemand == null ? OnDemand.n() : onDemand;
    }

    public final boolean z() {
        return this.premiumOnly_;
    }
}
