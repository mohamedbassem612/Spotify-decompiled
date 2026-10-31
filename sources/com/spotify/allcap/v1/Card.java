package com.spotify.allcap.v1;

import com.google.protobuf.h;
import p.bf40;
import p.bid;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Card extends h implements v2j0 {
    public static final int BUTTON_CTAS_FIELD_NUMBER = 7;
    public static final int CONSUMPTION_INDICATOR_FIELD_NUMBER = 3;
    private static final Card DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int FOOTER_FIELD_NUMBER = 6;
    public static final int NAVIGATION_CTAS_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int REMAINING_TIME_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private ConsumptionIndicator consumptionIndicator_;
    private String title_ = "";
    private String description_ = "";
    private String remainingTime_ = "";
    private h290 navigationCtas_ = h.emptyProtobufList();
    private String footer_ = "";
    private h290 buttonCtas_ = h.emptyProtobufList();

    static {
        Card card = new Card();
        DEFAULT_INSTANCE = card;
        h.registerDefaultInstance(Card.class, card);
    }

    private Card() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဉ\u0002\u0004ለ\u0003\u0005\u001b\u0006ለ\u0004\u0007\u001b", new Object[]{"bitField0_", "title_", "description_", "consumptionIndicator_", "remainingTime_", "navigationCtas_", Cta.class, "footer_", "buttonCtas_", Cta.class});
        }
        if (iOrdinal == 3) {
            return new Card();
        }
        if (iOrdinal == 4) {
            return new bid(DEFAULT_INSTANCE, (byte) 8);
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
        synchronized (Card.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final h290 n() {
        return this.buttonCtas_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ConsumptionIndicator o() {
        ConsumptionIndicator consumptionIndicator = this.consumptionIndicator_;
        return consumptionIndicator == null ? ConsumptionIndicator.n() : consumptionIndicator;
    }

    public final String p() {
        return this.footer_;
    }

    public final h290 q() {
        return this.navigationCtas_;
    }

    public final String r() {
        return this.remainingTime_;
    }

    public final boolean s() {
        return (this.bitField0_ & 4) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
