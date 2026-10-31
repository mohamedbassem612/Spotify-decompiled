package com.spotify.party.mobile.v2;

import com.google.protobuf.h;
import p.bf40;
import p.eo40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class GetListeningPartyMarketingCardsRequest extends h implements v2j0 {
    private static final GetListeningPartyMarketingCardsRequest DEFAULT_INSTANCE;
    public static final int ORGANIZER_URIS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private h290 organizerUris_ = h.emptyProtobufList();

    static {
        GetListeningPartyMarketingCardsRequest getListeningPartyMarketingCardsRequest = new GetListeningPartyMarketingCardsRequest();
        DEFAULT_INSTANCE = getListeningPartyMarketingCardsRequest;
        h.registerDefaultInstance(GetListeningPartyMarketingCardsRequest.class, getListeningPartyMarketingCardsRequest);
    }

    private GetListeningPartyMarketingCardsRequest() {
    }

    public static eo40 o() {
        return (eo40) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"organizerUris_"});
        }
        if (iOrdinal == 3) {
            return new GetListeningPartyMarketingCardsRequest();
        }
        if (iOrdinal == 4) {
            return new eo40(DEFAULT_INSTANCE);
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
        synchronized (GetListeningPartyMarketingCardsRequest.class) {
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

    public final void n(Iterable iterable) {
        h290 h290VarMutableCopy = this.organizerUris_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.organizerUris_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
