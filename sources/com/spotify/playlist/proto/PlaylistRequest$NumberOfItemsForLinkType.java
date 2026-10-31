package com.spotify.playlist.proto;

import com.google.protobuf.h;
import p.a01;
import p.bf40;
import p.clc0;
import p.dru0;
import p.eru0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class PlaylistRequest$NumberOfItemsForLinkType extends h implements eru0 {
    private static final PlaylistRequest$NumberOfItemsForLinkType DEFAULT_INSTANCE;
    public static final int LINK_TYPE_FIELD_NUMBER = 1;
    public static final int NUM_ITEMS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private int linkType_;
    private int numItems_;

    static {
        PlaylistRequest$NumberOfItemsForLinkType playlistRequest$NumberOfItemsForLinkType = new PlaylistRequest$NumberOfItemsForLinkType();
        DEFAULT_INSTANCE = playlistRequest$NumberOfItemsForLinkType;
        h.registerDefaultInstance(PlaylistRequest$NumberOfItemsForLinkType.class, playlistRequest$NumberOfItemsForLinkType);
    }

    private PlaylistRequest$NumberOfItemsForLinkType() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"bitField0_", "linkType_", a01.j, "numItems_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistRequest$NumberOfItemsForLinkType();
        }
        if (iOrdinal == 4) {
            return new dru0();
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
        synchronized (PlaylistRequest$NumberOfItemsForLinkType.class) {
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

    @Override // p.eru0
    public final clc0 h() {
        clc0 clc0VarA = clc0.a(this.linkType_);
        return clc0VarA == null ? clc0.EMPTY : clc0VarA;
    }

    @Override // p.eru0
    public final int i() {
        return this.numItems_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
