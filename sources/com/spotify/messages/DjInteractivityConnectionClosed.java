package com.spotify.messages;

import p.bf40;
import p.bnu;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class DjInteractivityConnectionClosed extends com.google.protobuf.h implements v2j0 {
    public static final int CONNECTION_ID_FIELD_NUMBER = 1;
    private static final DjInteractivityConnectionClosed DEFAULT_INSTANCE;
    public static final int END_OF_SPEECH_RECEIVED_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 3;
    public static final int STATUS_CODE_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean endOfSpeechReceived_;
    private int statusCode_;
    private String connectionId_ = "";
    private String reason_ = "";

    static {
        DjInteractivityConnectionClosed djInteractivityConnectionClosed = new DjInteractivityConnectionClosed();
        DEFAULT_INSTANCE = djInteractivityConnectionClosed;
        com.google.protobuf.h.registerDefaultInstance(DjInteractivityConnectionClosed.class, djInteractivityConnectionClosed);
    }

    private DjInteractivityConnectionClosed() {
    }

    public static bnu n() {
        return (bnu) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "connectionId_", "statusCode_", "reason_", "endOfSpeechReceived_"});
        }
        if (iOrdinal == 3) {
            return new DjInteractivityConnectionClosed();
        }
        if (iOrdinal == 4) {
            return new bnu(DEFAULT_INSTANCE);
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
        synchronized (DjInteractivityConnectionClosed.class) {
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
        this.bitField0_ |= 1;
        this.connectionId_ = str;
    }

    public final void p(boolean z) {
        this.bitField0_ |= 8;
        this.endOfSpeechReceived_ = z;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.reason_ = str;
    }

    public final void r(int i) {
        this.bitField0_ |= 2;
        this.statusCode_ = i;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
