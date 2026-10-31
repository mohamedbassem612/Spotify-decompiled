package com.spotify.extendedmetadata.extensions.contentalternativesimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.dw0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class AiDubbing extends h implements v2j0 {
    private static final AiDubbing DEFAULT_INSTANCE;
    public static final int ISO_639_1_LANGUAGE_FIELD_NUMBER = 2;
    public static final int ORIGINAL_CONTENT_URI_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private String originalContentUri_ = "";
    private String iso6391Language_ = "";

    static {
        AiDubbing aiDubbing = new AiDubbing();
        DEFAULT_INSTANCE = aiDubbing;
        h.registerDefaultInstance(AiDubbing.class, aiDubbing);
    }

    private AiDubbing() {
    }

    public static AiDubbing n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"originalContentUri_", "iso6391Language_"});
        }
        if (iOrdinal == 3) {
            return new AiDubbing();
        }
        if (iOrdinal == 4) {
            return new dw0(DEFAULT_INSTANCE, (byte) 19);
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
        synchronized (AiDubbing.class) {
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

    public final String o() {
        return this.iso6391Language_;
    }

    public final String p() {
        return this.originalContentUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
