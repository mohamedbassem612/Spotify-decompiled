package com.spotify.campfire.sharelist.impl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.mn71;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class SharelistItem extends h implements v2j0 {
    private static final SharelistItem DEFAULT_INSTANCE;
    public static final int GROUP_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int USER_FIELD_NUMBER = 1;
    private int sharelistItemCase_ = 0;
    private Object sharelistItem_;

    static {
        SharelistItem sharelistItem = new SharelistItem();
        DEFAULT_INSTANCE = sharelistItem;
        h.registerDefaultInstance(SharelistItem.class, sharelistItem);
    }

    private SharelistItem() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"sharelistItem_", "sharelistItemCase_", SharelistUser.class, SharelistGroup.class});
        }
        if (iOrdinal == 3) {
            return new SharelistItem();
        }
        if (iOrdinal == 4) {
            return new mn71(DEFAULT_INSTANCE, (byte) 6);
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
        synchronized (SharelistItem.class) {
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

    public final boolean hasGroup() {
        return this.sharelistItemCase_ == 2;
    }

    public final boolean hasUser() {
        return this.sharelistItemCase_ == 1;
    }

    public final SharelistGroup n() {
        return this.sharelistItemCase_ == 2 ? (SharelistGroup) this.sharelistItem_ : SharelistGroup.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final SharelistUser o() {
        return this.sharelistItemCase_ == 1 ? (SharelistUser) this.sharelistItem_ : SharelistUser.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
