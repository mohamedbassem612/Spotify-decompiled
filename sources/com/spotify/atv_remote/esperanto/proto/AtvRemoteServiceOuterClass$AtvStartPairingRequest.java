package com.spotify.atv_remote.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.mn7;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class AtvRemoteServiceOuterClass$AtvStartPairingRequest extends h implements v2j0 {
    private static final AtvRemoteServiceOuterClass$AtvStartPairingRequest DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER = 3;
    public static final int IP_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PORT_FIELD_NUMBER = 2;
    private int port_;
    private String ip_ = "";
    private String identifier_ = "";

    static {
        AtvRemoteServiceOuterClass$AtvStartPairingRequest atvRemoteServiceOuterClass$AtvStartPairingRequest = new AtvRemoteServiceOuterClass$AtvStartPairingRequest();
        DEFAULT_INSTANCE = atvRemoteServiceOuterClass$AtvStartPairingRequest;
        h.registerDefaultInstance(AtvRemoteServiceOuterClass$AtvStartPairingRequest.class, atvRemoteServiceOuterClass$AtvStartPairingRequest);
    }

    private AtvRemoteServiceOuterClass$AtvStartPairingRequest() {
    }

    public static mn7 n() {
        return (mn7) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003Ȉ", new Object[]{"ip_", "port_", "identifier_"});
        }
        if (iOrdinal == 3) {
            return new AtvRemoteServiceOuterClass$AtvStartPairingRequest();
        }
        if (iOrdinal == 4) {
            return new mn7(DEFAULT_INSTANCE);
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
        synchronized (AtvRemoteServiceOuterClass$AtvStartPairingRequest.class) {
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
        this.identifier_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.ip_ = str;
    }

    public final void q(int i) {
        this.port_ = i;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
