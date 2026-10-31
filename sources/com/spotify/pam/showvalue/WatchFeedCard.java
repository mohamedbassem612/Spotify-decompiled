package com.spotify.pam.showvalue;

import com.google.protobuf.h;
import p.bf40;
import p.ixk1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class WatchFeedCard extends h implements v2j0 {
    public static final int COVER_IMAGE_URL_FIELD_NUMBER = 8;
    private static final WatchFeedCard DEFAULT_INSTANCE;
    public static final int FIRST_ITEM_URI_FIELD_NUMBER = 2;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 7;
    public static final int OVERLINE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 5;
    public static final int THUMBNAIL_IMAGE_URL_FIELD_NUMBER = 6;
    public static final int TITLE_FIELD_NUMBER = 4;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private String uri_ = "";
    private String firstItemUri_ = "";
    private String overline_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private String thumbnailImageUrl_ = "";
    private String navigationUri_ = "";
    private String coverImageUrl_ = "";

    static {
        WatchFeedCard watchFeedCard = new WatchFeedCard();
        DEFAULT_INSTANCE = watchFeedCard;
        h.registerDefaultInstance(WatchFeedCard.class, watchFeedCard);
    }

    private WatchFeedCard() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006ለ\u0000\u0007Ȉ\bለ\u0001", new Object[]{"bitField0_", "uri_", "firstItemUri_", "overline_", "title_", "subtitle_", "thumbnailImageUrl_", "navigationUri_", "coverImageUrl_"});
        }
        if (iOrdinal == 3) {
            return new WatchFeedCard();
        }
        if (iOrdinal == 4) {
            return new ixk1(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (WatchFeedCard.class) {
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

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final String getUri() {
        return this.uri_;
    }

    public final String n() {
        return this.coverImageUrl_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.firstItemUri_;
    }

    public final String p() {
        return this.navigationUri_;
    }

    public final String q() {
        return this.overline_;
    }

    public final String r() {
        return this.thumbnailImageUrl_;
    }

    public final boolean s() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
