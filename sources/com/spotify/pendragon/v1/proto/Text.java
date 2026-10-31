package com.spotify.pendragon.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.usc1;
import p.v2j0;
import p.yix;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class Text extends h implements v2j0 {
    private static final Text DEFAULT_INSTANCE;
    public static final int FONT_OVERRIDE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int TEXT_COLOR_FIELD_NUMBER = 2;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private int fontOverride_;
    private String text_ = "";
    private String textColor_ = "";

    static {
        Text text = new Text();
        DEFAULT_INSTANCE = text;
        h.registerDefaultInstance(Text.class, text);
    }

    private Text() {
    }

    public static Text n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဌ\u0000", new Object[]{"bitField0_", "text_", "textColor_", "fontOverride_"});
        }
        if (iOrdinal == 3) {
            return new Text();
        }
        if (iOrdinal == 4) {
            return new usc1(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (Text.class) {
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

    public final yix o() {
        yix yixVar;
        switch (this.fontOverride_) {
            case 0:
                yixVar = yix.UNKNOWN_FONT;
                break;
            case 1:
                yixVar = yix.HEADLINE_LARGE;
                break;
            case 2:
                yixVar = yix.HEADLINE_MEDIUM;
                break;
            case 3:
                yixVar = yix.TITLE_LARGE;
                break;
            case 4:
                yixVar = yix.TITLE_MEDIUM;
                break;
            case 5:
                yixVar = yix.TITLE_SMALL;
                break;
            case 6:
                yixVar = yix.BODY_MEDIUM;
                break;
            case 7:
                yixVar = yix.BODY_MEDIUM_BOLD;
                break;
            case 8:
                yixVar = yix.BODY_SMALL;
                break;
            case 9:
                yixVar = yix.BODY_SMALL_BOLD;
                break;
            case 10:
                yixVar = yix.MARGINAL;
                break;
            case 11:
                yixVar = yix.MARGINAL_BOLD;
                break;
            default:
                yixVar = null;
                break;
        }
        return yixVar == null ? yix.UNRECOGNIZED : yixVar;
    }

    public final String p() {
        return this.text_;
    }

    public final String q() {
        return this.textColor_;
    }

    public final boolean r() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
