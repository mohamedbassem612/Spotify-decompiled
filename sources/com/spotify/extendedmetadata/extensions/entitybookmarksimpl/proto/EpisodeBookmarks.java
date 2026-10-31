package com.spotify.extendedmetadata.extensions.entitybookmarksimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.fxy;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class EpisodeBookmarks extends h implements v2j0 {
    public static final int BOOKMARKS_FIELD_NUMBER = 2;
    private static final EpisodeBookmarks DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 5;
    public static final int NUMBER_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 4;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private long duration_;
    private int number_;
    private String uri_ = "";
    private h290 bookmarks_ = h.emptyProtobufList();
    private String title_ = "";

    static {
        EpisodeBookmarks episodeBookmarks = new EpisodeBookmarks();
        DEFAULT_INSTANCE = episodeBookmarks;
        h.registerDefaultInstance(EpisodeBookmarks.class, episodeBookmarks);
    }

    private EpisodeBookmarks() {
    }

    public static EpisodeBookmarks o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003င\u0000\u0004ለ\u0001\u0005ဂ\u0002", new Object[]{"bitField0_", "uri_", "bookmarks_", BookmarkItem.class, "number_", "title_", "duration_"});
        }
        if (iOrdinal == 3) {
            return new EpisodeBookmarks();
        }
        if (iOrdinal == 4) {
            return new fxy(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (EpisodeBookmarks.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    public final h290 n() {
        return this.bookmarks_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
