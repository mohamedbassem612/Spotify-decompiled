package com.spotify.campaignsservice.retrieval.v1;

import com.google.protobuf.h;
import com.spotify.wrapped.v1.proto.AccessibilityDefinition;
import com.spotify.wrapped.v1.proto.Image;
import com.spotify.wrapped.v1.proto.Paragraph;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class RetrievalCard extends h implements v2j0 {
    public static final int ACCESSIBILITY_DEFINITION_FIELD_NUMBER = 5;
    public static final int CARD_IDS_FIELD_NUMBER = 1;
    public static final int CARD_VIEWED_STATE_FIELD_NUMBER = 7;
    private static final RetrievalCard DEFAULT_INSTANCE;
    public static final int HERO_FIELD_NUMBER = 3;
    public static final int NAVIGATE_ID_FIELD_NUMBER = 2;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int SMALL_FIELD_NUMBER = 4;
    private AccessibilityDefinition accessibilityDefinition_;
    private int bitField0_;
    private CardViewedState cardViewedState_;
    private CardStyle hero_;
    private CardStyle small_;
    private h290 cardIds_ = h.emptyProtobufList();
    private String navigateId_ = "";
    private String navigationUri_ = "";

    public static final class CardStyle extends h implements v2j0 {
        public static final int BACKGROUND_FIELD_NUMBER = 2;
        private static final CardStyle DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        private RetrievalBackground background_;
        private int bitField0_;
        private Paragraph text_;

        static {
            CardStyle cardStyle = new CardStyle();
            DEFAULT_INSTANCE = cardStyle;
            h.registerDefaultInstance(CardStyle.class, cardStyle);
        }

        private CardStyle() {
        }

        public static CardStyle o() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "text_", "background_"});
            }
            if (iOrdinal == 3) {
                return new CardStyle();
            }
            if (iOrdinal == 4) {
                return new b(DEFAULT_INSTANCE);
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
            synchronized (CardStyle.class) {
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

        public final RetrievalBackground n() {
            RetrievalBackground retrievalBackground = this.background_;
            return retrievalBackground == null ? RetrievalBackground.n() : retrievalBackground;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final Paragraph p() {
            Paragraph paragraph = this.text_;
            return paragraph == null ? Paragraph.n() : paragraph;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class RetrievalBackground extends h implements v2j0 {
        private static final RetrievalBackground DEFAULT_INSTANCE;
        public static final int IMAGE_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int RIVE_FIELD_NUMBER = 1;
        public static final int SUMMARY_FIELD_NUMBER = 3;
        private int backgroundCase_ = 0;
        private Object background_;

        static {
            RetrievalBackground retrievalBackground = new RetrievalBackground();
            DEFAULT_INSTANCE = retrievalBackground;
            h.registerDefaultInstance(RetrievalBackground.class, retrievalBackground);
        }

        private RetrievalBackground() {
        }

        public static RetrievalBackground n() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"background_", "backgroundCase_", RiveData.class, Image.class, SummaryShareCard.class});
            }
            if (iOrdinal == 3) {
                return new RetrievalBackground();
            }
            if (iOrdinal == 4) {
                return new c(DEFAULT_INSTANCE);
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
            synchronized (RetrievalBackground.class) {
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

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final Image o() {
            return this.backgroundCase_ == 2 ? (Image) this.background_ : Image.o();
        }

        public final RiveData p() {
            return this.backgroundCase_ == 1 ? (RiveData) this.background_ : RiveData.n();
        }

        public final SummaryShareCard q() {
            return this.backgroundCase_ == 3 ? (SummaryShareCard) this.background_ : SummaryShareCard.o();
        }

        public final boolean r() {
            return this.backgroundCase_ == 2;
        }

        public final boolean s() {
            return this.backgroundCase_ == 1;
        }

        public final boolean t() {
            return this.backgroundCase_ == 3;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        RetrievalCard retrievalCard = new RetrievalCard();
        DEFAULT_INSTANCE = retrievalCard;
        h.registerDefaultInstance(RetrievalCard.class, retrievalCard);
    }

    private RetrievalCard() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ț\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002\u0006Ȉ\u0007ဉ\u0003", new Object[]{"bitField0_", "cardIds_", "navigateId_", "hero_", "small_", "accessibilityDefinition_", "navigationUri_", "cardViewedState_"});
        }
        if (iOrdinal == 3) {
            return new RetrievalCard();
        }
        if (iOrdinal == 4) {
            return new a(DEFAULT_INSTANCE);
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
        synchronized (RetrievalCard.class) {
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

    public final AccessibilityDefinition n() {
        AccessibilityDefinition accessibilityDefinition = this.accessibilityDefinition_;
        return accessibilityDefinition == null ? AccessibilityDefinition.o() : accessibilityDefinition;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.cardIds_;
    }

    public final CardViewedState p() {
        CardViewedState cardViewedState = this.cardViewedState_;
        return cardViewedState == null ? CardViewedState.p() : cardViewedState;
    }

    public final CardStyle q() {
        CardStyle cardStyle = this.hero_;
        return cardStyle == null ? CardStyle.o() : cardStyle;
    }

    public final String r() {
        return this.navigateId_;
    }

    public final String s() {
        return this.navigationUri_;
    }

    public final CardStyle t() {
        CardStyle cardStyle = this.small_;
        return cardStyle == null ? CardStyle.o() : cardStyle;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
