package com.spotify.messages;

import com.google.protobuf.h;
import p.bf40;
import p.d7h1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class UbiExpr1Heartbeat extends h implements v2j0 {
    private static final UbiExpr1Heartbeat DEFAULT_INSTANCE;
    public static final int HEARTBEAT_INTERVAL_FIELD_NUMBER = 3;
    public static final int HEARTBEAT_START_TIMESTAMP_FIELD_NUMBER = 2;
    public static final int PAGE_INSTANCE_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private long heartbeatInterval_;
    private long heartbeatStartTimestamp_;
    private String pageInstanceId_ = "";

    static {
        UbiExpr1Heartbeat ubiExpr1Heartbeat = new UbiExpr1Heartbeat();
        DEFAULT_INSTANCE = ubiExpr1Heartbeat;
        h.registerDefaultInstance(UbiExpr1Heartbeat.class, ubiExpr1Heartbeat);
    }

    private UbiExpr1Heartbeat() {
    }

    public static d7h1 n() {
        return (d7h1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "pageInstanceId_", "heartbeatStartTimestamp_", "heartbeatInterval_"});
        }
        if (iOrdinal == 3) {
            return new UbiExpr1Heartbeat();
        }
        if (iOrdinal == 4) {
            return new d7h1(DEFAULT_INSTANCE);
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
        synchronized (UbiExpr1Heartbeat.class) {
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

    public final void o(long j) {
        this.bitField0_ |= 4;
        this.heartbeatInterval_ = j;
    }

    public final void p(long j) {
        this.bitField0_ |= 2;
        this.heartbeatStartTimestamp_ = j;
    }

    public final void q(String str) {
        this.bitField0_ |= 1;
        this.pageInstanceId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
