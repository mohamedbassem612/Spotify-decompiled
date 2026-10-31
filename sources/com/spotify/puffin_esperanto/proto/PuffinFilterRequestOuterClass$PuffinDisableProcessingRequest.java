package com.spotify.puffin_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.bqy0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zpy0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class PuffinFilterRequestOuterClass$PuffinDisableProcessingRequest extends h implements v2j0 {
    private static final PuffinFilterRequestOuterClass$PuffinDisableProcessingRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 1;
    private int reason_;

    static {
        PuffinFilterRequestOuterClass$PuffinDisableProcessingRequest puffinFilterRequestOuterClass$PuffinDisableProcessingRequest = new PuffinFilterRequestOuterClass$PuffinDisableProcessingRequest();
        DEFAULT_INSTANCE = puffinFilterRequestOuterClass$PuffinDisableProcessingRequest;
        h.registerDefaultInstance(PuffinFilterRequestOuterClass$PuffinDisableProcessingRequest.class, puffinFilterRequestOuterClass$PuffinDisableProcessingRequest);
    }

    private PuffinFilterRequestOuterClass$PuffinDisableProcessingRequest() {
    }

    public static zpy0 n() {
        return (zpy0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"reason_"});
        }
        if (iOrdinal == 3) {
            return new PuffinFilterRequestOuterClass$PuffinDisableProcessingRequest();
        }
        if (iOrdinal == 4) {
            return new zpy0(DEFAULT_INSTANCE);
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
        synchronized (PuffinFilterRequestOuterClass$PuffinDisableProcessingRequest.class) {
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

    public final void o(bqy0 bqy0Var) {
        this.reason_ = bqy0Var.getNumber();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
