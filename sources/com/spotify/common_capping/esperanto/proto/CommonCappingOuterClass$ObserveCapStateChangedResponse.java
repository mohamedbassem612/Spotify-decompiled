package com.spotify.common_capping.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.wah;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class CommonCappingOuterClass$ObserveCapStateChangedResponse extends h implements v2j0 {
    private static final CommonCappingOuterClass$ObserveCapStateChangedResponse DEFAULT_INSTANCE;
    public static final int IS_CAPPED_FIELD_NUMBER = 1;
    public static final int IS_CHANGE_FROM_LOCAL_CONSUMPTION_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private boolean isCapped_;
    private boolean isChangeFromLocalConsumption_;

    static {
        CommonCappingOuterClass$ObserveCapStateChangedResponse commonCappingOuterClass$ObserveCapStateChangedResponse = new CommonCappingOuterClass$ObserveCapStateChangedResponse();
        DEFAULT_INSTANCE = commonCappingOuterClass$ObserveCapStateChangedResponse;
        h.registerDefaultInstance(CommonCappingOuterClass$ObserveCapStateChangedResponse.class, commonCappingOuterClass$ObserveCapStateChangedResponse);
    }

    private CommonCappingOuterClass$ObserveCapStateChangedResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static CommonCappingOuterClass$ObserveCapStateChangedResponse q(byte[] bArr) {
        return (CommonCappingOuterClass$ObserveCapStateChangedResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"isCapped_", "isChangeFromLocalConsumption_"});
        }
        if (iOrdinal == 3) {
            return new CommonCappingOuterClass$ObserveCapStateChangedResponse();
        }
        if (iOrdinal == 4) {
            return new wah((byte) 11);
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
        synchronized (CommonCappingOuterClass$ObserveCapStateChangedResponse.class) {
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

    public final boolean o() {
        return this.isCapped_;
    }

    public final boolean p() {
        return this.isChangeFromLocalConsumption_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
