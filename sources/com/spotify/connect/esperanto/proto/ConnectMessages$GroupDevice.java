package com.spotify.connect.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h4l;
import p.jf40;
import p.n5k;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ConnectMessages$GroupDevice extends h implements v2j0 {
    public static final int CAPABILITIES_FIELD_NUMBER = 5;
    private static final ConnectMessages$GroupDevice DEFAULT_INSTANCE;
    public static final int GROUPING_STATUS_FIELD_NUMBER = 6;
    public static final int IDENTIFIERS_FIELD_NUMBER = 1;
    public static final int MODEL_DISPLAY_NAME_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 3;
    public static final int VOLUME_FIELD_NUMBER = 7;
    private int bitField0_;
    private ConnectMessages$GroupDeviceCapabilities capabilities_;
    private int groupingStatus_;
    private ConnectMessages$GroupDeviceIdentifiers identifiers_;
    private ConnectMessages$GroupDeviceVolume volume_;
    private String name_ = "";
    private String type_ = "";
    private String modelDisplayName_ = "";

    static {
        ConnectMessages$GroupDevice connectMessages$GroupDevice = new ConnectMessages$GroupDevice();
        DEFAULT_INSTANCE = connectMessages$GroupDevice;
        h.registerDefaultInstance(ConnectMessages$GroupDevice.class, connectMessages$GroupDevice);
    }

    private ConnectMessages$GroupDevice() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005ဉ\u0001\u0006\f\u0007ဉ\u0002", new Object[]{"bitField0_", "identifiers_", "name_", "type_", "modelDisplayName_", "capabilities_", "groupingStatus_", "volume_"});
        }
        if (iOrdinal == 3) {
            return new ConnectMessages$GroupDevice();
        }
        if (iOrdinal == 4) {
            return new n5k(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (ConnectMessages$GroupDevice.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final ConnectMessages$GroupDeviceCapabilities n() {
        ConnectMessages$GroupDeviceCapabilities connectMessages$GroupDeviceCapabilities = this.capabilities_;
        return connectMessages$GroupDeviceCapabilities == null ? ConnectMessages$GroupDeviceCapabilities.n() : connectMessages$GroupDeviceCapabilities;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h4l o() {
        h4l h4lVar;
        int i = this.groupingStatus_;
        if (i == 0) {
            h4lVar = h4l.UNKNOWN_GROUPING_STATUS;
        } else if (i == 1) {
            h4lVar = h4l.GROUPED;
        } else if (i != 2) {
            h4lVar = i != 3 ? null : h4l.GROUPING;
        } else {
            h4lVar = h4l.GROUPABLE;
        }
        return h4lVar == null ? h4l.UNRECOGNIZED : h4lVar;
    }

    public final ConnectMessages$GroupDeviceIdentifiers p() {
        ConnectMessages$GroupDeviceIdentifiers connectMessages$GroupDeviceIdentifiers = this.identifiers_;
        return connectMessages$GroupDeviceIdentifiers == null ? ConnectMessages$GroupDeviceIdentifiers.p() : connectMessages$GroupDeviceIdentifiers;
    }

    public final String q() {
        return this.modelDisplayName_;
    }

    public final String r() {
        return this.type_;
    }

    public final ConnectMessages$GroupDeviceVolume s() {
        ConnectMessages$GroupDeviceVolume connectMessages$GroupDeviceVolume = this.volume_;
        return connectMessages$GroupDeviceVolume == null ? ConnectMessages$GroupDeviceVolume.n() : connectMessages$GroupDeviceVolume;
    }

    public final boolean t() {
        return (this.bitField0_ & 4) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
