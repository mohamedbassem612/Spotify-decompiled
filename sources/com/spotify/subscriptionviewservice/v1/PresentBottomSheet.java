package com.spotify.subscriptionviewservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lyv0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class PresentBottomSheet extends h implements v2j0 {
    public static final int BODY_FIELD_NUMBER = 2;
    private static final PresentBottomSheet DEFAULT_INSTANCE;
    public static final int HEADER_ICON_FIELD_NUMBER = 3;
    public static final int HEADER_TEXT_FIELD_NUMBER = 4;
    public static final int IMAGE_URL_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int PRIMARY_BUTTON_FIELD_NUMBER = 6;
    public static final int SECONDARY_BUTTON_FIELD_NUMBER = 7;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private Icon headerIcon_;
    private ColorizedString headerText_;
    private Cta primaryButton_;
    private Cta secondaryButton_;
    private String title_ = "";
    private String body_ = "";
    private String imageUrl_ = "";

    static {
        PresentBottomSheet presentBottomSheet = new PresentBottomSheet();
        DEFAULT_INSTANCE = presentBottomSheet;
        h.registerDefaultInstance(PresentBottomSheet.class, presentBottomSheet);
    }

    private PresentBottomSheet() {
    }

    public static PresentBottomSheet o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ለ\u0003\u0006ဉ\u0004\u0007ဉ\u0005", new Object[]{"bitField0_", "title_", "body_", "headerIcon_", "headerText_", "imageUrl_", "primaryButton_", "secondaryButton_"});
        }
        if (iOrdinal == 3) {
            return new PresentBottomSheet();
        }
        if (iOrdinal == 4) {
            return new lyv0(DEFAULT_INSTANCE, (byte) 6);
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
        synchronized (PresentBottomSheet.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final String n() {
        return this.body_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Icon p() {
        Icon icon = this.headerIcon_;
        return icon == null ? Icon.o() : icon;
    }

    public final ColorizedString q() {
        ColorizedString colorizedString = this.headerText_;
        return colorizedString == null ? ColorizedString.o() : colorizedString;
    }

    public final Cta r() {
        Cta cta = this.primaryButton_;
        return cta == null ? Cta.p() : cta;
    }

    public final Cta s() {
        Cta cta = this.secondaryButton_;
        return cta == null ? Cta.p() : cta;
    }

    public final boolean t() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
