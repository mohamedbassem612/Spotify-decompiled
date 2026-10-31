package com.spotify.lockstate.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.wah;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ColumnLayout extends h implements v2j0 {
    public static final int BANNER_TITLE_FIELD_NUMBER = 1;
    private static final ColumnLayout DEFAULT_INSTANCE;
    public static final int FOOTER_FIELD_NUMBER = 8;
    public static final int ICON_URI_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PRIMARY_BUTTON_FIELD_NUMBER = 5;
    public static final int SECONDARY_BUTTON_FIELD_NUMBER = 6;
    public static final int SUBTITLE_FIELD_NUMBER = 4;
    public static final int TERTIARY_BUTTON_FIELD_NUMBER = 7;
    public static final int TITLE_FIELD_NUMBER = 3;
    private int bitField0_;
    private ActionableButton footer_;
    private ActionableButton primaryButton_;
    private ActionableButton secondaryButton_;
    private ActionableButton tertiaryButton_;
    private String bannerTitle_ = "";
    private String iconUri_ = "";
    private String title_ = "";
    private String subtitle_ = "";

    static {
        ColumnLayout columnLayout = new ColumnLayout();
        DEFAULT_INSTANCE = columnLayout;
        h.registerDefaultInstance(ColumnLayout.class, columnLayout);
    }

    private ColumnLayout() {
    }

    public static ColumnLayout o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003Ȉ\u0004Ȉ\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0004\bဉ\u0005", new Object[]{"bitField0_", "bannerTitle_", "iconUri_", "title_", "subtitle_", "primaryButton_", "secondaryButton_", "tertiaryButton_", "footer_"});
        }
        if (iOrdinal == 3) {
            return new ColumnLayout();
        }
        if (iOrdinal == 4) {
            return new wah(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (ColumnLayout.class) {
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

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final String n() {
        return this.bannerTitle_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ActionableButton p() {
        ActionableButton actionableButton = this.footer_;
        return actionableButton == null ? ActionableButton.o() : actionableButton;
    }

    public final String q() {
        return this.iconUri_;
    }

    public final ActionableButton r() {
        ActionableButton actionableButton = this.primaryButton_;
        return actionableButton == null ? ActionableButton.o() : actionableButton;
    }

    public final ActionableButton s() {
        ActionableButton actionableButton = this.secondaryButton_;
        return actionableButton == null ? ActionableButton.o() : actionableButton;
    }

    public final ActionableButton t() {
        ActionableButton actionableButton = this.tertiaryButton_;
        return actionableButton == null ? ActionableButton.o() : actionableButton;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean v() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean w() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean x() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean y() {
        return (this.bitField0_ & 16) != 0;
    }
}
