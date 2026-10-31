package com.spotify.connectivity.websocket.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.hhc;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xsz;
import p.ysz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class EsWebsocketEvent$WebSocketEvent extends h implements v2j0 {
    public static final int BINARYPAYLOAD_FIELD_NUMBER = 4;
    public static final int CONNECTED_FIELD_NUMBER = 1;
    private static final EsWebsocketEvent$WebSocketEvent DEFAULT_INSTANCE;
    public static final int DISCONNECTED_FIELD_NUMBER = 5;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SOCKETRECEIVEDTIMESTAMPMS_FIELD_NUMBER = 6;
    public static final int TEXTPAYLOAD_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean connected_;
    private boolean disconnected_;
    private int error_;
    private long socketReceivedTimestampMs_;
    private String textPayload_ = "";
    private phc binaryPayload_ = phc.b;

    static {
        EsWebsocketEvent$WebSocketEvent esWebsocketEvent$WebSocketEvent = new EsWebsocketEvent$WebSocketEvent();
        DEFAULT_INSTANCE = esWebsocketEvent$WebSocketEvent;
        h.registerDefaultInstance(EsWebsocketEvent$WebSocketEvent.class, esWebsocketEvent$WebSocketEvent);
    }

    private EsWebsocketEvent$WebSocketEvent() {
    }

    public static ysz n() {
        return (ysz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003ለ\u0002\u0004ည\u0003\u0005ဇ\u0004\u0006ဂ\u0005", new Object[]{"bitField0_", "connected_", "error_", "textPayload_", "binaryPayload_", "disconnected_", "socketReceivedTimestampMs_"});
        }
        if (iOrdinal == 3) {
            return new EsWebsocketEvent$WebSocketEvent();
        }
        if (iOrdinal == 4) {
            return new ysz(DEFAULT_INSTANCE);
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
        synchronized (EsWebsocketEvent$WebSocketEvent.class) {
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

    public final void o(hhc hhcVar) {
        this.bitField0_ |= 8;
        this.binaryPayload_ = hhcVar;
    }

    public final void p() {
        this.bitField0_ |= 1;
        this.connected_ = true;
    }

    public final void q() {
        this.bitField0_ |= 16;
        this.disconnected_ = true;
    }

    public final void r(xsz xszVar) {
        this.error_ = xszVar.getNumber();
        this.bitField0_ |= 2;
    }

    public final void s(long j) {
        this.bitField0_ |= 32;
        this.socketReceivedTimestampMs_ = j;
    }

    public final void t(String str) {
        this.bitField0_ |= 4;
        this.textPayload_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
