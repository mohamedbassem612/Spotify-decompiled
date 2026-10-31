package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.h;
import p.b290;
import p.bf40;
import p.c290;
import p.cp01;
import p.jf40;
import p.jma;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class RecentlyPlayedEpisodeMetadataDecorationPolicy extends h implements v2j0 {
    public static final int COVERS_FIELD_NUMBER = 9;
    private static final RecentlyPlayedEpisodeMetadataDecorationPolicy DEFAULT_INSTANCE;
    public static final int EXTENSION_FIELD_NUMBER = 21;
    public static final int IS_BOOK_CHAPTER_FIELD_NUMBER = 23;
    public static final int LENGTH_FIELD_NUMBER = 2;
    public static final int LINK_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private static final c290 extension_converter_ = new jma((byte) 22);
    private boolean covers_;
    private int extensionMemoizedSerializedSize;
    private b290 extension_ = h.emptyIntList();
    private boolean isBookChapter_;
    private boolean length_;
    private boolean link_;
    private boolean name_;

    static {
        RecentlyPlayedEpisodeMetadataDecorationPolicy recentlyPlayedEpisodeMetadataDecorationPolicy = new RecentlyPlayedEpisodeMetadataDecorationPolicy();
        DEFAULT_INSTANCE = recentlyPlayedEpisodeMetadataDecorationPolicy;
        h.registerDefaultInstance(RecentlyPlayedEpisodeMetadataDecorationPolicy.class, recentlyPlayedEpisodeMetadataDecorationPolicy);
    }

    private RecentlyPlayedEpisodeMetadataDecorationPolicy() {
    }

    public static cp01 n() {
        return (cp01) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0017\u0006\u0000\u0001\u0000\u0001\u0007\u0002\u0007\u0003\u0007\t\u0007\u0015,\u0017\u0007", new Object[]{"link_", "length_", "name_", "covers_", "extension_", "isBookChapter_"});
        }
        if (iOrdinal == 3) {
            return new RecentlyPlayedEpisodeMetadataDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new cp01(DEFAULT_INSTANCE);
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
        synchronized (RecentlyPlayedEpisodeMetadataDecorationPolicy.class) {
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

    public final void o() {
        this.covers_ = true;
    }

    public final void p() {
        this.link_ = true;
    }

    public final void q() {
        this.name_ = true;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
