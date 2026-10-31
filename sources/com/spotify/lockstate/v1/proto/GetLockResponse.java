package com.spotify.lockstate.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.dt21;
import p.em40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class GetLockResponse extends h implements v2j0 {
    private static final GetLockResponse DEFAULT_INSTANCE;
    public static final int LOCK_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int RESOLUTION_FAILURE_REASON_FIELD_NUMBER = 2;
    private int bitField0_;
    private Lock lock_;
    private int resolutionFailureReason_;

    static {
        GetLockResponse getLockResponse = new GetLockResponse();
        DEFAULT_INSTANCE = getLockResponse;
        h.registerDefaultInstance(GetLockResponse.class, getLockResponse);
    }

    private GetLockResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "lock_", "resolutionFailureReason_"});
        }
        if (iOrdinal == 3) {
            return new GetLockResponse();
        }
        if (iOrdinal == 4) {
            return new em40(DEFAULT_INSTANCE, (byte) 27);
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
        synchronized (GetLockResponse.class) {
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

    public final Lock n() {
        Lock lock = this.lock_;
        return lock == null ? Lock.o() : lock;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final dt21 o() {
        dt21 dt21Var;
        int i = this.resolutionFailureReason_;
        if (i == 0) {
            dt21Var = dt21.RESOLUTION_FAILURE_REASON_UNSPECIFIED;
        } else if (i == 1) {
            dt21Var = dt21.RESOLUTION_FAILURE_REASON_ELIGIBILITY_TIMEOUT;
        } else if (i != 2) {
            dt21Var = i != 3 ? null : dt21.RESOLUTION_FAILURE_REASON_INTERNAL_ERROR;
        } else {
            dt21Var = dt21.RESOLUTION_FAILURE_REASON_CONTENT_RESOLUTION_FAILED;
        }
        return dt21Var == null ? dt21.UNRECOGNIZED : dt21Var;
    }

    public final boolean p() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean q() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
