package com.spotify.paragraph.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.ynr0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class Paragraph$TextStyle extends h implements v2j0 {
    private static final Paragraph$TextStyle DEFAULT_INSTANCE;
    public static final int FONT_STYLE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int TEXT_COLOR_FIELD_NUMBER = 2;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int fontStyle_;
    private String text_ = "";
    private String textColor_ = "";

    static {
        Paragraph$TextStyle paragraph$TextStyle = new Paragraph$TextStyle();
        DEFAULT_INSTANCE = paragraph$TextStyle;
        h.registerDefaultInstance(Paragraph$TextStyle.class, paragraph$TextStyle);
    }

    private Paragraph$TextStyle() {
    }

    public static Paragraph$TextStyle n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f", new Object[]{"text_", "textColor_", "fontStyle_"});
        }
        if (iOrdinal == 3) {
            return new Paragraph$TextStyle();
        }
        if (iOrdinal == 4) {
            return new b(DEFAULT_INSTANCE);
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
        synchronized (Paragraph$TextStyle.class) {
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

    public final ynr0 o() {
        ynr0 ynr0Var;
        switch (this.fontStyle_) {
            case 0:
                ynr0Var = ynr0.bass;
                break;
            case 1:
                ynr0Var = ynr0.forte;
                break;
            case 2:
                ynr0Var = ynr0.brio;
                break;
            case 3:
                ynr0Var = ynr0.alto;
                break;
            case 4:
                ynr0Var = ynr0.canon;
                break;
            case 5:
                ynr0Var = ynr0.cello;
                break;
            case 6:
                ynr0Var = ynr0.ballad;
                break;
            case 7:
                ynr0Var = ynr0.ballad_bold;
                break;
            case 8:
                ynr0Var = ynr0.viola;
                break;
            case 9:
                ynr0Var = ynr0.viola_bold;
                break;
            case 10:
                ynr0Var = ynr0.mesto;
                break;
            case 11:
                ynr0Var = ynr0.mesto_bold;
                break;
            case 12:
                ynr0Var = ynr0.metronome;
                break;
            case 13:
                ynr0Var = ynr0.finale;
                break;
            case 14:
                ynr0Var = ynr0.finale_bold;
                break;
            case 15:
                ynr0Var = ynr0.minuet;
                break;
            case 16:
                ynr0Var = ynr0.minuet_bold;
                break;
            case 17:
                ynr0Var = ynr0.headlineLarge;
                break;
            case 18:
                ynr0Var = ynr0.headlineMedium;
                break;
            case 19:
                ynr0Var = ynr0.titleLarge;
                break;
            case 20:
                ynr0Var = ynr0.titleMedium;
                break;
            case 21:
                ynr0Var = ynr0.titleSmall;
                break;
            case 22:
                ynr0Var = ynr0.bodyMedium;
                break;
            case 23:
                ynr0Var = ynr0.bodyMediumBold;
                break;
            case 24:
                ynr0Var = ynr0.bodySmall;
                break;
            case 25:
                ynr0Var = ynr0.bodySmallBold;
                break;
            case 26:
                ynr0Var = ynr0.marginal;
                break;
            case 27:
                ynr0Var = ynr0.marginalBold;
                break;
            case 28:
                ynr0Var = ynr0.titleXsmall;
                break;
            default:
                ynr0Var = null;
                break;
        }
        return ynr0Var == null ? ynr0.UNRECOGNIZED : ynr0Var;
    }

    public final String p() {
        return this.text_;
    }

    public final String q() {
        return this.textColor_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
