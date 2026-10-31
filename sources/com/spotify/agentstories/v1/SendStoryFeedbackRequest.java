package com.spotify.agentstories.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.u461;
import p.v2j0;
import p.v461;
import p.w461;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class SendStoryFeedbackRequest extends h implements v2j0 {
    private static final SendStoryFeedbackRequest DEFAULT_INSTANCE;
    public static final int FEEDBACK_OPTION_FIELD_NUMBER = 4;
    public static final int FEEDBACK_RATING_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int STORY_ID_FIELD_NUMBER = 1;
    public static final int TEXT_FIELD_NUMBER = 3;
    private int bitField0_;
    private int feedbackOption_;
    private int feedbackRating_;
    private String storyId_ = "";
    private String text_ = "";

    static {
        SendStoryFeedbackRequest sendStoryFeedbackRequest = new SendStoryFeedbackRequest();
        DEFAULT_INSTANCE = sendStoryFeedbackRequest;
        h.registerDefaultInstance(SendStoryFeedbackRequest.class, sendStoryFeedbackRequest);
    }

    private SendStoryFeedbackRequest() {
    }

    public static u461 n() {
        return (u461) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ\u0004ဌ\u0000", new Object[]{"bitField0_", "storyId_", "feedbackRating_", "text_", "feedbackOption_"});
        }
        if (iOrdinal == 3) {
            return new SendStoryFeedbackRequest();
        }
        if (iOrdinal == 4) {
            return new u461(DEFAULT_INSTANCE);
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
        synchronized (SendStoryFeedbackRequest.class) {
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

    public final void o(v461 v461Var) {
        this.feedbackOption_ = v461Var.getNumber();
        this.bitField0_ |= 1;
    }

    public final void p(w461 w461Var) {
        this.feedbackRating_ = w461Var.getNumber();
    }

    public final void q(String str) {
        str.getClass();
        this.storyId_ = str;
    }

    public final void r(String str) {
        this.text_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
