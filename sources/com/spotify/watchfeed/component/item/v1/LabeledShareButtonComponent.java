package com.spotify.watchfeed.component.item.v1;

import p.bec;
import p.bf40;
import p.jf40;
import p.mfc;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.tm90;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class LabeledShareButtonComponent extends com.google.protobuf.h implements v2j0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 3;
    public static final int BUTTON_COLOR_SCHEME_FIELD_NUMBER = 7;
    public static final int BUTTON_STYLE_FIELD_NUMBER = 5;
    private static final LabeledShareButtonComponent DEFAULT_INSTANCE;
    public static final int DESTINATION_URI_FIELD_NUMBER = 6;
    public static final int ENTITY_URI_FIELD_NUMBER = 1;
    public static final int LABEL_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SHARE_IMAGE_URL_FIELD_NUMBER = 4;
    private int buttonColorScheme_;
    private int buttonStyle_;
    private String entityUri_ = "";
    private String label_ = "";
    private String accessibilityText_ = "";
    private String shareImageUrl_ = "";
    private String destinationUri_ = "";

    static {
        LabeledShareButtonComponent labeledShareButtonComponent = new LabeledShareButtonComponent();
        DEFAULT_INSTANCE = labeledShareButtonComponent;
        com.google.protobuf.h.registerDefaultInstance(LabeledShareButtonComponent.class, labeledShareButtonComponent);
    }

    private LabeledShareButtonComponent() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static LabeledShareButtonComponent t(phc phcVar) {
        return (LabeledShareButtonComponent) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\f\u0006Ȉ\u0007\f", new Object[]{"entityUri_", "label_", "accessibilityText_", "shareImageUrl_", "buttonStyle_", "destinationUri_", "buttonColorScheme_"});
        }
        if (iOrdinal == 3) {
            return new LabeledShareButtonComponent();
        }
        if (iOrdinal == 4) {
            return new tm90(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (LabeledShareButtonComponent.class) {
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

    public final String getEntityUri() {
        return this.entityUri_;
    }

    public final String n() {
        return this.accessibilityText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final bec o() {
        bec becVarA = bec.a(this.buttonColorScheme_);
        return becVarA == null ? bec.UNRECOGNIZED : becVarA;
    }

    public final mfc p() {
        mfc mfcVarA = mfc.a(this.buttonStyle_);
        return mfcVarA == null ? mfc.UNRECOGNIZED : mfcVarA;
    }

    public final String q() {
        return this.destinationUri_;
    }

    public final String r() {
        return this.label_;
    }

    public final String s() {
        return this.shareImageUrl_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
