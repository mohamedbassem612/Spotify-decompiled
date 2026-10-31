package com.spotify.lockstate.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.mn71;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ShowDialog extends h implements v2j0 {
    public static final int CONFIRM_BUTTON_FIELD_NUMBER = 3;
    private static final ShowDialog DEFAULT_INSTANCE;
    public static final int DISMISS_BUTTON_FIELD_NUMBER = 4;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private ActionableButton confirmButton_;
    private ActionableButton dismissButton_;
    private String title_ = "";
    private String message_ = "";

    static {
        ShowDialog showDialog = new ShowDialog();
        DEFAULT_INSTANCE = showDialog;
        h.registerDefaultInstance(ShowDialog.class, showDialog);
    }

    private ShowDialog() {
    }

    public static ShowDialog o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "title_", "message_", "confirmButton_", "dismissButton_"});
        }
        if (iOrdinal == 3) {
            return new ShowDialog();
        }
        if (iOrdinal == 4) {
            return new mn71(DEFAULT_INSTANCE, (byte) 21);
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
        synchronized (ShowDialog.class) {
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

    public final String getMessage() {
        return this.message_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final ActionableButton n() {
        ActionableButton actionableButton = this.confirmButton_;
        return actionableButton == null ? ActionableButton.o() : actionableButton;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ActionableButton p() {
        ActionableButton actionableButton = this.dismissButton_;
        return actionableButton == null ? ActionableButton.o() : actionableButton;
    }

    public final boolean q() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean r() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
