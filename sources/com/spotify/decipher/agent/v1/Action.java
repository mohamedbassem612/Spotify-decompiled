package com.spotify.decipher.agent.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sy;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class Action extends h implements v2j0 {
    private static final Action DEFAULT_INSTANCE;
    public static final int NAVIGATE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_CONTROL_FIELD_NUMBER = 4;
    public static final int PLAY_FIELD_NUMBER = 1;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int TRANSFER_FIELD_NUMBER = 5;
    private int actionCase_ = 0;
    private Object action_;

    static {
        Action action = new Action();
        DEFAULT_INSTANCE = action;
        h.registerDefaultInstance(Action.class, action);
    }

    private Action() {
    }

    public static sy n() {
        return (sy) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"action_", "actionCase_", PlayAction.class, QueryAction.class, NavigateAction.class, PlaybackControlAction.class, TransferAction.class});
        }
        if (iOrdinal == 3) {
            return new Action();
        }
        if (iOrdinal == 4) {
            return new sy(DEFAULT_INSTANCE);
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(NavigateAction navigateAction) {
        navigateAction.getClass();
        this.action_ = navigateAction;
        this.actionCase_ = 3;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
