package com.spotify.libs.connect.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.bk;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class AccessoryStateEvent extends h implements v2j0 {
    public static final int AUDIO_ROUTE_ID_FIELD_NUMBER = 4;
    public static final int AUDIO_ROUTE_TYPE_FIELD_NUMBER = 5;
    public static final int BLUETOOTH_MAC_ID_FIELD_NUMBER = 12;
    public static final int CHANGE_REASON_FIELD_NUMBER = 2;
    public static final int CHANGE_TIME_FIELD_NUMBER = 3;
    public static final int CONNECTION_TYPE_FIELD_NUMBER = 11;
    public static final int CURRENT_VOLUME_FIELD_NUMBER = 6;
    private static final AccessoryStateEvent DEFAULT_INSTANCE;
    public static final int EAM_ERROR_FIELD_NUMBER = 9;
    public static final int EAM_SEQUENCE_NUMBER_FIELD_NUMBER = 10;
    private static volatile qzr0 PARSER = null;
    public static final int SEQUENCE_NUMBER_FIELD_NUMBER = 1;
    public static final int WAS_RESOLVED_BY_EAM_FIELD_NUMBER = 8;
    public static final int WILL_RESOLVE_BY_EAM_FIELD_NUMBER = 7;
    private int bitField0_;
    private float currentVolume_;
    private boolean eamError_;
    private int eamSequenceNumber_;
    private int sequenceNumber_;
    private boolean wasResolvedByEam_;
    private boolean willResolveByEam_;
    private String changeReason_ = "";
    private String changeTime_ = "";
    private String audioRouteId_ = "";
    private String audioRouteType_ = "";
    private String connectionType_ = "";
    private String bluetoothMacId_ = "";

    static {
        AccessoryStateEvent accessoryStateEvent = new AccessoryStateEvent();
        DEFAULT_INSTANCE = accessoryStateEvent;
        h.registerDefaultInstance(AccessoryStateEvent.class, accessoryStateEvent);
    }

    private AccessoryStateEvent() {
    }

    public static bk n() {
        return (bk) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ခ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nင\t\u000bဈ\n\fဈ\u000b", new Object[]{"bitField0_", "sequenceNumber_", "changeReason_", "changeTime_", "audioRouteId_", "audioRouteType_", "currentVolume_", "willResolveByEam_", "wasResolvedByEam_", "eamError_", "eamSequenceNumber_", "connectionType_", "bluetoothMacId_"});
        }
        if (iOrdinal == 3) {
            return new AccessoryStateEvent();
        }
        if (iOrdinal == 4) {
            return new bk(DEFAULT_INSTANCE);
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
        synchronized (AccessoryStateEvent.class) {
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
        str.getClass();
        this.bitField0_ |= 8;
        this.audioRouteId_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 16;
        this.audioRouteType_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 2048;
        this.bluetoothMacId_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.changeReason_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.changeTime_ = str;
    }

    public final void t(String str) {
        this.bitField0_ |= 1024;
        this.connectionType_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u() {
        this.bitField0_ |= 32;
        this.currentVolume_ = -1.0f;
    }

    public final void v() {
        this.bitField0_ |= 256;
        this.eamError_ = false;
    }

    public final void w(int i) {
        this.bitField0_ |= 512;
        this.eamSequenceNumber_ = i;
    }

    public final void x(int i) {
        this.bitField0_ |= 1;
        this.sequenceNumber_ = i;
    }

    public final void y(boolean z) {
        this.bitField0_ |= 128;
        this.wasResolvedByEam_ = z;
    }

    public final void z(boolean z) {
        this.bitField0_ |= 64;
        this.willResolveByEam_ = z;
    }
}
