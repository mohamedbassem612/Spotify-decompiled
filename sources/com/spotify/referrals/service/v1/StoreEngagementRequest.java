package com.spotify.referrals.service.v1;

import com.google.protobuf.h;
import p.bf40;
import p.i2c1;
import p.i8y;
import p.jf40;
import p.n911;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class StoreEngagementRequest extends h implements v2j0 {
    private static final StoreEngagementRequest DEFAULT_INSTANCE;
    public static final int ENGAGEMENT_TYPE_FIELD_NUMBER = 3;
    public static final int ENTITY_ID_FIELD_NUMBER = 4;
    public static final int ENTITY_URI_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SURFACE_FIELD_NUMBER = 2;
    private int engagementType_;
    private int surface_;
    private String entityUri_ = "";
    private String entityId_ = "";

    static {
        StoreEngagementRequest storeEngagementRequest = new StoreEngagementRequest();
        DEFAULT_INSTANCE = storeEngagementRequest;
        h.registerDefaultInstance(StoreEngagementRequest.class, storeEngagementRequest);
    }

    private StoreEngagementRequest() {
    }

    public static i2c1 n() {
        return (i2c1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\f\u0004Ȉ", new Object[]{"entityUri_", "surface_", "engagementType_", "entityId_"});
        }
        if (iOrdinal == 3) {
            return new StoreEngagementRequest();
        }
        if (iOrdinal == 4) {
            return new i2c1(DEFAULT_INSTANCE);
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
        synchronized (StoreEngagementRequest.class) {
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

    public final void o(i8y i8yVar) {
        this.engagementType_ = i8yVar.getNumber();
    }

    public final void p(String str) {
        str.getClass();
        this.entityId_ = str;
    }

    public final void q(String str) {
        this.entityUri_ = str;
    }

    public final void r(n911 n911Var) {
        this.surface_ = n911Var.getNumber();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
