package com.spotify.libraryimportservice.tmm;

import com.google.protobuf.h;
import p.a3c1;
import p.bf40;
import p.f8a;
import p.j8y;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class StoreTransferResultsEngagementRequest extends h implements v2j0 {
    public static final int BANNER_TYPE_FIELD_NUMBER = 2;
    private static final StoreTransferResultsEngagementRequest DEFAULT_INSTANCE;
    public static final int ENGAGEMENT_TYPE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int TRANSFER_ID_FIELD_NUMBER = 1;
    private int bannerType_;
    private int engagementType_;
    private String transferId_ = "";

    static {
        StoreTransferResultsEngagementRequest storeTransferResultsEngagementRequest = new StoreTransferResultsEngagementRequest();
        DEFAULT_INSTANCE = storeTransferResultsEngagementRequest;
        h.registerDefaultInstance(StoreTransferResultsEngagementRequest.class, storeTransferResultsEngagementRequest);
    }

    private StoreTransferResultsEngagementRequest() {
    }

    public static a3c1 n() {
        return (a3c1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\f", new Object[]{"transferId_", "bannerType_", "engagementType_"});
        }
        if (iOrdinal == 3) {
            return new StoreTransferResultsEngagementRequest();
        }
        if (iOrdinal == 4) {
            return new a3c1(DEFAULT_INSTANCE);
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
        synchronized (StoreTransferResultsEngagementRequest.class) {
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

    public final void o(f8a f8aVar) {
        this.bannerType_ = f8aVar.getNumber();
    }

    public final void p(j8y j8yVar) {
        this.engagementType_ = j8yVar.getNumber();
    }

    public final void q(String str) {
        str.getClass();
        this.transferId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
