package com.spotify.subscriptionviewservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uca;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class BenefitsCard extends h implements v2j0 {
    public static final int BENEFITS_HUB_FIELD_NUMBER = 2;
    public static final int BENEFITS_LIST_FIELD_NUMBER = 1;
    public static final int CTA_FIELD_NUMBER = 3;
    private static final BenefitsCard DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int UBI_ID_FIELD_NUMBER = 100;
    private int bitField0_;
    private Object content_;
    private int contentCase_ = 0;
    private h290 cta_ = h.emptyProtobufList();
    private String ubiId_ = "";

    static {
        BenefitsCard benefitsCard = new BenefitsCard();
        DEFAULT_INSTANCE = benefitsCard;
        h.registerDefaultInstance(BenefitsCard.class, benefitsCard);
    }

    private BenefitsCard() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static BenefitsCard r() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001d\u0004\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003\u001bdለ\u0000", new Object[]{"content_", "contentCase_", "bitField0_", BenefitsList.class, BenefitsHub.class, "cta_", Cta.class, "ubiId_"});
        }
        if (iOrdinal == 3) {
            return new BenefitsCard();
        }
        if (iOrdinal == 4) {
            return new uca(DEFAULT_INSTANCE, (byte) 24);
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
        synchronized (BenefitsCard.class) {
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

    public final BenefitsHub n() {
        return this.contentCase_ == 2 ? (BenefitsHub) this.content_ : BenefitsHub.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final BenefitsList o() {
        return this.contentCase_ == 1 ? (BenefitsList) this.content_ : BenefitsList.n();
    }

    public final int p() {
        int i = this.contentCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public final h290 q() {
        return this.cta_;
    }

    public final String s() {
        return this.ubiId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
