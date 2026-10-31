package com.spotify.lockstate.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.j;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class Action extends h implements v2j0 {
    public static final int CALLBACK_FIELD_NUMBER = 3;
    public static final int CLOSE_APP_FIELD_NUMBER = 6;
    private static final Action DEFAULT_INSTANCE;
    public static final int DISMISS_FIELD_NUMBER = 1;
    public static final int NAVIGATE_TO_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_BOTTOM_SHEET_FIELD_NUMBER = 5;
    public static final int SHOW_DIALOG_FIELD_NUMBER = 4;
    private int actionCase_ = 0;
    private Object action_;

    static {
        Action action = new Action();
        DEFAULT_INSTANCE = action;
        h.registerDefaultInstance(Action.class, action);
    }

    private Action() {
    }

    public static Action o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"action_", "actionCase_", Dismiss.class, NavigateTo.class, Callback.class, ShowDialog.class, ShowBottomSheet.class, CloseApp.class});
        }
        if (iOrdinal == 3) {
            return new Action();
        }
        if (iOrdinal == 4) {
            return new j(DEFAULT_INSTANCE, (byte) 13);
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
        synchronized (Action.class) {
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

    public final Callback n() {
        return this.actionCase_ == 3 ? (Callback) this.action_ : Callback.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final NavigateTo p() {
        return this.actionCase_ == 2 ? (NavigateTo) this.action_ : NavigateTo.o();
    }

    public final ShowBottomSheet q() {
        return this.actionCase_ == 5 ? (ShowBottomSheet) this.action_ : ShowBottomSheet.p();
    }

    public final ShowDialog r() {
        return this.actionCase_ == 4 ? (ShowDialog) this.action_ : ShowDialog.o();
    }

    public final boolean s() {
        return this.actionCase_ == 3;
    }

    public final boolean t() {
        return this.actionCase_ == 6;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.actionCase_ == 1;
    }

    public final boolean v() {
        return this.actionCase_ == 2;
    }

    public final boolean w() {
        return this.actionCase_ == 5;
    }

    public final boolean x() {
        return this.actionCase_ == 4;
    }
}
