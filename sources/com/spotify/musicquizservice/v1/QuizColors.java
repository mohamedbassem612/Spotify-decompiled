package com.spotify.musicquizservice.v1;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s3z0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class QuizColors extends com.google.protobuf.h implements v2j0 {
    public static final int ACCENT_1_FIELD_NUMBER = 6;
    public static final int ACCENT_2_FIELD_NUMBER = 7;
    public static final int ACCENT_3_FIELD_NUMBER = 8;
    public static final int BACKGROUND_DARK_FIELD_NUMBER = 1;
    public static final int BACKGROUND_MID_FIELD_NUMBER = 2;
    private static final QuizColors DEFAULT_INSTANCE;
    public static final int NEGATIVE_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PRIMARY_FIELD_NUMBER = 3;
    public static final int SECONDARY_FIELD_NUMBER = 5;
    private String backgroundDark_ = "";
    private String backgroundMid_ = "";
    private String primary_ = "";
    private String negative_ = "";
    private String secondary_ = "";
    private String accent1_ = "";
    private String accent2_ = "";
    private String accent3_ = "";

    static {
        QuizColors quizColors = new QuizColors();
        DEFAULT_INSTANCE = quizColors;
        com.google.protobuf.h.registerDefaultInstance(QuizColors.class, quizColors);
    }

    private QuizColors() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static QuizColors s() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ", new Object[]{"backgroundDark_", "backgroundMid_", "primary_", "negative_", "secondary_", "accent1_", "accent2_", "accent3_"});
        }
        if (iOrdinal == 3) {
            return new QuizColors();
        }
        if (iOrdinal == 4) {
            return new s3z0(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (QuizColors.class) {
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
        return this.accent1_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.accent2_;
    }

    public final String p() {
        return this.accent3_;
    }

    public final String q() {
        return this.backgroundDark_;
    }

    public final String r() {
        return this.backgroundMid_;
    }

    public final String t() {
        return this.negative_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.primary_;
    }

    public final String v() {
        return this.secondary_;
    }
}
