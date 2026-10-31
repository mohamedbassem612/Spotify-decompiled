package com.spotify.connect.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.g4l;
import p.jf40;
import p.n5k;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ConnectMessages$AddDeviceToGroupResponse extends h implements v2j0 {
    private static final ConnectMessages$AddDeviceToGroupResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private int bitField0_;
    private int error_;
    private boolean success_;

    static {
        ConnectMessages$AddDeviceToGroupResponse connectMessages$AddDeviceToGroupResponse = new ConnectMessages$AddDeviceToGroupResponse();
        DEFAULT_INSTANCE = connectMessages$AddDeviceToGroupResponse;
        h.registerDefaultInstance(ConnectMessages$AddDeviceToGroupResponse.class, connectMessages$AddDeviceToGroupResponse);
    }

    private ConnectMessages$AddDeviceToGroupResponse() {
    }

    public static ConnectMessages$AddDeviceToGroupResponse p(byte[] bArr) {
        return (ConnectMessages$AddDeviceToGroupResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002ဌ\u0000", new Object[]{"bitField0_", "success_", "error_"});
        }
        if (iOrdinal == 3) {
            return new ConnectMessages$AddDeviceToGroupResponse();
        }
        if (iOrdinal == 4) {
            return new n5k(DEFAULT_INSTANCE, (byte) 22);
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
        synchronized (ConnectMessages$AddDeviceToGroupResponse.class) {
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

    public final g4l n() {
        g4l g4lVar;
        int i = this.error_;
        if (i != 13) {
            switch (i) {
                case 0:
                    g4lVar = g4l.UNKNOWN_ERROR;
                    break;
                case 1:
                    g4lVar = g4l.TIMEOUT;
                    break;
                case 2:
                    g4lVar = g4l.INTERNAL;
                    break;
                case 3:
                    g4lVar = g4l.GROUP_DEVICE_NOT_FOUND;
                    break;
                case 4:
                    g4lVar = g4l.MAX_NUMBER_OF_DEVICES_REACHED;
                    break;
                case 5:
                    g4lVar = g4l.TARGET_NOT_FOUND;
                    break;
                case 6:
                    g4lVar = g4l.NOT_IMPLEMENTED;
                    break;
                default:
                    g4lVar = null;
                    break;
            }
        } else {
            g4lVar = g4l.BUSY;
        }
        return g4lVar == null ? g4l.UNRECOGNIZED : g4lVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.success_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
