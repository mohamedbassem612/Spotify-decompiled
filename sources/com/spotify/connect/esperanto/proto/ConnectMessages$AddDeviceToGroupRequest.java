package com.spotify.connect.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.f4l;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ConnectMessages$AddDeviceToGroupRequest extends h implements v2j0 {
    public static final int CONNECT_DEVICE_IDENTIFIER_FIELD_NUMBER = 1;
    private static final ConnectMessages$AddDeviceToGroupRequest DEFAULT_INSTANCE;
    public static final int GROUP_DEVICE_IDENTIFIER_FIELD_NUMBER = 2;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private String connectDeviceIdentifier_ = "";
    private String groupDeviceIdentifier_ = "";
    private CommonMessages$LoggingParams loggingParams_;

    static {
        ConnectMessages$AddDeviceToGroupRequest connectMessages$AddDeviceToGroupRequest = new ConnectMessages$AddDeviceToGroupRequest();
        DEFAULT_INSTANCE = connectMessages$AddDeviceToGroupRequest;
        h.registerDefaultInstance(ConnectMessages$AddDeviceToGroupRequest.class, connectMessages$AddDeviceToGroupRequest);
    }

    private ConnectMessages$AddDeviceToGroupRequest() {
    }

    public static f4l n() {
        return (f4l) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000", new Object[]{"bitField0_", "connectDeviceIdentifier_", "groupDeviceIdentifier_", "loggingParams_"});
        }
        if (iOrdinal == 3) {
            return new ConnectMessages$AddDeviceToGroupRequest();
        }
        if (iOrdinal == 4) {
            return new f4l(DEFAULT_INSTANCE);
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
        synchronized (ConnectMessages$AddDeviceToGroupRequest.class) {
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

    public final void p(String str) {
        str.getClass();
        this.groupDeviceIdentifier_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
