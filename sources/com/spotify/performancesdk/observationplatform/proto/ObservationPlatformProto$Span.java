package com.spotify.performancesdk.observationplatform.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xhp0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservationPlatformProto$Span extends h implements v2j0 {
    private static final ObservationPlatformProto$Span DEFAULT_INSTANCE;
    public static final int END_TIME_NS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SPAN_KEY_FIELD_NUMBER = 1;
    public static final int START_TIME_NS_FIELD_NUMBER = 2;
    private long endTimeNs_;
    private String spanKey_ = "";
    private long startTimeNs_;

    static {
        ObservationPlatformProto$Span observationPlatformProto$Span = new ObservationPlatformProto$Span();
        DEFAULT_INSTANCE = observationPlatformProto$Span;
        h.registerDefaultInstance(ObservationPlatformProto$Span.class, observationPlatformProto$Span);
    }

    private ObservationPlatformProto$Span() {
    }

    public static xhp0 n() {
        return (xhp0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002", new Object[]{"spanKey_", "startTimeNs_", "endTimeNs_"});
        }
        if (iOrdinal == 3) {
            return new ObservationPlatformProto$Span();
        }
        if (iOrdinal == 4) {
            return new xhp0(DEFAULT_INSTANCE);
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
        synchronized (ObservationPlatformProto$Span.class) {
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

    public final void o(long j) {
        this.endTimeNs_ = j;
    }

    public final void p(String str) {
        str.getClass();
        this.spanKey_ = str;
    }

    public final void q(long j) {
        this.startTimeNs_ = j;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
