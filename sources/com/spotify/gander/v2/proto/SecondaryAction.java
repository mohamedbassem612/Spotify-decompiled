package com.spotify.gander.v2.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.wd51;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class SecondaryAction extends h implements v2j0 {
    public static final int BLOCK_FOLLOWER_FIELD_NUMBER = 2;
    private static final SecondaryAction DEFAULT_INSTANCE;
    public static final int DELETE_NOTIFICATION_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int REMOVE_FOLLOWER_FIELD_NUMBER = 1;
    public static final int SET_PLAYLIST_PRIVATE_FIELD_NUMBER = 3;
    private int actionCase_ = 0;
    private Object action_;

    static {
        SecondaryAction secondaryAction = new SecondaryAction();
        DEFAULT_INSTANCE = secondaryAction;
        h.registerDefaultInstance(SecondaryAction.class, secondaryAction);
    }

    private SecondaryAction() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static wd51 r() {
        return (wd51) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"action_", "actionCase_", RemoveFollowerAction.class, BlockFollowerAction.class, SetPlaylistPrivateAction.class, DeleteNotificationAction.class});
        }
        if (iOrdinal == 3) {
            return new SecondaryAction();
        }
        if (iOrdinal == 4) {
            return new wd51(DEFAULT_INSTANCE);
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
        synchronized (SecondaryAction.class) {
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
            return 5;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final BlockFollowerAction o() {
        return this.actionCase_ == 2 ? (BlockFollowerAction) this.action_ : BlockFollowerAction.n();
    }

    public final RemoveFollowerAction p() {
        return this.actionCase_ == 1 ? (RemoveFollowerAction) this.action_ : RemoveFollowerAction.n();
    }

    public final SetPlaylistPrivateAction q() {
        return this.actionCase_ == 3 ? (SetPlaylistPrivateAction) this.action_ : SetPlaylistPrivateAction.n();
    }

    public final void s(BlockFollowerAction blockFollowerAction) {
        blockFollowerAction.getClass();
        this.action_ = blockFollowerAction;
        this.actionCase_ = 2;
    }

    public final void t(DeleteNotificationAction deleteNotificationAction) {
        deleteNotificationAction.getClass();
        this.action_ = deleteNotificationAction;
        this.actionCase_ = 4;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(RemoveFollowerAction removeFollowerAction) {
        removeFollowerAction.getClass();
        this.action_ = removeFollowerAction;
        this.actionCase_ = 1;
    }

    public final void v(SetPlaylistPrivateAction setPlaylistPrivateAction) {
        setPlaylistPrivateAction.getClass();
        this.action_ = setPlaylistPrivateAction;
        this.actionCase_ = 3;
    }
}
