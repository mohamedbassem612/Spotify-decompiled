package com.spotify.home.slotloading.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.ld91;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class SlotContentLoadingErrorEvent extends h implements v2j0 {
    private static final SlotContentLoadingErrorEvent DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 5;
    public static final int FEED_ID_FIELD_NUMBER = 1;
    public static final int HTTP_STATUS_CODE_FIELD_NUMBER = 4;
    public static final int IS_OFFLINE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SLOT_TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private int httpStatusCode_;
    private boolean isOffline_;
    private String feedId_ = "";
    private String slotType_ = "";
    private String errorMessage_ = "";

    static {
        SlotContentLoadingErrorEvent slotContentLoadingErrorEvent = new SlotContentLoadingErrorEvent();
        DEFAULT_INSTANCE = slotContentLoadingErrorEvent;
        h.registerDefaultInstance(SlotContentLoadingErrorEvent.class, slotContentLoadingErrorEvent);
    }

    private SlotContentLoadingErrorEvent() {
    }

    public static ld91 n() {
        return (ld91) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "feedId_", "slotType_", "isOffline_", "httpStatusCode_", "errorMessage_"});
        }
        if (iOrdinal == 3) {
            return new SlotContentLoadingErrorEvent();
        }
        if (iOrdinal == 4) {
            return new ld91(DEFAULT_INSTANCE);
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
        synchronized (SlotContentLoadingErrorEvent.class) {
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
        this.bitField0_ |= 16;
        this.errorMessage_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 1;
        this.feedId_ = str;
    }

    public final void q(int i) {
        this.bitField0_ |= 8;
        this.httpStatusCode_ = i;
    }

    public final void r(boolean z) {
        this.bitField0_ |= 4;
        this.isOffline_ = z;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.slotType_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
