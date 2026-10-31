package com.spotify.connect.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.j4l;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s4l;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ConnectMessages$RemoveDeviceFromGroupResponse extends h implements v2j0 {
    private static final ConnectMessages$RemoveDeviceFromGroupResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private int bitField0_;
    private int error_;
    private boolean success_;

    static {
        ConnectMessages$RemoveDeviceFromGroupResponse connectMessages$RemoveDeviceFromGroupResponse = new ConnectMessages$RemoveDeviceFromGroupResponse();
        DEFAULT_INSTANCE = connectMessages$RemoveDeviceFromGroupResponse;
        h.registerDefaultInstance(ConnectMessages$RemoveDeviceFromGroupResponse.class, connectMessages$RemoveDeviceFromGroupResponse);
    }

    private ConnectMessages$RemoveDeviceFromGroupResponse() {
    }

    public static ConnectMessages$RemoveDeviceFromGroupResponse p(byte[] bArr) {
        return (ConnectMessages$RemoveDeviceFromGroupResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return new ConnectMessages$RemoveDeviceFromGroupResponse();
        }
        if (iOrdinal == 4) {
            return new j4l(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (ConnectMessages$RemoveDeviceFromGroupResponse.class) {
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

    public final s4l n() {
        s4l s4lVar;
        int i = this.error_;
        if (i == 0) {
            s4lVar = s4l.UNKNOWN_ERROR;
        } else if (i == 1) {
            s4lVar = s4l.TIMEOUT;
        } else if (i == 2) {
            s4lVar = s4l.INTERNAL;
        } else if (i == 3) {
            s4lVar = s4l.GROUP_DEVICE_NOT_FOUND;
        } else if (i == 4) {
            s4lVar = s4l.TARGET_NOT_FOUND;
        } else if (i != 5) {
            s4lVar = i != 12 ? null : s4l.BUSY;
        } else {
            s4lVar = s4l.NOT_IMPLEMENTED;
        }
        return s4lVar == null ? s4l.UNRECOGNIZED : s4lVar;
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
