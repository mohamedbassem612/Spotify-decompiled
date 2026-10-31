package com.spotify.contentagnostic.v2;

import p.bf40;
import p.hw7;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class AudioPassThrough extends com.google.protobuf.h implements v2j0 {
    private static final AudioPassThrough DEFAULT_INSTANCE;
    public static final int FLAT_FILE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private FlatFile flatFile_;

    static {
        AudioPassThrough audioPassThrough = new AudioPassThrough();
        DEFAULT_INSTANCE = audioPassThrough;
        com.google.protobuf.h.registerDefaultInstance(AudioPassThrough.class, audioPassThrough);
    }

    private AudioPassThrough() {
    }

    public static AudioPassThrough n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "flatFile_"});
        }
        if (iOrdinal == 3) {
            return new AudioPassThrough();
        }
        if (iOrdinal == 4) {
            return new hw7(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (AudioPassThrough.class) {
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

    public final FlatFile o() {
        FlatFile flatFile = this.flatFile_;
        return flatFile == null ? FlatFile.p() : flatFile;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
