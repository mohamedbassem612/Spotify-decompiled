package com.spotify.highlightsstats.data.proto.timeline.view.v1;

import com.google.protobuf.h;
import com.spotify.paragraph.v1.proto.Paragraph;
import p.bf40;
import p.eog0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class MarketComparisonSection extends h implements v2j0 {
    public static final int ACCESSIBILITY_DESCRIPTION_FIELD_NUMBER = 5;
    private static final MarketComparisonSection DEFAULT_INSTANCE;
    public static final int MARKET_LINE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PERCENTAGE_DIFFERENCE_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int USER_LINE_FIELD_NUMBER = 2;
    private String accessibilityDescription_ = "";
    private int bitField0_;
    private MarketComparisonItem marketLine_;
    private int percentageDifference_;
    private Paragraph title_;
    private MarketComparisonItem userLine_;

    static {
        MarketComparisonSection marketComparisonSection = new MarketComparisonSection();
        DEFAULT_INSTANCE = marketComparisonSection;
        h.registerDefaultInstance(MarketComparisonSection.class, marketComparisonSection);
    }

    private MarketComparisonSection() {
    }

    public static MarketComparisonSection o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u0004\u0005Ȉ", new Object[]{"bitField0_", "title_", "userLine_", "marketLine_", "percentageDifference_", "accessibilityDescription_"});
        }
        if (iOrdinal == 3) {
            return new MarketComparisonSection();
        }
        if (iOrdinal == 4) {
            return new eog0(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (MarketComparisonSection.class) {
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
        return this.accessibilityDescription_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final MarketComparisonItem p() {
        MarketComparisonItem marketComparisonItem = this.marketLine_;
        return marketComparisonItem == null ? MarketComparisonItem.p() : marketComparisonItem;
    }

    public final int q() {
        return this.percentageDifference_;
    }

    public final Paragraph r() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final MarketComparisonItem s() {
        MarketComparisonItem marketComparisonItem = this.userLine_;
        return marketComparisonItem == null ? MarketComparisonItem.p() : marketComparisonItem;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
