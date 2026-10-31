package com.spotify.connectivity.websocket.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lrz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class EsWebsocketConnectRequest$WebSocketConnectRequest extends h implements v2j0 {
    public static final int ACCESSTOKEN_FIELD_NUMBER = 2;
    private static final EsWebsocketConnectRequest$WebSocketConnectRequest DEFAULT_INSTANCE;
    public static final int DISABLESSLVERIFICATION_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    private boolean disableSslVerification_;
    private String url_ = "";
    private String accessToken_ = "";

    static {
        EsWebsocketConnectRequest$WebSocketConnectRequest esWebsocketConnectRequest$WebSocketConnectRequest = new EsWebsocketConnectRequest$WebSocketConnectRequest();
        DEFAULT_INSTANCE = esWebsocketConnectRequest$WebSocketConnectRequest;
        h.registerDefaultInstance(EsWebsocketConnectRequest$WebSocketConnectRequest.class, esWebsocketConnectRequest$WebSocketConnectRequest);
    }

    private EsWebsocketConnectRequest$WebSocketConnectRequest() {
    }

    public static EsWebsocketConnectRequest$WebSocketConnectRequest p(byte[] bArr) {
        return (EsWebsocketConnectRequest$WebSocketConnectRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007", new Object[]{"url_", "accessToken_", "disableSslVerification_"});
        }
        if (iOrdinal == 3) {
            return new EsWebsocketConnectRequest$WebSocketConnectRequest();
        }
        if (iOrdinal == 4) {
            return new lrz(DEFAULT_INSTANCE, (byte) 13);
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
        synchronized (EsWebsocketConnectRequest$WebSocketConnectRequest.class) {
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

    public final String getUrl() {
        return this.url_;
    }

    public final String n() {
        return this.accessToken_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.disableSslVerification_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
