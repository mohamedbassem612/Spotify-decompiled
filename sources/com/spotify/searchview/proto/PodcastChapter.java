package com.spotify.searchview.proto;

import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;
import p.bf40;
import p.iqu0;
import p.jf40;
import p.n2v0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class PodcastChapter extends com.google.protobuf.h implements v2j0 {
    public static final int AGE_ASSURED_FIELD_NUMBER = 6;
    private static final PodcastChapter DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 3;
    public static final int EXPLICIT_FIELD_NUMBER = 4;
    public static final int MOGEF19_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int PUBLICATION_TIME_FIELD_NUMBER = 7;
    public static final int SHOW_NAME_FIELD_NUMBER = 2;
    public static final int SUBTITLE_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 10;
    public static final int VIDEO_FIELD_NUMBER = 8;
    public static final int VIDEO_IMAGE_URI_FIELD_NUMBER = 9;
    private boolean ageAssured_;
    private int bitField0_;
    private Duration duration_;
    private boolean explicit_;
    private boolean mogef19_;
    private Timestamp publicationTime_;
    private int type_;
    private boolean video_;
    private String subtitle_ = "";
    private String showName_ = "";
    private String videoImageUri_ = "";

    static {
        PodcastChapter podcastChapter = new PodcastChapter();
        DEFAULT_INSTANCE = podcastChapter;
        com.google.protobuf.h.registerDefaultInstance(PodcastChapter.class, podcastChapter);
    }

    private PodcastChapter() {
    }

    public static PodcastChapter o() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004\u0007\u0005\u0007\u0006\u0007\u0007ဉ\u0001\b\u0007\tȈ\n\f", new Object[]{"bitField0_", "subtitle_", "showName_", "duration_", "explicit_", "mogef19_", "ageAssured_", "publicationTime_", "video_", "videoImageUri_", "type_"});
        }
        if (iOrdinal == 3) {
            return new PodcastChapter();
        }
        if (iOrdinal == 4) {
            return new iqu0(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (PodcastChapter.class) {
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

    public final String getSubtitle() {
        return this.subtitle_;
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

    public final n2v0 t() {
        n2v0 n2v0Var;
        int i = this.type_;
        if (i == 0) {
            n2v0Var = n2v0.CHAPTER_TYPE_UNKNOWN;
        } else if (i != 1) {
            n2v0Var = i != 2 ? null : n2v0.CHAPTER_TYPE_MUSIC;
        } else {
            n2v0Var = n2v0.CHAPTER_TYPE_TALK;
        }
        return n2v0Var == null ? n2v0.UNRECOGNIZED : n2v0Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.video_;
    }

    public final String v() {
        return this.videoImageUri_;
    }
}
