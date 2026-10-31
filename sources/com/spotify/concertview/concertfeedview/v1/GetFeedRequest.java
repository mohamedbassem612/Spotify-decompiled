package com.spotify.concertview.concertfeedview.v1;

import com.google.protobuf.h;
import p.b290;
import p.bf40;
import p.c290;
import p.er80;
import p.i9;
import p.in40;
import p.jf40;
import p.nig;
import p.pvc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class GetFeedRequest extends h implements v2j0 {
    public static final int CAPABILITIES_FIELD_NUMBER = 4;
    public static final int CONTEXT_ARTIST_URI_FIELD_NUMBER = 3;
    private static final GetFeedRequest DEFAULT_INSTANCE;
    public static final int FILTER_FIELD_NUMBER = 2;
    public static final int IGNORED_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private static final c290 capabilities_converter_ = new pvc((byte) 11);
    private int bitField0_;
    private int capabilitiesMemoizedSerializedSize;
    private FeedFilter filter_;
    private String ignored_ = "";
    private String contextArtistUri_ = "";
    private b290 capabilities_ = h.emptyIntList();

    static {
        GetFeedRequest getFeedRequest = new GetFeedRequest();
        DEFAULT_INSTANCE = getFeedRequest;
        h.registerDefaultInstance(GetFeedRequest.class, getFeedRequest);
    }

    private GetFeedRequest() {
    }

    public static in40 o() {
        return (in40) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ለ\u0001\u0004,", new Object[]{"bitField0_", "ignored_", "filter_", "contextArtistUri_", "capabilities_"});
        }
        if (iOrdinal == 3) {
            return new GetFeedRequest();
        }
        if (iOrdinal == 4) {
            return new in40(DEFAULT_INSTANCE);
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
        synchronized (GetFeedRequest.class) {
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

    public final void p(FeedFilter feedFilter) {
        feedFilter.getClass();
        this.filter_ = feedFilter;
        this.bitField0_ |= 1;
    }

    public final void q() {
        this.ignored_ = "list_hero,list_wide,list,grid,carousel";
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
