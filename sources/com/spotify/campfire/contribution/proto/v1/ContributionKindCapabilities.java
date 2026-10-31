package com.spotify.campfire.contribution.proto.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h4m;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ContributionKindCapabilities extends h implements v2j0 {
    public static final int COMMENTS_FIELD_NUMBER = 3;
    private static final ContributionKindCapabilities DEFAULT_INSTANCE;
    public static final int NOTES_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int REACTIONS_FIELD_NUMBER = 2;
    private int bitField0_;
    private ContributionCapabilities comments_;
    private ContributionCapabilities notes_;
    private ContributionCapabilities reactions_;

    static {
        ContributionKindCapabilities contributionKindCapabilities = new ContributionKindCapabilities();
        DEFAULT_INSTANCE = contributionKindCapabilities;
        h.registerDefaultInstance(ContributionKindCapabilities.class, contributionKindCapabilities);
    }

    private ContributionKindCapabilities() {
    }

    public static ContributionKindCapabilities o() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "notes_", "reactions_", "comments_"});
        }
        if (iOrdinal == 3) {
            return new ContributionKindCapabilities();
        }
        if (iOrdinal == 4) {
            return new h4m(DEFAULT_INSTANCE, (byte) 13);
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
        synchronized (ContributionKindCapabilities.class) {
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

    public final ContributionCapabilities n() {
        ContributionCapabilities contributionCapabilities = this.comments_;
        return contributionCapabilities == null ? ContributionCapabilities.s() : contributionCapabilities;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ContributionCapabilities p() {
        ContributionCapabilities contributionCapabilities = this.notes_;
        return contributionCapabilities == null ? ContributionCapabilities.s() : contributionCapabilities;
    }

    public final ContributionCapabilities q() {
        ContributionCapabilities contributionCapabilities = this.reactions_;
        return contributionCapabilities == null ? ContributionCapabilities.s() : contributionCapabilities;
    }

    public final boolean r() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean s() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
