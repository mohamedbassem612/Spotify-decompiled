package com.spotify.pendragon.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lka;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class Button extends h implements v2j0 {
    public static final int CLICK_ACTION_FIELD_NUMBER = 3;
    private static final Button DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int STYLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private ClickAction clickAction_;
    private String identifier_ = "";
    private ButtonStyle style_;

    static {
        Button button = new Button();
        DEFAULT_INSTANCE = button;
        h.registerDefaultInstance(Button.class, button);
    }

    private Button() {
    }

    public static Button p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "identifier_", "style_", "clickAction_"});
        }
        if (iOrdinal == 3) {
            return new Button();
        }
        if (iOrdinal == 4) {
            return new lka((byte) 26);
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
        synchronized (Button.class) {
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

    public final ClickAction o() {
        ClickAction clickAction = this.clickAction_;
        return clickAction == null ? ClickAction.r() : clickAction;
    }

    public final String q() {
        return this.identifier_;
    }

    public final ButtonStyle r() {
        ButtonStyle buttonStyle = this.style_;
        return buttonStyle == null ? ButtonStyle.r() : buttonStyle;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
