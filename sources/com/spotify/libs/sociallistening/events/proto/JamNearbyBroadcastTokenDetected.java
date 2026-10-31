package com.spotify.libs.sociallistening.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yy90;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class JamNearbyBroadcastTokenDetected extends h implements v2j0 {
    private static final JamNearbyBroadcastTokenDetected DEFAULT_INSTANCE;
    public static final int DISCOVERY_METHOD_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TOKEN_FIELD_NUMBER = 1;
    private int bitField0_;
    private String token_ = "";
    private String discoveryMethod_ = "";

    static {
        JamNearbyBroadcastTokenDetected jamNearbyBroadcastTokenDetected = new JamNearbyBroadcastTokenDetected();
        DEFAULT_INSTANCE = jamNearbyBroadcastTokenDetected;
        h.registerDefaultInstance(JamNearbyBroadcastTokenDetected.class, jamNearbyBroadcastTokenDetected);
    }

    private JamNearbyBroadcastTokenDetected() {
    }

    public static yy90 n() {
        return (yy90) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "token_", "discoveryMethod_"});
        }
        if (iOrdinal == 3) {
            return new JamNearbyBroadcastTokenDetected();
        }
        if (iOrdinal == 4) {
            return new yy90(DEFAULT_INSTANCE);
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
        synchronized (JamNearbyBroadcastTokenDetected.class) {
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
        this.discoveryMethod_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.token_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
