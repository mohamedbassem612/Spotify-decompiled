package com.spotify.common_capping.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.prh;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.srh;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class CommonCappingOuterClass$ObserveCapStateChangedRequest extends h implements v2j0 {
    private static final CommonCappingOuterClass$ObserveCapStateChangedRequest DEFAULT_INSTANCE;
    public static final int FEATURE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int feature_;

    static {
        CommonCappingOuterClass$ObserveCapStateChangedRequest commonCappingOuterClass$ObserveCapStateChangedRequest = new CommonCappingOuterClass$ObserveCapStateChangedRequest();
        DEFAULT_INSTANCE = commonCappingOuterClass$ObserveCapStateChangedRequest;
        h.registerDefaultInstance(CommonCappingOuterClass$ObserveCapStateChangedRequest.class, commonCappingOuterClass$ObserveCapStateChangedRequest);
    }

    private CommonCappingOuterClass$ObserveCapStateChangedRequest() {
    }

    public static srh n() {
        return (srh) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"feature_"});
        }
        if (iOrdinal == 3) {
            return new CommonCappingOuterClass$ObserveCapStateChangedRequest();
        }
        if (iOrdinal == 4) {
            return new srh(DEFAULT_INSTANCE);
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
        synchronized (CommonCappingOuterClass$ObserveCapStateChangedRequest.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(prh prhVar) {
        this.feature_ = prhVar.getNumber();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
