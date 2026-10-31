package com.spotify.pendragon.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.bn81;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.us71;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class Snackbar extends h implements v2j0 {
    public static final int AUTO_DISMISS_ENABLED_FIELD_NUMBER = 6;
    public static final int BASE_SNACKBAR_FIELD_NUMBER = 5;
    public static final int BUTTONS_FIELD_NUMBER = 3;
    private static final Snackbar DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 4;
    private boolean autoDismissEnabled_;
    private Object snackbarTemplate_;
    private int snackbarTemplateCase_ = 0;
    private h290 buttons_ = h.emptyProtobufList();
    private String type_ = "";

    static {
        Snackbar snackbar = new Snackbar();
        DEFAULT_INSTANCE = snackbar;
        h.registerDefaultInstance(Snackbar.class, snackbar);
    }

    private Snackbar() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Snackbar r() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0003\u0006\u0004\u0000\u0001\u0000\u0003\u001b\u0004Ȉ\u0005<\u0000\u0006\u0007", new Object[]{"snackbarTemplate_", "snackbarTemplateCase_", "buttons_", Button.class, "type_", BaseSnackbar.class, "autoDismissEnabled_"});
        }
        if (iOrdinal == 3) {
            return new Snackbar();
        }
        if (iOrdinal == 4) {
            return new bn81((byte) 19);
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
        synchronized (Snackbar.class) {
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

    public final boolean o() {
        return this.autoDismissEnabled_;
    }

    public final BaseSnackbar p() {
        return this.snackbarTemplateCase_ == 5 ? (BaseSnackbar) this.snackbarTemplate_ : BaseSnackbar.p();
    }

    public final h290 q() {
        return this.buttons_;
    }

    public final int s() {
        return us71.b(this.snackbarTemplateCase_);
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
