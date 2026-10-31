package com.spotify.reinventfree.topupeligibilityimpl.proto;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.h780;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class IsEligibleForTopUpResponse extends h implements v2j0 {
    private static final IsEligibleForTopUpResponse DEFAULT_INSTANCE;
    public static final int ELIGIBLE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int REFRESH_AT_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean eligible_;
    private Timestamp refreshAt_;

    static {
        IsEligibleForTopUpResponse isEligibleForTopUpResponse = new IsEligibleForTopUpResponse();
        DEFAULT_INSTANCE = isEligibleForTopUpResponse;
        h.registerDefaultInstance(IsEligibleForTopUpResponse.class, isEligibleForTopUpResponse);
    }

    private IsEligibleForTopUpResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002ဉ\u0000", new Object[]{"bitField0_", "eligible_", "refreshAt_"});
        }
        if (iOrdinal == 3) {
            return new IsEligibleForTopUpResponse();
        }
        if (iOrdinal == 4) {
            return new h780(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (IsEligibleForTopUpResponse.class) {
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

    public final boolean n() {
        return this.eligible_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Timestamp o() {
        Timestamp timestamp = this.refreshAt_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final boolean p() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
