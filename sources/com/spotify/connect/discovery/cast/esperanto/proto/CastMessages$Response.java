package com.spotify.connect.discovery.cast.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.bid;
import p.jf40;
import p.n3e;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class CastMessages$Response extends h implements v2j0 {
    private static final CastMessages$Response DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 1;
    private int result_;

    static {
        CastMessages$Response castMessages$Response = new CastMessages$Response();
        DEFAULT_INSTANCE = castMessages$Response;
        h.registerDefaultInstance(CastMessages$Response.class, castMessages$Response);
    }

    private CastMessages$Response() {
    }

    public static CastMessages$Response o(byte[] bArr) {
        return (CastMessages$Response) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"result_"});
        }
        if (iOrdinal == 3) {
            return new CastMessages$Response();
        }
        if (iOrdinal == 4) {
            return new bid(DEFAULT_INSTANCE, (byte) 24);
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
        synchronized (CastMessages$Response.class) {
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

    public final n3e n() {
        n3e n3eVar;
        int i = this.result_;
        if (i == 0) {
            n3eVar = n3e.OK;
        } else if (i == 1) {
            n3eVar = n3e.NOT_FOUND;
        } else if (i != 2) {
            n3eVar = i != 3 ? null : n3e.INVALID_STATE;
        } else {
            n3eVar = n3e.FAILED_TO_PARSE_JSON;
        }
        return n3eVar == null ? n3e.UNRECOGNIZED : n3eVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
