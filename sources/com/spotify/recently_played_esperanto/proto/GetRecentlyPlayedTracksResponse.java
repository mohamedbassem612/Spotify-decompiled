package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.lp40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class GetRecentlyPlayedTracksResponse extends h implements v2j0 {
    private static final GetRecentlyPlayedTracksResponse DEFAULT_INSTANCE;
    public static final int ENTITY_FIELD_NUMBER = 1;
    public static final int ERROR_FIELD_NUMBER = 7;
    public static final int LOADED_FIELD_NUMBER = 3;
    public static final int MISSING_METADATA_COUNT_FIELD_NUMBER = 2;
    public static final int ORIGINAL_LENGTH_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 6;
    public static final int UNFILTERED_LENGTH_FIELD_NUMBER = 5;
    private h290 entity_ = h.emptyProtobufList();
    private String error_ = "";
    private boolean loaded_;
    private int missingMetadataCount_;
    private int originalLength_;
    private int status_;
    private int unfilteredLength_;

    static {
        GetRecentlyPlayedTracksResponse getRecentlyPlayedTracksResponse = new GetRecentlyPlayedTracksResponse();
        DEFAULT_INSTANCE = getRecentlyPlayedTracksResponse;
        h.registerDefaultInstance(GetRecentlyPlayedTracksResponse.class, getRecentlyPlayedTracksResponse);
    }

    private GetRecentlyPlayedTracksResponse() {
    }

    public static lp40 p() {
        return (lp40) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static GetRecentlyPlayedTracksResponse q(byte[] bArr) {
        return (GetRecentlyPlayedTracksResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002\u000b\u0003\u0007\u0004\u000b\u0005\u000b\u0006\u000b\u0007Ȉ", new Object[]{"entity_", RecentlyPlayedEntity.class, "missingMetadataCount_", "loaded_", "originalLength_", "unfilteredLength_", "status_", "error_"});
        }
        if (iOrdinal == 3) {
            return new GetRecentlyPlayedTracksResponse();
        }
        if (iOrdinal == 4) {
            return new lp40(DEFAULT_INSTANCE);
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
        synchronized (GetRecentlyPlayedTracksResponse.class) {
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
        return this.entity_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.status_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
