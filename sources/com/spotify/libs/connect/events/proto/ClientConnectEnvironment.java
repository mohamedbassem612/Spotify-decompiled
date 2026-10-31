package com.spotify.libs.connect.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.pig;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ClientConnectEnvironment extends h implements v2j0 {
    private static final ClientConnectEnvironment DEFAULT_INSTANCE;
    public static final int LOCAL_DEVICE_ID_FIELD_NUMBER = 1;
    public static final int LOCAL_TIME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TIMEZONE_FIELD_NUMBER = 3;
    private int bitField0_;
    private String localDeviceId_ = "";
    private String localTime_ = "";
    private String timezone_ = "";

    static {
        ClientConnectEnvironment clientConnectEnvironment = new ClientConnectEnvironment();
        DEFAULT_INSTANCE = clientConnectEnvironment;
        h.registerDefaultInstance(ClientConnectEnvironment.class, clientConnectEnvironment);
    }

    private ClientConnectEnvironment() {
    }

    public static pig n() {
        return (pig) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "localDeviceId_", "localTime_", "timezone_"});
        }
        if (iOrdinal == 3) {
            return new ClientConnectEnvironment();
        }
        if (iOrdinal == 4) {
            return new pig(DEFAULT_INSTANCE);
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
        synchronized (ClientConnectEnvironment.class) {
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
        this.bitField0_ |= 1;
        this.localDeviceId_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.localTime_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 4;
        this.timezone_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
