package com.spotify.unboxinghub.api.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.ir40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class GridItem extends h implements v2j0 {
    public static final int ACTIVATED_FIELD_NUMBER = 8;
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 3;
    public static final int BACKGROUND_URI_FIELD_NUMBER = 2;
    public static final int BUTTON_ICON_FIELD_NUMBER = 4;
    private static final GridItem DEFAULT_INSTANCE;
    public static final int GRADIENT_COLOR_FIELD_NUMBER = 9;
    public static final int HIGHLIGHTED_LABEL_FIELD_NUMBER = 10;
    public static final int ID_FIELD_NUMBER = 7;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int TINT_COLOR_FIELD_NUMBER = 5;
    public static final int TITLE_FIELD_NUMBER = 1;
    private boolean activated_;
    private int bitField0_;
    private int buttonIcon_;
    private HighlightedLabel highlightedLabel_;
    private String title_ = "";
    private String backgroundUri_ = "";
    private String backgroundColor_ = "";
    private String tintColor_ = "";
    private String navigationUri_ = "";
    private String id_ = "";
    private String gradientColor_ = "";

    static {
        GridItem gridItem = new GridItem();
        DEFAULT_INSTANCE = gridItem;
        h.registerDefaultInstance(GridItem.class, gridItem);
    }

    private GridItem() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0007\tȈ\nဉ\u0000", new Object[]{"bitField0_", "title_", "backgroundUri_", "backgroundColor_", "buttonIcon_", "tintColor_", "navigationUri_", "id_", "activated_", "gradientColor_", "highlightedLabel_"});
        }
        if (iOrdinal == 3) {
            return new GridItem();
        }
        if (iOrdinal == 4) {
            return new ir40(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (GridItem.class) {
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

    public final String getId() {
        return this.id_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final boolean n() {
        return this.activated_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.backgroundColor_;
    }

    public final String p() {
        return this.backgroundUri_;
    }

    public final String q() {
        return this.gradientColor_;
    }

    public final HighlightedLabel r() {
        HighlightedLabel highlightedLabel = this.highlightedLabel_;
        return highlightedLabel == null ? HighlightedLabel.o() : highlightedLabel;
    }

    public final String s() {
        return this.navigationUri_;
    }

    public final String t() {
        return this.tintColor_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 1) != 0;
    }
}
