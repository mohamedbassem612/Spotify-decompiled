package com.spotify.premiummarketing.premiumdestinationpage.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.r4v0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class PremiumPageHeader extends h implements v2j0 {
    private static final PremiumPageHeader DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int HERO_OFFER_COLOR_SET_FIELD_NUMBER = 8;
    public static final int IMAGE_URL_FIELD_NUMBER = 4;
    public static final int LABEL_FIELD_NUMBER = 6;
    public static final int LOGGING_INFO_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int VIDEO_FIELD_NUMBER = 7;
    private int bitField0_;
    private LoggingInfo loggingInfo_;
    private HeroVideo video_;
    private String title_ = "";
    private String subtitle_ = "";
    private String description_ = "";
    private String imageUrl_ = "";
    private String label_ = "";
    private String heroOfferColorSet_ = "";

    static {
        PremiumPageHeader premiumPageHeader = new PremiumPageHeader();
        DEFAULT_INSTANCE = premiumPageHeader;
        h.registerDefaultInstance(PremiumPageHeader.class, premiumPageHeader);
    }

    private PremiumPageHeader() {
    }

    public static PremiumPageHeader n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ဉ\u0004\u0006ለ\u0005\u0007ဉ\u0006\bለ\u0007", new Object[]{"bitField0_", "title_", "subtitle_", "description_", "imageUrl_", "loggingInfo_", "label_", "video_", "heroOfferColorSet_"});
        }
        if (iOrdinal == 3) {
            return new PremiumPageHeader();
        }
        if (iOrdinal == 4) {
            return new r4v0(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (PremiumPageHeader.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
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

    public final String o() {
        return this.heroOfferColorSet_;
    }

    public final String p() {
        return this.label_;
    }

    public final LoggingInfo q() {
        LoggingInfo loggingInfo = this.loggingInfo_;
        return loggingInfo == null ? LoggingInfo.o() : loggingInfo;
    }

    public final HeroVideo r() {
        HeroVideo heroVideo = this.video_;
        return heroVideo == null ? HeroVideo.n() : heroVideo;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
