package com.spotify.pendragon.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.m660;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class Html extends h implements v2j0 {
    public static final int BANNER_FIELD_NUMBER = 1;
    public static final int CONTENT_FIELD_NUMBER = 5;
    private static final Html DEFAULT_INSTANCE;
    public static final int FULLSCREEN_FIELD_NUMBER = 2;
    public static final int MODAL_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SNACKBAR_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 6;
    private Object format_;
    private int formatCase_ = 0;
    private String content_ = "";
    private String type_ = "";

    static {
        Html html = new Html();
        DEFAULT_INSTANCE = html;
        h.registerDefaultInstance(Html.class, html);
    }

    private Html() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Html q() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005Ȉ\u0006Ȉ", new Object[]{"format_", "formatCase_", Banner.class, Fullscreen.class, Modal.class, Snackbar.class, "content_", "type_"});
        }
        if (iOrdinal == 3) {
            return new Html();
        }
        if (iOrdinal == 4) {
            return new m660((byte) 29);
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
        synchronized (Html.class) {
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
        return this.formatCase_ == 1 ? (Banner) this.format_ : Banner.s();
    }

    public final String p() {
        return this.content_;
    }

    public final int r() {
        int i = this.formatCase_;
        if (i == 0) {
            return 5;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i != 3) {
            return i != 4 ? 0 : 4;
        }
        return 3;
    }

    public final Fullscreen s() {
        return this.formatCase_ == 2 ? (Fullscreen) this.format_ : Fullscreen.q();
    }

    public final Modal t() {
        return this.formatCase_ == 3 ? (Modal) this.format_ : Modal.r();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final Snackbar u() {
        return this.formatCase_ == 4 ? (Snackbar) this.format_ : Snackbar.r();
    }
}
