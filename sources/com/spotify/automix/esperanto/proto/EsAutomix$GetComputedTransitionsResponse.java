package com.spotify.automix.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.rdz;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class EsAutomix$GetComputedTransitionsResponse extends h implements v2j0 {
    public static final int COMPUTED_TRANSITIONS_FIELD_NUMBER = 1;
    private static final EsAutomix$GetComputedTransitionsResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private h290 computedTransitions_ = h.emptyProtobufList();

    static {
        EsAutomix$GetComputedTransitionsResponse esAutomix$GetComputedTransitionsResponse = new EsAutomix$GetComputedTransitionsResponse();
        DEFAULT_INSTANCE = esAutomix$GetComputedTransitionsResponse;
        h.registerDefaultInstance(EsAutomix$GetComputedTransitionsResponse.class, esAutomix$GetComputedTransitionsResponse);
    }

    private EsAutomix$GetComputedTransitionsResponse() {
    }

    public static EsAutomix$GetComputedTransitionsResponse o(byte[] bArr) {
        return (EsAutomix$GetComputedTransitionsResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"computedTransitions_", EsAutomix$ComputedTransitions.class});
        }
        if (iOrdinal == 3) {
            return new EsAutomix$GetComputedTransitionsResponse();
        }
        if (iOrdinal == 4) {
            return new rdz(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (EsAutomix$GetComputedTransitionsResponse.class) {
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

    public final h290 n() {
        return this.computedTransitions_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
