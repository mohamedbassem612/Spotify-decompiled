package com.spotify.premiummarketing.premiumdestinationpage.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zp50;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class GroupedOfferCards extends h implements v2j0 {
    public static final int COLLAPSED_TEXT_FIELD_NUMBER = 1;
    private static final GroupedOfferCards DEFAULT_INSTANCE;
    public static final int EXPANDED_TEXT_FIELD_NUMBER = 2;
    public static final int LOGGING_INFO_FIELD_NUMBER = 4;
    public static final int OFFER_CARDS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private LoggingInfo loggingInfo_;
    private String collapsedText_ = "";
    private String expandedText_ = "";
    private h290 offerCards_ = h.emptyProtobufList();

    static {
        GroupedOfferCards groupedOfferCards = new GroupedOfferCards();
        DEFAULT_INSTANCE = groupedOfferCards;
        h.registerDefaultInstance(GroupedOfferCards.class, groupedOfferCards);
    }

    private GroupedOfferCards() {
    }

    public static GroupedOfferCards o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003\u001b\u0004ဉ\u0002", new Object[]{"bitField0_", "collapsedText_", "expandedText_", "offerCards_", PremiumOfferCard.class, "loggingInfo_"});
        }
        if (iOrdinal == 3) {
            return new GroupedOfferCards();
        }
        if (iOrdinal == 4) {
            return new zp50(DEFAULT_INSTANCE, (byte) 0);
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
        synchronized (GroupedOfferCards.class) {
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
        return this.collapsedText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.expandedText_;
    }

    public final LoggingInfo q() {
        LoggingInfo loggingInfo = this.loggingInfo_;
        return loggingInfo == null ? LoggingInfo.o() : loggingInfo;
    }

    public final h290 r() {
        return this.offerCards_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
