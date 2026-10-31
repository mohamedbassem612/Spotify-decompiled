package com.spotify.contentagnostic.v2;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.np70;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.wz70;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ImageInstance extends h implements v2j0 {
    private static final ImageInstance DEFAULT_INSTANCE;
    public static final int FLAT_FILE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SIZE_FIELD_NUMBER = 2;
    private int bitField0_;
    private FlatFile flatFile_;
    private int size_;

    static {
        ImageInstance imageInstance = new ImageInstance();
        DEFAULT_INSTANCE = imageInstance;
        h.registerDefaultInstance(ImageInstance.class, imageInstance);
    }

    private ImageInstance() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "flatFile_", "size_"});
        }
        if (iOrdinal == 3) {
            return new ImageInstance();
        }
        if (iOrdinal == 4) {
            return new np70((byte) 20);
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
        synchronized (ImageInstance.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final FlatFile o() {
        FlatFile flatFile = this.flatFile_;
        return flatFile == null ? FlatFile.p() : flatFile;
    }

    public final wz70 p() {
        wz70 wz70Var;
        int i = this.size_;
        if (i == 0) {
            wz70Var = wz70.IMAGE_SIZE_UNSPECIFIED;
        } else if (i == 1) {
            wz70Var = wz70.IMAGE_SIZE_SMALL;
        } else if (i == 2) {
            wz70Var = wz70.IMAGE_SIZE_DEFAULT;
        } else if (i == 3) {
            wz70Var = wz70.IMAGE_SIZE_LARGE;
        } else if (i != 4) {
            wz70Var = i != 5 ? null : wz70.IMAGE_SIZE_XXLARGE;
        } else {
            wz70Var = wz70.IMAGE_SIZE_XLARGE;
        }
        return wz70Var == null ? wz70.UNRECOGNIZED : wz70Var;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
