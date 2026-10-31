package com.spotify.playlistreaction.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s3z0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ReactionListDisplay extends h implements v2j0 {
    public static final int CREATE_DATE_FIELD_NUMBER = 2;
    private static final ReactionListDisplay DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REACTION_UNICODE_FIELD_NUMBER = 1;
    public static final int USER_AUTHOR_METADATA_FIELD_NUMBER = 101;
    private Object authorMetadata_;
    private long createDate_;
    private int authorMetadataCase_ = 0;
    private String reactionUnicode_ = "";

    static {
        ReactionListDisplay reactionListDisplay = new ReactionListDisplay();
        DEFAULT_INSTANCE = reactionListDisplay;
        h.registerDefaultInstance(ReactionListDisplay.class, reactionListDisplay);
    }

    private ReactionListDisplay() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001e\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002e<\u0000", new Object[]{"authorMetadata_", "authorMetadataCase_", "reactionUnicode_", "createDate_", ReactionUserAuthorMetadata.class});
        }
        if (iOrdinal == 3) {
            return new ReactionListDisplay();
        }
        if (iOrdinal == 4) {
            return new s3z0(DEFAULT_INSTANCE, (byte) 19);
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
        synchronized (ReactionListDisplay.class) {
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

    public final long n() {
        return this.createDate_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.reactionUnicode_;
    }

    public final ReactionUserAuthorMetadata p() {
        return this.authorMetadataCase_ == 101 ? (ReactionUserAuthorMetadata) this.authorMetadata_ : ReactionUserAuthorMetadata.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
