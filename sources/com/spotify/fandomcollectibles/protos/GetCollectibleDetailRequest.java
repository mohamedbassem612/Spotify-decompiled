package com.spotify.fandomcollectibles.protos;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.ol40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class GetCollectibleDetailRequest extends h implements v2j0 {
    public static final int CLIENT_TIME_ZONE_FIELD_NUMBER = 2;
    public static final int COLLECTIBLE_ID_FIELD_NUMBER = 1;
    private static final GetCollectibleDetailRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private String collectibleId_ = "";
    private String clientTimeZone_ = "";

    static {
        GetCollectibleDetailRequest getCollectibleDetailRequest = new GetCollectibleDetailRequest();
        DEFAULT_INSTANCE = getCollectibleDetailRequest;
        h.registerDefaultInstance(GetCollectibleDetailRequest.class, getCollectibleDetailRequest);
    }

    private GetCollectibleDetailRequest() {
    }

    public static ol40 n() {
        return (ol40) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"collectibleId_", "clientTimeZone_"});
        }
        if (iOrdinal == 3) {
            return new GetCollectibleDetailRequest();
        }
        if (iOrdinal == 4) {
            return new ol40(DEFAULT_INSTANCE);
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
        synchronized (GetCollectibleDetailRequest.class) {
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

    public final void o(String str) {
        str.getClass();
        this.clientTimeZone_ = str;
    }

    public final void p(String str) {
        this.collectibleId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
