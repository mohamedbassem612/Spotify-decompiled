package com.spotify.campfire.contribution.proto.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.kum;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ContributionPayload extends h implements v2j0 {
    public static final int COMMENT_FIELD_NUMBER = 2;
    private static final ContributionPayload DEFAULT_INSTANCE;
    public static final int NOTE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int REACTION_FIELD_NUMBER = 3;
    private int payloadCase_ = 0;
    private Object payload_;

    static {
        ContributionPayload contributionPayload = new ContributionPayload();
        DEFAULT_INSTANCE = contributionPayload;
        h.registerDefaultInstance(ContributionPayload.class, contributionPayload);
    }

    private ContributionPayload() {
    }

    public static ContributionPayload o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static kum s() {
        return (kum) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"payload_", "payloadCase_", NotePayload.class, CommentPayload.class, ReactionPayload.class});
        }
        if (iOrdinal == 3) {
            return new ContributionPayload();
        }
        if (iOrdinal == 4) {
            return new kum(DEFAULT_INSTANCE);
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
        synchronized (ContributionPayload.class) {
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

    public final CommentPayload n() {
        return this.payloadCase_ == 2 ? (CommentPayload) this.payload_ : CommentPayload.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final NotePayload p() {
        return this.payloadCase_ == 1 ? (NotePayload) this.payload_ : NotePayload.n();
    }

    public final int q() {
        int i = this.payloadCase_;
        if (i == 0) {
            return 4;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }

    public final ReactionPayload r() {
        return this.payloadCase_ == 3 ? (ReactionPayload) this.payload_ : ReactionPayload.n();
    }

    public final void t(CommentPayload commentPayload) {
        commentPayload.getClass();
        this.payload_ = commentPayload;
        this.payloadCase_ = 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(NotePayload notePayload) {
        notePayload.getClass();
        this.payload_ = notePayload;
        this.payloadCase_ = 1;
    }

    public final void v(ReactionPayload reactionPayload) {
        reactionPayload.getClass();
        this.payload_ = reactionPayload;
        this.payloadCase_ = 3;
    }
}
