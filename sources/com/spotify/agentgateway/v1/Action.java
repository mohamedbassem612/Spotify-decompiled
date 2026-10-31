package com.spotify.agentgateway.v1;

import com.google.protobuf.h;
import p.bf40;
import p.j;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class Action extends h implements v2j0 {
    private static final Action DEFAULT_INSTANCE;
    public static final int DOWNLOAD_ACTION_FIELD_NUMBER = 4;
    public static final int NAVIGATE_ACTION_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PLAY_ACTION_FIELD_NUMBER = 1;
    private int actionCase_ = 0;
    private Object action_;

    static {
        Action action = new Action();
        DEFAULT_INSTANCE = action;
        h.registerDefaultInstance(Action.class, action);
    }

    private Action() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0004<\u0000", new Object[]{"action_", "actionCase_", PlayAction.class, NavigateAction.class, DownloadAction.class});
        }
        if (iOrdinal == 3) {
            return new Action();
        }
        if (iOrdinal == 4) {
            return new j(DEFAULT_INSTANCE, (byte) 11);
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

    public final int n() {
        int i = this.actionCase_;
        if (i == 0) {
            return 4;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return i != 4 ? 0 : 3;
            }
        }
        return i2;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final DownloadAction o() {
        return this.actionCase_ == 4 ? (DownloadAction) this.action_ : DownloadAction.n();
    }

    public final NavigateAction p() {
        return this.actionCase_ == 2 ? (NavigateAction) this.action_ : NavigateAction.n();
    }

    public final PlayAction q() {
        return this.actionCase_ == 1 ? (PlayAction) this.action_ : PlayAction.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
