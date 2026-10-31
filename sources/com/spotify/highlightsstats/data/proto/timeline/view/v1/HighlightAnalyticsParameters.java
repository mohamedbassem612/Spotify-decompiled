package com.spotify.highlightsstats.data.proto.timeline.view.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.m660;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class HighlightAnalyticsParameters extends h implements v2j0 {
    private static final HighlightAnalyticsParameters DEFAULT_INSTANCE;
    public static final int ENTITY_URIS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 1;
    private String reason_ = "";
    private String entityUris_ = "";

    static {
        HighlightAnalyticsParameters highlightAnalyticsParameters = new HighlightAnalyticsParameters();
        DEFAULT_INSTANCE = highlightAnalyticsParameters;
        h.registerDefaultInstance(HighlightAnalyticsParameters.class, highlightAnalyticsParameters);
    }

    private HighlightAnalyticsParameters() {
    }

    public static HighlightAnalyticsParameters n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"reason_", "entityUris_"});
        }
        if (iOrdinal == 3) {
            return new HighlightAnalyticsParameters();
        }
        if (iOrdinal == 4) {
            return new m660(DEFAULT_INSTANCE, (byte) 6);
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
        synchronized (HighlightAnalyticsParameters.class) {
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

    public final String o() {
        return this.entityUris_;
    }

    public final String p() {
        return this.reason_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
