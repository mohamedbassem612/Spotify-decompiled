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
public final class LabeledAddToCollectionButton extends com.google.protobuf.h implements v2j0 {
    public static final int ACCESSIBILITY_ADDED_TEXT_FIELD_NUMBER = 4;
    public static final int ACCESSIBILITY_NOT_ADDED_TEXT_FIELD_NUMBER = 5;
    public static final int ADDED_TEXT_FIELD_NUMBER = 2;
    public static final int BUTTON_COLOR_SCHEME_FIELD_NUMBER = 7;
    public static final int BUTTON_STYLE_FIELD_NUMBER = 6;
    private static final LabeledAddToCollectionButton DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 1;
    public static final int NOT_ADDED_TEXT_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private int buttonColorScheme_;
    private int buttonStyle_;
    private String entityUri_ = "";
    private String addedText_ = "";
    private String notAddedText_ = "";
    private String accessibilityAddedText_ = "";
    private String accessibilityNotAddedText_ = "";

    static {
        LabeledAddToCollectionButton labeledAddToCollectionButton = new LabeledAddToCollectionButton();
        DEFAULT_INSTANCE = labeledAddToCollectionButton;
        com.google.protobuf.h.registerDefaultInstance(LabeledAddToCollectionButton.class, labeledAddToCollectionButton);
    }

    private LabeledAddToCollectionButton() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static LabeledAddToCollectionButton t(phc phcVar) {
        return (LabeledAddToCollectionButton) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\f\u0007\f", new Object[]{"entityUri_", "addedText_", "notAddedText_", "accessibilityAddedText_", "accessibilityNotAddedText_", "buttonStyle_", "buttonColorScheme_"});
        }
        if (iOrdinal == 3) {
            return new LabeledAddToCollectionButton();
        }
        if (iOrdinal == 4) {
            return new tm90(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (LabeledAddToCollectionButton.class) {
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
        return this.accessibilityAddedText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.accessibilityNotAddedText_;
    }

    public final String p() {
        return this.addedText_;
    }

    public final bec q() {
        bec becVarA = bec.a(this.buttonColorScheme_);
        return becVarA == null ? bec.UNRECOGNIZED : becVarA;
    }

    public final mfc r() {
        mfc mfcVarA = mfc.a(this.buttonStyle_);
        return mfcVarA == null ? mfc.UNRECOGNIZED : mfcVarA;
    }

    public final String s() {
        return this.notAddedText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
