package com.spotify.messages;

import p.bf40;
import p.ggz0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class QuickstartPivotClientPlaybackResult extends com.google.protobuf.h implements v2j0 {
    private static final QuickstartPivotClientPlaybackResult DEFAULT_INSTANCE;
    public static final int DETAILED_RESULT_FIELD_NUMBER = 4;
    public static final int FEATURE_IDENTIFIER_FIELD_NUMBER = 2;
    public static final int INTERACTION_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 3;
    private int bitField0_;
    private String interactionId_ = "";
    private String featureIdentifier_ = "";
    private String result_ = "";
    private String detailedResult_ = "";

    static {
        QuickstartPivotClientPlaybackResult quickstartPivotClientPlaybackResult = new QuickstartPivotClientPlaybackResult();
        DEFAULT_INSTANCE = quickstartPivotClientPlaybackResult;
        com.google.protobuf.h.registerDefaultInstance(QuickstartPivotClientPlaybackResult.class, quickstartPivotClientPlaybackResult);
    }

    private QuickstartPivotClientPlaybackResult() {
    }

    public static ggz0 n() {
        return (ggz0) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "interactionId_", "featureIdentifier_", "result_", "detailedResult_"});
        }
        if (iOrdinal == 3) {
            return new QuickstartPivotClientPlaybackResult();
        }
        if (iOrdinal == 4) {
            return new ggz0(DEFAULT_INSTANCE);
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
        synchronized (QuickstartPivotClientPlaybackResult.class) {
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
        str.getClass();
        this.bitField0_ |= 8;
        this.detailedResult_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.featureIdentifier_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.interactionId_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.result_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
