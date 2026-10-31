package com.spotify.campfire.contribution.proto.v1;

import com.google.protobuf.h;
import p.bf40;
import p.ivm;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ContributionTarget extends h implements v2j0 {
    public static final int CONTEXTUAL_TARGET_FIELD_NUMBER = 2;
    public static final int CONTRIBUTION_TARGET_FIELD_NUMBER = 3;
    private static final ContributionTarget DEFAULT_INSTANCE;
    public static final int ENTITY_TARGET_FIELD_NUMBER = 1;
    public static final int LISTENING_ACTIVITY_TARGET_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER;
    private int targetCase_ = 0;
    private Object target_;

    static {
        ContributionTarget contributionTarget = new ContributionTarget();
        DEFAULT_INSTANCE = contributionTarget;
        h.registerDefaultInstance(ContributionTarget.class, contributionTarget);
    }

    private ContributionTarget() {
    }

    public static ContributionTarget p() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ivm t() {
        return (ivm) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"target_", "targetCase_", EntityTarget.class, ContextualTarget.class, ContributionReference.class, ListeningActivityTarget.class});
        }
        if (iOrdinal == 3) {
            return new ContributionTarget();
        }
        if (iOrdinal == 4) {
            return new ivm(DEFAULT_INSTANCE);
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
        synchronized (ContributionTarget.class) {
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

    public final ContextualTarget n() {
        return this.targetCase_ == 2 ? (ContextualTarget) this.target_ : ContextualTarget.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ContributionReference o() {
        return this.targetCase_ == 3 ? (ContributionReference) this.target_ : ContributionReference.n();
    }

    public final EntityTarget q() {
        return this.targetCase_ == 1 ? (EntityTarget) this.target_ : EntityTarget.n();
    }

    public final ListeningActivityTarget r() {
        return this.targetCase_ == 4 ? (ListeningActivityTarget) this.target_ : ListeningActivityTarget.o();
    }

    public final int s() {
        int i = this.targetCase_;
        if (i == 0) {
            return 5;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(ContextualTarget contextualTarget) {
        contextualTarget.getClass();
        this.target_ = contextualTarget;
        this.targetCase_ = 2;
    }

    public final void v(ContributionReference contributionReference) {
        contributionReference.getClass();
        this.target_ = contributionReference;
        this.targetCase_ = 3;
    }

    public final void w(EntityTarget entityTarget) {
        entityTarget.getClass();
        this.target_ = entityTarget;
        this.targetCase_ = 1;
    }

    public final void x(ListeningActivityTarget listeningActivityTarget) {
        listeningActivityTarget.getClass();
        this.target_ = listeningActivityTarget;
        this.targetCase_ = 4;
    }
}
