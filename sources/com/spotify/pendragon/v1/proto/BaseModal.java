package com.spotify.pendragon.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.mi;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uql;
import p.uv9;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class BaseModal extends h implements v2j0 {
    public static final int ACCESSORY_CONTENT_FIELD_NUMBER = 2;
    public static final int ACCESSORY_CONTENT_SIZE_FIELD_NUMBER = 9;
    public static final int BACKGROUND_FIELD_NUMBER = 1;
    public static final int BODY_FIELD_NUMBER = 4;
    public static final int CONTENT_ALIGNMENT_FIELD_NUMBER = 8;
    private static final BaseModal DEFAULT_INSTANCE;
    public static final int DISCLAIMER_FIELD_NUMBER = 7;
    public static final int HEADLINE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PRIMARY_BUTTON_FIELD_NUMBER = 5;
    public static final int SECONDARY_BUTTON_FIELD_NUMBER = 6;
    private int accessoryContentSize_;
    private AccessoryContent accessoryContent_;
    private Background background_;
    private int bitField0_;
    private Text body_;
    private int contentAlignment_;
    private Disclaimer disclaimer_;
    private Text headline_;
    private Button primaryButton_;
    private Button secondaryButton_;

    static {
        BaseModal baseModal = new BaseModal();
        DEFAULT_INSTANCE = baseModal;
        h.registerDefaultInstance(BaseModal.class, baseModal);
    }

    private BaseModal() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static BaseModal s() {
        return DEFAULT_INSTANCE;
    }

    public final boolean A() {
        return (this.bitField0_ & 32) != 0;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\b\f\t\f", new Object[]{"bitField0_", "background_", "accessoryContent_", "headline_", "body_", "primaryButton_", "secondaryButton_", "disclaimer_", "contentAlignment_", "accessoryContentSize_"});
        }
        if (iOrdinal == 3) {
            return new BaseModal();
        }
        if (iOrdinal == 4) {
            return new uv9(DEFAULT_INSTANCE, (byte) 27);
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
        synchronized (BaseModal.class) {
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

    public final mi o() {
        mi miVarA = mi.a(this.accessoryContentSize_);
        return miVarA == null ? mi.UNRECOGNIZED : miVarA;
    }

    public final Background p() {
        Background background = this.background_;
        return background == null ? Background.o() : background;
    }

    public final Text q() {
        Text text = this.body_;
        return text == null ? Text.n() : text;
    }

    public final uql r() {
        uql uqlVarA = uql.a(this.contentAlignment_);
        return uqlVarA == null ? uql.e : uqlVarA;
    }

    public final Disclaimer t() {
        Disclaimer disclaimer = this.disclaimer_;
        return disclaimer == null ? Disclaimer.n() : disclaimer;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final Text u() {
        Text text = this.headline_;
        return text == null ? Text.n() : text;
    }

    public final Button v() {
        Button button = this.primaryButton_;
        return button == null ? Button.p() : button;
    }

    public final Button w() {
        Button button = this.secondaryButton_;
        return button == null ? Button.p() : button;
    }

    public final boolean x() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean y() {
        return (this.bitField0_ & 64) != 0;
    }

    public final boolean z() {
        return (this.bitField0_ & 16) != 0;
    }
}
