package com.spotify.watchfeed.component.item.v1;

import p.bf40;
import p.jf40;
import p.lub1;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class StyledTextRowComponent extends com.google.protobuf.h implements v2j0 {
    private static final StyledTextRowComponent DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int TEXT_STYLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private TextStyle textStyle_;
    private String text_ = "";

    static {
        StyledTextRowComponent styledTextRowComponent = new StyledTextRowComponent();
        DEFAULT_INSTANCE = styledTextRowComponent;
        com.google.protobuf.h.registerDefaultInstance(StyledTextRowComponent.class, styledTextRowComponent);
    }

    private StyledTextRowComponent() {
    }

    public static StyledTextRowComponent p(phc phcVar) {
        return (StyledTextRowComponent) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, phcVar);
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "text_", "textStyle_"});
        }
        if (iOrdinal == 3) {
            return new StyledTextRowComponent();
        }
        if (iOrdinal == 4) {
            return new lub1(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (StyledTextRowComponent.class) {
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
        return this.text_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final TextStyle o() {
        TextStyle textStyle = this.textStyle_;
        return textStyle == null ? TextStyle.o() : textStyle;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
