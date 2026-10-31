package com.spotify.extendedmetadata.extensions.entitybookmarksimpl.proto;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lka;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class BookmarkItem extends h implements v2j0 {
    private static final BookmarkItem DEFAULT_INSTANCE;
    public static final int DURATION_MS_FIELD_NUMBER = 3;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LAST_UPDATED_FIELD_NUMBER = 5;
    public static final int OFFSET_MS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 4;
    private int bitField0_;
    private long durationMs_;
    private Timestamp lastUpdated_;
    private long offsetMs_;
    private String id_ = "";
    private String title_ = "";

    static {
        BookmarkItem bookmarkItem = new BookmarkItem();
        DEFAULT_INSTANCE = bookmarkItem;
        h.registerDefaultInstance(BookmarkItem.class, bookmarkItem);
    }

    private BookmarkItem() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003ဂ\u0000\u0004ለ\u0001\u0005ဉ\u0002", new Object[]{"bitField0_", "id_", "offsetMs_", "durationMs_", "title_", "lastUpdated_"});
        }
        if (iOrdinal == 3) {
            return new BookmarkItem();
        }
        if (iOrdinal == 4) {
            return new lka(DEFAULT_INSTANCE, (byte) 10);
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
        synchronized (BookmarkItem.class) {
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

    public final String getId() {
        return this.id_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final long n() {
        return this.durationMs_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Timestamp o() {
        Timestamp timestamp = this.lastUpdated_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final long p() {
        return this.offsetMs_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
