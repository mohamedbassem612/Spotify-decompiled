package com.spotify.agentgateway.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.io40;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zo40;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class GetProgressStagesResponse extends h implements v2j0 {
    public static final int CONTENT_TYPE_FIELD_NUMBER = 1;
    public static final int DEBUG_INFO_FIELD_NUMBER = 4;
    private static final GetProgressStagesResponse DEFAULT_INSTANCE;
    public static final int LABEL_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PROGRESS_STAGES_FIELD_NUMBER = 3;
    private qng0 debugInfo_ = qng0.b;
    private String contentType_ = "";
    private String label_ = "";
    private h290 progressStages_ = h.emptyProtobufList();

    static {
        GetProgressStagesResponse getProgressStagesResponse = new GetProgressStagesResponse();
        DEFAULT_INSTANCE = getProgressStagesResponse;
        h.registerDefaultInstance(GetProgressStagesResponse.class, getProgressStagesResponse);
    }

    private GetProgressStagesResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u00042", new Object[]{"contentType_", "label_", "progressStages_", ProgressStage.class, "debugInfo_", zo40.a});
        }
        if (iOrdinal == 3) {
            return new GetProgressStagesResponse();
        }
        if (iOrdinal == 4) {
            return new io40(DEFAULT_INSTANCE, (byte) 20);
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
        synchronized (GetProgressStagesResponse.class) {
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

    public final String n() {
        return this.contentType_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.label_;
    }

    public final h290 p() {
        return this.progressStages_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
