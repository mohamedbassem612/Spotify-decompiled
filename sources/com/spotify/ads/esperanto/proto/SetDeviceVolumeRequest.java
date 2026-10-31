package com.spotify.ads.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.kk61;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class SetDeviceVolumeRequest extends h implements v2j0 {
    private static final SetDeviceVolumeRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int VOLUME_FIELD_NUMBER = 1;
    private double volume_;

    static {
        SetDeviceVolumeRequest setDeviceVolumeRequest = new SetDeviceVolumeRequest();
        DEFAULT_INSTANCE = setDeviceVolumeRequest;
        h.registerDefaultInstance(SetDeviceVolumeRequest.class, setDeviceVolumeRequest);
    }

    private SetDeviceVolumeRequest() {
    }

    public static kk61 n() {
        return (kk61) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000", new Object[]{"volume_"});
        }
        if (iOrdinal == 3) {
            return new SetDeviceVolumeRequest();
        }
        if (iOrdinal == 4) {
            return new kk61(DEFAULT_INSTANCE);
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
        synchronized (SetDeviceVolumeRequest.class) {
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

    public final void o(double d) {
        this.volume_ = d;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
