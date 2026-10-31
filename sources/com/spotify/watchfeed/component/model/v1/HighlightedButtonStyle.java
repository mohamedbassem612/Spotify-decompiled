package com.spotify.watchfeed.component.model.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.m660;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class HighlightedButtonStyle extends h implements v2j0 {
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 1;
    private static final HighlightedButtonStyle DEFAULT_INSTANCE;
    public static final int OUTLINE_COLOR_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private String backgroundColor_ = "";
    private String outlineColor_ = "";

    static {
        HighlightedButtonStyle highlightedButtonStyle = new HighlightedButtonStyle();
        DEFAULT_INSTANCE = highlightedButtonStyle;
        h.registerDefaultInstance(HighlightedButtonStyle.class, highlightedButtonStyle);
    }

    private HighlightedButtonStyle() {
    }

    public static HighlightedButtonStyle o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"backgroundColor_", "outlineColor_"});
        }
        if (iOrdinal == 3) {
            return new HighlightedButtonStyle();
        }
        if (iOrdinal == 4) {
            return new m660(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (HighlightedButtonStyle.class) {
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
        return this.backgroundColor_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.outlineColor_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
