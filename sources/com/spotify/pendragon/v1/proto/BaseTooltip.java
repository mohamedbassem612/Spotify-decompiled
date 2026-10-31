package com.spotify.pendragon.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uca;
import p.v2j0;
import p.w3f1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class BaseTooltip extends h implements v2j0 {
    public static final int ACCESSORY_CONTENT_FIELD_NUMBER = 3;
    public static final int ALIGNMENT_FIELD_NUMBER = 1;
    public static final int BUTTON_FIELD_NUMBER = 5;
    private static final BaseTooltip DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 2;
    private AccessoryContent accessoryContent_;
    private int alignment_;
    private int bitField0_;
    private Button button_;
    private Header header_;
    private Text text_;

    static {
        BaseTooltip baseTooltip = new BaseTooltip();
        DEFAULT_INSTANCE = baseTooltip;
        h.registerDefaultInstance(BaseTooltip.class, baseTooltip);
    }

    private BaseTooltip() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static BaseTooltip q() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003", new Object[]{"bitField0_", "alignment_", "text_", "accessoryContent_", "button_", "header_"});
        }
        if (iOrdinal == 3) {
            return new BaseTooltip();
        }
        if (iOrdinal == 4) {
            return new uca(DEFAULT_INSTANCE, (byte) 1);
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
        synchronized (BaseTooltip.class) {
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

    public final AccessoryContent n() {
        AccessoryContent accessoryContent = this.accessoryContent_;
        return accessoryContent == null ? AccessoryContent.p() : accessoryContent;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final w3f1 o() {
        w3f1 w3f1Var;
        int i = this.alignment_;
        if (i == 0) {
            w3f1Var = w3f1.TOOLTIP_ALIGNMENT_UNKNOWN;
        } else if (i != 1) {
            w3f1Var = i != 2 ? null : w3f1.TOOLTIP_ALIGNMENT_STACKED;
        } else {
            w3f1Var = w3f1.TOOLTIP_ALIGNMENT_HORIZONTAL;
        }
        return w3f1Var == null ? w3f1.UNRECOGNIZED : w3f1Var;
    }

    public final Button p() {
        Button button = this.button_;
        return button == null ? Button.p() : button;
    }

    public final Header r() {
        Header header = this.header_;
        return header == null ? Header.n() : header;
    }

    public final Text s() {
        Text text = this.text_;
        return text == null ? Text.n() : text;
    }

    public final boolean t() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean v() {
        return (this.bitField0_ & 8) != 0;
    }
}
