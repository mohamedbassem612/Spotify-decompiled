package com.spotify.scrollsita.v1;

import com.google.protobuf.h;
import p.ajz0;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s3z0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class QuizInfoText extends h implements v2j0 {
    private static final QuizInfoText DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int icon_;
    private String text_ = "";

    static {
        QuizInfoText quizInfoText = new QuizInfoText();
        DEFAULT_INSTANCE = quizInfoText;
        h.registerDefaultInstance(QuizInfoText.class, quizInfoText);
    }

    private QuizInfoText() {
    }

    public static QuizInfoText n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"text_", "icon_"});
        }
        if (iOrdinal == 3) {
            return new QuizInfoText();
        }
        if (iOrdinal == 4) {
            return new s3z0(DEFAULT_INSTANCE, (byte) 5);
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
        synchronized (QuizInfoText.class) {
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

    public final ajz0 o() {
        ajz0 ajz0Var;
        int i = this.icon_;
        if (i != 0) {
            ajz0Var = i != 1 ? null : ajz0.QUIZ_ICON_TYPE_INFO;
        } else {
            ajz0Var = ajz0.QUIZ_ICON_TYPE_UNSPECIFIED;
        }
        return ajz0Var == null ? ajz0.UNRECOGNIZED : ajz0Var;
    }

    public final String p() {
        return this.text_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
