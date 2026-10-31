package com.spotify.searchview.proto;

import p.bf40;
import p.jf40;
import p.ofj1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class VideoCarouselItem extends com.google.protobuf.h implements v2j0 {
    private static final VideoCarouselItem DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 6;
    public static final int ISEXPLICIT_FIELD_NUMBER = 7;
    public static final int MOGEF19_FIELD_NUMBER = 9;
    private static volatile qzr0 PARSER = null;
    public static final int START_FIELD_NUMBER = 5;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int THUMBNAILURI_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int VIDEOID_FIELD_NUMBER = 4;
    public static final int VIDEOSPOTIFYURI_FIELD_NUMBER = 8;
    private int end_;
    private boolean isExplicit_;
    private boolean mogef19_;
    private int start_;
    private String title_ = "";
    private String subtitle_ = "";
    private String thumbnailUri_ = "";
    private String videoId_ = "";
    private String videoSpotifyUri_ = "";

    static {
        VideoCarouselItem videoCarouselItem = new VideoCarouselItem();
        DEFAULT_INSTANCE = videoCarouselItem;
        com.google.protobuf.h.registerDefaultInstance(VideoCarouselItem.class, videoCarouselItem);
    }

    private VideoCarouselItem() {
    }

    public static VideoCarouselItem n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0004\u0006\u0004\u0007\u0007\bȈ\t\u0007", new Object[]{"title_", "subtitle_", "thumbnailUri_", "videoId_", "start_", "end_", "isExplicit_", "videoSpotifyUri_", "mogef19_"});
        }
        if (iOrdinal == 3) {
            return new VideoCarouselItem();
        }
        if (iOrdinal == 4) {
            return new ofj1(DEFAULT_INSTANCE, (byte) 1);
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
        synchronized (VideoCarouselItem.class) {
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

    public final boolean getIsExplicit() {
        return this.isExplicit_;
    }

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.end_;
    }

    public final boolean p() {
        return this.mogef19_;
    }

    public final int q() {
        return this.start_;
    }

    public final String r() {
        return this.thumbnailUri_;
    }

    public final String s() {
        return this.videoId_;
    }

    public final String t() {
        return this.videoSpotifyUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
