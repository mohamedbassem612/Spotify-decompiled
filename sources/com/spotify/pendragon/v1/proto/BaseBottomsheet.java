package com.spotify.pendragon.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uv9;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class BaseBottomsheet extends h implements v2j0 {
    public static final int ACCESSORY_CONTENT_FIELD_NUMBER = 2;
    public static final int BODY_FIELD_NUMBER = 4;
    private static final BaseBottomsheet DEFAULT_INSTANCE;
    public static final int DISCLAIMER_FIELD_NUMBER = 7;
    public static final int HEADER_FIELD_NUMBER = 8;
    public static final int HEADLINE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PRIMARY_BUTTON_FIELD_NUMBER = 5;
    public static final int SECONDARY_BUTTON_FIELD_NUMBER = 6;
    private AccessoryContent accessoryContent_;
    private int bitField0_;
    private Text body_;
    private Disclaimer disclaimer_;
    private Header header_;
    private Text headline_;
    private Button primaryButton_;
    private Button secondaryButton_;

    static {
        BaseBottomsheet baseBottomsheet = new BaseBottomsheet();
        DEFAULT_INSTANCE = baseBottomsheet;
        h.registerDefaultInstance(BaseBottomsheet.class, baseBottomsheet);
    }

    private BaseBottomsheet() {
    }

    public static BaseBottomsheet p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0002\b\u0007\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0000", new Object[]{"bitField0_", "accessoryContent_", "headline_", "body_", "primaryButton_", "secondaryButton_", "disclaimer_", "header_"});
        }
        if (iOrdinal == 3) {
            return new BaseBottomsheet();
        }
        if (iOrdinal == 4) {
            return new uv9(DEFAULT_INSTANCE, (byte) 24);
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
        synchronized (BaseBottomsheet.class) {
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

    public final Text o() {
        Text text = this.body_;
        return text == null ? Text.n() : text;
    }

    public final Disclaimer q() {
        Disclaimer disclaimer = this.disclaimer_;
        return disclaimer == null ? Disclaimer.n() : disclaimer;
    }

    public final Header r() {
        Header header = this.header_;
        return header == null ? Header.n() : header;
    }

    public final Text s() {
        Text text = this.headline_;
        return text == null ? Text.n() : text;
    }

    public final Button t() {
        Button button = this.primaryButton_;
        return button == null ? Button.p() : button;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final Button u() {
        Button button = this.secondaryButton_;
        return button == null ? Button.p() : button;
    }

    public final boolean v() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean w() {
        return (this.bitField0_ & 64) != 0;
    }

    public final boolean x() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean y() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean z() {
        return (this.bitField0_ & 32) != 0;
    }
}
