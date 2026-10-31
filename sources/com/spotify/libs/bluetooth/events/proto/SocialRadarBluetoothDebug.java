package com.spotify.libs.bluetooth.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.p5a1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class SocialRadarBluetoothDebug extends h implements v2j0 {
    public static final int ACTION_FIELD_NUMBER = 2;
    public static final int ADDITIONAL_INFO_FIELD_NUMBER = 6;
    public static final int CONNECTION_ID_HASH_FIELD_NUMBER = 1;
    private static final SocialRadarBluetoothDebug DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int RANGE_FIELD_NUMBER = 4;
    public static final int RSSI_FIELD_NUMBER = 3;
    private int bitField0_;
    private int rssi_;
    private String connectionIdHash_ = "";
    private String action_ = "";
    private String range_ = "";
    private String error_ = "";
    private String additionalInfo_ = "";

    static {
        SocialRadarBluetoothDebug socialRadarBluetoothDebug = new SocialRadarBluetoothDebug();
        DEFAULT_INSTANCE = socialRadarBluetoothDebug;
        h.registerDefaultInstance(SocialRadarBluetoothDebug.class, socialRadarBluetoothDebug);
    }

    private SocialRadarBluetoothDebug() {
    }

    public static p5a1 n() {
        return (p5a1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "connectionIdHash_", "action_", "rssi_", "range_", "error_", "additionalInfo_"});
        }
        if (iOrdinal == 3) {
            return new SocialRadarBluetoothDebug();
        }
        if (iOrdinal == 4) {
            return new p5a1(DEFAULT_INSTANCE);
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
        synchronized (SocialRadarBluetoothDebug.class) {
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
        this.bitField0_ |= 2;
        this.action_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 32;
        this.additionalInfo_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 1;
        this.connectionIdHash_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 16;
        this.error_ = str;
    }

    public final void s(String str) {
        this.bitField0_ |= 8;
        this.range_ = str;
    }

    public final void t(int i) {
        this.bitField0_ |= 4;
        this.rssi_ = i;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
