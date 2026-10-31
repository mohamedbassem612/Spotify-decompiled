package com.spotify.userinteractivityservice.usercomments.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.ghc0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ListRepliesResponse extends h implements v2j0 {
    private static final ListRepliesResponse DEFAULT_INSTANCE;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 3;
    public static final int NUMBER_OF_REPLIES_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int REPLIES_FIELD_NUMBER = 2;
    private int numberOfReplies_;
    private h290 replies_ = h.emptyProtobufList();
    private String nextPageToken_ = "";

    static {
        ListRepliesResponse listRepliesResponse = new ListRepliesResponse();
        DEFAULT_INSTANCE = listRepliesResponse;
        h.registerDefaultInstance(ListRepliesResponse.class, listRepliesResponse);
    }

    private ListRepliesResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002\u001b\u0003Ȉ", new Object[]{"numberOfReplies_", "replies_", Reply.class, "nextPageToken_"});
        }
        if (iOrdinal == 3) {
            return new ListRepliesResponse();
        }
        if (iOrdinal == 4) {
            return new ghc0(DEFAULT_INSTANCE, (byte) 23);
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
        synchronized (ListRepliesResponse.class) {
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

    public final String getNextPageToken() {
        return this.nextPageToken_;
    }

    public final int n() {
        return this.numberOfReplies_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.replies_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
