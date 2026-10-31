package com.spotify.quizrecommendationservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.po01;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class RecommendedQuiz extends h implements v2j0 {
    private static final RecommendedQuiz DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TARGET_ENTITY_URI_FIELD_NUMBER = 1;
    public static final int TITLE_TEMPLATE_FIELD_NUMBER = 3;
    public static final int VISUAL_ENTITY_URI_FIELD_NUMBER = 2;
    private int bitField0_;
    private String targetEntityUri_ = "";
    private String visualEntityUri_ = "";
    private String titleTemplate_ = "";

    static {
        RecommendedQuiz recommendedQuiz = new RecommendedQuiz();
        DEFAULT_INSTANCE = recommendedQuiz;
        h.registerDefaultInstance(RecommendedQuiz.class, recommendedQuiz);
    }

    private RecommendedQuiz() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003ለ\u0001", new Object[]{"bitField0_", "targetEntityUri_", "visualEntityUri_", "titleTemplate_"});
        }
        if (iOrdinal == 3) {
            return new RecommendedQuiz();
        }
        if (iOrdinal == 4) {
            return new po01(DEFAULT_INSTANCE, (byte) 20);
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
        synchronized (RecommendedQuiz.class) {
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

    public final String n() {
        return this.targetEntityUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.titleTemplate_;
    }

    public final String p() {
        return this.visualEntityUri_;
    }

    public final boolean q() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean r() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
