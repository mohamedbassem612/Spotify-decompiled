package com.spotify.messages;

import p.bf40;
import p.col1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class WhereToPlaySuggestionLifecycle extends com.google.protobuf.h implements v2j0 {
    public static final int CONFIDENCE_LEVEL_FIELD_NUMBER = 6;
    private static final WhereToPlaySuggestionLifecycle DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 5;
    public static final int RECOMMENDATION_ID_FIELD_NUMBER = 4;
    public static final int STAGE_FIELD_NUMBER = 1;
    public static final int SURFACE_ID_FIELD_NUMBER = 3;
    public static final int TRIGGER_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private String stage_ = "";
    private String triggerId_ = "";
    private String surfaceId_ = "";
    private String recommendationId_ = "";
    private String reason_ = "";
    private String confidenceLevel_ = "";

    static {
        WhereToPlaySuggestionLifecycle whereToPlaySuggestionLifecycle = new WhereToPlaySuggestionLifecycle();
        DEFAULT_INSTANCE = whereToPlaySuggestionLifecycle;
        com.google.protobuf.h.registerDefaultInstance(WhereToPlaySuggestionLifecycle.class, whereToPlaySuggestionLifecycle);
    }

    private WhereToPlaySuggestionLifecycle() {
    }

    public static col1 n() {
        return (col1) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "stage_", "triggerId_", "surfaceId_", "recommendationId_", "reason_", "confidenceLevel_"});
        }
        if (iOrdinal == 3) {
            return new WhereToPlaySuggestionLifecycle();
        }
        if (iOrdinal == 4) {
            return new col1(DEFAULT_INSTANCE);
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
        synchronized (WhereToPlaySuggestionLifecycle.class) {
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
        this.bitField0_ |= 32;
        this.confidenceLevel_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.reason_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.recommendationId_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 1;
        this.stage_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.surfaceId_ = str;
    }

    public final void t(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.triggerId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
