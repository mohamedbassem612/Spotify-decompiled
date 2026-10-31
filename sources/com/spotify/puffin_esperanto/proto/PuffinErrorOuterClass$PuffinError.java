package com.spotify.puffin_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h1y0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xpy0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PuffinErrorOuterClass$PuffinError extends h implements v2j0 {
    private static final PuffinErrorOuterClass$PuffinError DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    public static final int STATUS_CODE_FIELD_NUMBER = 1;
    private String reason_ = "";
    private int statusCode_;

    static {
        PuffinErrorOuterClass$PuffinError puffinErrorOuterClass$PuffinError = new PuffinErrorOuterClass$PuffinError();
        DEFAULT_INSTANCE = puffinErrorOuterClass$PuffinError;
        h.registerDefaultInstance(PuffinErrorOuterClass$PuffinError.class, puffinErrorOuterClass$PuffinError);
    }

    private PuffinErrorOuterClass$PuffinError() {
    }

    public static PuffinErrorOuterClass$PuffinError o(byte[] bArr) {
        return (PuffinErrorOuterClass$PuffinError) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"statusCode_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new PuffinErrorOuterClass$PuffinError();
        }
        if (iOrdinal == 4) {
            return new h1y0(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (PuffinErrorOuterClass$PuffinError.class) {
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

    public final xpy0 n() {
        xpy0 xpy0Var;
        int i = this.statusCode_;
        if (i == 0) {
            xpy0Var = xpy0.UNKNOWN_FAILURE;
        } else if (i == 2) {
            xpy0Var = xpy0.GENERAL_ERROR;
        } else if (i != 3) {
            xpy0Var = i != 4 ? null : xpy0.NOT_COMPATIBLE_WITH_RUNTIME;
        } else {
            xpy0Var = xpy0.INVALID_FILE;
        }
        return xpy0Var == null ? xpy0.UNRECOGNIZED : xpy0Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
