package com.spotify.offline_esperanto.proto;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.onz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class EsOffline$Device extends h implements v2j0 {
    public static final int CACHE_ID_FIELD_NUMBER = 2;
    public static final int CAPABILITIES_FIELD_NUMBER = 9;
    public static final int CLIENT_ID_FIELD_NUMBER = 8;
    private static final EsOffline$Device DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 1;
    public static final int IS_LOCAL_FIELD_NUMBER = 7;
    public static final int LAST_SEEN_AT_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 3;
    public static final int OFFLINE_ENABLED_FIELD_NUMBER = 10;
    private static volatile qzr0 PARSER = null;
    public static final int PLATFORM_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_NUMBER = 4;
    private int bitField0_;
    private EsOffline$Capabilities capabilities_;
    private boolean isLocal_;
    private Timestamp lastSeenAt_;
    private boolean offlineEnabled_;
    private int platform_;
    private int type_;
    private String deviceId_ = "";
    private String cacheId_ = "";
    private String name_ = "";
    private String clientId_ = "";

    static {
        EsOffline$Device esOffline$Device = new EsOffline$Device();
        DEFAULT_INSTANCE = esOffline$Device;
        h.registerDefaultInstance(EsOffline$Device.class, esOffline$Device);
    }

    private EsOffline$Device() {
    }

    public static EsOffline$Device p() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0004\u0005\u0004\u0006ဉ\u0000\u0007\u0007\bȈ\tဉ\u0001\n\u0007", new Object[]{"bitField0_", "deviceId_", "cacheId_", "name_", "type_", "platform_", "lastSeenAt_", "isLocal_", "clientId_", "capabilities_", "offlineEnabled_"});
        }
        if (iOrdinal == 3) {
            return new EsOffline$Device();
        }
        if (iOrdinal == 4) {
            return new onz(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (EsOffline$Device.class) {
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

    public final String getClientId() {
        return this.clientId_;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getDeviceId() {
        return this.deviceId_;
    }

    public final boolean getIsLocal() {
        return this.isLocal_;
    }

    public final String getName() {
        return this.name_;
    }

    public final String n() {
        return this.cacheId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final EsOffline$Capabilities o() {
        EsOffline$Capabilities esOffline$Capabilities = this.capabilities_;
        return esOffline$Capabilities == null ? EsOffline$Capabilities.n() : esOffline$Capabilities;
    }

    public final Timestamp q() {
        Timestamp timestamp = this.lastSeenAt_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final boolean r() {
        return this.offlineEnabled_;
    }

    public final int s() {
        return this.platform_;
    }

    public final int t() {
        return this.type_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
