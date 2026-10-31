package com.spotify.assistedcuration.endpointsimpl.assistedcurationsearch.v1;

import com.google.protobuf.h;
import java.util.List;
import p.b290;
import p.bf40;
import p.c290;
import p.d290;
import p.h290;
import p.jf40;
import p.mka;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.z451;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SearchProto$MainViewUriResponse extends h implements v2j0 {
    private static final SearchProto$MainViewUriResponse DEFAULT_INSTANCE;
    public static final int ENTITY_TYPES_FIELD_NUMBER = 2;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int URIS_FIELD_NUMBER = 1;
    private static final c290 entityTypes_converter_ = new mka((byte) 24);
    private int entityTypesMemoizedSerializedSize;
    private h290 uris_ = h.emptyProtobufList();
    private b290 entityTypes_ = h.emptyIntList();
    private String pageToken_ = "";

    static {
        SearchProto$MainViewUriResponse searchProto$MainViewUriResponse = new SearchProto$MainViewUriResponse();
        DEFAULT_INSTANCE = searchProto$MainViewUriResponse;
        h.registerDefaultInstance(SearchProto$MainViewUriResponse.class, searchProto$MainViewUriResponse);
    }

    private SearchProto$MainViewUriResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001Ț\u0002,\u0003Ȉ", new Object[]{"uris_", "entityTypes_", "pageToken_"});
        }
        if (iOrdinal == 3) {
            return new SearchProto$MainViewUriResponse();
        }
        if (iOrdinal == 4) {
            return new z451(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (SearchProto$MainViewUriResponse.class) {
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

    public final String getPageToken() {
        return this.pageToken_;
    }

    public final List getUrisList() {
        return this.uris_;
    }

    public final d290 n() {
        return new d290(this.entityTypes_, entityTypes_converter_);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
