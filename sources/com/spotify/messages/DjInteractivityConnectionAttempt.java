package com.spotify.messages;

import p.anu;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class DjInteractivityConnectionAttempt extends com.google.protobuf.h implements v2j0 {
    public static final int CONNECTION_ID_FIELD_NUMBER = 1;
    public static final int CONNECTION_RESULT_FIELD_NUMBER = 4;
    private static final DjInteractivityConnectionAttempt DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_CODE_FIELD_NUMBER = 5;
    public static final int TIMESTAMP_CONNECTION_INITIATED_FIELD_NUMBER = 2;
    public static final int TIMESTAMP_CONNECTION_RESOLVED_FIELD_NUMBER = 3;
    private int bitField0_;
    private String connectionId_ = "";
    private String connectionResult_ = "";
    private String details_ = "";
    private int statusCode_;
    private long timestampConnectionInitiated_;
    private long timestampConnectionResolved_;

    static {
        DjInteractivityConnectionAttempt djInteractivityConnectionAttempt = new DjInteractivityConnectionAttempt();
        DEFAULT_INSTANCE = djInteractivityConnectionAttempt;
        com.google.protobuf.h.registerDefaultInstance(DjInteractivityConnectionAttempt.class, djInteractivityConnectionAttempt);
    }

    private DjInteractivityConnectionAttempt() {
    }

    public static anu n() {
        return (anu) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "connectionId_", "timestampConnectionInitiated_", "timestampConnectionResolved_", "connectionResult_", "statusCode_", "details_"});
        }
        if (iOrdinal == 3) {
            return new DjInteractivityConnectionAttempt();
        }
        if (iOrdinal == 4) {
            return new anu(DEFAULT_INSTANCE);
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
        synchronized (DjInteractivityConnectionAttempt.class) {
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
        this.bitField0_ |= 1;
        this.connectionId_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.connectionResult_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.details_ = str;
    }

    public final void r(int i) {
        this.bitField0_ |= 16;
        this.statusCode_ = i;
    }

    public final void s(long j) {
        this.bitField0_ |= 2;
        this.timestampConnectionInitiated_ = j;
    }

    public final void t(long j) {
        this.bitField0_ |= 4;
        this.timestampConnectionResolved_ = j;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
