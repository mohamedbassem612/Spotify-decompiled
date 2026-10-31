package com.spotify.campfire.contribution.proto.v1;

import com.google.protobuf.h;
import p.bf40;
import p.hhe;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ChildSummaries extends h implements v2j0 {
    public static final int COMMENTS_FIELD_NUMBER = 1;
    private static final ChildSummaries DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REACTIONS_FIELD_NUMBER = 2;
    private int bitField0_;
    private CommentChildSummary comments_;
    private ReactionChildSummary reactions_;

    static {
        ChildSummaries childSummaries = new ChildSummaries();
        DEFAULT_INSTANCE = childSummaries;
        h.registerDefaultInstance(ChildSummaries.class, childSummaries);
    }

    private ChildSummaries() {
    }

    public static ChildSummaries o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "comments_", "reactions_"});
        }
        if (iOrdinal == 3) {
            return new ChildSummaries();
        }
        if (iOrdinal == 4) {
            return new hhe(DEFAULT_INSTANCE, (byte) 21);
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
        synchronized (ChildSummaries.class) {
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

    public final CommentChildSummary n() {
        CommentChildSummary commentChildSummary = this.comments_;
        return commentChildSummary == null ? CommentChildSummary.n() : commentChildSummary;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ReactionChildSummary p() {
        ReactionChildSummary reactionChildSummary = this.reactions_;
        return reactionChildSummary == null ? ReactionChildSummary.n() : reactionChildSummary;
    }

    public final boolean q() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean r() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
