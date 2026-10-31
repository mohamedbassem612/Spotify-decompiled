package com.spotify.connect.discovery.cast.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.bid;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class CastMessages$ConnectRequest extends h implements v2j0 {
    private static final CastMessages$ConnectRequest DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 1;
    public static final int INTERACTION_IDS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private String deviceId_ = "";
    private h290 interactionIds_ = h.emptyProtobufList();

    static {
        CastMessages$ConnectRequest castMessages$ConnectRequest = new CastMessages$ConnectRequest();
        DEFAULT_INSTANCE = castMessages$ConnectRequest;
        h.registerDefaultInstance(CastMessages$ConnectRequest.class, castMessages$ConnectRequest);
    }

    private CastMessages$ConnectRequest() {
    }

    public static CastMessages$ConnectRequest o(byte[] bArr) {
        return (CastMessages$ConnectRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"deviceId_", "interactionIds_"});
        }
        if (iOrdinal == 3) {
            return new CastMessages$ConnectRequest();
        }
        if (iOrdinal == 4) {
            return new bid(DEFAULT_INSTANCE, (byte) 23);
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
        synchronized (CastMessages$ConnectRequest.class) {
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

    public final String getDeviceId() {
        return this.deviceId_;
    }

    public final h290 n() {
        return this.interactionIds_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
