package com.spotify.watchfeed.component.item.v1;

import p.bf40;
import p.ea30;
import p.jf40;
import p.nzd1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sl3;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class TextStyle extends com.google.protobuf.h implements v2j0 {
    public static final int ALIGNMENT_FIELD_NUMBER = 4;
    private static final TextStyle DEFAULT_INSTANCE;
    public static final int FONT_STYLE_FIELD_NUMBER = 2;
    public static final int MAX_LINES_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int TEXT_COLOR_FIELD_NUMBER = 1;
    private int alignment_;
    private int fontStyle_;
    private int maxLines_;
    private String textColor_ = "";

    static {
        TextStyle textStyle = new TextStyle();
        DEFAULT_INSTANCE = textStyle;
        com.google.protobuf.h.registerDefaultInstance(TextStyle.class, textStyle);
    }

    private TextStyle() {
    }

    public static TextStyle o() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0004\u0004\f", new Object[]{"textColor_", "fontStyle_", "maxLines_", "alignment_"});
        }
        if (iOrdinal == 3) {
            return new TextStyle();
        }
        if (iOrdinal == 4) {
            return new nzd1(DEFAULT_INSTANCE, (byte) 8);
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
        synchronized (TextStyle.class) {
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

    public final sl3 n() {
        sl3 sl3Var;
        int i = this.alignment_;
        if (i == 0) {
            sl3Var = sl3.START;
        } else if (i != 1) {
            sl3Var = i != 2 ? null : sl3.END;
        } else {
            sl3Var = sl3.CENTER;
        }
        return sl3Var == null ? sl3.UNRECOGNIZED : sl3Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ea30 p() {
        ea30 ea30Var;
        switch (this.fontStyle_) {
            case 0:
                ea30Var = ea30.BODY_MEDIUM;
                break;
            case 1:
                ea30Var = ea30.BODY_MEDIUM_BOLD;
                break;
            case 2:
                ea30Var = ea30.TITLE_LARGE;
                break;
            case 3:
                ea30Var = ea30.HEADLINE_MEDIUM_BLACK_WIDE;
                break;
            case 4:
                ea30Var = ea30.HEADLINE_MEDIUM_MEDIUM_WIDE;
                break;
            case 5:
                ea30Var = ea30.TITLE_LARGE_BLACK_WIDE;
                break;
            case 6:
                ea30Var = ea30.TITLE_LARGE_MEDIUM_WIDE;
                break;
            case 7:
                ea30Var = ea30.TITLE_SMALL_MEDIUM_WIDE;
                break;
            case 8:
                ea30Var = ea30.TITLE_SMALL_BLACK_WIDE;
                break;
            default:
                ea30Var = null;
                break;
        }
        return ea30Var == null ? ea30.UNRECOGNIZED : ea30Var;
    }

    public final int q() {
        return this.maxLines_;
    }

    public final String r() {
        return this.textColor_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
