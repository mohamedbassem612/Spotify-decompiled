package com.spotify.campaignsservice.retrieval.v1;

import com.google.protobuf.h;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import p.bf40;
import p.jf40;
import p.myc1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class SummaryShareCard extends h implements v2j0 {
    public static final int CARD_FIELD_NUMBER = 1;
    private static final SummaryShareCard DEFAULT_INSTANCE;
    public static final int INSET_COLOR_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private SceneTemplate.SummaryShare.Card card_;
    private String insetColor_ = "";

    static {
        SummaryShareCard summaryShareCard = new SummaryShareCard();
        DEFAULT_INSTANCE = summaryShareCard;
        h.registerDefaultInstance(SummaryShareCard.class, summaryShareCard);
    }

    private SummaryShareCard() {
    }

    public static SummaryShareCard o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"bitField0_", "card_", "insetColor_"});
        }
        if (iOrdinal == 3) {
            return new SummaryShareCard();
        }
        if (iOrdinal == 4) {
            return new myc1(DEFAULT_INSTANCE);
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
        synchronized (SummaryShareCard.class) {
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

    public final SceneTemplate.SummaryShare.Card n() {
        SceneTemplate.SummaryShare.Card card = this.card_;
        return card == null ? SceneTemplate.SummaryShare.Card.s() : card;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.insetColor_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
