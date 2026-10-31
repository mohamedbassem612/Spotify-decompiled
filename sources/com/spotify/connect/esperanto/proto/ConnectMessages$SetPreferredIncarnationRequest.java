package com.spotify.connect.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.k4l;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.t4l;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ConnectMessages$SetPreferredIncarnationRequest extends h implements v2j0 {
    private static final ConnectMessages$SetPreferredIncarnationRequest DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 1;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PREFERRED_LOGIN_TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String deviceId_ = "";
    private CommonMessages$LoggingParams loggingParams_;
    private int preferredLoginType_;

    static {
        ConnectMessages$SetPreferredIncarnationRequest connectMessages$SetPreferredIncarnationRequest = new ConnectMessages$SetPreferredIncarnationRequest();
        DEFAULT_INSTANCE = connectMessages$SetPreferredIncarnationRequest;
        h.registerDefaultInstance(ConnectMessages$SetPreferredIncarnationRequest.class, connectMessages$SetPreferredIncarnationRequest);
    }

    private ConnectMessages$SetPreferredIncarnationRequest() {
    }

    public static t4l n() {
        return (t4l) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဌ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "deviceId_", "preferredLoginType_", "loggingParams_"});
        }
        if (iOrdinal == 3) {
            return new ConnectMessages$SetPreferredIncarnationRequest();
        }
        if (iOrdinal == 4) {
            return new t4l(DEFAULT_INSTANCE);
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
        synchronized (ConnectMessages$SetPreferredIncarnationRequest.class) {
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
        this.deviceId_ = str;
    }

    public final void p(k4l k4lVar) {
        this.preferredLoginType_ = k4lVar.getNumber();
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
