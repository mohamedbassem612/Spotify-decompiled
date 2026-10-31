package com.spotify.atv_remote.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.ln7;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zg7;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class AtvRemoteServiceOuterClass$AtvPairingResponse extends h implements v2j0 {
    private static final AtvRemoteServiceOuterClass$AtvPairingResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 3;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private String errorMessage_ = "";
    private int error_;
    private boolean success_;

    static {
        AtvRemoteServiceOuterClass$AtvPairingResponse atvRemoteServiceOuterClass$AtvPairingResponse = new AtvRemoteServiceOuterClass$AtvPairingResponse();
        DEFAULT_INSTANCE = atvRemoteServiceOuterClass$AtvPairingResponse;
        h.registerDefaultInstance(AtvRemoteServiceOuterClass$AtvPairingResponse.class, atvRemoteServiceOuterClass$AtvPairingResponse);
    }

    private AtvRemoteServiceOuterClass$AtvPairingResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static AtvRemoteServiceOuterClass$AtvPairingResponse q(byte[] bArr) {
        return (AtvRemoteServiceOuterClass$AtvPairingResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002Ȉ\u0003\f", new Object[]{"success_", "errorMessage_", "error_"});
        }
        if (iOrdinal == 3) {
            return new AtvRemoteServiceOuterClass$AtvPairingResponse();
        }
        if (iOrdinal == 4) {
            return new zg7(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (AtvRemoteServiceOuterClass$AtvPairingResponse.class) {
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

    public final ln7 n() {
        ln7 ln7Var;
        switch (this.error_) {
            case 0:
                ln7Var = ln7.ATV_PAIRING_ERROR_UNSPECIFIED;
                break;
            case 1:
                ln7Var = ln7.ATV_PAIRING_ERROR_INVALID_PIN_FORMAT;
                break;
            case 2:
                ln7Var = ln7.ATV_PAIRING_ERROR_HAP_AUTHENTICATION;
                break;
            case 3:
                ln7Var = ln7.ATV_PAIRING_ERROR_HAP_BACKOFF;
                break;
            case 4:
                ln7Var = ln7.ATV_PAIRING_ERROR_HAP_MAX_PEERS;
                break;
            case 5:
                ln7Var = ln7.ATV_PAIRING_ERROR_HAP_MAX_TRIES;
                break;
            case 6:
                ln7Var = ln7.ATV_PAIRING_ERROR_HAP_UNAVAILABLE;
                break;
            case 7:
                ln7Var = ln7.ATV_PAIRING_ERROR_HAP_BUSY;
                break;
            case 8:
                ln7Var = ln7.ATV_PAIRING_ERROR_UNKNOWN_HAP_ERROR;
                break;
            case 9:
                ln7Var = ln7.ATV_PAIRING_ERROR_DEVICE_NOT_RESPONDING;
                break;
            case 10:
                ln7Var = ln7.ATV_PAIRING_ERROR_CONNECTION_LOST;
                break;
            case 11:
                ln7Var = ln7.ATV_PAIRING_ERROR_UNKNOWN;
                break;
            default:
                ln7Var = null;
                break;
        }
        return ln7Var == null ? ln7.UNRECOGNIZED : ln7Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.errorMessage_;
    }

    public final boolean p() {
        return this.success_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
