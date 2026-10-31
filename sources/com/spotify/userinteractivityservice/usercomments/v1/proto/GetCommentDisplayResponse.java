package com.spotify.userinteractivityservice.usercomments.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.tuw;
import p.v2j0;
import p.vk40;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class GetCommentDisplayResponse extends h implements v2j0 {
    public static final int COMMENT_FIELD_NUMBER = 1;
    private static final GetCommentDisplayResponse DEFAULT_INSTANCE;
    public static final int ELIGIBILITY_STATUS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int REPLY_FIELD_NUMBER = 3;
    private int bitField0_;
    private Comment comment_;
    private int eligibilityStatus_;
    private Reply reply_;

    static {
        GetCommentDisplayResponse getCommentDisplayResponse = new GetCommentDisplayResponse();
        DEFAULT_INSTANCE = getCommentDisplayResponse;
        h.registerDefaultInstance(GetCommentDisplayResponse.class, getCommentDisplayResponse);
    }

    private GetCommentDisplayResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001", new Object[]{"bitField0_", "comment_", "eligibilityStatus_", "reply_"});
        }
        if (iOrdinal == 3) {
            return new GetCommentDisplayResponse();
        }
        if (iOrdinal == 4) {
            return new vk40(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (GetCommentDisplayResponse.class) {
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

    public final Comment n() {
        Comment comment = this.comment_;
        return comment == null ? Comment.u() : comment;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final tuw o() {
        tuw tuwVarA = tuw.a(this.eligibilityStatus_);
        return tuwVarA == null ? tuw.h : tuwVarA;
    }

    public final Reply p() {
        Reply reply = this.reply_;
        return reply == null ? Reply.q() : reply;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
