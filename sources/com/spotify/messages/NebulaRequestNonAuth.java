package com.spotify.messages;

import p.bf40;
import p.h5o0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class NebulaRequestNonAuth extends com.google.protobuf.h implements v2j0 {
    private static final NebulaRequestNonAuth DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 5;
    public static final int ERROR_REASON_FIELD_NUMBER = 4;
    public static final int FETCHED_REASON_FIELD_NUMBER = 6;
    public static final int LATENCY_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PAYLOAD_SIZE_FIELD_NUMBER = 2;
    public static final int PLATFORM_FIELD_NUMBER = 7;
    public static final int STATUS_CODE_FIELD_NUMBER = 3;
    private int bitField0_;
    private long latency_;
    private long payloadSize_;
    private int statusCode_;
    private String errorReason_ = "";
    private String errorMessage_ = "";
    private String fetchedReason_ = "";
    private String platform_ = "";

    static {
        NebulaRequestNonAuth nebulaRequestNonAuth = new NebulaRequestNonAuth();
        DEFAULT_INSTANCE = nebulaRequestNonAuth;
        com.google.protobuf.h.registerDefaultInstance(NebulaRequestNonAuth.class, nebulaRequestNonAuth);
    }

    private NebulaRequestNonAuth() {
    }

    public static h5o0 n() {
        return (h5o0) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"bitField0_", "latency_", "payloadSize_", "statusCode_", "errorReason_", "errorMessage_", "fetchedReason_", "platform_"});
        }
        if (iOrdinal == 3) {
            return new NebulaRequestNonAuth();
        }
        if (iOrdinal == 4) {
            return new h5o0(DEFAULT_INSTANCE);
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
        synchronized (NebulaRequestNonAuth.class) {
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
        this.bitField0_ |= 16;
        this.errorMessage_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 8;
        this.errorReason_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 32;
        this.fetchedReason_ = str;
    }

    public final void r(long j) {
        this.bitField0_ |= 1;
        this.latency_ = j;
    }

    public final void s(long j) {
        this.bitField0_ |= 2;
        this.payloadSize_ = j;
    }

    public final void t() {
        this.bitField0_ |= 64;
        this.platform_ = "android";
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(int i) {
        this.bitField0_ |= 4;
        this.statusCode_ = i;
    }
}
