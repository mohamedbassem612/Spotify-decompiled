package com.spotify.music.loggers.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.oqt;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class DeviceIdentifier extends h implements v2j0 {
    public static final int ANDROIDID_FIELD_NUMBER = 4;
    private static final DeviceIdentifier DEFAULT_INSTANCE;
    public static final int DEVICEID_FIELD_NUMBER = 2;
    public static final int GOOGLEAID_FIELD_NUMBER = 3;
    public static final int IDFA_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private String idfa_ = "";
    private String deviceid_ = "";
    private String googleaid_ = "";
    private String androidid_ = "";

    static {
        DeviceIdentifier deviceIdentifier = new DeviceIdentifier();
        DEFAULT_INSTANCE = deviceIdentifier;
        h.registerDefaultInstance(DeviceIdentifier.class, deviceIdentifier);
    }

    private DeviceIdentifier() {
    }

    public static oqt n() {
        return (oqt) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "idfa_", "deviceid_", "googleaid_", "androidid_"});
        }
        if (iOrdinal == 3) {
            return new DeviceIdentifier();
        }
        if (iOrdinal == 4) {
            return new oqt(DEFAULT_INSTANCE);
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
        synchronized (DeviceIdentifier.class) {
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
        this.androidid_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 2;
        this.deviceid_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.googleaid_ = str;
    }

    public final void r() {
        this.bitField0_ |= 1;
        this.idfa_ = "";
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
