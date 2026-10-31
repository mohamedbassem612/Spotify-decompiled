package com.spotify.pam.showvalue;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.ixk1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class WatchFeedSection extends h implements v2j0 {
    public static final int CARDS_FIELD_NUMBER = 3;
    private static final WatchFeedSection DEFAULT_INSTANCE;
    public static final int HEADING_SUBTITLE_FIELD_NUMBER = 2;
    public static final int HEADING_TITLE_FIELD_NUMBER = 1;
    public static final int NAVIGATION_ACTION_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private CarouselAction navigationAction_;
    private String headingTitle_ = "";
    private String headingSubtitle_ = "";
    private h290 cards_ = h.emptyProtobufList();

    static {
        WatchFeedSection watchFeedSection = new WatchFeedSection();
        DEFAULT_INSTANCE = watchFeedSection;
        h.registerDefaultInstance(WatchFeedSection.class, watchFeedSection);
    }

    private WatchFeedSection() {
    }

    public static WatchFeedSection o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002ለ\u0000\u0003\u001b\u0004ဉ\u0001", new Object[]{"bitField0_", "headingTitle_", "headingSubtitle_", "cards_", WatchFeedCard.class, "navigationAction_"});
        }
        if (iOrdinal == 3) {
            return new WatchFeedSection();
        }
        if (iOrdinal == 4) {
            return new ixk1(DEFAULT_INSTANCE, (byte) 10);
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
        synchronized (WatchFeedSection.class) {
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

    public final h290 n() {
        return this.cards_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.headingSubtitle_;
    }

    public final String q() {
        return this.headingTitle_;
    }

    public final CarouselAction r() {
        CarouselAction carouselAction = this.navigationAction_;
        return carouselAction == null ? CarouselAction.n() : carouselAction;
    }

    public final boolean s() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
