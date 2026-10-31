package com.spotify.connectivity.websocket.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lrz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class EsWebsocketDisconnect$WebSocketDisconnectRequest extends h implements v2j0 {
    private static final EsWebsocketDisconnect$WebSocketDisconnectRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;

    static {
        EsWebsocketDisconnect$WebSocketDisconnectRequest esWebsocketDisconnect$WebSocketDisconnectRequest = new EsWebsocketDisconnect$WebSocketDisconnectRequest();
        DEFAULT_INSTANCE = esWebsocketDisconnect$WebSocketDisconnectRequest;
        h.registerDefaultInstance(EsWebsocketDisconnect$WebSocketDisconnectRequest.class, esWebsocketDisconnect$WebSocketDisconnectRequest);
    }

    private EsWebsocketDisconnect$WebSocketDisconnectRequest() {
    }

    public static EsWebsocketDisconnect$WebSocketDisconnectRequest n(byte[] bArr) {
        return (EsWebsocketDisconnect$WebSocketDisconnectRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
        }
        if (iOrdinal == 3) {
            return new EsWebsocketDisconnect$WebSocketDisconnectRequest();
        }
        if (iOrdinal == 4) {
            return new lrz(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (EsWebsocketDisconnect$WebSocketDisconnectRequest.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
