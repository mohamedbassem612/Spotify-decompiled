package com.spotify.musicquizservice.v1;

import java.util.List;
import p.bf40;
import p.em40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class GetLocalizedStringsResponse extends com.google.protobuf.h implements v2j0 {
    private static final GetLocalizedStringsResponse DEFAULT_INSTANCE;
    public static final int PAGES_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int RESOLVED_LOCALE_FIELD_NUMBER = 2;
    private h290 pages_ = com.google.protobuf.h.emptyProtobufList();
    private String resolvedLocale_ = "";

    static {
        GetLocalizedStringsResponse getLocalizedStringsResponse = new GetLocalizedStringsResponse();
        DEFAULT_INSTANCE = getLocalizedStringsResponse;
        com.google.protobuf.h.registerDefaultInstance(GetLocalizedStringsResponse.class, getLocalizedStringsResponse);
    }

    private GetLocalizedStringsResponse() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", new Object[]{"pages_", PageStrings.class, "resolvedLocale_"});
        }
        if (iOrdinal == 3) {
            return new GetLocalizedStringsResponse();
        }
        if (iOrdinal == 4) {
            return new em40(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (GetLocalizedStringsResponse.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
