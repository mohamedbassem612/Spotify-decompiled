package com.spotify.extendedmetadata.extensions.entitybookmarksimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.c8x;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class EntityBookmarks extends h implements v2j0 {
    private static final EntityBookmarks DEFAULT_INSTANCE;
    public static final int EPISODE_BOOKMARKS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_BOOKMARKS_FIELD_NUMBER = 2;
    private int bodyCase_ = 0;
    private Object body_;

    static {
        EntityBookmarks entityBookmarks = new EntityBookmarks();
        DEFAULT_INSTANCE = entityBookmarks;
        h.registerDefaultInstance(EntityBookmarks.class, entityBookmarks);
    }

    private EntityBookmarks() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static EntityBookmarks q(byte[] bArr) {
        return (EntityBookmarks) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"body_", "bodyCase_", EpisodeBookmarks.class, ShowBookmarks.class});
        }
        if (iOrdinal == 3) {
            return new EntityBookmarks();
        }
        if (iOrdinal == 4) {
            return new c8x(DEFAULT_INSTANCE, (byte) 11);
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
        synchronized (EntityBookmarks.class) {
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
        int i = this.bodyCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final EpisodeBookmarks o() {
        return this.bodyCase_ == 1 ? (EpisodeBookmarks) this.body_ : EpisodeBookmarks.o();
    }

    public final ShowBookmarks p() {
        return this.bodyCase_ == 2 ? (ShowBookmarks) this.body_ : ShowBookmarks.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
