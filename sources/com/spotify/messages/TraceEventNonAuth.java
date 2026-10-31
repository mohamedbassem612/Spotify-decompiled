package com.spotify.messages;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.phc;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.rif1;
import p.s2j0;
import p.sif1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class TraceEventNonAuth extends h implements v2j0 {
    public static final int ATTRIBUTES_FIELD_NUMBER = 5;
    private static final TraceEventNonAuth DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SEGMENT_FIELD_NUMBER = 2;
    public static final int SPANS_FIELD_NUMBER = 4;
    public static final int TRACE_ID_FIELD_NUMBER = 1;
    public static final int TRACE_KEY_FIELD_NUMBER = 3;
    private int bitField0_;
    private int segment_;
    private qng0 attributes_ = qng0.b;
    private String traceId_ = "";
    private String traceKey_ = "";
    private phc spans_ = phc.b;

    static {
        TraceEventNonAuth traceEventNonAuth = new TraceEventNonAuth();
        DEFAULT_INSTANCE = traceEventNonAuth;
        h.registerDefaultInstance(TraceEventNonAuth.class, traceEventNonAuth);
    }

    private TraceEventNonAuth() {
    }

    public static sif1 o() {
        return (sif1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ည\u0003\u00052", new Object[]{"bitField0_", "traceId_", "segment_", "traceKey_", "spans_", "attributes_", rif1.a});
        }
        if (iOrdinal == 3) {
            return new TraceEventNonAuth();
        }
        if (iOrdinal == 4) {
            return new sif1(DEFAULT_INSTANCE);
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
        synchronized (TraceEventNonAuth.class) {
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

    public final qng0 n() {
        qng0 qng0Var = this.attributes_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.attributes_ = qng0VarH;
        return qng0VarH;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(int i) {
        this.bitField0_ |= 2;
        this.segment_ = i;
    }

    public final void q(phc phcVar) {
        this.bitField0_ |= 8;
        this.spans_ = phcVar;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.traceId_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.traceKey_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
