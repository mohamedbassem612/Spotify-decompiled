package com.spotify.audiobookrelations.v0;

import com.google.protobuf.h;
import p.bf40;
import p.hw7;
import p.jf40;
import p.na8;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class AudiobookRelationsResponse extends h implements v2j0 {
    public static final int ACTION_FIELD_NUMBER = 2;
    private static final AudiobookRelationsResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SAME_BOOK_URI_FIELD_NUMBER = 1;
    private int action_;
    private String sameBookUri_ = "";

    static {
        AudiobookRelationsResponse audiobookRelationsResponse = new AudiobookRelationsResponse();
        DEFAULT_INSTANCE = audiobookRelationsResponse;
        h.registerDefaultInstance(AudiobookRelationsResponse.class, audiobookRelationsResponse);
    }

    private AudiobookRelationsResponse() {
    }

    public static AudiobookRelationsResponse p(byte[] bArr) {
        return (AudiobookRelationsResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"sameBookUri_", "action_"});
        }
        if (iOrdinal == 3) {
            return new AudiobookRelationsResponse();
        }
        if (iOrdinal == 4) {
            return new hw7(DEFAULT_INSTANCE, (byte) 24);
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
        synchronized (AudiobookRelationsResponse.class) {
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

    public final na8 n() {
        na8 na8Var;
        int i = this.action_;
        if (i != 0) {
            na8Var = i != 1 ? null : na8.BOOK_PAGE_REDIRECT;
        } else {
            na8Var = na8.UNSPECIFIED;
        }
        return na8Var == null ? na8.UNRECOGNIZED : na8Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.sameBookUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
