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
public final class BaseSnackbar extends h implements v2j0 {
    public static final int ACCESSORY_CONTENT_FIELD_NUMBER = 3;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final BaseSnackbar DEFAULT_INSTANCE;
    public static final int DISMISS_BUTTON_FIELD_NUMBER = 5;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PRIMARY_BUTTON_FIELD_NUMBER = 4;
    private AccessoryContent accessoryContent_;
    private int bitField0_;
    private Text body_;
    private Button dismissButton_;
    private Header header_;
    private Button primaryButton_;

    static {
        BaseSnackbar baseSnackbar = new BaseSnackbar();
        DEFAULT_INSTANCE = baseSnackbar;
        h.registerDefaultInstance(BaseSnackbar.class, baseSnackbar);
    }

    private BaseSnackbar() {
    }

    public static BaseSnackbar p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "header_", "body_", "accessoryContent_", "primaryButton_", "dismissButton_"});
        }
        if (iOrdinal == 3) {
            return new BaseSnackbar();
        }
        if (iOrdinal == 4) {
            return new uv9(DEFAULT_INSTANCE, (byte) 28);
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
        synchronized (BaseSnackbar.class) {
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

    public final Button q() {
        Button button = this.dismissButton_;
        return button == null ? Button.p() : button;
    }

    public final Header r() {
        Header header = this.header_;
        return header == null ? Header.n() : header;
    }

    public final Button s() {
        Button button = this.primaryButton_;
        return button == null ? Button.p() : button;
    }

    public final boolean t() {
        return (this.bitField0_ & 4) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
