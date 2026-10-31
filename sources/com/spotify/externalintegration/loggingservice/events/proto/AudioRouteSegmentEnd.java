package com.spotify.externalintegration.loggingservice.events.proto;

import com.google.protobuf.h;
import p.b48;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class AudioRouteSegmentEnd extends h implements v2j0 {
    public static final int CURRENT_ROUTE_CAR_CONNECTION_TYPE_FIELD_NUMBER = 9;
    public static final int CURRENT_ROUTE_ID_FIELD_NUMBER = 3;
    public static final int CURRENT_ROUTE_NAME_FIELD_NUMBER = 4;
    public static final int CURRENT_ROUTE_TYPE_FIELD_NUMBER = 5;
    private static final AudioRouteSegmentEnd DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 1;
    public static final int PREVIOUS_ROUTE_CAR_CONNECTION_TYPE_FIELD_NUMBER = 10;
    public static final int PREVIOUS_ROUTE_ID_FIELD_NUMBER = 6;
    public static final int PREVIOUS_ROUTE_NAME_FIELD_NUMBER = 7;
    public static final int PREVIOUS_ROUTE_TYPE_FIELD_NUMBER = 8;
    public static final int REASON_FIELD_NUMBER = 2;
    private int bitField0_;
    private int currentRouteCarConnectionType_;
    private int previousRouteCarConnectionType_;
    private String playbackId_ = "";
    private String reason_ = "";
    private String currentRouteId_ = "";
    private String currentRouteName_ = "";
    private String currentRouteType_ = "";
    private String previousRouteId_ = "";
    private String previousRouteName_ = "";
    private String previousRouteType_ = "";

    static {
        AudioRouteSegmentEnd audioRouteSegmentEnd = new AudioRouteSegmentEnd();
        DEFAULT_INSTANCE = audioRouteSegmentEnd;
        h.registerDefaultInstance(AudioRouteSegmentEnd.class, audioRouteSegmentEnd);
    }

    private AudioRouteSegmentEnd() {
    }

    public static b48 n() {
        return (b48) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tင\b\nင\t", new Object[]{"bitField0_", "playbackId_", "reason_", "currentRouteId_", "currentRouteName_", "currentRouteType_", "previousRouteId_", "previousRouteName_", "previousRouteType_", "currentRouteCarConnectionType_", "previousRouteCarConnectionType_"});
        }
        if (iOrdinal == 3) {
            return new AudioRouteSegmentEnd();
        }
        if (iOrdinal == 4) {
            return new b48(DEFAULT_INSTANCE);
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
        synchronized (AudioRouteSegmentEnd.class) {
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

    public final void o(int i) {
        this.bitField0_ |= 256;
        this.currentRouteCarConnectionType_ = i;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.currentRouteId_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.currentRouteName_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 16;
        this.currentRouteType_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.playbackId_ = str;
    }

    public final void t(int i) {
        this.bitField0_ |= 512;
        this.previousRouteCarConnectionType_ = i;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.previousRouteId_ = str;
    }

    public final void v(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.previousRouteName_ = str;
    }

    public final void w(String str) {
        this.bitField0_ |= 128;
        this.previousRouteType_ = str;
    }

    public final void x(String str) {
        this.bitField0_ |= 2;
        this.reason_ = str;
    }
}
