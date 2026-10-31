package com.spotify.premiummarketing.premiumdestinationpage.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.m660;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class HeroVideo extends h implements v2j0 {
    private static final HeroVideo DEFAULT_INSTANCE;
    public static final int LABEL_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PAUSE_VIDEO_TEXT_FIELD_NUMBER = 3;
    public static final int PLAY_VIDEO_TEXT_FIELD_NUMBER = 4;
    public static final int URL_FIELD_NUMBER = 2;
    private int bitField0_;
    private String label_ = "";
    private String url_ = "";
    private String pauseVideoText_ = "";
    private String playVideoText_ = "";

    static {
        HeroVideo heroVideo = new HeroVideo();
        DEFAULT_INSTANCE = heroVideo;
        h.registerDefaultInstance(HeroVideo.class, heroVideo);
    }

    private HeroVideo() {
    }

    public static HeroVideo n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003Ȉ\u0004Ȉ", new Object[]{"bitField0_", "label_", "url_", "pauseVideoText_", "playVideoText_"});
        }
        if (iOrdinal == 3) {
            return new HeroVideo();
        }
        if (iOrdinal == 4) {
            return new m660(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (HeroVideo.class) {
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

    public final String getUrl() {
        return this.url_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.label_;
    }

    public final String p() {
        return this.pauseVideoText_;
    }

    public final String q() {
        return this.playVideoText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
