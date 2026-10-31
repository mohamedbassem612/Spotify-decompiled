package com.spotify.userinteractivityservice.usercomments.v1.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.ql40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.tuw;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class GetCommentCardResponse extends h implements v2j0 {
    private static final GetCommentCardResponse DEFAULT_INSTANCE;
    public static final int ELIGIBILITY_STATUS_FIELD_NUMBER = 1;
    public static final int NUMBER_OF_COMMENTS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TOP_COMMENTS_FIELD_NUMBER = 3;
    private int eligibilityStatus_;
    private int numberOfComments_;
    private h290 topComments_ = h.emptyProtobufList();

    static {
        GetCommentCardResponse getCommentCardResponse = new GetCommentCardResponse();
        DEFAULT_INSTANCE = getCommentCardResponse;
        h.registerDefaultInstance(GetCommentCardResponse.class, getCommentCardResponse);
    }

    private GetCommentCardResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002\u0004\u0003\u001b", new Object[]{"eligibilityStatus_", "numberOfComments_", "topComments_", Comment.class});
        }
        if (iOrdinal == 3) {
            return new GetCommentCardResponse();
        }
        if (iOrdinal == 4) {
            return new ql40();
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
        synchronized (GetCommentCardResponse.class) {
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

    public final void o(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.topComments_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.topComments_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final void p() {
        this.topComments_ = h.emptyProtobufList();
    }

    public final tuw q() {
        tuw tuwVarA = tuw.a(this.eligibilityStatus_);
        return tuwVarA == null ? tuw.h : tuwVarA;
    }

    public final int r() {
        return this.numberOfComments_;
    }

    public final int s() {
        return this.topComments_.size();
    }

    public final h290 t() {
        return this.topComments_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
