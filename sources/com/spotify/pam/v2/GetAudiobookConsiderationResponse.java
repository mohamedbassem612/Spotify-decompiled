package com.spotify.pam.v2;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vk40;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class GetAudiobookConsiderationResponse extends h implements v2j0 {
    public static final int ASTRO_BENEFITS_FIELD_NUMBER = 2;
    private static final GetAudiobookConsiderationResponse DEFAULT_INSTANCE;
    public static final int DISCLAIMER_FIELD_NUMBER = 4;
    public static final int EXPLANATION_CARD_FIELD_NUMBER = 3;
    public static final int HEADER_CARD_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private BenefitListCard astroBenefits_;
    private int bitField0_;
    private String disclaimer_ = "";
    private ExplanationCard explanationCard_;
    private HeaderCard headerCard_;

    static {
        GetAudiobookConsiderationResponse getAudiobookConsiderationResponse = new GetAudiobookConsiderationResponse();
        DEFAULT_INSTANCE = getAudiobookConsiderationResponse;
        h.registerDefaultInstance(GetAudiobookConsiderationResponse.class, getAudiobookConsiderationResponse);
    }

    private GetAudiobookConsiderationResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004Ȉ", new Object[]{"bitField0_", "headerCard_", "astroBenefits_", "explanationCard_", "disclaimer_"});
        }
        if (iOrdinal == 3) {
            return new GetAudiobookConsiderationResponse();
        }
        if (iOrdinal == 4) {
            return new vk40(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (GetAudiobookConsiderationResponse.class) {
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

    public final BenefitListCard n() {
        BenefitListCard benefitListCard = this.astroBenefits_;
        return benefitListCard == null ? BenefitListCard.q() : benefitListCard;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.disclaimer_;
    }

    public final ExplanationCard p() {
        ExplanationCard explanationCard = this.explanationCard_;
        return explanationCard == null ? ExplanationCard.n() : explanationCard;
    }

    public final HeaderCard q() {
        HeaderCard headerCard = this.headerCard_;
        return headerCard == null ? HeaderCard.o() : headerCard;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
