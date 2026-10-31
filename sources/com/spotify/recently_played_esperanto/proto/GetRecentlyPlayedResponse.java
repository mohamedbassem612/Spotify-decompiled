package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.io40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class GetRecentlyPlayedResponse extends h implements v2j0 {
    public static final int CONTEXT_FIELD_NUMBER = 1;
    private static final GetRecentlyPlayedResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 4;
    public static final int LOADED_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 3;
    private h290 context_ = h.emptyProtobufList();
    private String error_ = "";
    private boolean loaded_;
    private int status_;

    static {
        GetRecentlyPlayedResponse getRecentlyPlayedResponse = new GetRecentlyPlayedResponse();
        DEFAULT_INSTANCE = getRecentlyPlayedResponse;
        h.registerDefaultInstance(GetRecentlyPlayedResponse.class, getRecentlyPlayedResponse);
    }

    private GetRecentlyPlayedResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static GetRecentlyPlayedResponse q(byte[] bArr) {
        return (GetRecentlyPlayedResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002\u0007\u0003\u000b\u0004Ȉ", new Object[]{"context_", RecentlyPlayedContext.class, "loaded_", "status_", "error_"});
        }
        if (iOrdinal == 3) {
            return new GetRecentlyPlayedResponse();
        }
        if (iOrdinal == 4) {
            return new io40(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (GetRecentlyPlayedResponse.class) {
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
        return this.context_.size();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.context_;
    }

    public final boolean p() {
        return this.loaded_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
