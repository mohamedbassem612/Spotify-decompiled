package com.spotify.clientrestrictions.v1;

import com.google.protobuf.Empty;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.u031;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class RestrictedIntegrationsResponse extends h implements v2j0 {
    public static final int CACHE_TTL_IN_SECONDS_FIELD_NUMBER = 2;
    private static final RestrictedIntegrationsResponse DEFAULT_INSTANCE;
    public static final int ETAG_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PAYLOAD_CACHED_FIELD_NUMBER = 4;
    public static final int PAYLOAD_UNCACHED_FIELD_NUMBER = 3;
    private long cacheTtlInSeconds_;
    private Object payload_;
    private int payloadCase_ = 0;
    private String etag_ = "";

    static {
        RestrictedIntegrationsResponse restrictedIntegrationsResponse = new RestrictedIntegrationsResponse();
        DEFAULT_INSTANCE = restrictedIntegrationsResponse;
        h.registerDefaultInstance(RestrictedIntegrationsResponse.class, restrictedIntegrationsResponse);
    }

    private RestrictedIntegrationsResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static RestrictedIntegrationsResponse r(byte[] bArr) {
        return (RestrictedIntegrationsResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003<\u0000\u0004<\u0000", new Object[]{"payload_", "payloadCase_", "etag_", "cacheTtlInSeconds_", RestrictedIntegrationsPayload.class, Empty.class});
        }
        if (iOrdinal == 3) {
            return new RestrictedIntegrationsResponse();
        }
        if (iOrdinal == 4) {
            return new u031(DEFAULT_INSTANCE);
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
        synchronized (RestrictedIntegrationsResponse.class) {
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

    public final long n() {
        return this.cacheTtlInSeconds_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.etag_;
    }

    public final RestrictedIntegrationsPayload p() {
        return this.payloadCase_ == 3 ? (RestrictedIntegrationsPayload) this.payload_ : RestrictedIntegrationsPayload.n();
    }

    public final boolean q() {
        return this.payloadCase_ == 3;
    }

    public final void s(long j) {
        this.cacheTtlInSeconds_ = j;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
