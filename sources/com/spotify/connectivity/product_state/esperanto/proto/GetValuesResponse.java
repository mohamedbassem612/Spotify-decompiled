package com.spotify.connectivity.product_state.esperanto.proto;

import com.google.protobuf.h;
import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.ir40;
import p.jf40;
import p.or40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class GetValuesResponse extends h implements v2j0 {
    private static final GetValuesResponse DEFAULT_INSTANCE;
    public static final int PAIRS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private qng0 pairs_ = qng0.b;

    static {
        GetValuesResponse getValuesResponse = new GetValuesResponse();
        DEFAULT_INSTANCE = getValuesResponse;
        h.registerDefaultInstance(GetValuesResponse.class, getValuesResponse);
    }

    private GetValuesResponse() {
    }

    public static GetValuesResponse p(byte[] bArr) {
        return (GetValuesResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"pairs_", or40.a});
        }
        if (iOrdinal == 3) {
            return new GetValuesResponse();
        }
        if (iOrdinal == 4) {
            return new ir40((byte) 3);
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
        synchronized (GetValuesResponse.class) {
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

    public final Map o() {
        return Collections.unmodifiableMap(this.pairs_);
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
