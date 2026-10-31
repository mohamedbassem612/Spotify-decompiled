package com.spotify.campfire.contribution.proto.v1;

import com.google.protobuf.h;
import p.a7t;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.r9t;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class DeleteContributionRequest extends h implements v2j0 {
    public static final int CONTRIBUTION_REFERENCE_FIELD_NUMBER = 1;
    private static final DeleteContributionRequest DEFAULT_INSTANCE;
    public static final int DELETION_POLICY_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private ContributionReference contributionReference_;
    private int deletionPolicy_;

    static {
        DeleteContributionRequest deleteContributionRequest = new DeleteContributionRequest();
        DEFAULT_INSTANCE = deleteContributionRequest;
        h.registerDefaultInstance(DeleteContributionRequest.class, deleteContributionRequest);
    }

    private DeleteContributionRequest() {
    }

    public static a7t n() {
        return (a7t) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "contributionReference_", "deletionPolicy_"});
        }
        if (iOrdinal == 3) {
            return new DeleteContributionRequest();
        }
        if (iOrdinal == 4) {
            return new a7t(DEFAULT_INSTANCE);
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
        synchronized (DeleteContributionRequest.class) {
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

    public final void o(ContributionReference contributionReference) {
        contributionReference.getClass();
        this.contributionReference_ = contributionReference;
        this.bitField0_ |= 1;
    }

    public final void p() {
        this.deletionPolicy_ = r9t.DELETION_POLICY_ALL.getNumber();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
