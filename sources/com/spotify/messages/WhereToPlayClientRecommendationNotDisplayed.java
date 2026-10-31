package com.spotify.messages;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.unl1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class WhereToPlayClientRecommendationNotDisplayed extends h implements v2j0 {
    private static final WhereToPlayClientRecommendationNotDisplayed DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PREDICTION_ID_FIELD_NUMBER = 3;
    public static final int REASON_FIELD_NUMBER = 1;
    public static final int REQUEST_SENT_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean requestSent_;
    private String reason_ = "";
    private String predictionId_ = "";

    static {
        WhereToPlayClientRecommendationNotDisplayed whereToPlayClientRecommendationNotDisplayed = new WhereToPlayClientRecommendationNotDisplayed();
        DEFAULT_INSTANCE = whereToPlayClientRecommendationNotDisplayed;
        h.registerDefaultInstance(WhereToPlayClientRecommendationNotDisplayed.class, whereToPlayClientRecommendationNotDisplayed);
    }

    private WhereToPlayClientRecommendationNotDisplayed() {
    }

    public static unl1 n() {
        return (unl1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "reason_", "requestSent_", "predictionId_"});
        }
        if (iOrdinal == 3) {
            return new WhereToPlayClientRecommendationNotDisplayed();
        }
        if (iOrdinal == 4) {
            return new unl1(DEFAULT_INSTANCE);
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
        synchronized (WhereToPlayClientRecommendationNotDisplayed.class) {
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

    public final void o(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.predictionId_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 1;
        this.reason_ = str;
    }

    public final void q() {
        this.bitField0_ |= 2;
        this.requestSent_ = true;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
