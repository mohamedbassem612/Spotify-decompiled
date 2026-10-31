package com.spotify.connect.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.n5k;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ConnectMessages$GroupDeviceIdentifiers extends h implements v2j0 {
    public static final int CONNECT_STATE_IDENTIFIER_FIELD_NUMBER = 4;
    public static final int DEDUPLICATION_ID_FIELD_NUMBER = 3;
    private static final ConnectMessages$GroupDeviceIdentifiers DEFAULT_INSTANCE;
    public static final int GROUP_DEVICE_IDENTIFIER_FIELD_NUMBER = 1;
    public static final int LOCAL_IDENTIFIER_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private String groupDeviceIdentifier_ = "";
    private String localIdentifier_ = "";
    private String deduplicationId_ = "";
    private String connectStateIdentifier_ = "";

    static {
        ConnectMessages$GroupDeviceIdentifiers connectMessages$GroupDeviceIdentifiers = new ConnectMessages$GroupDeviceIdentifiers();
        DEFAULT_INSTANCE = connectMessages$GroupDeviceIdentifiers;
        h.registerDefaultInstance(ConnectMessages$GroupDeviceIdentifiers.class, connectMessages$GroupDeviceIdentifiers);
    }

    private ConnectMessages$GroupDeviceIdentifiers() {
    }

    public static ConnectMessages$GroupDeviceIdentifiers p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003ለ\u0001\u0004ለ\u0002", new Object[]{"bitField0_", "groupDeviceIdentifier_", "localIdentifier_", "deduplicationId_", "connectStateIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new ConnectMessages$GroupDeviceIdentifiers();
        }
        if (iOrdinal == 4) {
            return new n5k(DEFAULT_INSTANCE, (byte) 28);
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
        synchronized (ConnectMessages$GroupDeviceIdentifiers.class) {
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

    public final String n() {
        return this.connectStateIdentifier_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.deduplicationId_;
    }

    public final String q() {
        return this.groupDeviceIdentifier_;
    }

    public final String r() {
        return this.localIdentifier_;
    }

    public final boolean s() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 1) != 0;
    }
}
