package com.spotify.musicquizservice.v1;

import p.b290;
import p.bf40;
import p.c290;
import p.fo40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yla;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class GetLocalizedStringsRequest extends com.google.protobuf.h implements v2j0 {
    private static final GetLocalizedStringsRequest DEFAULT_INSTANCE;
    public static final int PAGES_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int QUIZ_URI_FIELD_NUMBER = 1;
    private static final c290 pages_converter_ = new yla((byte) 12);
    private int pagesMemoizedSerializedSize;
    private String quizUri_ = "";
    private b290 pages_ = com.google.protobuf.h.emptyIntList();

    static {
        GetLocalizedStringsRequest getLocalizedStringsRequest = new GetLocalizedStringsRequest();
        DEFAULT_INSTANCE = getLocalizedStringsRequest;
        com.google.protobuf.h.registerDefaultInstance(GetLocalizedStringsRequest.class, getLocalizedStringsRequest);
    }

    private GetLocalizedStringsRequest() {
    }

    public static fo40 n() {
        return (fo40) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002,", new Object[]{"quizUri_", "pages_"});
        }
        if (iOrdinal == 3) {
            return new GetLocalizedStringsRequest();
        }
        if (iOrdinal == 4) {
            return new fo40(DEFAULT_INSTANCE);
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
        synchronized (GetLocalizedStringsRequest.class) {
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

    public final void o(String str) {
        str.getClass();
        this.quizUri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
