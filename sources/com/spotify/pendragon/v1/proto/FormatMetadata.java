package com.spotify.pendragon.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.dv20;
import p.ia20;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FormatMetadata extends h implements v2j0 {
    public static final int BANNER_FIELD_NUMBER = 1;
    public static final int BOTTOM_SHEET_FIELD_NUMBER = 2;
    private static final FormatMetadata DEFAULT_INSTANCE;
    public static final int FULLSCREEN_FIELD_NUMBER = 3;
    public static final int INLINE_CARD_FIELD_NUMBER = 4;
    public static final int MODAL_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int SNACKBAR_FIELD_NUMBER = 6;
    public static final int TOOLTIP_FIELD_NUMBER = 7;
    public static final int WEB_VIEW_FIELD_NUMBER = 8;
    private int typeCase_ = 0;
    private Object type_;

    static {
        FormatMetadata formatMetadata = new FormatMetadata();
        DEFAULT_INSTANCE = formatMetadata;
        h.registerDefaultInstance(FormatMetadata.class, formatMetadata);
    }

    private FormatMetadata() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static FormatMetadata q() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"type_", "typeCase_", Banner.class, Bottomsheet.class, Fullscreen.class, InlineCard.class, Modal.class, Snackbar.class, Tooltip.class, Webview.class});
        }
        if (iOrdinal == 3) {
            return new FormatMetadata();
        }
        if (iOrdinal == 4) {
            return new ia20((byte) 20);
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
        synchronized (FormatMetadata.class) {
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

    public final Banner o() {
        return this.typeCase_ == 1 ? (Banner) this.type_ : Banner.s();
    }

    public final Bottomsheet p() {
        return this.typeCase_ == 2 ? (Bottomsheet) this.type_ : Bottomsheet.s();
    }

    public final Fullscreen r() {
        return this.typeCase_ == 3 ? (Fullscreen) this.type_ : Fullscreen.q();
    }

    public final InlineCard s() {
        return this.typeCase_ == 4 ? (InlineCard) this.type_ : InlineCard.r();
    }

    public final Modal t() {
        return this.typeCase_ == 5 ? (Modal) this.type_ : Modal.r();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final Snackbar u() {
        return this.typeCase_ == 6 ? (Snackbar) this.type_ : Snackbar.r();
    }

    public final Tooltip v() {
        return this.typeCase_ == 7 ? (Tooltip) this.type_ : Tooltip.s();
    }

    public final int w() {
        return dv20.a(this.typeCase_);
    }

    public final Webview x() {
        return this.typeCase_ == 8 ? (Webview) this.type_ : Webview.p();
    }
}
