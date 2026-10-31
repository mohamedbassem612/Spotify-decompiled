package com.spotify.libs.sociallistening.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xy90;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class JamNearbyBroadcastStarted extends h implements v2j0 {
    public static final int BROADCAST_TYPE_FIELD_NUMBER = 7;
    private static final JamNearbyBroadcastStarted DEFAULT_INSTANCE;
    public static final int FAILURE_REASON_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 4;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int TECH_FIELD_NUMBER = 2;
    public static final int TOKEN_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_NUMBER = 3;
    private int bitField0_;
    private String sessionId_ = "";
    private String tech_ = "";
    private String type_ = "";
    private String reason_ = "";
    private String token_ = "";
    private String failureReason_ = "";
    private String broadcastType_ = "";

    static {
        JamNearbyBroadcastStarted jamNearbyBroadcastStarted = new JamNearbyBroadcastStarted();
        DEFAULT_INSTANCE = jamNearbyBroadcastStarted;
        h.registerDefaultInstance(JamNearbyBroadcastStarted.class, jamNearbyBroadcastStarted);
    }

    private JamNearbyBroadcastStarted() {
    }

    public static xy90 n() {
        return (xy90) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"bitField0_", "sessionId_", "tech_", "type_", "reason_", "token_", "failureReason_", "broadcastType_"});
        }
        if (iOrdinal == 3) {
            return new JamNearbyBroadcastStarted();
        }
        if (iOrdinal == 4) {
            return new xy90(DEFAULT_INSTANCE);
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
        synchronized (JamNearbyBroadcastStarted.class) {
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
        this.bitField0_ |= 64;
        this.broadcastType_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.failureReason_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 2;
        this.tech_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.token_ = str;
    }

    public final void s(String str) {
        this.bitField0_ |= 4;
        this.type_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
