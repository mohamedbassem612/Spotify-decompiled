package com.spotify.connect.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.n5k;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ConnectMessages$GroupData extends h implements v2j0 {
    public static final int CAPABILITIES_FIELD_NUMBER = 2;
    private static final ConnectMessages$GroupData DEFAULT_INSTANCE;
    public static final int DEVICES_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private ConnectMessages.GroupCapabilities capabilities_;
    private h290 devices_ = h.emptyProtobufList();

    static {
        ConnectMessages$GroupData connectMessages$GroupData = new ConnectMessages$GroupData();
        DEFAULT_INSTANCE = connectMessages$GroupData;
        h.registerDefaultInstance(ConnectMessages$GroupData.class, connectMessages$GroupData);
    }

    private ConnectMessages$GroupData() {
    }

    public static ConnectMessages$GroupData p() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "devices_", ConnectMessages.GroupDevice.class, "capabilities_"});
        }
        if (iOrdinal == 3) {
            return new ConnectMessages$GroupData();
        }
        if (iOrdinal == 4) {
            return new n5k((byte) 25);
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
        synchronized (ConnectMessages$GroupData.class) {
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

    public final ConnectMessages.GroupCapabilities o() {
        ConnectMessages.GroupCapabilities groupCapabilities = this.capabilities_;
        return groupCapabilities == null ? ConnectMessages.GroupCapabilities.n() : groupCapabilities;
    }

    public final h290 q() {
        return this.devices_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
