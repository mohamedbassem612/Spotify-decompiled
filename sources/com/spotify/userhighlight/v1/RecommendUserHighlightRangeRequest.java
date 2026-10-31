package com.spotify.userhighlight.v1;

import com.google.protobuf.Duration;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lw01;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class RecommendUserHighlightRangeRequest extends h implements v2j0 {
    private static final RecommendUserHighlightRangeRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int START_OFFSET_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private Duration startOffset_;
    private String uri_ = "";

    static {
        RecommendUserHighlightRangeRequest recommendUserHighlightRangeRequest = new RecommendUserHighlightRangeRequest();
        DEFAULT_INSTANCE = recommendUserHighlightRangeRequest;
        h.registerDefaultInstance(RecommendUserHighlightRangeRequest.class, recommendUserHighlightRangeRequest);
    }

    private RecommendUserHighlightRangeRequest() {
    }

    public static lw01 n() {
        return (lw01) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "uri_", "startOffset_"});
        }
        if (iOrdinal == 3) {
            return new RecommendUserHighlightRangeRequest();
        }
        if (iOrdinal == 4) {
            return new lw01(DEFAULT_INSTANCE);
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
        synchronized (RecommendUserHighlightRangeRequest.class) {
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

    public final void o(Duration duration) {
        this.startOffset_ = duration;
        this.bitField0_ |= 1;
    }

    public final void p(String str) {
        str.getClass();
        this.uri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
