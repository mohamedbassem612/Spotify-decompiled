package com.spotify.adsdisplay.elementimpl.survey.events.proto;

import app.p000rive.semantics.SemanticState;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.m6d1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class SurveyAdEvent extends h implements v2j0 {
    public static final int AD_ID_FIELD_NUMBER = 1;
    private static final SurveyAdEvent DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 8;
    public static final int EVENT_REASON_FIELD_NUMBER = 9;
    public static final int FORMAT_FIELD_NUMBER = 11;
    public static final int IN_FOCUS_FIELD_NUMBER = 13;
    public static final int LINEITEM_ID_FIELD_NUMBER = 3;
    public static final int OPTION_ID_FIELD_NUMBER = 5;
    public static final int OPTION_POSITION_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int PRODUCT_NAME_FIELD_NUMBER = 12;
    public static final int QUESTION_ID_FIELD_NUMBER = 4;
    public static final int REQUEST_ID_FIELD_NUMBER = 2;
    public static final int RESPONSE_FIELD_NUMBER = 7;
    public static final int SLOT_FIELD_NUMBER = 10;
    private int bitField0_;
    private boolean inFocus_;
    private int optionPosition_;
    private String adId_ = "";
    private String requestId_ = "";
    private String lineitemId_ = "";
    private String questionId_ = "";
    private String optionId_ = "";
    private String response_ = "";
    private String event_ = "";
    private String eventReason_ = "";
    private String slot_ = "";
    private String format_ = "";
    private String productName_ = "";

    static {
        SurveyAdEvent surveyAdEvent = new SurveyAdEvent();
        DEFAULT_INSTANCE = surveyAdEvent;
        h.registerDefaultInstance(SurveyAdEvent.class, surveyAdEvent);
    }

    private SurveyAdEvent() {
    }

    public static m6d1 n() {
        return (m6d1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006င\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဈ\n\fဈ\u000b\rဇ\f", new Object[]{"bitField0_", "adId_", "requestId_", "lineitemId_", "questionId_", "optionId_", "optionPosition_", "response_", "event_", "eventReason_", "slot_", "format_", "productName_", "inFocus_"});
        }
        if (iOrdinal == 3) {
            return new SurveyAdEvent();
        }
        if (iOrdinal == 4) {
            return new m6d1(DEFAULT_INSTANCE);
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
        synchronized (SurveyAdEvent.class) {
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
        this.adId_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= SemanticState.Focused;
        this.event_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= SemanticState.ReadOnly;
        this.format_ = str;
    }

    public final void r(boolean z) {
        this.bitField0_ |= SemanticState.Obscured;
        this.inFocus_ = z;
    }

    public final void s(String str) {
        this.bitField0_ |= 4;
        this.lineitemId_ = str;
    }

    public final void t(String str) {
        this.bitField0_ |= 16;
        this.optionId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(int i) {
        this.bitField0_ |= 32;
        this.optionPosition_ = i;
    }

    public final void v(String str) {
        str.getClass();
        this.bitField0_ |= SemanticState.Modal;
        this.productName_ = str;
    }

    public final void w(String str) {
        this.bitField0_ |= 8;
        this.questionId_ = str;
    }

    public final void x(String str) {
        this.bitField0_ |= 2;
        this.requestId_ = str;
    }

    public final void y(String str) {
        this.bitField0_ |= 64;
        this.response_ = str;
    }
}
