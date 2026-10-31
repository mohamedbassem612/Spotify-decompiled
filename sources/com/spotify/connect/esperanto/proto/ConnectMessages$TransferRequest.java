package com.spotify.connect.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.v4l;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ConnectMessages$TransferRequest extends h implements v2j0 {
    public static final int CONNECT_DEVICE_IDENTIFIER_FIELD_NUMBER = 2;
    private static final ConnectMessages$TransferRequest DEFAULT_INSTANCE;
    public static final int DODO_FIELD_NUMBER = 3;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SOURCE_LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER = 4;
    public static final int STREAM_POLICY_FIELD_NUMBER = 5;
    private int bitField0_;
    private boolean dodo_;
    private CommonMessages$LoggingParams loggingParams_;
    private int streamPolicy_;
    private String connectDeviceIdentifier_ = "";
    private String sourceLogicalPlaybackIdentifier_ = "";

    static {
        ConnectMessages$TransferRequest connectMessages$TransferRequest = new ConnectMessages$TransferRequest();
        DEFAULT_INSTANCE = connectMessages$TransferRequest;
        h.registerDefaultInstance(ConnectMessages$TransferRequest.class, connectMessages$TransferRequest);
    }

    private ConnectMessages$TransferRequest() {
    }

    public static v4l n() {
        return (v4l) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003ဇ\u0001\u0004ለ\u0002\u0005\f", new Object[]{"bitField0_", "loggingParams_", "connectDeviceIdentifier_", "dodo_", "sourceLogicalPlaybackIdentifier_", "streamPolicy_"});
        }
        if (iOrdinal == 3) {
            return new ConnectMessages$TransferRequest();
        }
        if (iOrdinal == 4) {
            return new v4l(DEFAULT_INSTANCE);
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
        synchronized (ConnectMessages$TransferRequest.class) {
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
        this.connectDeviceIdentifier_ = str;
    }

    public final void p(CommonMessages$LoggingParams commonMessages$LoggingParams) {
        this.loggingParams_ = commonMessages$LoggingParams;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
