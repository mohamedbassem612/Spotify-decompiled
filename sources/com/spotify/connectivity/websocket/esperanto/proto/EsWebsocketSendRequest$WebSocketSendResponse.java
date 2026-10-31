package com.spotify.connectivity.websocket.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zsz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class EsWebsocketSendRequest$WebSocketSendResponse extends h implements v2j0 {
    private static final EsWebsocketSendRequest$WebSocketSendResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private boolean success_;

    static {
        EsWebsocketSendRequest$WebSocketSendResponse esWebsocketSendRequest$WebSocketSendResponse = new EsWebsocketSendRequest$WebSocketSendResponse();
        DEFAULT_INSTANCE = esWebsocketSendRequest$WebSocketSendResponse;
        h.registerDefaultInstance(EsWebsocketSendRequest$WebSocketSendResponse.class, esWebsocketSendRequest$WebSocketSendResponse);
    }

    private EsWebsocketSendRequest$WebSocketSendResponse() {
    }

    public static zsz n() {
        return (zsz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"success_"});
        }
        if (iOrdinal == 3) {
            return new EsWebsocketSendRequest$WebSocketSendResponse();
        }
        if (iOrdinal == 4) {
            return new zsz(DEFAULT_INSTANCE);
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
        synchronized (EsWebsocketSendRequest$WebSocketSendResponse.class) {
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

    public final void o(boolean z) {
        this.success_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
