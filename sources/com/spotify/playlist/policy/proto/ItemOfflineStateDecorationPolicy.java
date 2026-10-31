package com.spotify.playlist.policy.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.ol90;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ItemOfflineStateDecorationPolicy extends h implements v2j0 {
    private static final ItemOfflineStateDecorationPolicy DEFAULT_INSTANCE;
    public static final int LOCALLY_PLAYABLE_FIELD_NUMBER = 3;
    public static final int OFFLINE_STATE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SYNC_PROGRESS_FIELD_NUMBER = 2;
    private boolean locallyPlayable_;
    private boolean offlineState_;
    private boolean syncProgress_;

    static {
        ItemOfflineStateDecorationPolicy itemOfflineStateDecorationPolicy = new ItemOfflineStateDecorationPolicy();
        DEFAULT_INSTANCE = itemOfflineStateDecorationPolicy;
        h.registerDefaultInstance(ItemOfflineStateDecorationPolicy.class, itemOfflineStateDecorationPolicy);
    }

    private ItemOfflineStateDecorationPolicy() {
    }

    public static ItemOfflineStateDecorationPolicy n() {
        return DEFAULT_INSTANCE;
    }

    public static ol90 o() {
        return (ol90) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007", new Object[]{"offlineState_", "syncProgress_", "locallyPlayable_"});
        }
        if (iOrdinal == 3) {
            return new ItemOfflineStateDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new ol90(DEFAULT_INSTANCE);
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
        synchronized (ItemOfflineStateDecorationPolicy.class) {
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

    public final boolean getLocallyPlayable() {
        return this.locallyPlayable_;
    }

    public final boolean getOfflineState() {
        return this.offlineState_;
    }

    public final boolean getSyncProgress() {
        return this.syncProgress_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void setLocallyPlayable(boolean z) {
        this.locallyPlayable_ = z;
    }

    public final void setOfflineState(boolean z) {
        this.offlineState_ = z;
    }

    public final void setSyncProgress(boolean z) {
        this.syncProgress_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
