package com.spotify.watchfeed.component.item.v1;

import p.bf40;
import p.coc;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class CallToActionEventsButtonComponent extends com.google.protobuf.h implements v2j0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 4;
    private static final CallToActionEventsButtonComponent DEFAULT_INSTANCE;
    public static final int EVENT_DATA_FIELD_NUMBER = 3;
    public static final int ICON_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private EventData eventData_;
    private String title_ = "";
    private String icon_ = "";
    private String accessibilityText_ = "";

    static {
        CallToActionEventsButtonComponent callToActionEventsButtonComponent = new CallToActionEventsButtonComponent();
        DEFAULT_INSTANCE = callToActionEventsButtonComponent;
        com.google.protobuf.h.registerDefaultInstance(CallToActionEventsButtonComponent.class, callToActionEventsButtonComponent);
    }

    private CallToActionEventsButtonComponent() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static CallToActionEventsButtonComponent q(phc phcVar) {
        return (CallToActionEventsButtonComponent) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004Ȉ", new Object[]{"bitField0_", "title_", "icon_", "eventData_", "accessibilityText_"});
        }
        if (iOrdinal == 3) {
            return new CallToActionEventsButtonComponent();
        }
        if (iOrdinal == 4) {
            return new coc(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (CallToActionEventsButtonComponent.class) {
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

    public final String n() {
        return this.accessibilityText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final EventData o() {
        EventData eventData = this.eventData_;
        return eventData == null ? EventData.p() : eventData;
    }

    public final String p() {
        return this.icon_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
