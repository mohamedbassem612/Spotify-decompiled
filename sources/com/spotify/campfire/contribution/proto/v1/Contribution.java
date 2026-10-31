package com.spotify.campfire.contribution.proto.v1;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.dvm;
import p.h4m;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class Contribution extends h implements v2j0 {
    public static final int CHILD_SUMMARIES_FIELD_NUMBER = 8;
    public static final int CONTRIBUTION_REFERENCE_FIELD_NUMBER = 1;
    public static final int CREATED_AT_FIELD_NUMBER = 5;
    public static final int CREATOR_URI_FIELD_NUMBER = 4;
    private static final Contribution DEFAULT_INSTANCE;
    public static final int MODIFIED_AT_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int PAYLOAD_FIELD_NUMBER = 3;
    public static final int SOURCE_FIELD_NUMBER = 7;
    public static final int TARGET_FIELD_NUMBER = 2;
    private int bitField0_;
    private ChildSummaries childSummaries_;
    private ContributionReference contributionReference_;
    private Timestamp createdAt_;
    private String creatorUri_ = "";
    private Timestamp modifiedAt_;
    private ContributionPayload payload_;
    private int source_;
    private ContributionTarget target_;

    static {
        Contribution contribution = new Contribution();
        DEFAULT_INSTANCE = contribution;
        h.registerDefaultInstance(Contribution.class, contribution);
    }

    private Contribution() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Contribution q() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004Ȉ\u0005ဉ\u0003\u0006ဉ\u0004\u0007\f\bဉ\u0005", new Object[]{"bitField0_", "contributionReference_", "target_", "payload_", "creatorUri_", "createdAt_", "modifiedAt_", "source_", "childSummaries_"});
        }
        if (iOrdinal == 3) {
            return new Contribution();
        }
        if (iOrdinal == 4) {
            return new h4m(DEFAULT_INSTANCE, (byte) 11);
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
        synchronized (Contribution.class) {
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

    public final Timestamp getCreatedAt() {
        Timestamp timestamp = this.createdAt_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final Timestamp getModifiedAt() {
        Timestamp timestamp = this.modifiedAt_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final boolean hasCreatedAt() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean hasModifiedAt() {
        return (this.bitField0_ & 16) != 0;
    }

    public final ChildSummaries n() {
        ChildSummaries childSummaries = this.childSummaries_;
        return childSummaries == null ? ChildSummaries.o() : childSummaries;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ContributionReference o() {
        ContributionReference contributionReference = this.contributionReference_;
        return contributionReference == null ? ContributionReference.n() : contributionReference;
    }

    public final String p() {
        return this.creatorUri_;
    }

    public final ContributionPayload r() {
        ContributionPayload contributionPayload = this.payload_;
        return contributionPayload == null ? ContributionPayload.o() : contributionPayload;
    }

    public final dvm s() {
        dvm dvmVarA = dvm.a(this.source_);
        return dvmVarA == null ? dvm.UNRECOGNIZED : dvmVarA;
    }

    public final ContributionTarget t() {
        ContributionTarget contributionTarget = this.target_;
        return contributionTarget == null ? ContributionTarget.p() : contributionTarget;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 32) != 0;
    }
}
