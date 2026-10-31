package com.spotify.campfire.contribution.proto.v1;

import com.google.protobuf.h;
import p.am40;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class GetContributionSummaryRequest extends h implements v2j0 {
    private static final GetContributionSummaryRequest DEFAULT_INSTANCE;
    public static final int MAX_HIGHLIGHTS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TARGET_FIELD_NUMBER = 1;
    private int bitField0_;
    private int maxHighlights_;
    private ContributionTarget target_;

    static {
        GetContributionSummaryRequest getContributionSummaryRequest = new GetContributionSummaryRequest();
        DEFAULT_INSTANCE = getContributionSummaryRequest;
        h.registerDefaultInstance(GetContributionSummaryRequest.class, getContributionSummaryRequest);
    }

    private GetContributionSummaryRequest() {
    }

    public static am40 n() {
        return (am40) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"bitField0_", "target_", "maxHighlights_"});
        }
        if (iOrdinal == 3) {
            return new GetContributionSummaryRequest();
        }
        if (iOrdinal == 4) {
            return new am40(DEFAULT_INSTANCE);
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
        synchronized (GetContributionSummaryRequest.class) {
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

    public final void o(int i) {
        this.bitField0_ |= 2;
        this.maxHighlights_ = i;
    }

    public final void p(ContributionTarget contributionTarget) {
        this.target_ = contributionTarget;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
