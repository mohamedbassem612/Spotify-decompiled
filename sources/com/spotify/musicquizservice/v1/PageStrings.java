package com.spotify.musicquizservice.v1;

import p.bf40;
import p.g0r0;
import p.gtq0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class PageStrings extends com.google.protobuf.h implements v2j0 {
    private static final PageStrings DEFAULT_INSTANCE;
    public static final int PAGE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 2;
    private int page_;
    private h290 strings_ = com.google.protobuf.h.emptyProtobufList();

    static {
        PageStrings pageStrings = new PageStrings();
        DEFAULT_INSTANCE = pageStrings;
        com.google.protobuf.h.registerDefaultInstance(PageStrings.class, pageStrings);
    }

    private PageStrings() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"page_", "strings_", LocalizedString.class});
        }
        if (iOrdinal == 3) {
            return new PageStrings();
        }
        if (iOrdinal == 4) {
            return new gtq0(DEFAULT_INSTANCE, (byte) 11);
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
        synchronized (PageStrings.class) {
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

    public final g0r0 n() {
        g0r0 g0r0VarA = g0r0.a(this.page_);
        return g0r0VarA == null ? g0r0.UNRECOGNIZED : g0r0VarA;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.strings_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
