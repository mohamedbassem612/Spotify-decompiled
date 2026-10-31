package com.spotify.adsdisplay.elementimpl.htmlad.events.proto;

import app.p000rive.semantics.SemanticState;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.or50;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class HTMLAdNavigationEvent extends h implements v2j0 {
    public static final int AD_ID_FIELD_NUMBER = 2;
    public static final int BLOCK_REASON_FIELD_NUMBER = 8;
    public static final int CREATIVE_ID_FIELD_NUMBER = 5;
    private static final HTMLAdNavigationEvent DEFAULT_INSTANCE;
    public static final int EVENT_TYPE_FIELD_NUMBER = 1;
    public static final int LINEITEM_ID_FIELD_NUMBER = 4;
    public static final int NAVIGATION_SOURCE_FIELD_NUMBER = 10;
    public static final int NAVIGATION_TYPE_FIELD_NUMBER = 9;
    public static final int OUTCOME_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 3;
    public static final int TAP_X_FIELD_NUMBER = 11;
    public static final int TAP_Y_FIELD_NUMBER = 12;
    public static final int URL_FIELD_NUMBER = 6;
    private int bitField0_;
    private double tapX_;
    private double tapY_;
    private String eventType_ = "";
    private String adId_ = "";
    private String requestId_ = "";
    private String lineitemId_ = "";
    private String creativeId_ = "";
    private String url_ = "";
    private String outcome_ = "";
    private String blockReason_ = "";
    private String navigationType_ = "";
    private String navigationSource_ = "";

    static {
        HTMLAdNavigationEvent hTMLAdNavigationEvent = new HTMLAdNavigationEvent();
        DEFAULT_INSTANCE = hTMLAdNavigationEvent;
        h.registerDefaultInstance(HTMLAdNavigationEvent.class, hTMLAdNavigationEvent);
    }

    private HTMLAdNavigationEvent() {
    }

    public static or50 n() {
        return (or50) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bက\n\fက\u000b", new Object[]{"bitField0_", "eventType_", "adId_", "requestId_", "lineitemId_", "creativeId_", "url_", "outcome_", "blockReason_", "navigationType_", "navigationSource_", "tapX_", "tapY_"});
        }
        if (iOrdinal == 3) {
            return new HTMLAdNavigationEvent();
        }
        if (iOrdinal == 4) {
            return new or50(DEFAULT_INSTANCE);
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
        synchronized (HTMLAdNavigationEvent.class) {
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
        this.bitField0_ |= 2;
        this.adId_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= SemanticState.Focused;
        this.blockReason_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.creativeId_ = str;
    }

    public final void r() {
        this.bitField0_ |= 1;
        this.eventType_ = "navigation";
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.lineitemId_ = str;
    }

    public final void setUrl(String str) {
        this.bitField0_ |= 32;
        this.url_ = str;
    }

    public final void t(String str) {
        this.bitField0_ |= 512;
        this.navigationSource_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        this.bitField0_ |= SemanticState.Hidden;
        this.navigationType_ = str;
    }

    public final void v(String str) {
        this.bitField0_ |= 64;
        this.outcome_ = str;
    }

    public final void w(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.requestId_ = str;
    }

    public final void x(double d) {
        this.bitField0_ |= SemanticState.ReadOnly;
        this.tapX_ = d;
    }

    public final void y(double d) {
        this.bitField0_ |= SemanticState.Modal;
        this.tapY_ = d;
    }
}
