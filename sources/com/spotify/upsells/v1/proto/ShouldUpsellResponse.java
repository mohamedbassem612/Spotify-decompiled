package com.spotify.upsells.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.mn71;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.t0i1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ShouldUpsellResponse extends h implements v2j0 {
    private static final ShouldUpsellResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 1;
    private int result_;

    static {
        ShouldUpsellResponse shouldUpsellResponse = new ShouldUpsellResponse();
        DEFAULT_INSTANCE = shouldUpsellResponse;
        h.registerDefaultInstance(ShouldUpsellResponse.class, shouldUpsellResponse);
    }

    private ShouldUpsellResponse() {
    }

    public static ShouldUpsellResponse n() {
        return DEFAULT_INSTANCE;
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
            return new ShouldUpsellResponse();
        }
        if (iOrdinal == 4) {
            return new mn71(DEFAULT_INSTANCE, (byte) 13);
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
        synchronized (ShouldUpsellResponse.class) {
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

    public final t0i1 o() {
        t0i1 t0i1Var;
        int i = this.result_;
        if (i == 0) {
            t0i1Var = t0i1.UPSELL_RESULT_UNSPECIFIED;
        } else if (i != 1) {
            t0i1Var = i != 2 ? null : t0i1.UPSELL_RESULT_NO_UPSELL;
        } else {
            t0i1Var = t0i1.UPSELL_RESULT_HAS_UPSELL;
        }
        return t0i1Var == null ? t0i1.UNRECOGNIZED : t0i1Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
