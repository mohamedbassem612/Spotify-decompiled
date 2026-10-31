package com.spotify.kidsrequest.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.io40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class GetPendingRequestsResponse extends h implements v2j0 {
    public static final int CHILD_DISPLAY_NAME_FIELD_NUMBER = 1;
    private static final GetPendingRequestsResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REQUESTS_FIELD_NUMBER = 2;
    private String childDisplayName_ = "";
    private h290 requests_ = h.emptyProtobufList();

    static {
        GetPendingRequestsResponse getPendingRequestsResponse = new GetPendingRequestsResponse();
        DEFAULT_INSTANCE = getPendingRequestsResponse;
        h.registerDefaultInstance(GetPendingRequestsResponse.class, getPendingRequestsResponse);
    }

    private GetPendingRequestsResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"childDisplayName_", "requests_", PendingAllowlistRequest.class});
        }
        if (iOrdinal == 3) {
            return new GetPendingRequestsResponse();
        }
        if (iOrdinal == 4) {
            return new io40(DEFAULT_INSTANCE, (byte) 11);
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
        synchronized (GetPendingRequestsResponse.class) {
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

    public final String n() {
        return this.childDisplayName_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.requests_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
