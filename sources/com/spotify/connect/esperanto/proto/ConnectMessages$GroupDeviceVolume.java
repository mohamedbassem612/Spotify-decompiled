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
public final class ConnectMessages$GroupDeviceVolume extends h implements v2j0 {
    private static final ConnectMessages$GroupDeviceVolume DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int VOLUME_FIELD_NUMBER = 1;
    public static final int VOLUME_STEPS_FIELD_NUMBER = 2;
    private int volumeSteps_;
    private int volume_;

    static {
        ConnectMessages$GroupDeviceVolume connectMessages$GroupDeviceVolume = new ConnectMessages$GroupDeviceVolume();
        DEFAULT_INSTANCE = connectMessages$GroupDeviceVolume;
        h.registerDefaultInstance(ConnectMessages$GroupDeviceVolume.class, connectMessages$GroupDeviceVolume);
    }

    private ConnectMessages$GroupDeviceVolume() {
    }

    public static ConnectMessages$GroupDeviceVolume n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u0004", new Object[]{"volume_", "volumeSteps_"});
        }
        if (iOrdinal == 3) {
            return new ConnectMessages$GroupDeviceVolume();
        }
        if (iOrdinal == 4) {
            return new n5k(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (ConnectMessages$GroupDeviceVolume.class) {
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

    public final int o() {
        return this.volume_;
    }

    public final int p() {
        return this.volumeSteps_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
