package com.spotify.connect.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.ofj1;
import p.psh;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.usk1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class VolumeMessages$VolumeResponse extends h implements v2j0 {
    public static final int ACTIVE_DEVICE_CONNECT_STATE_IDENTIFIER_FIELD_NUMBER = 3;
    private static final VolumeMessages$VolumeResponse DEFAULT_INSTANCE;
    public static final int GROUP_DEVICE_VOLUMES_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int VOLUME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int status_;
    private int volume_;
    private qng0 groupDeviceVolumes_ = qng0.b;
    private String activeDeviceConnectStateIdentifier_ = "";

    static {
        VolumeMessages$VolumeResponse volumeMessages$VolumeResponse = new VolumeMessages$VolumeResponse();
        DEFAULT_INSTANCE = volumeMessages$VolumeResponse;
        h.registerDefaultInstance(VolumeMessages$VolumeResponse.class, volumeMessages$VolumeResponse);
    }

    private VolumeMessages$VolumeResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static VolumeMessages$VolumeResponse r(byte[] bArr) {
        return (VolumeMessages$VolumeResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001င\u0000\u0002\f\u0003ለ\u0001\u00042", new Object[]{"bitField0_", "volume_", "status_", "activeDeviceConnectStateIdentifier_", "groupDeviceVolumes_", usk1.a});
        }
        if (iOrdinal == 3) {
            return new VolumeMessages$VolumeResponse();
        }
        if (iOrdinal == 4) {
            return new ofj1((byte) 21);
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
        synchronized (VolumeMessages$VolumeResponse.class) {
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

    public final String o() {
        return this.activeDeviceConnectStateIdentifier_;
    }

    public final psh p() {
        psh pshVarA = psh.a(this.status_);
        return pshVarA == null ? psh.UNRECOGNIZED : pshVarA;
    }

    public final int q() {
        return this.volume_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
