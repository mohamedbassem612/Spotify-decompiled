package com.spotify.unboxingfeatureflows.api.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.em40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class GetFeatureFlowResponse extends h implements v2j0 {
    private static final GetFeatureFlowResponse DEFAULT_INSTANCE;
    public static final int FEATURE_ID_FIELD_NUMBER = 1;
    public static final int FLOW_STEPS_FIELD_NUMBER = 3;
    public static final int HEADER_TEXT_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private String featureId_ = "";
    private String headerText_ = "";
    private h290 flowSteps_ = h.emptyProtobufList();

    static {
        GetFeatureFlowResponse getFeatureFlowResponse = new GetFeatureFlowResponse();
        DEFAULT_INSTANCE = getFeatureFlowResponse;
        h.registerDefaultInstance(GetFeatureFlowResponse.class, getFeatureFlowResponse);
    }

    private GetFeatureFlowResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"featureId_", "headerText_", "flowSteps_", FlowStep.class});
        }
        if (iOrdinal == 3) {
            return new GetFeatureFlowResponse();
        }
        if (iOrdinal == 4) {
            return new em40(DEFAULT_INSTANCE, (byte) 13);
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
        synchronized (GetFeatureFlowResponse.class) {
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
        return this.featureId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.flowSteps_;
    }

    public final String p() {
        return this.headerText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
