package com.spotify.destination;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lka;
import p.q8c;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class BrowsePageInfo extends h implements v2j0 {
    private static final BrowsePageInfo DEFAULT_INSTANCE;
    public static final int PAGE_KIND_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int pageKind_;

    static {
        BrowsePageInfo browsePageInfo = new BrowsePageInfo();
        DEFAULT_INSTANCE = browsePageInfo;
        h.registerDefaultInstance(BrowsePageInfo.class, browsePageInfo);
    }

    private BrowsePageInfo() {
    }

    public static BrowsePageInfo o(byte[] bArr) {
        return (BrowsePageInfo) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"pageKind_"});
        }
        if (iOrdinal == 3) {
            return new BrowsePageInfo();
        }
        if (iOrdinal == 4) {
            return new lka(DEFAULT_INSTANCE, (byte) 20);
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
        synchronized (BrowsePageInfo.class) {
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

    public final q8c n() {
        q8c q8cVar;
        int i = this.pageKind_;
        if (i != 0) {
            q8cVar = i != 1 ? null : q8c.c;
        } else {
            q8cVar = q8c.b;
        }
        return q8cVar == null ? q8c.d : q8cVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
