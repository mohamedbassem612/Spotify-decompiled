package com.spotify.voting.proto.v2;

import com.google.protobuf.h;
import p.bf40;
import p.ir40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class GetVotingResultsPageResponse extends h implements v2j0 {
    public static final int APP_VERSION_NOT_SUPPORTED_FIELD_NUMBER = 2;
    private static final GetVotingResultsPageResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RESULTS_PAGE_FIELD_NUMBER = 1;
    private int responseCase_ = 0;
    private Object response_;

    static {
        GetVotingResultsPageResponse getVotingResultsPageResponse = new GetVotingResultsPageResponse();
        DEFAULT_INSTANCE = getVotingResultsPageResponse;
        h.registerDefaultInstance(GetVotingResultsPageResponse.class, getVotingResultsPageResponse);
    }

    private GetVotingResultsPageResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"response_", "responseCase_", VotingResultsPage.class, AppVersionNotSupported.class});
        }
        if (iOrdinal == 3) {
            return new GetVotingResultsPageResponse();
        }
        if (iOrdinal == 4) {
            return new ir40(DEFAULT_INSTANCE, (byte) 6);
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
        synchronized (GetVotingResultsPageResponse.class) {
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

    public final AppVersionNotSupported n() {
        return this.responseCase_ == 2 ? (AppVersionNotSupported) this.response_ : AppVersionNotSupported.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        int i = this.responseCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public final VotingResultsPage p() {
        return this.responseCase_ == 1 ? (VotingResultsPage) this.response_ : VotingResultsPage.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
