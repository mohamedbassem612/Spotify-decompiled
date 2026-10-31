package com.spotify.p4p.ucp.seedsearch.v1;

import com.google.protobuf.h;
import p.b290;
import p.bf40;
import p.c290;
import p.er80;
import p.i9;
import p.jf40;
import p.jma;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.ul51;
import p.up40;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class GetSeedSearchResultsRequest extends h implements v2j0 {
    private static final GetSeedSearchResultsRequest DEFAULT_INSTANCE;
    public static final int ENTITY_TYPES_FIELD_NUMBER = 2;
    public static final int MAX_RESULTS_FIELD_NUMBER = 3;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 1;
    private static final c290 entityTypes_converter_ = new jma((byte) 12);
    private int bitField0_;
    private int entityTypesMemoizedSerializedSize;
    private int maxResults_;
    private String query_ = "";
    private b290 entityTypes_ = h.emptyIntList();
    private String pageToken_ = "";

    static {
        GetSeedSearchResultsRequest getSeedSearchResultsRequest = new GetSeedSearchResultsRequest();
        DEFAULT_INSTANCE = getSeedSearchResultsRequest;
        h.registerDefaultInstance(GetSeedSearchResultsRequest.class, getSeedSearchResultsRequest);
    }

    private GetSeedSearchResultsRequest() {
    }

    public static up40 o() {
        return (up40) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002,\u0003င\u0000\u0004ለ\u0001", new Object[]{"bitField0_", "query_", "entityTypes_", "maxResults_", "pageToken_"});
        }
        if (iOrdinal == 3) {
            return new GetSeedSearchResultsRequest();
        }
        if (iOrdinal == 4) {
            return new up40(DEFAULT_INSTANCE);
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
        synchronized (GetSeedSearchResultsRequest.class) {
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

    public final void n() {
        b290 b290VarMutableCopy = this.entityTypes_;
        if (!((i9) b290VarMutableCopy).a) {
            b290VarMutableCopy = h.mutableCopy(b290VarMutableCopy);
            this.entityTypes_ = b290VarMutableCopy;
        }
        ((er80) b290VarMutableCopy).c(ul51.ARTIST.getNumber());
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p() {
        this.bitField0_ |= 1;
        this.maxResults_ = 15;
    }

    public final void q(String str) {
        str.getClass();
        this.query_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
