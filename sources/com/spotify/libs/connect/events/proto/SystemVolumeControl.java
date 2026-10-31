package com.spotify.libs.connect.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.red1;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class SystemVolumeControl extends h implements v2j0 {
    public static final int CURRENT_ROUTE_TYPE_FIELD_NUMBER = 4;
    private static final SystemVolumeControl DEFAULT_INSTANCE;
    public static final int OLD_VOLUME_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int REQUESTING_FEATURE_FIELD_NUMBER = 1;
    public static final int VOLUME_FIELD_NUMBER = 2;
    private int bitField0_;
    private float oldVolume_;
    private float volume_;
    private String requestingFeature_ = "";
    private String currentRouteType_ = "";

    static {
        SystemVolumeControl systemVolumeControl = new SystemVolumeControl();
        DEFAULT_INSTANCE = systemVolumeControl;
        h.registerDefaultInstance(SystemVolumeControl.class, systemVolumeControl);
    }

    private SystemVolumeControl() {
    }

    public static red1 n() {
        return (red1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "requestingFeature_", "volume_", "oldVolume_", "currentRouteType_"});
        }
        if (iOrdinal == 3) {
            return new SystemVolumeControl();
        }
        if (iOrdinal == 4) {
            return new red1(DEFAULT_INSTANCE);
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
        synchronized (SystemVolumeControl.class) {
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
        this.bitField0_ |= 8;
        this.currentRouteType_ = str;
    }

    public final void p(float f) {
        this.bitField0_ |= 4;
        this.oldVolume_ = f;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.requestingFeature_ = str;
    }

    public final void r(float f) {
        this.bitField0_ |= 2;
        this.volume_ = f;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
