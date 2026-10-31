package com.spotify.userinteractivityservice.usercomments.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.neh;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Comment extends h implements v2j0 {
    public static final int COMMENT_STR_FIELD_NUMBER = 3;
    public static final int COMMENT_URI_FIELD_NUMBER = 1;
    public static final int COVER_IMAGE_URLS_REACTED_FIELD_NUMBER = 6;
    public static final int COVER_IMAGE_URLS_REPLIED_FIELD_NUMBER = 7;
    public static final int CREATE_DATE_FIELD_NUMBER = 2;
    private static final Comment DEFAULT_INSTANCE;
    public static final int HAS_USER_REACHED_REPLY_LIMIT_FIELD_NUMBER = 15;
    public static final int IS_PENDING_REVIEW_FIELD_NUMBER = 10;
    public static final int IS_PINNED_FIELD_NUMBER = 16;
    public static final int IS_SENSITIVE_FIELD_NUMBER = 11;
    public static final int NUMBER_OF_REACTIONS_FIELD_NUMBER = 8;
    public static final int NUMBER_OF_REPLIES_FIELD_NUMBER = 9;
    public static final int NUMBER_OF_REPLIES_WITH_THREADS_FIELD_NUMBER = 14;
    private static volatile qzr0 PARSER = null;
    public static final int REACTIONS_ROW_FIELD_NUMBER = 12;
    public static final int SHOW_AUTHOR_METADATA_FIELD_NUMBER = 5;
    public static final int TIMESTAMPS_FIELD_NUMBER = 17;
    public static final int TOP_REPLIES_AUTHOR_METADATA_FIELD_NUMBER = 13;
    public static final int USER_AUTHOR_METADATA_FIELD_NUMBER = 4;
    private Object authorMetadata_;
    private int bitField0_;
    private long createDate_;
    private boolean hasUserReachedReplyLimit_;
    private boolean isPendingReview_;
    private boolean isPinned_;
    private boolean isSensitive_;
    private int numberOfReactions_;
    private int numberOfRepliesWithThreads_;
    private int numberOfReplies_;
    private ReactionsRow reactionsRow_;
    private int authorMetadataCase_ = 0;
    private String commentUri_ = "";
    private String commentStr_ = "";
    private h290 coverImageUrlsReacted_ = h.emptyProtobufList();
    private h290 coverImageUrlsReplied_ = h.emptyProtobufList();
    private h290 topRepliesAuthorMetadata_ = h.emptyProtobufList();
    private h290 timestamps_ = h.emptyProtobufList();

    static {
        Comment comment = new Comment();
        DEFAULT_INSTANCE = comment;
        h.registerDefaultInstance(Comment.class, comment);
    }

    private Comment() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Comment u() {
        return DEFAULT_INSTANCE;
    }

    public final ReactionsRow A() {
        ReactionsRow reactionsRow = this.reactionsRow_;
        return reactionsRow == null ? ReactionsRow.n() : reactionsRow;
    }

    public final ShowAuthorMetadata B() {
        return this.authorMetadataCase_ == 5 ? (ShowAuthorMetadata) this.authorMetadata_ : ShowAuthorMetadata.n();
    }

    public final h290 C() {
        return this.timestamps_;
    }

    public final h290 D() {
        return this.topRepliesAuthorMetadata_;
    }

    public final UserAuthorMetadata E() {
        return this.authorMetadataCase_ == 4 ? (UserAuthorMetadata) this.authorMetadata_ : UserAuthorMetadata.n();
    }

    public final void F(boolean z) {
        this.hasUserReachedReplyLimit_ = z;
    }

    public final void G(int i) {
        this.numberOfRepliesWithThreads_ = i;
    }

    public final void H(ReactionsRow reactionsRow) {
        this.reactionsRow_ = reactionsRow;
        this.bitField0_ |= 1;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0001\u0001\u0001\u0011\u0011\u0000\u0004\u0000\u0001Ȉ\u0002\u0002\u0003Ȉ\u0004<\u0000\u0005<\u0000\u0006Ț\u0007Ț\b\u0004\t\u0004\n\u0007\u000b\u0007\fဉ\u0000\r\u001b\u000e\u0004\u000f\u0007\u0010\u0007\u0011\u001b", new Object[]{"authorMetadata_", "authorMetadataCase_", "bitField0_", "commentUri_", "createDate_", "commentStr_", UserAuthorMetadata.class, ShowAuthorMetadata.class, "coverImageUrlsReacted_", "coverImageUrlsReplied_", "numberOfReactions_", "numberOfReplies_", "isPendingReview_", "isSensitive_", "reactionsRow_", "topRepliesAuthorMetadata_", AuthorMetadata.class, "numberOfRepliesWithThreads_", "hasUserReachedReplyLimit_", "isPinned_", "timestamps_", Timestamp.class});
        }
        if (iOrdinal == 3) {
            return new Comment();
        }
        if (iOrdinal == 4) {
            return new neh(DEFAULT_INSTANCE);
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
        synchronized (Comment.class) {
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

    public final void n(Iterable iterable) {
        h290 h290VarMutableCopy = this.topRepliesAuthorMetadata_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.topRepliesAuthorMetadata_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o() {
        this.topRepliesAuthorMetadata_ = h.emptyProtobufList();
    }

    public final int p() {
        int i = this.authorMetadataCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 4) {
            return i != 5 ? 0 : 2;
        }
        return 1;
    }

    public final String q() {
        return this.commentStr_;
    }

    public final String r() {
        return this.commentUri_;
    }

    public final h290 s() {
        return this.coverImageUrlsReacted_;
    }

    public final long t() {
        return this.createDate_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean v() {
        return this.hasUserReachedReplyLimit_;
    }

    public final boolean w() {
        return this.isPendingReview_;
    }

    public final boolean x() {
        return this.isPinned_;
    }

    public final boolean y() {
        return this.isSensitive_;
    }

    public final int z() {
        return this.numberOfRepliesWithThreads_;
    }
}
