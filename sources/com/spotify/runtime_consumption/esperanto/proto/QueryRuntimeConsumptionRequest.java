package com.spotify.runtime_consumption.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.g1z0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class QueryRuntimeConsumptionRequest extends h implements v2j0 {
    public static final int CONTENT_URI_FIELD_NUMBER = 3;
    private static final QueryRuntimeConsumptionRequest DEFAULT_INSTANCE;
    public static final int EXCLUDE_PREVIEWS_FIELD_NUMBER = 4;
    public static final int ORCHESTRATION_STACK_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_STACK_FIELD_NUMBER = 2;
    private int bitField0_;
    private String contentUri_ = "";
    private boolean excludePreviews_;
    private int orchestrationStack_;
    private int playbackStack_;

    static {
        QueryRuntimeConsumptionRequest queryRuntimeConsumptionRequest = new QueryRuntimeConsumptionRequest();
        DEFAULT_INSTANCE = queryRuntimeConsumptionRequest;
        h.registerDefaultInstance(QueryRuntimeConsumptionRequest.class, queryRuntimeConsumptionRequest);
    }

    private QueryRuntimeConsumptionRequest() {
    }

    public static g1z0 n() {
        return (g1z0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ለ\u0002\u0004\u0007", new Object[]{"bitField0_", "orchestrationStack_", "playbackStack_", "contentUri_", "excludePreviews_"});
        }
        if (iOrdinal == 3) {
            return new QueryRuntimeConsumptionRequest();
        }
        if (iOrdinal == 4) {
            return new g1z0(DEFAULT_INSTANCE);
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
        synchronized (QueryRuntimeConsumptionRequest.class) {
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
        this.bitField0_ |= 4;
        this.contentUri_ = str;
    }

    public final void p() {
        this.excludePreviews_ = true;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
