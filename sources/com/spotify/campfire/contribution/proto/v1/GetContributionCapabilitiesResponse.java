package com.spotify.campfire.contribution.proto.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vk40;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class GetContributionCapabilitiesResponse extends h implements v2j0 {
    public static final int CAPABILITIES_FIELD_NUMBER = 1;
    private static final GetContributionCapabilitiesResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int resultCase_ = 0;
    private Object result_;

    static {
        GetContributionCapabilitiesResponse getContributionCapabilitiesResponse = new GetContributionCapabilitiesResponse();
        DEFAULT_INSTANCE = getContributionCapabilitiesResponse;
        h.registerDefaultInstance(GetContributionCapabilitiesResponse.class, getContributionCapabilitiesResponse);
    }

    private GetContributionCapabilitiesResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"result_", "resultCase_", ContributionKindCapabilities.class, ErrorStatus.class});
        }
        if (iOrdinal == 3) {
            return new GetContributionCapabilitiesResponse();
        }
        if (iOrdinal == 4) {
            return new vk40(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (GetContributionCapabilitiesResponse.class) {
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

    public final boolean hasCapabilities() {
        return this.resultCase_ == 1;
    }

    public final ContributionKindCapabilities n() {
        return this.resultCase_ == 1 ? (ContributionKindCapabilities) this.result_ : ContributionKindCapabilities.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ErrorStatus o() {
        return this.resultCase_ == 2 ? (ErrorStatus) this.result_ : ErrorStatus.o();
    }

    public final boolean p() {
        return this.resultCase_ == 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
