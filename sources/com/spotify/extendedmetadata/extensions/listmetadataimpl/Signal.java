package com.spotify.extendedmetadata.extensions.listmetadataimpl;

import com.google.protobuf.h;
import p.bf40;
import p.hhc;
import p.jf40;
import p.l981;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Signal extends h implements v2j0 {
    public static final int CLIENT_PAYLOAD_FIELD_NUMBER = 3;
    public static final int DATA_FIELD_NUMBER = 2;
    private static final Signal DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private phc clientPayload_;
    private phc data_;
    private String identifier_ = "";

    static {
        Signal signal = new Signal();
        DEFAULT_INSTANCE = signal;
        h.registerDefaultInstance(Signal.class, signal);
    }

    private Signal() {
        hhc hhcVar = phc.b;
        this.data_ = hhcVar;
        this.clientPayload_ = hhcVar;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\n", new Object[]{"identifier_", "data_", "clientPayload_"});
        }
        if (iOrdinal == 3) {
            return new Signal();
        }
        if (iOrdinal == 4) {
            return new l981(DEFAULT_INSTANCE, (byte) 28);
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
        synchronized (Signal.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
