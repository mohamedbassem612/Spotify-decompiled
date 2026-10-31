package com.spotify.messages;

import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.rn1;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class AddToPlaylist extends com.google.protobuf.h implements v2j0 {
    private static final AddToPlaylist DEFAULT_INSTANCE;
    public static final int ITEM_URIS_FIELD_NUMBER = 1;
    public static final int NEW_PLAYLIST_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_URI_FIELD_NUMBER = 4;
    public static final int SOURCE_CONTEXT_URI_FIELD_NUMBER = 3;
    public static final int SOURCE_VIEW_URI_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean newPlaylist_;
    private h290 itemUris_ = com.google.protobuf.h.emptyProtobufList();
    private String sourceViewUri_ = "";
    private String sourceContextUri_ = "";
    private String playlistUri_ = "";

    static {
        AddToPlaylist addToPlaylist = new AddToPlaylist();
        DEFAULT_INSTANCE = addToPlaylist;
        com.google.protobuf.h.registerDefaultInstance(AddToPlaylist.class, addToPlaylist);
    }

    private AddToPlaylist() {
    }

    public static rn1 o() {
        return (rn1) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003", new Object[]{"bitField0_", "itemUris_", "sourceViewUri_", "sourceContextUri_", "playlistUri_", "newPlaylist_"});
        }
        if (iOrdinal == 3) {
            return new AddToPlaylist();
        }
        if (iOrdinal == 4) {
            return new rn1(DEFAULT_INSTANCE);
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
        synchronized (AddToPlaylist.class) {
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

    public final void n(Iterable iterable) {
        h290 h290VarMutableCopy = this.itemUris_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.itemUris_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(boolean z) {
        this.bitField0_ |= 8;
        this.newPlaylist_ = z;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.playlistUri_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.sourceContextUri_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sourceViewUri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
