package com.spotify.highlightsstats.data.proto.v2;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.hf60;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class HighlightsListRequest extends h implements v2j0 {
    private static final HighlightsListRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    public static final int TIME_ZONE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String timeZone_ = "";
    private Timestamp timestamp_;

    static {
        HighlightsListRequest highlightsListRequest = new HighlightsListRequest();
        DEFAULT_INSTANCE = highlightsListRequest;
        h.registerDefaultInstance(HighlightsListRequest.class, highlightsListRequest);
    }

    private HighlightsListRequest() {
    }

    public static hf60 n() {
        return (hf60) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"bitField0_", "timestamp_", "timeZone_"});
        }
        if (iOrdinal == 3) {
            return new HighlightsListRequest();
        }
        if (iOrdinal == 4) {
            return new hf60(DEFAULT_INSTANCE);
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
        synchronized (HighlightsListRequest.class) {
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

    public final void o(String str) {
        this.timeZone_ = str;
    }

    public final void p(Timestamp timestamp) {
        this.timestamp_ = timestamp;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
