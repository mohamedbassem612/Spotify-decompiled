package com.spotify.audiobooktophysicalbookmapping;

import com.google.protobuf.Duration;
import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.h290;
import p.jf40;
import p.lka;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class BookVersionMapping extends h implements v2j0 {
    public static final int BOOK_END_OFFSET_FIELD_NUMBER = 3;
    public static final int BOOK_VERSION_FIELD_NUMBER = 1;
    private static final BookVersionMapping DEFAULT_INSTANCE;
    public static final int PAGES_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private Duration bookEndOffset_;
    private BookVersion bookVersion_;
    private h290 pages_ = h.emptyProtobufList();

    static {
        BookVersionMapping bookVersionMapping = new BookVersionMapping();
        DEFAULT_INSTANCE = bookVersionMapping;
        h.registerDefaultInstance(BookVersionMapping.class, bookVersionMapping);
    }

    private BookVersionMapping() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001", new Object[]{"bitField0_", "bookVersion_", "pages_", PageStartMapping.class, "bookEndOffset_"});
        }
        if (iOrdinal == 3) {
            return new BookVersionMapping();
        }
        if (iOrdinal == 4) {
            return new lka(DEFAULT_INSTANCE, (byte) 9);
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
        synchronized (BookVersionMapping.class) {
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

    public final List getPagesList() {
        return this.pages_;
    }

    public final Duration n() {
        Duration duration = this.bookEndOffset_;
        return duration == null ? Duration.n() : duration;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final BookVersion o() {
        BookVersion bookVersion = this.bookVersion_;
        return bookVersion == null ? BookVersion.n() : bookVersion;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
