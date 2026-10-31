package com.spotify.messages;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xfc;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ByomSessionEnded extends com.google.protobuf.h implements v2j0 {
    private static final ByomSessionEnded DEFAULT_INSTANCE;
    public static final int ELAPSED_MS_FIELD_NUMBER = 4;
    public static final int END_REASON_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 2;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private long elapsedMs_;
    private String sessionId_ = "";
    private String result_ = "";
    private String endReason_ = "";

    static {
        ByomSessionEnded byomSessionEnded = new ByomSessionEnded();
        DEFAULT_INSTANCE = byomSessionEnded;
        com.google.protobuf.h.registerDefaultInstance(ByomSessionEnded.class, byomSessionEnded);
    }

    private ByomSessionEnded() {
    }

    public static xfc n() {
        return (xfc) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"bitField0_", "sessionId_", "result_", "endReason_", "elapsedMs_"});
        }
        if (iOrdinal == 3) {
            return new ByomSessionEnded();
        }
        if (iOrdinal == 4) {
            return new xfc(DEFAULT_INSTANCE);
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
        synchronized (ByomSessionEnded.class) {
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
        this.bitField0_ |= 8;
        this.elapsedMs_ = j;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.endReason_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.result_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
