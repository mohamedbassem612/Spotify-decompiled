package com.spotify.campfire.contribution.proto.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s3z0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ReactionChildSummary extends h implements v2j0 {
    private static final ReactionChildSummary DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REACTION_COUNTS_FIELD_NUMBER = 2;
    public static final int SUMMARY_FIELD_NUMBER = 1;
    public static final int VIEWER_REACTIONS_FIELD_NUMBER = 3;
    private int bitField0_;
    private ChildSummary summary_;
    private h290 reactionCounts_ = h.emptyProtobufList();
    private h290 viewerReactions_ = h.emptyProtobufList();

    static {
        ReactionChildSummary reactionChildSummary = new ReactionChildSummary();
        DEFAULT_INSTANCE = reactionChildSummary;
        h.registerDefaultInstance(ReactionChildSummary.class, reactionChildSummary);
    }

    private ReactionChildSummary() {
    }

    public static ReactionChildSummary n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b", new Object[]{"bitField0_", "summary_", "reactionCounts_", ReactionCount.class, "viewerReactions_", Contribution.class});
        }
        if (iOrdinal == 3) {
            return new ReactionChildSummary();
        }
        if (iOrdinal == 4) {
            return new s3z0(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (ReactionChildSummary.class) {
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

    public final h290 o() {
        return this.reactionCounts_;
    }

    public final ChildSummary p() {
        ChildSummary childSummary = this.summary_;
        return childSummary == null ? ChildSummary.o() : childSummary;
    }

    public final h290 q() {
        return this.viewerReactions_;
    }

    public final boolean r() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
