package com.spotify.searchview.proto;

import com.google.protobuf.Duration;
import com.google.protobuf.Int64Value;
import com.google.protobuf.Timestamp;
import p.au7;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zg7;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class AudioEpisode extends com.google.protobuf.h implements v2j0 {
    public static final int AGE_ASSURED_FIELD_NUMBER = 16;
    private static final AudioEpisode DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 7;
    public static final int DURATION_FIELD_NUMBER = 3;
    public static final int EXPLICIT_FIELD_NUMBER = 2;
    public static final int MOGEF19_FIELD_NUMBER = 9;
    public static final int MUSIC_AND_TALK_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int PUBLICATION_TIME_FIELD_NUMBER = 8;
    public static final int SHOW_NAME_FIELD_NUMBER = 1;
    public static final int SHOW_URI_FIELD_NUMBER = 2000;
    public static final int SNIPPET_FIELD_NUMBER = 10;
    public static final int STREAM_COUNT_FIELD_NUMBER = 17;
    public static final int TAGS_FIELD_NUMBER = 15;
    public static final int TYPE_FIELD_NUMBER = 18;
    public static final int VIDEO_FIELD_NUMBER = 12;
    public static final int VIDEO_FORMAT_FIELD_NUMBER = 2002;
    public static final int VIDEO_IMAGE_URI_FIELD_NUMBER = 14;
    private boolean ageAssured_;
    private int bitField0_;
    private Duration duration_;
    private boolean explicit_;
    private boolean mogef19_;
    private boolean musicAndTalk_;
    private Timestamp publicationTime_;
    private Snippet snippet_;
    private Int64Value streamCount_;
    private int type_;
    private boolean videoFormat_;
    private boolean video_;
    private String showName_ = "";
    private String description_ = "";
    private String videoImageUri_ = "";
    private h290 tags_ = com.google.protobuf.h.emptyProtobufList();
    private String showUri_ = "";

    static {
        AudioEpisode audioEpisode = new AudioEpisode();
        DEFAULT_INSTANCE = audioEpisode;
        com.google.protobuf.h.registerDefaultInstance(AudioEpisode.class, audioEpisode);
    }

    private AudioEpisode() {
    }

    public static AudioEpisode o() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0001\u0001ߒ\u0010\u0000\u0001\u0000\u0001Ȉ\u0002\u0007\u0003ဉ\u0000\u0006\u0007\u0007Ȉ\bဉ\u0001\t\u0007\nဉ\u0002\f\u0007\u000eȈ\u000f\u001b\u0010\u0007\u0011ဉ\u0003\u0012\fߐȈߒ\u0007", new Object[]{"bitField0_", "showName_", "explicit_", "duration_", "musicAndTalk_", "description_", "publicationTime_", "mogef19_", "snippet_", "video_", "videoImageUri_", "tags_", Tag.class, "ageAssured_", "streamCount_", "type_", "showUri_", "videoFormat_"});
        }
        if (iOrdinal == 3) {
            return new AudioEpisode();
        }
        if (iOrdinal == 4) {
            return new zg7(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (AudioEpisode.class) {
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

    public final boolean p() {
        return this.explicit_;
    }

    public final boolean q() {
        return this.mogef19_;
    }

    public final Timestamp r() {
        Timestamp timestamp = this.publicationTime_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final String s() {
        return this.showName_;
    }

    public final Snippet t() {
        Snippet snippet = this.snippet_;
        return snippet == null ? Snippet.n() : snippet;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final Int64Value u() {
        Int64Value int64Value = this.streamCount_;
        return int64Value == null ? Int64Value.n() : int64Value;
    }

    public final au7 v() {
        au7 au7Var;
        int i = this.type_;
        if (i == 0) {
            au7Var = au7.AUDIO_EPISODE_TYPE_UNSPECIFIED;
        } else if (i != 1) {
            au7Var = i != 2 ? null : au7.AUDIO_EPISODE_TYPE_MUSIC;
        } else {
            au7Var = au7.AUDIO_EPISODE_TYPE_TALK;
        }
        return au7Var == null ? au7.UNRECOGNIZED : au7Var;
    }

    public final boolean w() {
        return this.video_;
    }

    public final String x() {
        return this.videoImageUri_;
    }
}
