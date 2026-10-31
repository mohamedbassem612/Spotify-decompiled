package com.spotify.playlist.proto;

import com.google.protobuf.h;
import p.bf40;
import p.iqu0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class PlaylistRequest$ItemMetadata extends h implements v2j0 {
    private static final PlaylistRequest$ItemMetadata DEFAULT_INSTANCE;
    public static final int IMAGE_FIELD_NUMBER = 2;
    public static final int IS_EXPLICIT_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private boolean isExplicit_;
    private String name_ = "";
    private String image_ = "";

    static {
        PlaylistRequest$ItemMetadata playlistRequest$ItemMetadata = new PlaylistRequest$ItemMetadata();
        DEFAULT_INSTANCE = playlistRequest$ItemMetadata;
        h.registerDefaultInstance(PlaylistRequest$ItemMetadata.class, playlistRequest$ItemMetadata);
    }

    private PlaylistRequest$ItemMetadata() {
    }

    public static PlaylistRequest$ItemMetadata o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "name_", "image_", "isExplicit_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistRequest$ItemMetadata();
        }
        if (iOrdinal == 4) {
            return new iqu0((byte) 8);
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
        synchronized (PlaylistRequest$ItemMetadata.class) {
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

    public final boolean getIsExplicit() {
        return this.isExplicit_;
    }

    public final String getName() {
        return this.name_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
