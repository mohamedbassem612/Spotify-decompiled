package com.spotify.userinteractivityservice.usercomments.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.dg21;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Reply extends h implements v2j0 {
    public static final int COMMENT_URI_FIELD_NUMBER = 1;
    public static final int CREATE_DATE_FIELD_NUMBER = 2;
    private static final Reply DEFAULT_INSTANCE;
    public static final int IS_PENDING_REVIEW_FIELD_NUMBER = 7;
    public static final int IS_SENSITIVE_FIELD_NUMBER = 8;
    private static volatile qzr0 PARSER = null;
    public static final int REACTIONS_ROW_FIELD_NUMBER = 6;
    public static final int REPLY_STR_FIELD_NUMBER = 3;
    public static final int SHOW_AUTHOR_METADATA_FIELD_NUMBER = 5;
    public static final int TIMESTAMPS_FIELD_NUMBER = 9;
    public static final int USER_AUTHOR_METADATA_FIELD_NUMBER = 4;
    private Object authorMetadata_;
    private int bitField0_;
    private long createDate_;
    private boolean isPendingReview_;
    private boolean isSensitive_;
    private ReactionsRow reactionsRow_;
    private int authorMetadataCase_ = 0;
    private String commentUri_ = "";
    private String replyStr_ = "";
    private h290 timestamps_ = h.emptyProtobufList();

    static {
        Reply reply = new Reply();
        DEFAULT_INSTANCE = reply;
        h.registerDefaultInstance(Reply.class, reply);
    }

    private Reply() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Reply q() {
        return DEFAULT_INSTANCE;
    }

    public static dg21 y() {
        return (dg21) DEFAULT_INSTANCE.createBuilder();
    }

    public final void A(long j) {
        this.createDate_ = j;
    }

    public final void B() {
        this.isPendingReview_ = true;
    }

    public final void C(ReactionsRow reactionsRow) {
        this.reactionsRow_ = reactionsRow;
        this.bitField0_ |= 1;
    }

    public final void D(String str) {
        str.getClass();
        this.replyStr_ = str;
    }

    public final void E(UserAuthorMetadata userAuthorMetadata) {
        userAuthorMetadata.getClass();
        this.authorMetadata_ = userAuthorMetadata;
        this.authorMetadataCase_ = 4;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0001\u0001\t\t\u0000\u0001\u0000\u0001Ȉ\u0002\u0002\u0003Ȉ\u0004<\u0000\u0005<\u0000\u0006ဉ\u0000\u0007\u0007\b\u0007\t\u001b", new Object[]{"authorMetadata_", "authorMetadataCase_", "bitField0_", "commentUri_", "createDate_", "replyStr_", UserAuthorMetadata.class, ShowAuthorMetadata.class, "reactionsRow_", "isPendingReview_", "isSensitive_", "timestamps_", Timestamp.class});
        }
        if (iOrdinal == 3) {
            return new Reply();
        }
        if (iOrdinal == 4) {
            return new dg21(DEFAULT_INSTANCE);
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
        synchronized (Reply.class) {
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

    public final int n() {
        int i = this.authorMetadataCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 4) {
            return i != 5 ? 0 : 2;
        }
        return 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.commentUri_;
    }

    public final long p() {
        return this.createDate_;
    }

    public final boolean r() {
        return this.isPendingReview_;
    }

    public final boolean s() {
        return this.isSensitive_;
    }

    public final ReactionsRow t() {
        ReactionsRow reactionsRow = this.reactionsRow_;
        return reactionsRow == null ? ReactionsRow.n() : reactionsRow;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.replyStr_;
    }

    public final ShowAuthorMetadata v() {
        return this.authorMetadataCase_ == 5 ? (ShowAuthorMetadata) this.authorMetadata_ : ShowAuthorMetadata.n();
    }

    public final h290 w() {
        return this.timestamps_;
    }

    public final UserAuthorMetadata x() {
        return this.authorMetadataCase_ == 4 ? (UserAuthorMetadata) this.authorMetadata_ : UserAuthorMetadata.n();
    }

    public final void z(String str) {
        this.commentUri_ = str;
    }
}
