package com.spotify.pendragon.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lka;
import p.ofc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yec;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ButtonStyle extends h implements v2j0 {
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 2;
    public static final int BUTTON_ICON_ALIGNMENT_FIELD_NUMBER = 7;
    public static final int BUTTON_TYPE_FIELD_NUMBER = 5;
    private static final ButtonStyle DEFAULT_INSTANCE;
    public static final int FONT_OVERRIDE_FIELD_NUMBER = 6;
    public static final int ICON_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int TEXT_COLOR_FIELD_NUMBER = 3;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private int buttonIconAlignment_;
    private int buttonType_;
    private int fontOverride_;
    private Icon icon_;
    private String text_ = "";
    private String backgroundColor_ = "";
    private String textColor_ = "";

    static {
        ButtonStyle buttonStyle = new ButtonStyle();
        DEFAULT_INSTANCE = buttonStyle;
        h.registerDefaultInstance(ButtonStyle.class, buttonStyle);
    }

    private ButtonStyle() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ButtonStyle r() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ဉ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဌ\u0006", new Object[]{"bitField0_", "text_", "backgroundColor_", "textColor_", "icon_", "buttonType_", "fontOverride_", "buttonIconAlignment_"});
        }
        if (iOrdinal == 3) {
            return new ButtonStyle();
        }
        if (iOrdinal == 4) {
            return new lka((byte) 28);
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
        synchronized (ButtonStyle.class) {
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

    public final String o() {
        return this.backgroundColor_;
    }

    public final yec p() {
        yec yecVar;
        int i = this.buttonIconAlignment_;
        if (i == 0) {
            yecVar = yec.BUTTON_ICON_ALIGNMENT_UNKNOWN;
        } else if (i != 1) {
            yecVar = i != 2 ? null : yec.BUTTON_ICON_ALIGNMENT_TRAILING;
        } else {
            yecVar = yec.BUTTON_ICON_ALIGNMENT_LEADING;
        }
        return yecVar == null ? yec.UNRECOGNIZED : yecVar;
    }

    public final ofc q() {
        ofc ofcVar;
        int i = this.buttonType_;
        if (i == 0) {
            ofcVar = ofc.UNKNOWN_BUTTON_TYPE;
        } else if (i == 1) {
            ofcVar = ofc.PRIMARY;
        } else if (i != 2) {
            ofcVar = i != 3 ? null : ofc.TEXT_LINK;
        } else {
            ofcVar = ofc.TERTIARY;
        }
        return ofcVar == null ? ofc.UNRECOGNIZED : ofcVar;
    }

    public final Icon s() {
        Icon icon = this.icon_;
        return icon == null ? Icon.p() : icon;
    }

    public final String t() {
        return this.text_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.textColor_;
    }

    public final boolean v() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean w() {
        return (this.bitField0_ & 1) != 0;
    }
}
