package com.spotify.connect.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.j4l;
import p.jf40;
import p.n4l;
import p.o4l;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ConnectMessages$OutputPeripheral extends h implements v2j0 {
    public static final int BRAND_FIELD_NUMBER = 2;
    public static final int CATEGORY_FIELD_NUMBER = 4;
    public static final int CONNECTION_TYPE_FIELD_NUMBER = 5;
    private static final ConnectMessages$OutputPeripheral DEFAULT_INSTANCE;
    public static final int MODEL_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private int category_;
    private int connectionType_;
    private String name_ = "";
    private String brand_ = "";
    private String model_ = "";

    static {
        ConnectMessages$OutputPeripheral connectMessages$OutputPeripheral = new ConnectMessages$OutputPeripheral();
        DEFAULT_INSTANCE = connectMessages$OutputPeripheral;
        h.registerDefaultInstance(ConnectMessages$OutputPeripheral.class, connectMessages$OutputPeripheral);
    }

    private ConnectMessages$OutputPeripheral() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ConnectMessages$OutputPeripheral r() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ဌ\u0003\u0005ဌ\u0004", new Object[]{"bitField0_", "name_", "brand_", "model_", "category_", "connectionType_"});
        }
        if (iOrdinal == 3) {
            return new ConnectMessages$OutputPeripheral();
        }
        if (iOrdinal == 4) {
            return new j4l((byte) 1);
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
        synchronized (ConnectMessages$OutputPeripheral.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.brand_;
    }

    public final n4l p() {
        n4l n4lVar;
        switch (this.category_) {
            case 0:
                n4lVar = n4l.OUTPUT_PERIPHERAL_CATEGORY_UNKNOWN;
                break;
            case 1:
                n4lVar = n4l.OUTPUT_PERIPHERAL_CATEGORY_CAR;
                break;
            case 2:
                n4lVar = n4l.OUTPUT_PERIPHERAL_CATEGORY_HEADPHONES;
                break;
            case 3:
                n4lVar = n4l.OUTPUT_PERIPHERAL_CATEGORY_SPEAKER;
                break;
            case 4:
                n4lVar = n4l.OUTPUT_PERIPHERAL_CATEGORY_WEARABLE;
                break;
            case 5:
                n4lVar = n4l.OUTPUT_PERIPHERAL_CATEGORY_GLASSES;
                break;
            case 6:
                n4lVar = n4l.OUTPUT_PERIPHERAL_CATEGORY_APP;
                break;
            default:
                n4lVar = null;
                break;
        }
        return n4lVar == null ? n4l.UNRECOGNIZED : n4lVar;
    }

    public final o4l q() {
        o4l o4lVar;
        int i = this.connectionType_;
        if (i == 0) {
            o4lVar = o4l.OUTPUT_PERIPHERAL_CONNECTION_TYPE_UNKNOWN;
        } else if (i == 1) {
            o4lVar = o4l.OUTPUT_PERIPHERAL_CONNECTION_TYPE_WIRED;
        } else if (i == 2) {
            o4lVar = o4l.OUTPUT_PERIPHERAL_CONNECTION_TYPE_CAR_PROJECTED;
        } else if (i == 3) {
            o4lVar = o4l.OUTPUT_PERIPHERAL_CONNECTION_TYPE_BLUETOOTH;
        } else if (i != 4) {
            o4lVar = i != 5 ? null : o4l.OUTPUT_PERIPHERAL_CONNECTION_TYPE_BUILT_IN_SPEAKER;
        } else {
            o4lVar = o4l.OUTPUT_PERIPHERAL_CONNECTION_TYPE_AIRPLAY;
        }
        return o4lVar == null ? o4l.UNRECOGNIZED : o4lVar;
    }

    public final String s() {
        return this.model_;
    }

    public final boolean t() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean v() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean w() {
        return (this.bitField0_ & 4) != 0;
    }
}
