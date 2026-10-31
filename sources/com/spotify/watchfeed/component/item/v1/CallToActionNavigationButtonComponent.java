package com.spotify.watchfeed.component.item.v1;

import com.spotify.watchfeed.component.model.v1.proto.Visual;
import p.bf40;
import p.coc;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class CallToActionNavigationButtonComponent extends com.google.protobuf.h implements v2j0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 6;
    public static final int DECISION_ID_FIELD_NUMBER = 5;
    private static final CallToActionNavigationButtonComponent DEFAULT_INSTANCE;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int URI_FIELD_NUMBER = 1;
    public static final int VISUAL_FIELD_NUMBER = 2;
    private int bitField0_;
    private Visual visual_;
    private String uri_ = "";
    private String title_ = "";
    private String navigationUri_ = "";
    private String decisionId_ = "";
    private String accessibilityText_ = "";

    static {
        CallToActionNavigationButtonComponent callToActionNavigationButtonComponent = new CallToActionNavigationButtonComponent();
        DEFAULT_INSTANCE = callToActionNavigationButtonComponent;
        com.google.protobuf.h.registerDefaultInstance(CallToActionNavigationButtonComponent.class, callToActionNavigationButtonComponent);
    }

    private CallToActionNavigationButtonComponent() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static CallToActionNavigationButtonComponent s(phc phcVar) {
        return (CallToActionNavigationButtonComponent) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"bitField0_", "uri_", "visual_", "title_", "navigationUri_", "decisionId_", "accessibilityText_"});
        }
        if (iOrdinal == 3) {
            return new CallToActionNavigationButtonComponent();
        }
        if (iOrdinal == 4) {
            return new coc(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (CallToActionNavigationButtonComponent.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final String getUri() {
        return this.uri_;
    }

    public final String n() {
        return this.accessibilityText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.decisionId_;
    }

    public final String p() {
        return this.navigationUri_;
    }

    public final Visual q() {
        Visual visual = this.visual_;
        return visual == null ? Visual.o() : visual;
    }

    public final boolean r() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
