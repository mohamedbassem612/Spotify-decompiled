package com.spotify.lyrics.serviceretrofit.proto.v3;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vne0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class LyricsWrapperResponse extends h implements v2j0 {
    private static final LyricsWrapperResponse DEFAULT_INSTANCE;
    public static final int HAS_VOCAL_REMOVAL_FIELD_NUMBER = 2;
    public static final int LYRICS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private boolean hasVocalRemoval_;
    private LyricsV3Response lyrics_;

    static {
        LyricsWrapperResponse lyricsWrapperResponse = new LyricsWrapperResponse();
        DEFAULT_INSTANCE = lyricsWrapperResponse;
        h.registerDefaultInstance(LyricsWrapperResponse.class, lyricsWrapperResponse);
    }

    private LyricsWrapperResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007", new Object[]{"bitField0_", "lyrics_", "hasVocalRemoval_"});
        }
        if (iOrdinal == 3) {
            return new LyricsWrapperResponse();
        }
        if (iOrdinal == 4) {
            return new vne0(DEFAULT_INSTANCE, (byte) 22);
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
        synchronized (LyricsWrapperResponse.class) {
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

    public final boolean n() {
        return this.hasVocalRemoval_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final LyricsV3Response o() {
        LyricsV3Response lyricsV3Response = this.lyrics_;
        return lyricsV3Response == null ? LyricsV3Response.o() : lyricsV3Response;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
