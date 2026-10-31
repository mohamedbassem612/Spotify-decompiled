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
public final class ActionableButton extends h implements v2j0 {
    public static final int ACTION_FIELD_NUMBER = 2;
    private static final ActionableButton DEFAULT_INSTANCE;
    public static final int ICON_URI_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SEMANTIC_ACTION_FIELD_NUMBER = 4;
    public static final int TEXT_FIELD_NUMBER = 1;
    private Action action_;
    private int bitField0_;
    private String text_ = "";
    private String iconUri_ = "";
    private String semanticAction_ = "";

    static {
        ActionableButton actionableButton = new ActionableButton();
        DEFAULT_INSTANCE = actionableButton;
        h.registerDefaultInstance(ActionableButton.class, actionableButton);
    }

    private ActionableButton() {
    }

    public static ActionableButton o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ለ\u0001\u0004ለ\u0002", new Object[]{"bitField0_", "text_", "action_", "iconUri_", "semanticAction_"});
        }
        if (iOrdinal == 3) {
            return new ActionableButton();
        }
        if (iOrdinal == 4) {
            return new j(DEFAULT_INSTANCE, (byte) 19);
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
        synchronized (ActionableButton.class) {
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

    public final Action n() {
        Action action = this.action_;
        return action == null ? Action.o() : action;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.iconUri_;
    }

    public final String q() {
        return this.semanticAction_;
    }

    public final String r() {
        return this.text_;
    }

    public final boolean s() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 4) != 0;
    }
}
