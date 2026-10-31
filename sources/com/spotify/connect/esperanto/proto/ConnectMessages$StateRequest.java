package com.spotify.connect.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.u4l;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ConnectMessages$StateRequest extends h implements v2j0 {
    private static final ConnectMessages$StateRequest DEFAULT_INSTANCE;
    public static final int EXCLUDE_NON_LOCAL_DEVICES_FIELD_NUMBER = 4;
    public static final int INCLUDE_LOCAL_DEVICE_FIELD_NUMBER = 3;
    public static final int INCLUDE_USER_MATCH_UNAUTHENTICATED_DEVICES_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_OFFLINE_AMAZON_DEVICES_AS_ONLINE_FIELD_NUMBER = 2;
    public static final int SHOW_OFFLINE_DEVICES_IN_CORE_FIELD_NUMBER = 1;
    private boolean excludeNonLocalDevices_;
    private boolean includeLocalDevice_;
    private boolean includeUserMatchUnauthenticatedDevices_;
    private boolean showOfflineAmazonDevicesAsOnline_;
    private boolean showOfflineDevicesInCore_;

    static {
        ConnectMessages$StateRequest connectMessages$StateRequest = new ConnectMessages$StateRequest();
        DEFAULT_INSTANCE = connectMessages$StateRequest;
        h.registerDefaultInstance(ConnectMessages$StateRequest.class, connectMessages$StateRequest);
    }

    private ConnectMessages$StateRequest() {
    }

    public static u4l n() {
        return (u4l) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007", new Object[]{"showOfflineDevicesInCore_", "showOfflineAmazonDevicesAsOnline_", "includeLocalDevice_", "excludeNonLocalDevices_", "includeUserMatchUnauthenticatedDevices_"});
        }
        if (iOrdinal == 3) {
            return new ConnectMessages$StateRequest();
        }
        if (iOrdinal == 4) {
            return new u4l(DEFAULT_INSTANCE);
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
        synchronized (ConnectMessages$StateRequest.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(boolean z) {
        this.excludeNonLocalDevices_ = z;
    }

    public final void p() {
        this.includeLocalDevice_ = true;
    }

    public final void q(boolean z) {
        this.includeUserMatchUnauthenticatedDevices_ = z;
    }

    public final void r(boolean z) {
        this.showOfflineAmazonDevicesAsOnline_ = z;
    }

    public final void s(boolean z) {
        this.showOfflineDevicesInCore_ = z;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
