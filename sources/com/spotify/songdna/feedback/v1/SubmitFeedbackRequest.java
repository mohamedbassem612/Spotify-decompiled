package com.spotify.songdna.feedback.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lmc1;
import p.qzr0;
import p.r2j0;
import p.r641;
import p.s2j0;
import p.tr10;
import p.v2j0;
import p.y6a1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class SubmitFeedbackRequest extends h implements v2j0 {
    public static final int ADDITIONAL_DETAILS_FIELD_NUMBER = 5;
    public static final int CATEGORY_FIELD_NUMBER = 2;
    private static final SubmitFeedbackRequest DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SAMPLES_OR_COVERS_ISSUE_FIELD_NUMBER = 4;
    public static final int SONG_CREDITS_ISSUE_FIELD_NUMBER = 3;
    private int bitField0_;
    private int category_;
    private Object issue_;
    private int issueCase_ = 0;
    private String entityUri_ = "";
    private String additionalDetails_ = "";

    static {
        SubmitFeedbackRequest submitFeedbackRequest = new SubmitFeedbackRequest();
        DEFAULT_INSTANCE = submitFeedbackRequest;
        h.registerDefaultInstance(SubmitFeedbackRequest.class, submitFeedbackRequest);
    }

    private SubmitFeedbackRequest() {
    }

    public static lmc1 n() {
        return (lmc1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003?\u0000\u0004?\u0000\u0005ለ\u0000", new Object[]{"issue_", "issueCase_", "bitField0_", "entityUri_", "category_", "additionalDetails_"});
        }
        if (iOrdinal == 3) {
            return new SubmitFeedbackRequest();
        }
        if (iOrdinal == 4) {
            return new lmc1(DEFAULT_INSTANCE);
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
        synchronized (SubmitFeedbackRequest.class) {
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
        this.bitField0_ |= 1;
        this.additionalDetails_ = str;
    }

    public final void p(tr10 tr10Var) {
        this.category_ = tr10Var.getNumber();
    }

    public final void q(String str) {
        str.getClass();
        this.entityUri_ = str;
    }

    public final void r(r641 r641Var) {
        this.issue_ = Integer.valueOf(r641Var.getNumber());
        this.issueCase_ = 4;
    }

    public final void s(y6a1 y6a1Var) {
        this.issue_ = Integer.valueOf(y6a1Var.getNumber());
        this.issueCase_ = 3;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
