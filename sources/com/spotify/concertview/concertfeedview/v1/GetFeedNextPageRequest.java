package com.spotify.concertview.concertfeedview.v1;

import com.google.protobuf.h;
import p.b290;
import p.bf40;
import p.c290;
import p.eoc;
import p.er80;
import p.gn40;
import p.i9;
import p.jf40;
import p.nig;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class GetFeedNextPageRequest extends h implements v2j0 {
    public static final int CAPABILITIES_FIELD_NUMBER = 2;
    private static final GetFeedNextPageRequest DEFAULT_INSTANCE;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private static final c290 capabilities_converter_ = new eoc((byte) 11);
    private int capabilitiesMemoizedSerializedSize;
    private String nextPageToken_ = "";
    private b290 capabilities_ = h.emptyIntList();

    static {
        GetFeedNextPageRequest getFeedNextPageRequest = new GetFeedNextPageRequest();
        DEFAULT_INSTANCE = getFeedNextPageRequest;
        h.registerDefaultInstance(GetFeedNextPageRequest.class, getFeedNextPageRequest);
    }

    private GetFeedNextPageRequest() {
    }

    public static gn40 o() {
        return (gn40) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002,", new Object[]{"nextPageToken_", "capabilities_"});
        }
        if (iOrdinal == 3) {
            return new GetFeedNextPageRequest();
        }
        if (iOrdinal == 4) {
            return new gn40(DEFAULT_INSTANCE);
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
        synchronized (GetFeedNextPageRequest.class) {
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

    public final void n(nig nigVar) {
        b290 b290VarMutableCopy = this.capabilities_;
        if (!((i9) b290VarMutableCopy).a) {
            b290VarMutableCopy = h.mutableCopy(b290VarMutableCopy);
            this.capabilities_ = b290VarMutableCopy;
        }
        ((er80) b290VarMutableCopy).c(nigVar.getNumber());
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        str.getClass();
        this.nextPageToken_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
