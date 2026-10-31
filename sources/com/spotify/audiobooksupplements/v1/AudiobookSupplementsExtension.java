package com.spotify.audiobooksupplements.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.hw7;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class AudiobookSupplementsExtension extends h implements v2j0 {
    private static final AudiobookSupplementsExtension DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SUPPLEMENTS_FIELD_NUMBER = 1;
    private h290 supplements_ = h.emptyProtobufList();

    static {
        AudiobookSupplementsExtension audiobookSupplementsExtension = new AudiobookSupplementsExtension();
        DEFAULT_INSTANCE = audiobookSupplementsExtension;
        h.registerDefaultInstance(AudiobookSupplementsExtension.class, audiobookSupplementsExtension);
    }

    private AudiobookSupplementsExtension() {
    }

    public static AudiobookSupplementsExtension o(byte[] bArr) {
        return (AudiobookSupplementsExtension) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"supplements_", AudiobookSupplement.class});
        }
        if (iOrdinal == 3) {
            return new AudiobookSupplementsExtension();
        }
        if (iOrdinal == 4) {
            return new hw7(DEFAULT_INSTANCE, (byte) 27);
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
        synchronized (AudiobookSupplementsExtension.class) {
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

    public final h290 n() {
        return this.supplements_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
