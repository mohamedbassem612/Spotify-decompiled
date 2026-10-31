package com.spotify.campfire.insights.proto.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.rn40;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class GetInsightsRequest extends h implements v2j0 {
    private static final GetInsightsRequest DEFAULT_INSTANCE;
    public static final int ENTITIES_PER_WEEK_FIELD_NUMBER = 3;
    public static final int HIERARCHY_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int WEEKS_FIELD_NUMBER = 2;
    private int entitiesPerWeek_;
    private String hierarchyId_ = "";
    private int weeks_;

    static {
        GetInsightsRequest getInsightsRequest = new GetInsightsRequest();
        DEFAULT_INSTANCE = getInsightsRequest;
        h.registerDefaultInstance(GetInsightsRequest.class, getInsightsRequest);
    }

    private GetInsightsRequest() {
    }

    public static rn40 n() {
        return (rn40) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\u000b", new Object[]{"hierarchyId_", "weeks_", "entitiesPerWeek_"});
        }
        if (iOrdinal == 3) {
            return new GetInsightsRequest();
        }
        if (iOrdinal == 4) {
            return new rn40(DEFAULT_INSTANCE);
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
        synchronized (GetInsightsRequest.class) {
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

    public final void setHierarchyId(String str) {
        str.getClass();
        this.hierarchyId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
