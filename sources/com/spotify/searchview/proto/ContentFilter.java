package com.spotify.searchview.proto;

import p.bf40;
import p.j4l;
import p.jf40;
import p.ntl;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ContentFilter extends com.google.protobuf.h implements v2j0 {
    private static final ContentFilter DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;

    static {
        ContentFilter contentFilter = new ContentFilter();
        DEFAULT_INSTANCE = contentFilter;
        com.google.protobuf.h.registerDefaultInstance(ContentFilter.class, contentFilter);
    }

    private ContentFilter() {
    }

    public static ContentFilter n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"type_"});
        }
        if (iOrdinal == 3) {
            return new ContentFilter();
        }
        if (iOrdinal == 4) {
            return new j4l(DEFAULT_INSTANCE, (byte) 23);
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
        synchronized (ContentFilter.class) {
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

    public final ntl o() {
        ntl ntlVar;
        int i = this.type_;
        if (i == 0) {
            ntlVar = ntl.CONTENT_FILTER_TYPE_UNKNOWN;
        } else if (i == 1) {
            ntlVar = ntl.CONTENT_FILTER_TYPE_VIDEOS;
        } else if (i != 2) {
            ntlVar = i != 3 ? null : ntl.CONTENT_FILTER_TYPE_LIVE_EVENTS;
        } else {
            ntlVar = ntl.CONTENT_FILTER_TYPE_PODCAST;
        }
        return ntlVar == null ? ntl.UNRECOGNIZED : ntlVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
