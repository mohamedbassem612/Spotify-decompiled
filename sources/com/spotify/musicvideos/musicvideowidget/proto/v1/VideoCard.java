package com.spotify.musicvideos.musicvideowidget.proto.v1;

import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.gvi1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class VideoCard extends h implements v2j0 {
    public static final int ARTIST_URI_FIELD_NUMBER = 14;
    private static final VideoCard DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 10;
    public static final int IS_EXPLICIT_FIELD_NUMBER = 3;
    public static final int MOGEF19_FIELD_NUMBER = 15;
    public static final int NAVIGATE_URI_FIELD_NUMBER = 16;
    private static volatile qzr0 PARSER = null;
    public static final int RELEASE_DATE_FIELD_NUMBER = 13;
    public static final int START_FIELD_NUMBER = 9;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int THUMBNAIL_URI_FIELD_NUMBER = 8;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int VIDEO_GID_FIELD_NUMBER = 5;
    public static final int VIDEO_TRACK_URI_FIELD_NUMBER = 7;
    private int bitField0_;
    private Duration end_;
    private boolean isExplicit_;
    private boolean mogef19_;
    private Timestamp releaseDate_;
    private Duration start_;
    private String title_ = "";
    private String subtitle_ = "";
    private String videoGid_ = "";
    private String videoTrackUri_ = "";
    private String thumbnailUri_ = "";
    private String artistUri_ = "";
    private String navigateUri_ = "";

    static {
        VideoCard videoCard = new VideoCard();
        DEFAULT_INSTANCE = videoCard;
        h.registerDefaultInstance(VideoCard.class, videoCard);
    }

    private VideoCard() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\u0010\f\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0005Ȉ\u0007Ȉ\bȈ\tဉ\u0000\nဉ\u0001\rဉ\u0002\u000eȈ\u000f\u0007\u0010Ȉ", new Object[]{"bitField0_", "title_", "subtitle_", "isExplicit_", "videoGid_", "videoTrackUri_", "thumbnailUri_", "start_", "end_", "releaseDate_", "artistUri_", "mogef19_", "navigateUri_"});
        }
        if (iOrdinal == 3) {
            return new VideoCard();
        }
        if (iOrdinal == 4) {
            return new gvi1(DEFAULT_INSTANCE, (byte) 28);
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
        synchronized (VideoCard.class) {
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

    public final String n() {
        return this.videoTrackUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
