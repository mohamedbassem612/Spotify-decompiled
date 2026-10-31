package com.spotify.libraryimportservice.tmm;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.io40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class GetMatchReviewResponse extends h implements v2j0 {
    private static final GetMatchReviewResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TRANSFER_IDS_FIELD_NUMBER = 2;
    public static final int UNMATCHED_ITEMS_FIELD_NUMBER = 1;
    private h290 unmatchedItems_ = h.emptyProtobufList();
    private h290 transferIds_ = h.emptyProtobufList();

    static {
        GetMatchReviewResponse getMatchReviewResponse = new GetMatchReviewResponse();
        DEFAULT_INSTANCE = getMatchReviewResponse;
        h.registerDefaultInstance(GetMatchReviewResponse.class, getMatchReviewResponse);
    }

    private GetMatchReviewResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002Ț", new Object[]{"unmatchedItems_", UnmatchedItem.class, "transferIds_"});
        }
        if (iOrdinal == 3) {
            return new GetMatchReviewResponse();
        }
        if (iOrdinal == 4) {
            return new io40(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (GetMatchReviewResponse.class) {
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

    public final h290 n() {
        return this.transferIds_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.unmatchedItems_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
