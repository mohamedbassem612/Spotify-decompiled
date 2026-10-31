package com.spotify.widget.eventloggerimpl.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.cpl1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class WidgetLifecycleEvent extends h implements v2j0 {
    private static final WidgetLifecycleEvent DEFAULT_INSTANCE;
    public static final int EVENT_TYPE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int WIDGET_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private String eventType_ = "";
    private long widgetId_;

    static {
        WidgetLifecycleEvent widgetLifecycleEvent = new WidgetLifecycleEvent();
        DEFAULT_INSTANCE = widgetLifecycleEvent;
        h.registerDefaultInstance(WidgetLifecycleEvent.class, widgetLifecycleEvent);
    }

    private WidgetLifecycleEvent() {
    }

    public static cpl1 n() {
        return (cpl1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "eventType_", "widgetId_"});
        }
        if (iOrdinal == 3) {
            return new WidgetLifecycleEvent();
        }
        if (iOrdinal == 4) {
            return new cpl1(DEFAULT_INSTANCE);
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
        synchronized (WidgetLifecycleEvent.class) {
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
        this.eventType_ = str;
    }

    public final void p(long j) {
        this.bitField0_ |= 2;
        this.widgetId_ = j;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
