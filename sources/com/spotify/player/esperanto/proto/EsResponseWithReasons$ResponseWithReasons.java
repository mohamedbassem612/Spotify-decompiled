package com.spotify.player.esperanto.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xoz;
import p.xqz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class EsResponseWithReasons$ResponseWithReasons extends com.google.protobuf.h implements v2j0 {
    private static final EsResponseWithReasons$ResponseWithReasons DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int REASONS_FIELD_NUMBER = 2;
    private int error_;
    private String reasons_ = "";

    static {
        EsResponseWithReasons$ResponseWithReasons esResponseWithReasons$ResponseWithReasons = new EsResponseWithReasons$ResponseWithReasons();
        DEFAULT_INSTANCE = esResponseWithReasons$ResponseWithReasons;
        com.google.protobuf.h.registerDefaultInstance(EsResponseWithReasons$ResponseWithReasons.class, esResponseWithReasons$ResponseWithReasons);
    }

    private EsResponseWithReasons$ResponseWithReasons() {
    }

    public static EsResponseWithReasons$ResponseWithReasons p(byte[] bArr) {
        return (EsResponseWithReasons$ResponseWithReasons) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"error_", "reasons_"});
        }
        if (iOrdinal == 3) {
            return new EsResponseWithReasons$ResponseWithReasons();
        }
        if (iOrdinal == 4) {
            return new xoz(DEFAULT_INSTANCE, (byte) 27);
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
        synchronized (EsResponseWithReasons$ResponseWithReasons.class) {
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

    public final xqz n() {
        xqz xqzVar;
        int i = this.error_;
        if (i == 0) {
            xqzVar = xqz.OK;
        } else if (i == 1) {
            xqzVar = xqz.FORBIDDEN;
        } else if (i != 2) {
            xqzVar = i != 3 ? null : xqz.CONFLICT;
        } else {
            xqzVar = xqz.NOT_FOUND;
        }
        return xqzVar == null ? xqz.UNRECOGNIZED : xqzVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.reasons_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
